import java.util.Scanner;
import java.util.Vector;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        int[] arr = new int[repeat];
        int findingNum = scanner.nextInt();
        Vector<Integer> resultV = new Vector<Integer>();
        for(int i=0; i<repeat; i++){
            arr[i] = scanner.nextInt();
            if(arr[i]<findingNum){
                resultV.add(arr[i]);
            }
        }
        for(int i=0; i<resultV.size(); i++){
            System.out.print(resultV.get(i)+" ");
        }
        scanner.close();
    }
}