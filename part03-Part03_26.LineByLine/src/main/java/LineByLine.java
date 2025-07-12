
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                break;
            }
            
            String[] partes = line.split(" ");
            for(int i = 0; i < partes.length; i++){
                System.out.println(partes[i]);
        }
        }
    }
}
