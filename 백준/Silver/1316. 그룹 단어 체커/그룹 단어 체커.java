import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordNum = scanner.nextInt();
        int[] groupword = new int[wordNum];
        for(int i=0; i<wordNum; i++){
            String s = scanner.next();
            char[] usedWords = new char[s.length()];
            char buffer='0';
            groupword[i]=1;
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);

                // c가 이전 글자와 다르다면(새로운 단어)
                if(c!=buffer){
                    for(int k=0; k<j; k++){
                        // usedWords[]에 저장된 글자와 같다면
                        if(c==usedWords[k]) {
                            groupword[i]=0; // 해당 단어는 그룹단어가 아님
                            break;
                        }
                    }
                    usedWords[j]=c; // 해당 글자를 usedWords에 저장
                }
                buffer = c; // 다음 단어와 비교하기 위함

                // c가 이전 글자와 같다면 계속
            }
        }
        int sum=0;
        for(int i=0; i<wordNum; i++) {
            sum+=groupword[i];
        }

        System.out.print(sum);
        scanner.close();
    }
}