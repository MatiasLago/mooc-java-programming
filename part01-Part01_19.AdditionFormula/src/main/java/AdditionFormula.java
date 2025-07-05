
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int primero = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int segundo = Integer.valueOf(scanner.nextLine());
        
        int suma = primero + segundo;
        
        System.out.println(primero + " + " + segundo +" = " +suma);
    }
}
