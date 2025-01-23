import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        // 모두 대문자로 변환
        s = s.toUpperCase();
        int[] alphabetCount = new int[26];

        // 배열에 단어의 각 알파벳의 갯수 저장
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i); // i번째 단어를 char 형식으로 바꾸어 c에 저장
            alphabetCount[c - 'A']++; // 알파벳에 해당하는 번호 1 증가(A->0, B->1, ...)
        }

        // 가장 많이 사용한 알파벳 구하기(여러개인 경우 ?)
        boolean isDuplicated = false;
        int maxI = 0; // 최대값의 i값
        int max = 0; // 사용횟수중 최대값
        for(int i=0; i<26; i++){
            if(alphabetCount[i]> max){
                max = alphabetCount[i];
                maxI = i;
                isDuplicated = false;
            }
            else if(alphabetCount[i] == max)
                isDuplicated = true;
        }


        if(isDuplicated)
            System.out.print('?');
        else
            System.out.print((char)(maxI+'A')); // 대문자로 출력
        scanner.close();
    }
}