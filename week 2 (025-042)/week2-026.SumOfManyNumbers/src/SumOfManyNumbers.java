
import java.util.Scanner;

public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int number_read = Integer.parseInt(reader.nextLine());
            if (number_read == 0) {
                break;
            }
            sum += number_read;
            System.out.println("Sum now: " + sum);
        }
        
        System.out.println("Sum in the end: " + sum);
    }
}
