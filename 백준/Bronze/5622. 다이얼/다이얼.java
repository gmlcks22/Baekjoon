import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.next().toCharArray(); // 입력 받은 단어 저장
        int[] pNumbers = new int[charArray.length]; // switch 문에서 나온 번호 저장
        // 알파벳에 맞는 번호 알아내어 pNumbers[]에 저장
        for(int i=0; i<charArray.length;i++){
            switch(charArray[i]){
                case 'A':
                case 'B':
                case 'C':
                    pNumbers[i] = 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    pNumbers[i] = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    pNumbers[i] = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    pNumbers[i] = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    pNumbers[i] = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    pNumbers[i] = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    pNumbers[i] = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    pNumbers[i] = 9;
                    break;
                default:
                    pNumbers[i] = 1;
            }
        }

        int time=0;
        for(int i=0; i<charArray.length; i++){
            time += pNumbers[i]+1;
        }
        System.out.print(time);
        scanner.close();
    }
}