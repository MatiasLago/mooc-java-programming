
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int primero = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give the second number:");
        int segundo = Integer.valueOf(scan.nextLine());
        
        if(primero > segundo){
            System.out.println("Greater number is: " +primero);
        } else if(segundo > primero){
            System.out.println("Greater number is: " +segundo);
        } else{
            System.out.println("The numbers are equal!");
        }
    }
}
