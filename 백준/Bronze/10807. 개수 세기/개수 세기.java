import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        int[] nums = new int[repeat];
        for(int i=0; i<repeat; i++){
            nums[i] = scanner.nextInt();
        }
        int findingNum = scanner.nextInt();
        int numOfFindingNum = 0;
        for(int i=0; i<repeat; i++){
            if(nums[i] == findingNum)
                numOfFindingNum++;
        }
        System.out.print(numOfFindingNum);
        scanner.close();
    }
}