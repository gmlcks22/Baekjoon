import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        char[] bufferChars = new char[chars.length];

        // bufferChars[]에 chars[]을 뒤집어서 저장
        for(int i=0; i<chars.length; i++){
            bufferChars[chars.length-i-1] = chars[i];
        }
        int palindrome = 0;
        // chars[]에 bufferChars[] 을 한 단어씩 비교
        for(int i=0; i<chars.length; i++){
            if(chars[i] == bufferChars[i]){
                palindrome = 1; // 단어가 같으면 palindrome 변수를 1로 변경하고 계속 비교
                continue;
            }
            else{
                palindrome = 0; // 단어가 다르면 palindrome 변수를 0으로 변경하고 끝
                break;
            }
        }
        System.out.print(palindrome);

        scanner.close();
    }
}