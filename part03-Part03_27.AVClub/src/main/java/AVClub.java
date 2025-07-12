
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String linea = scanner.nextLine();
            if(linea.isEmpty()){
                break;
            }
            
            String partes[] = linea.split(" ");
            
            for(String palabra : partes){
                if(palabra.contains("av")){
                    System.out.println(palabra);
            }
        }
    }
}
}
