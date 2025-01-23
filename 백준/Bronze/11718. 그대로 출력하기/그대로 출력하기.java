import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat=0;
        ArrayList<String> arrayList = new ArrayList<String>();
        while(scanner.hasNextLine()){
            String s = scanner.nextLine();
            arrayList.add(s);
            repeat++;
        }
        for(int i=0; i<repeat; i++){
            System.out.println(arrayList.get(i));
        }
        scanner.close();
    }
}