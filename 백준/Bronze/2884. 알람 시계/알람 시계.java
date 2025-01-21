import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int degree = minute-45;
        int alarmHour = 0, alarmMinute = 0;
        if(degree>=0){
            alarmHour = hour;
            alarmMinute = degree;
        }
        else{
            alarmHour = hour-1;
            if(alarmHour<0) alarmHour=24+alarmHour;
            alarmMinute = 60+degree;
        }
        System.out.print(alarmHour + " " + alarmMinute);
    }
}