
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double valor = Double.valueOf(scan.nextLine());
        
        if(valor < 5000){
            System.out.println("No tax!");
        } else if(valor >= 5000 && valor < 25000){
            double tax = (100 + (valor - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if(valor >= 25000 & valor < 55000){
            double tax = (1700 + (valor - 25000) * 0.10);
            System.out.println("Tax: " + tax);
        } else if(valor >= 55000 && valor < 200000){
            double tax = (4700 + (valor - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if(valor >= 200000 && valor < 1000000){
            double tax = (22100 + (valor - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else if(valor >= 1000000){
            double tax = (142100 + (valor - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }
    }
}
