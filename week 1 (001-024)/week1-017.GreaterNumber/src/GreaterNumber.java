import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int first=Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int second=Integer.parseInt(reader.nextLine());
        if(first != second){
            System.out.println("Greater number: " + Math.max(first, second));
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
