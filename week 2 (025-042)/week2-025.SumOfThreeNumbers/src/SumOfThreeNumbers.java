
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number: ");
        int second = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the third number: ");
        int third = Integer.parseInt(reader.nextLine());
        
        int sum = first + second + third;
        System.out.println("Sum: " + sum);
    }
}
