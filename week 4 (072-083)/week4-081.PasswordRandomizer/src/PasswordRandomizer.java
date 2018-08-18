
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private int size;
    private Random random = new Random();
    private String password;

    public PasswordRandomizer(int length) {
        this.size = length;

    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        password="";
        while(i < this.size){
            int number=random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password+=symbol;
            i++;
        }
        return password;
    }
}
