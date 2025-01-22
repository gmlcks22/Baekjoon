import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String words[] = s.split(" ");
        int numOfBlank=0;
        for(int i=0; i<words.length; i++){
            if(words[i]==""){
                numOfBlank++;
            }
        }
        System.out.print(words.length-numOfBlank);
    }
}