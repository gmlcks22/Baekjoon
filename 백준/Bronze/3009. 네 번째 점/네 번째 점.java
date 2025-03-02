import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> xArr = new ArrayList<>();
        ArrayList<Integer> yArr = new ArrayList<>();

        for(int i = 0; i<3; i++){
            xArr.add(scanner.nextInt());
            yArr.add(scanner.nextInt());
        }

        HashMap<Integer, Integer> countXMap = new HashMap<>();
        HashMap<Integer, Integer> countYMap = new HashMap<>();

        // Count number's appearance of xArr
        for(int num : xArr){
            countXMap.put(num, countXMap.getOrDefault(num, 0) + 1);
        }

        // Count number's appearance of yArr
        for(int num : yArr){
            countYMap.put(num, countYMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : countXMap.entrySet()){
            if(entry.getValue() == 1){ // 등장횟수(value) == 1 이면
                System.out.print(entry.getKey() + " ");
            }
        }

        for(Map.Entry<Integer, Integer> entry : countYMap.entrySet()){
            if(entry.getValue() == 1){ // 등장횟수(value) == 1 이면
                System.out.print(entry.getKey());
            }
        }

    }
}