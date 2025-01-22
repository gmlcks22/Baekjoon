import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 바구니&공 종류
        int m = scanner.nextInt(); // 반복횟수


        int[]baskets = new int[n];
        // 각 바구니의 번호가 적힌 공을 해당 바구니에 넣는다
        for(int i=0; i<n; i++)
            baskets[i] = i+1;

        for(int o=0; o<m; o++){
            int i = scanner.nextInt(); // i번 바구니와
            int j = scanner.nextInt(); // j번 바구니를
            int buffer;
            //바꾼다
            buffer = baskets[i-1];
            baskets[i-1] = baskets[j-1];
            baskets[j-1] = buffer;
        }
        for(int i=0; i<n; i++){
            System.out.print(baskets[i]+" ");
        }
        scanner.close();
    }
}