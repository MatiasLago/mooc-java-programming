public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }
    
    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i=1; i <= size; i++){
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for(int i=1; i<= height; i++){
            printSpaces(height - i);
            printStars(2 * i -1);
        }
        for(int j=0; j < 2; j++){
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // demo usage (not used by tests)
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}