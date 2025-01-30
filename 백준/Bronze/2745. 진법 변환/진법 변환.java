import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // todo B진법 -> 10진법
        Scanner scanner = new Scanner(System.in);
        int value, result=0;

        String n = scanner.next(); // 값
        int b = scanner.nextInt(); // 진법

        for(int i=0; i< n.length(); i++){
            char c = n.charAt(i);
            // 알파벳 맞는 숫자로 변형
            if(Character.isLetter(c)){
                value = c-'A' + 10; // 알파벳을 숫자로 변형
            }
            else value = c-'0'; // 문자 배열에서 정수로 바꿈

            // 10진수로 변환
            result = result * b + value; // 반복문을 종료하면 자릿수만큼 b를 곱하게 된다. 즉 각 자리의 value 자릿수만큼 제봅한 값을 곱하게 됨
        }
        System.out.print(result);
    }
}