import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 방의 총 개수
        scanner.close();
        
        if (n == 1){
            System.out.print(1);
            return;
        }
        
        int layer = 1; // 지름(면 개수)
        int maxInLayer = 1; // 지나온 방 개수
        
        while (maxInLayer < n){
            maxInLayer+= 6 * layer;
            layer++;
        }

        System.out.print(layer);
    }
}