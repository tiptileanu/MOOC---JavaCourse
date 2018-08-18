
import java.util.Scanner;

public class BiggerNumber 
{

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Type an other number: ");
        int second = Integer.parseInt(reader.nextLine());
        System.out.println("The bigger number of the two numbers given was: " + (Math.max(first, second))); 
         
        
        // Implement your program here. Remember to ask the input from user
    }
   
}
