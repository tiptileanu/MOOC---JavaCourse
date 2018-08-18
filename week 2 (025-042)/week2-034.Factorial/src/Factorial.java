
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int nr = 1;
        int factorial = 1;
        if (number == 0) {
            System.out.println("0!=1");
            return;
        }
        while (nr <= number) {
            factorial *= nr;
            nr++;
        }
        System.out.println(number + "!=" + factorial);
    }
}
