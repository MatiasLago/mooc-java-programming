
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cuenta = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num > 0 && num < 0){
                System.out.println(num);
                
            }else if(num == 0){
                System.out.println("Number of numbers: " +cuenta);
                break;
            }
            cuenta = cuenta + 1;
        }
    }
}
