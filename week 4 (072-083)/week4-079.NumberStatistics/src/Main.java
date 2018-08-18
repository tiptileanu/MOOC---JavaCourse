
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number != -1) {
                stats.addNumber(number);
                if (number % 2 == 0) {
                    even.addNumber(number);
                } else{
                    odd.addNumber(number);
                }
            } else {
                break;
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
