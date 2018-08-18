
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        double max_power=Double.parseDouble(reader.nextLine());
        double power=0;
        int sum=0;
        
        while(power<=max_power){
            int result=(int)Math.pow(2, power);
            sum+=result;
            power++;
        }
        System.out.println("The result is: "+sum);
    }
}
