
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String strings = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int entero = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double doble = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boleano = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " +strings);
        System.out.println("You gave the integer " + entero);
        System.out.println("You gave the double " + doble);
        System.out.println("You gave the boolean " + boleano);
    
    }
}
