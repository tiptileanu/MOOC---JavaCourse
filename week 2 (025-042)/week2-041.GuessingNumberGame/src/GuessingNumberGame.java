
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int times_counter = 0;
        while (true) {
            System.out.print("Guess a number: ");
            int yourNumber = Integer.parseInt(reader.nextLine());
            if (yourNumber < numberDrawn) {
                times_counter++;
                System.out.println("The number is greater" + ", guesses made: " + times_counter);
                
            } else if (yourNumber > numberDrawn) {
                times_counter++;
                System.out.println("The number is lesser" + ", guesses made: " + times_counter);
                
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
        // program your solution here. Do not touch the above lines!

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
