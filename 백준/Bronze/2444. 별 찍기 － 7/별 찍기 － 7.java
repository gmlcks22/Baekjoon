import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // num of stars height: 2*n-1

        // printing upper side triangle shape(to the longest star line)
        for(int i=0; i<n; i++){
            // max num of stars: 2*n-1
            // num of blank in half line: (n-1)-i
            // printing blanks
            for(int j=0; j<(n-1)-i; j++){
                System.out.print(" ");
            }
            // printing stars
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // printing lower side triangle shape
        for(int i=0; i<n-1; i++){
            // printing blanks
            for(int j=0; j<i+1; j++){
                System.out.print(" ");
            }
            // printing stars
            for(int j=0; j<2*n-2*i-3; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}