import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] words = s.toCharArray();
        int[] resultArr = new int[26];

        // resultArr[] -1로 초기화
        for(int i=0; i<26; i++){
            resultArr[i] = -1;
        }

        for(int i = 0; i< words.length; i++){
            // words[]의 단어를 ascii 코드로 소문자와 대조해서 해당 문자가 처음 나왔는지 알아낸다.
            for(int j=0; j<26; j++){
                if((int)words[i]==j+97 && resultArr[j]==-1){
                    resultArr[j] = i;
                }
            }
        }
        
        //결과 출력
        for(int i=0; i<26; i++){
            System.out.print(resultArr[i]+" ");
        }
    }
}