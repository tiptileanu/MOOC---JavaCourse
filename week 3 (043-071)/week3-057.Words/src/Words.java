import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            String word=reader.nextLine();
            if(word.equals("")){
//                word.isEmpty() can also be used to check if aword is empty
                break;
            
            } else {
                words.add(word);
            }
        }
        System.out.println("You types the following words: ");
        for(String names:words){
            System.out.println(names);
        }
    }
}
