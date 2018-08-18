
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last number: ");
        int last = Integer.parseInt(reader.nextLine());
        int nr = first;
        while (nr <= last) {
            System.out.println(nr);
            nr++;
        }
    }
}
