import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char[] aChars = a.toCharArray(); // 입력받은 String을 Char 배열로 바꿈
        char[] acBuffer = new char[aChars.length]; // 뒤집을 때 임시 저장용 버퍼 배열
        String b = scanner.next();
        char[] bChars = b.toCharArray();
        char[] bcBuffer = new char[bChars.length];

        for(int i=0; i<aChars.length; i++){
            acBuffer[i] = aChars[aChars.length-(i+1)];
        }
        for(int i=0; i<bChars.length; i++){
            bcBuffer[i] = bChars[bChars.length-(i+1)];
        }

        int result = 0;
        // compare
        for(int i=0; i<3; i++){
            if(acBuffer[i]>bcBuffer[i]){
                result = 0;
                break;
            }
            else if(acBuffer[i]<bcBuffer[i]){
                result = 1;
                break;
            }
            else continue;
        }

        for(int i=0; i<3; i++){
            if(result==0)
                System.out.print(acBuffer[i]);
            else System.out.print(bcBuffer[i]);
        }
        
    }
}