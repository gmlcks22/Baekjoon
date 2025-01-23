import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score;
        double mulOfScore = 0;
        int sumOfUnit = 0;
        for(int i=0; i<20; i++){
            String line = scanner.nextLine();
            String[] s = line.split(" "); // 공백으로 구분
            if(s[2].equals("P")) continue;
            switch (s[2]){
                case "A+": score=4.5; break;
                case "A0": score=4.0; break;
                case "B+": score=3.5; break;
                case "B0": score=3.0; break;
                case "C+": score=2.5; break;
                case "C0": score=2.0; break;
                case "D+": score=1.5; break;
                case "D0": score=1.0; break;
                case "F": score=0; break;
                default: score=0;
            }
            mulOfScore += score*Double.parseDouble(s[1]); // 과목평점*학점 누적 더하기
            sumOfUnit += Double.parseDouble(s[1]);
        }
        System.out.print(mulOfScore/sumOfUnit);
        scanner.close();
    }
}