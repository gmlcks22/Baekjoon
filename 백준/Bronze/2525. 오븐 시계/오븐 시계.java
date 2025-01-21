import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int cookingTime = scanner.nextInt();
        minute += cookingTime;
        int repeat = minute/60;
        if(minute>=60){
            for(int i=0; i<repeat; i++){
                hour += 1;
                minute -= 60;
                if(hour==24){
                    hour-=24;
                }
            }
        }
        System.out.print(hour + " " + minute);
        scanner.close();
    }
}