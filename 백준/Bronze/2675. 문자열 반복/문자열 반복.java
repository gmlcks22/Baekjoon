import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();

        int[] num = new int[repeat]; // 같은 단어를 반복해서 출력할 횟수
        String[] s = new String[repeat]; // 단어 저장용
        for(int i=0; i<repeat; i++){
            num[i] = scanner.nextInt();
            s[i] = scanner.next();
        }

        // 테스트 케이스 횟수
        for(int i=0; i<repeat; i++){
            char[] charArray = s[i].toCharArray();
            // 단어 길이만큼 반복, s[i]=abc이면 3번 반복
            for(int j=0; j<charArray.length; j++){
                // 단어 앞에 준 횟수만큼 반복(중복해서 출력하는 단어 개수)
                for(int k=0; k<num[i]; k++){
                    System.out.print(charArray[j]);
                }
            }
            System.out.print("\n");
        }
    }
}