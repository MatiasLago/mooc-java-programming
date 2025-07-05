
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points[0-100]:");
        int nota = Integer.valueOf(scan.nextLine());
        
        if(nota > 100){
            System.out.println("Grade: Incredible!");
        } else if(nota >= 90 && nota <=100){
            System.out.println("Grade: 5");
        } else if(nota >= 80 && nota <= 89){
            System.out.println("Grade: 4");
        } else if(nota >= 70 && nota <= 79){
            System.out.println("Grade: 3");
        } else if(nota >= 60 && nota <= 69){
            System.out.println("Grade: 2");
        } else if(nota >= 50 && nota <= 59){
            System.out.println("Grade: 1");
        } else if(nota >= 0 && nota <= 49){
            System.out.println("Grade: failed");
        } else if(nota < 0){
            System.out.println("Grade: impossible!");
        }
    }
}
