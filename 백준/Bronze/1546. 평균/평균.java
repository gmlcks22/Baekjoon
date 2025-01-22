import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 과목의 개수 n
        int[] score = new int[n];
        for(int i=0; i<n; i++){
            score[i] = scanner.nextInt();
        }
        int max = score[0];
        // getting max score.
        for(int i=0; i<n; i++){
            if(score[i]>max) max = score[i];
        }
        double[] newScore = new double[n];
        // setting new scores.
        for(int i=0; i<n; i++){
            newScore[i] = Double.valueOf(score[i])/max*100;
        }

        // getting avg of new scores.
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += newScore[i];
        }
        double avg = sum/n;
        System.out.print(avg);
        scanner.close();
    }
}