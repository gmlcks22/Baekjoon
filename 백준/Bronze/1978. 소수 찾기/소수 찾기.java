import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numOfPrimeNum = 0;
        for(int i=0; i<n; i++){
            int num = scanner.nextInt();
            // num 의 약수를 모두 구함
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 1; j < num; j++) {
                if (num % j == 0) a.add(j);
            }
            if(a.size() == 1) numOfPrimeNum++;
        }
        System.out.print(numOfPrimeNum);
        scanner.close();
    }
}