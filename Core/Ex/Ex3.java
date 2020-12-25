/* Code by KingNNT */
import java.lang.*;
import java.util.*;

/**
 * Ex3
 */
public class Ex3 {

    public Boolean isPrime() {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        if (a <= 1) return false;
        else if (a == 2 || a ==3 ) return true;
            else {
                for (int i = 2; i < a; i++)
                    if (a % i == 0) return false;
                return true;
            }
    }
    public static void main(String[] args) {
        Ex3 obj = new Ex3();

        if (obj.isPrime() == true ) System.out.println("Yes");
        else System.out.println("No");
    }
}