import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for(int i=0; i<testCase; i++){
            int received = scanner.nextInt();
            int quarter = received / 25;
            received %= 25;
            int dime = received / 10;
            received %=10;
            int nickel = received / 5;
            received %= 5;
            int penny = received;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
        
        scanner.close();
    }
}