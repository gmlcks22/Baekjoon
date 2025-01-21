import java.util.Scanner;
import java.util.Vector;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int repeat = 0;
        while(true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            v.add(Integer.valueOf(a+b));
            if(a==0 && b==0){
                break;
            }
            repeat++;
        }
        for(int i=0; i<repeat; i++){
            System.out.println(v.get(i));
        }
    }
}