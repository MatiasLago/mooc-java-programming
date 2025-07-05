
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int primero = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int segundo = Integer.valueOf(scanner.nextLine());
        
        int suma = primero + segundo;
        int resta = primero - segundo;
        int multi = primero * segundo;
        double div = (double) primero / segundo;
        
        
        System.out.println(primero + " + " + segundo + " = " + suma);
        System.out.println(primero + " - " + segundo + " = " + resta);
        System.out.println(primero + " * " + segundo + " = " + multi);
        System.out.println(primero + " / " + segundo + " = " + div);
    }
}
