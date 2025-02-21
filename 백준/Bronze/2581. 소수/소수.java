import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        // i == (m ~ n) 의 소수를 찾아 ArrayList에 add
        ArrayList<Integer> primeNumArr = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            ArrayList<Integer> divisorArr = new ArrayList<>();
            // i의 약수의 개수를 구함
            for (int j = 1; j < i; j++) {
                if (i % j == 0) divisorArr.add(j);
            }
            // i가 소수이면 primeNumArr에 j를 저장
            if(divisorArr.size() == 1) primeNumArr.add(i);
        }

        // m ~ n 에 소수가 존재하면
        if(primeNumArr.size()>0){
            int sum  = 0;
            for(int i=0; i<primeNumArr.size(); i++){
                sum += primeNumArr.get(i);
            }
            System.out.println(sum);
            System.out.print(primeNumArr.get(0));
        }
        else{
            System.out.println(-1);
        }
    }
}