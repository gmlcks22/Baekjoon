import java.util.Scanner;
import java.util.Vector;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[9];
        for(int i=0; i<9; i++){
            num[i] = scanner.nextInt();
        }
        int max = num[0];
        int maxOrder = 0;
        for(int i=1; i<9; i++){
            if(num[i]>max){
                max = num[i];
                maxOrder = i;
            }
        }
        System.out.println(max);
        System.out.print(maxOrder+1);
        scanner.close();
    }
}