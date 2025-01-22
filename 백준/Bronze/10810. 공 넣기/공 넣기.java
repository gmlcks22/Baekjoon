import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 바구니&공 종류
        int m = scanner.nextInt(); // 반복횟수

        int[]baskets = new int[n+1];

        for(int o=1; o<=m; o++){
            int i = scanner.nextInt(); // i번 바구니부터
            int j = scanner.nextInt(); // j번 바구니까지
            int k = scanner.nextInt(); // k번 번호 공을 넣는다
            for(int l = i; l<=j; l++){
                baskets[l] = k;
            }
        }
        for(int i=1; i<=n; i++){
            System.out.print(baskets[i]+" ");
        }
        scanner.close();
    }
}