
import java.util.Scanner;

public class Divider 
{

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        Double first = Double.parseDouble(reader.nextLine());
        System.out.println("Type an other number: ");
        Double second=Double.parseDouble(reader.nextLine());
        System.out.println("Division: " + first + "/" + second + "=" + (first/second));

        // Implement your program here. Remember to ask the input from user.
    }
}
