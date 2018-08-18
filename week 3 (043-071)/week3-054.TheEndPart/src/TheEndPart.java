import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word=reader.nextLine();
        System.out.println("Length of the end part: ");
        int nr_of_letters=Integer.parseInt(reader.nextLine());
        int index=word.length()-nr_of_letters;
        System.out.println("Result: "+word.substring(index));
    }
}
