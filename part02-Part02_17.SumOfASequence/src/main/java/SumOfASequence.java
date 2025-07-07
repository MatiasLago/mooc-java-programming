
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number: ");
        int n = Integer.valueOf(scanner.nextLine());
       
        int suma = 0;
        
        for(int i = 0; i <= n ; i++){
            suma = suma + i;

        }
        System.out.println("The sum is " + suma);
    }
}
