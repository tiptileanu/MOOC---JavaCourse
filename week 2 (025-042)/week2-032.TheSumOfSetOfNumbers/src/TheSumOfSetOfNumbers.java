
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what number?\t");
        int limit=Integer.parseInt(reader.nextLine());
        int sum=0;
        int nr=0;
        while(nr<=limit){
            sum+=nr;
            
            nr++;
        }
        System.out.println("Sum is: "+sum);
    }
}
