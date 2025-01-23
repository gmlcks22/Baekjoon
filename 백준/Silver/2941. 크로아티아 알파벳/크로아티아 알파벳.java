import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String[] croatianAlphabets = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(String croatian : croatianAlphabets) {
            s = s.replace(croatian, "0");
        }

        System.out.print(s.length());
        scanner.close();
    }
}