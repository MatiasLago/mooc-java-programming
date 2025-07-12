
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayor = 0;
        String nombre = "";
        
        while(true){
        String pers = scanner.nextLine();    
            if(pers.equals("")){
                break;
            }
        
        String[] pp = pers.split(",");
        int age = Integer.valueOf(pp[1]);
        
        if(age > mayor){
            mayor = age;
            nombre = pp[0];
        }
        }
        System.out.println("Name of the oldest: " + nombre);
    }
}
