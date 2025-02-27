import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // 소인수분해
    public static void PrintPrimeFactorization(int n) {
        ArrayList<Integer> primeFactorArr = new ArrayList<>(); // 소인수 저장
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                primeFactorArr.add(i);
                n = n / i;
            }
        }
        // n이 소수로 남아있다면 추가
        if(n > 1){
            primeFactorArr.add(n);
        }

        for (int i = 0; i < primeFactorArr.size(); i++) {
            System.out.println(primeFactorArr.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PrintPrimeFactorization(n);
    }
}