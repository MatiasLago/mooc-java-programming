
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cant = -1;
        int suma = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            suma = suma + num;
            cant++;
            double prom = (double) suma / cant;
            
            if(num == 0){
                System.out.println("Average of the numbers: " +prom);
                break;
            }
        }
    }
}
