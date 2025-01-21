import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x>0 && y>0) System.out.print(1);
        if(x>0 && y<0) System.out.print(4);
        if(x<0 && y>0) System.out.print(2);
        if(x<0 && y<0) System.out.print(3);
        scanner.close();
    }
}