
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(!guessedLetters.contains(letter)){
            if(!this.word.contains(letter)){
                numberOfFaults++;
                guessedLetters+=letter;
            }else if(!guessedLetters.contains(letter)){
            guessedLetters+=letter;
            }
        }
    }

    public String hiddenWord() {
        int i=0;
       
        String HiddenWord="";
  
     
        while (i < word.length()) {
            String a = word.charAt(i) + "";
            if (guessedLetters.contains(a)) {
                HiddenWord = HiddenWord+a;
            }
            else {
                HiddenWord = HiddenWord+"_";
            }
            i++;
        }   
        return HiddenWord;   
    }   
}
