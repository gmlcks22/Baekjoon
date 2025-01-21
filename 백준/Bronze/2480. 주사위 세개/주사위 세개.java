import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDice = scanner.nextInt();
        int secondDice = scanner.nextInt();
        int thirdDice = scanner.nextInt();
        int[] dices = {firstDice, secondDice, thirdDice};
        int prize, max = firstDice;
        if(dices[0] == dices[1] && dices[1] == dices[2]){
            prize=10000+firstDice*1000;
        }
        else if(dices[0]==dices[1]&&dices[1]!=dices[2] ||
                dices[0]==dices[2]&&dices[2]!=dices[1])
            prize=1000+dices[0]*100;
        else if(dices[1]==dices[2]&&dices[2]!=dices[0])
            prize=1000+dices[1]*100;
        else{
            for(int i=0; i<3; i++){
                if(max<dices[i])
                    max = dices[i];
            }
            prize=max*100;
        }
        System.out.print(prize);
        scanner.close();
    }
}