import java.util.Scanner;
import java.util.Vector;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] num = new int[x];
        for(int i=0; i<x; i++){
            num[i] = scanner.nextInt();
        }
        int max = num[0];
        int min = num[0];
        for(int i=0; i<x; i++){
            if(num[i]>max)
                max = num[i];
            if(num[i]<min)
                min = num[i];
        }
        System.out.print(min+" "+max);
        scanner.close();
    }
}