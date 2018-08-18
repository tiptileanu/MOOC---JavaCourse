
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while(true){
           System.out.print("Type floating point number: ");
           Double temperature=Double.parseDouble(reader.nextLine());
            if(temperature < -30 || temperature >40){
                System.out.println("Please keep it above -30 and below +40!");
            } else{
                
                Graph.addNumber(temperature);
            }
        }
        
        
        
    }
}
