
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int edad = Integer.valueOf(scan.nextLine());
        
        if(edad >= 0 && edad <= 120){
            System.out.println("OK");
        } else{
            System.out.println("Impossible!");
        }
    }
}
