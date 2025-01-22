import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int repeat = Integer.parseInt(br.readLine());
        String[] result = new String[repeat*2];
        for(int i=0; i<(repeat*2); i+=2){
            char[] word;
            word = br.readLine().toCharArray();
            result[i]=Character.toString(word[0]);
            result[i+1]=Character.toString(word[word.length-1]);
        }

        for(int i=0; i<(repeat*2); i+=2){
            System.out.print(result[i]);
            System.out.println(result[i+1]);
        }
    }
}