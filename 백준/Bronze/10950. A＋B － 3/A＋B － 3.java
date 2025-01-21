import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        int amount = scanner.nextInt();
        int[] result = new int[amount];
        for(int i=0; i<amount; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            result[i] = a+b;
        }
        for(int i=0; i<amount; i++){
            System.out.println(result[i]);
        }
        scanner.close();
    }
}