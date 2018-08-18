
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int ODDcounter=0;
        int EVENcounter=0;
        while (true) {
            System.out.print("Type numbers: ");
            int number = Integer.parseInt(reader.nextLine());

            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }else if(number%2==0){
                EVENcounter++;
            }else{
                ODDcounter++;
            }
            
            sum += number;
            counter++;
            
        }
        double average = (double)sum / (double)counter;
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: "+EVENcounter);
        System.out.println("Odd numbers: "+ODDcounter);

    }
}
