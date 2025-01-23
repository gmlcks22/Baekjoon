import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // num of lines
        int m = scanner.nextInt(); // num of num in a line
        int[] numA = new int[n*m];
        int[] numB = new int[n*m];

        // 행렬 A를 배열에 저장
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++)
                numA[i*m + j] = scanner.nextInt();
        }
        // 행령 B를 배열에 저장
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++)
                numB[i*m + j] = scanner.nextInt();
        }

        // 구한 행령을 더함 numA[]로 더함
        for(int i=0; i<n*m; i++){
            numA[i] += numB[i];
        }
        // 더한 행렬 출력
        for(int i=0; i<n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(numA[j+m*i]+" ");
            System.out.print("\n");
        }

        scanner.close();
    }
}