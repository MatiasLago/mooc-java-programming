
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        
        int cant = 0;
        int suma = 0;
        double prom = 0;
        int even = 0;
        int odd = 0;
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                System.out.println("Thx! Bye");
                System.out.println("Sum: " +suma);
                System.out.println("Numbers: " +cant);
                System.out.println("Average: " +prom);
                System.out.println("Even:" +even);
                System.out.println("Odd: " +odd);
                break;
            }
            cant++;
            suma = suma + num;
            prom = (double) suma / cant;
            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
    }
}
