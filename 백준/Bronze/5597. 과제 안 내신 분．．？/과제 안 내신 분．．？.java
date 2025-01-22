import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] summitted = new int[30];
        int[] unSummitted = new int[2];
        for(int i=0; i<28; i++){
            int n = scanner.nextInt();
            summitted[n-1]=n;
        }
        int j=0;
        for(int i=0; i<30; i++){
            if(summitted[i]==0){
                unSummitted[j]=i+1;
                j++;
            }
        }
        for(int i=0; i<2; i++)
            System.out.println(unSummitted[i]);
        scanner.close();
    }
}