
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nr = 1;
        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        while (nr <= number) {
            System.out.println(nr);
            nr++;
        }
    }
}
