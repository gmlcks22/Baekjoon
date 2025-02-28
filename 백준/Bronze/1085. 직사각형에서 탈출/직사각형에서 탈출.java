import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int minDistance = Math.min(Math.min(x, w - x), Math.min(y, h - y));
        System.out.print(minDistance);
    }
}