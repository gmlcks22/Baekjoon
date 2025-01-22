import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        char[] word;
        word = br.readLine().toCharArray();
        int order = Integer.parseInt(br.readLine());

        System.out.print(word[order-1]);

    }
}