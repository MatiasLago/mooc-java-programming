
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
                   
            suma = suma + num;
                        
            if(num == 0){
                System.out.println("Sum of the numbers: " +suma);
                break;
            }
        }
    }
}
