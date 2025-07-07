
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cant = -1;
        int suma = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            cant++;
            suma = suma + num;
            
            if(num == 0){
                System.out.println("Number of numbers: " +cant);
                System.out.println("Sum of the numbers: " +suma);
                break;
            }
        }
    }
}
