
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int suma = 0;
        
        while(num1 <= num2){
            suma = suma + num1;
            num1++;
        }
        
        System.out.println("The sum is: " + suma);

    }
}
