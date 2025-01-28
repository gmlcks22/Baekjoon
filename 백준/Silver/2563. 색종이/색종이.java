import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareNum = scanner.nextInt();
        int[][] grid = new int[101][101]; // 배열로 그리드를 만들어 계산
        int totalArea =0;

        for(int n = 0; n< squareNum; n++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // 입력받은 사각형(10x10) 그리드에 표시
            for(int i=x; i<x+10; i++){
                for(int j=y; j<y+10; j++){
                    // 해당 좌표에 처음으로 표시하면
                    if(grid[i][j] == 0) {
                        totalArea++; // 총 면적++
                    }
                    grid[i][j] = 1; // 그리드 한 칸의 면적 표시
                }
            }
        }
        System.out.print(totalArea);
        scanner.close();
    }
}