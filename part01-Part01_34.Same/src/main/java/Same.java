
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String primero = scan.nextLine();
        String segundo = scan.nextLine();
        
        if(primero.equals(segundo)){
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }
        // Write your program here. 
    }
}
