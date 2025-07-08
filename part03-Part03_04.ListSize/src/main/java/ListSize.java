
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> teachers = new ArrayList<>();

teachers.add("Simon");
teachers.add("Samuel");
teachers.add("Ann");
teachers.add("Anna");

int index = 0;
// Repeat for as long as the value of the variable `index`
// is smaller than the size of the teachers list
while (index < teachers.size()) {
    System.out.println(teachers.get(index));
    index = index + 1;
}

    }
}
