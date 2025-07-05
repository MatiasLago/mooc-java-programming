
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int primero = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int segundo = Integer.valueOf(scanner.nextLine());
        
        double prom =  (double) (primero + segundo) / 2; 
        
        System.out.println("The average is " + prom);
    }
}
