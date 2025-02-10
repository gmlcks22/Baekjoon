import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 10진법 수 n
        int b = scanner.nextInt(); // 바꿀 진법 수 b

        Vector<String> v = new Vector<String>();
        int remain;

        while(n>0){
            remain = n%b;
            if(remain>9){
                v.add(String.valueOf((char)(remain - 10 + 'A'))); // 문자로 변환
            }
            else {
                v.add(String.valueOf(remain));
            }
            n = n/b;
        }

        for(int i=v.size()-1; i>=0; i--){
            System.out.print(v.get(i));
        }
        scanner.close();
    }
}