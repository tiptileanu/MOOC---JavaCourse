
public class Printing {

    public static void printStars(int amount) {
        int i=1;
        while(i<=amount){
        System.out.print("*");
        i++;
        }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        int i=1;
        // 39.2
        while(i<=sideSize){
            printStars(sideSize);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int i=1;
        while(i<=height){
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int i=1;
        while(i<=size){
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
