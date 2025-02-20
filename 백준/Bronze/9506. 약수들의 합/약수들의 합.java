import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == -1) break;

            // 약수를 모두 구함
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 1; i < n; i++) { // 자기 자신을 제외해야 하므로, i == n 일 때 약수임을 제외
                if (n % i == 0) a.add(i);
            }

            // 구한 약수를 모두 더함
            int sum = 0;
            for (int i = 0; i < a.size(); i++) {
                sum += a.get(i);
            }

            // 약수의 합과 n 비교, 출력
            if (n == sum) {
                System.out.print(n + " = ");
                for (int i = 0; i < a.size(); i++) {
                    System.out.print(a.get(i));
                    if (i != a.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        scanner.close();
    }
}