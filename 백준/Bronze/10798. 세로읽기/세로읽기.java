import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] words = new String[5][15];

        for(int i=0; i<5; i++){
            String line = scanner.nextLine();
            String[] numString = line.split(""); // 수 구분해서 배열에 대입

            for(int j = 0; j< numString.length; j++){
                words[i][j] = numString[j];
            }
        }
        for(int j=0; j<15; j++){
            for(int i=0; i<5; i++){
                if(words[i][j]!=null)
                    System.out.print(words[i][j]);
            }
        }
        scanner.close();
    }
}