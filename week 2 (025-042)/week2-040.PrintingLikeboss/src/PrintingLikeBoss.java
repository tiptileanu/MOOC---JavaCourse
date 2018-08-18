public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
         int printed = 0; 
         while (printed < amount) { 
             System.out.print("*");
             printed = printed + 1;
         }
         System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int printed = 0; 
         while (printed < amount) { 
             System.out.print(" ");
             printed = printed + 1;
         }
    }

    public static void printTriangle(int size) {
        // 40.2
        int rows=1;
        while(rows<=size){
            printWhitespaces(size-rows);
            printStars(rows);
            rows++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int rows=1;
        int number_of_stars=1;
        while(rows<=height){
            printWhitespaces(height-rows);
            printStars(number_of_stars);
            rows++;
            number_of_stars+=2;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
