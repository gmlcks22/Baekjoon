import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();

        int x = (int)Math.ceil((double)(v - a) / (a - b)) + 1;
        // 마지막 날에는 a만큼만 올라가고 b만큼 내려오지 않음.
        // 그러므로 총 걸리는 일수에서 1을 뺀 v-a 만큼의 거리에 하루에 가는 거리 a-b 를 나누어 일수를 구함.
        // 정수가 아닌 유리수가 나올 경우 올림하여 정확한 날짜를 구함
        System.out.print(x);
    }
}