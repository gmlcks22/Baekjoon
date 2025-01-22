import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] remain = new int[10];
        for(int i=0; i<10; i++){
            int n = scanner.nextInt();
            remain[i] = n%42; // remain[i] = 0~41
        }

        int[] countRemain = new int[42];
        for(int i=0; i<10; i++){
            for(int j=i+1; j<10; j++){
                if(remain[i]==remain[j]){
                    countRemain[remain[i]]++;
                }
            }
        }
        int sumOfn =0;
        int sum=0;
        for(int i=0; i<42; i++) {
            if(countRemain[i]!=0){
                sumOfn += (1+Math.sqrt(8*countRemain[i]+1))/2;
                sum ++;
            }
        }



        System.out.print(10-sumOfn+sum);

        scanner.close();
    }
}