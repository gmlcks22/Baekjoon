import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        // 약수를 모두 구함
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) a.add(i);
        }
        // 오름차순으로 나온 약수들 중에서 k번째 수를 구함. ArrayList는 0부터 저장되므로, ArrayList의 k-1번째 수를 출력.
        if(k>a.size()) System.out.print(0);
        else System.out.print(a.get(k-1));
    }
}