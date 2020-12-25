/* Code by KingNNT*/
import java.lang.*;
import java.util.*;
/**
 * Ex1
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character = scanner.next().charAt(0);
        int ascii = (int) character;

        if (ascii >= 65 && ascii <= 90) System.out.println("UPPERCASE");
        else if (ascii >=97 && ascii <= 122) System.out.println("lowercase");
            else System.out.println("symbol");
    }
}