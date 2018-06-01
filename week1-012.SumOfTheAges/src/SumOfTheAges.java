
import java.util.Scanner;

public class SumOfTheAges 
{

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String first = reader.nextLine();
        System.out.println("Type your age: ");
        int age1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type your name: ");
        String second = reader.nextLine();
        int age2 = Integer.parseInt(reader.nextLine());
        System.out.println(first + " and " + second + " are " + (age1+age2) + " years old in total.");
        // Implement your program here
    }
}
