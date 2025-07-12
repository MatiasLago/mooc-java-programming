
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sumOfYears = 0;
        int count      = 0;
        
        while(true){
        String pers = scanner.nextLine();
            if(pers.equals("")){
                break;
            }
        
        String[] parts = pers.split(",");
        String name = parts[0];
        int year = Integer.valueOf(parts[1]);
        
         sumOfYears += year;
         count++;
            
        if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        
        double average = (double) sumOfYears / count;
        
        System.out.println("Longest name: " +longestName);
        System.out.println("Average of the birth years: " +average);
    }
}