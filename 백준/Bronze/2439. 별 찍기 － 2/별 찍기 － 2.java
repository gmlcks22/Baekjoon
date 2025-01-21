import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        for(int i=0; i<repeat; i++){
            for(int j=repeat-i; j>1; j--)
                System.out.print(" ");
            for(int j=0; j<i+1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}