import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char word = scanner.next().charAt(0); // chatAt(0): 0번째 글짜 char 형식으로 리턴
        System.out.println((int)word); // int 형식으로 형변환 --> ascii code
    }
}
