import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 바구니 개수
        int m = scanner.nextInt(); // 반복 횟수

        int[] baskets = new int[n];
        for(int e=0; e<n; e++){
            baskets[e] = e+1;
        }

        for(int e=0; e<m; e++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            // 배열에 적용된 숫자로 변환
            i = i-1;
            j = j-1;
            int[] changingArea = new int[j-i+1];
            int iB = i, jB = j;
            int iC = 0, jC = j-i;
            // changingArea[]에 baskets[]의 i~j의 범위를 뒤집어서 저장
            for(; iB <=jB; iB++){
                changingArea[jC] = baskets[iB];
                jC--;
            }
            iB=i;
            // changingArea[]에 저장한 배열을 baskets[]에 옮김
            for(; iB<=jB; iB++){
                baskets[iB] = changingArea[iC];
                iC++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(baskets[i]+" ");
        }

        scanner.close();
    }
}