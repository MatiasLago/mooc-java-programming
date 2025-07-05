
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int primero = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int segundo = Integer.valueOf(scanner.nextLine());
        
        int multi = primero * segundo;
        
        System.out.println(primero + " * " + segundo + " = " + multi);
    }
}
