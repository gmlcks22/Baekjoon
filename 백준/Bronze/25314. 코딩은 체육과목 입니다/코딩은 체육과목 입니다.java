import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //4<=n<=1000
        for(int i=1; i<n/4; i++){
            System.out.print("long ");
        }
        System.out.print("long int");
        scanner.close();
    }
}