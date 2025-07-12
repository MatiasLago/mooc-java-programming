
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        int mayor = 0;        
        
        while(true){
            String pers = scanner.nextLine();
            if (pers.equals("")){
                break;
            }
            
            String[] na = pers.split(",");
            int age = Integer.valueOf(na[1]);

            if(age > mayor){
                mayor = age;
            }
        }
        System.out.println("Age of the oldest: "+mayor);
    }
}
