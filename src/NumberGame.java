import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int more = 1;
        while(more!=0) {
            int num = rand.nextInt(100) + 1;
            int idx = 0;
            int won = 0;
            System.out.println("You have only limited 5 attempts.");
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter number to guess:");
                int guess = sc.nextInt();
                if (guess > num) {
                    System.out.println("Too large number");
                }
                else if(guess < num){
                    System.out.println("Too small number");
                }
                else{
                    System.out.println("You won");
                    won++;
                }
                idx++;
            }
            if(idx == 5) System.out.println("All your attempts completed");
            System.out.println("Random number is " + num);
            System.out.println("Enter 0 to exit... or any key to continue");
            int x = sc.nextInt();
            more = x;
            if(won>0) System.out.println("You have won " + won + " times.");
            System.out.println("Start again");
        }
    }
}
