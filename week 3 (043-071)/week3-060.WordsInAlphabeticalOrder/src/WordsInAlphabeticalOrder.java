
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            if (name.isEmpty()){
                break;
            }
            names.add(name);
        }
        
        Collections.sort(names);
        System.out.println("You typed the following words:");
        for(String entry:names){
            System.out.println(entry);
        }
    }
}
