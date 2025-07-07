
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prom = 0;
        int suma = 0;
        int cant = 0;
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            
            prom = (double) suma / cant;
            if(num > 0){
                suma = suma + num;
                cant++;
            } else if(suma <= 0 && num == 0){
                System.out.println("Cannot calculate the average");
                break;
            } else if(num == 0){
                System.out.println(prom);
                break;
            }
            
        }
    }
}
