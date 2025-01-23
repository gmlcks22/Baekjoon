import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 0~7: White King, Queen, Rook, Bishop, Knight, Pawn
        // num: 1           1      2     2       2       8
        int king = scanner.nextInt();
        int queen = scanner.nextInt();
        int rook = scanner.nextInt();
        int bishop = scanner.nextInt();
        int knight = scanner.nextInt();
        int pawn = scanner.nextInt();

        System.out.print(1-king+" ");
        System.out.print(1-queen+" ");
        System.out.print(2-rook+" ");
        System.out.print(2-bishop+" ");
        System.out.print(2-knight+" ");
        System.out.print(8-pawn+" ");
    }
}