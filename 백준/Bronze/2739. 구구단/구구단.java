import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplication = scanner.nextInt();
        int result;
        for(int i=1; i<10; i++){
            result = multiplication*i;
            System.out.println(multiplication+" * "+i+" = "+result);
        }
        scanner.close();
    }
}