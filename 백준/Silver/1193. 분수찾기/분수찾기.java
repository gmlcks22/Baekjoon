import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int numerator = 1; // 분자
        int denominator = 1; // 분모

        // x가 속한 열(k) 찾기
//        int k = 1;
//        while (x > k * (k + 1) / 2) {
//            k++;
//        }

        // x가 속한 열(k) 찾기
        int k = (int)Math.ceil((-1 + Math.sqrt(1 + 8 * (long) x)) / 2);

        // x번째 분수 찾기
        int nInTheColumn = k - (k * (k + 1) / 2 - x); // x가 k열의 몇 번째 숫자인지 저장
        if (k % 2 != 0) { // 1 3 5 7 9
            numerator = k + 1 - nInTheColumn;
            denominator = nInTheColumn;
        } else { // 2 4 6 8
            numerator = nInTheColumn;
            denominator = k + 1 - nInTheColumn;
        }

        System.out.print(numerator + "/" + denominator);
    }
}