
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Password?");
        String pass = reader.nextLine();
        String contra = "Caput Draconis";
        
        if(pass.equals(contra)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
        // Write your program here 
    }
}
