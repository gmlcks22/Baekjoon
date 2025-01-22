import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input 1: number of numbers
        int n = scanner.nextInt();
        // input 2: numbers without blank
        String s = scanner.next();
        char[] numbers = s.toCharArray();
        int sum=0;
        for(int i=0; i<n; i++){
            sum += (int)numbers[i]-48;
        }

        System.out.print(sum);
        System.out.println();
    }
}