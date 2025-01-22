import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        char word = scanner.next().charAt(0);

        System.out.println((int)word);
    }
}