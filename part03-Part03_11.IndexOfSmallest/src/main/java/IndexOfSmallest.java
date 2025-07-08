
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        // implement here  a program that reads user input
        // until the user enters 9999
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
            list.add(input);
        }
        
        System.out.println("");
       
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int i = 0;
        int menor = list.get(0);
        
        while(i < list.size()){
            if(menor > list.get(i)){
                menor = list.get(i);
            }
            i++;
        }
        
        System.out.println("Smallest number: " + menor);
        
        int j = 0;
        while(j < list.size()){
            if(list.get(j) == menor){
                System.out.println(menor + " is at index " + j);
            }
            j++;
        }
    }
}
