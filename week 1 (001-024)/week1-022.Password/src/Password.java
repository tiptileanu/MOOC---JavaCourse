
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        while (true) {
            System.out.print("Type the password: ");
            String command = reader.nextLine();
            if (command.equals(password)) {
                System.out.println("Right!" + "\n\nThe secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
