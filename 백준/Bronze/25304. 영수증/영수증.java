import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong(); // 총 금액
        int n = scanner.nextInt(); // 물건 종류 수
        int a, b; // 물건의 가격, 개수
        int sum = 0;
        for(int i=0; i<n; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum += a*b;
        }
        if(sum==x) System.out.print("Yes");
        else System.out.print("No");
        scanner.close();
    }
}