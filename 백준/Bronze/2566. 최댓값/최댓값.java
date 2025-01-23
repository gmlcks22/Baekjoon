import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] max = new int[9]; // 각 라인의 최댓값
        int[][] nums = new int[9][9];
        int max = 0;
        int maxI = 0, maxJ = 0;
        for(int i=0; i<9; i++){
            String line = scanner.nextLine();
            String[] numString = line.split(" "); // 수 구분해서 배열에 대입

            for(int j = 0; j <9; j++){
                nums[i][j] = Integer.parseInt(numString[j]); // 정수로 변환
                if(nums[i][j] > max){
                    max = nums[i][j]; // 최댓값
                    maxI=i; // 최댓값의 y좌표
                    maxJ=j; // 최댓값의 x좌표
                }
            }
        }

        System.out.println(max);
        System.out.print((maxI+1) + " " + (maxJ+1));
        scanner.close();
    }
}