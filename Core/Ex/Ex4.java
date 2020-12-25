
/* Code by KingNNT */
import java.lang.*;
import java.util.*;

/**
 * Ex4
 */
public class Ex4 {

    public int n;
    
    public Boolean isPrime(int a) {
        
        // int a = Integer.parseInt(scanner.nextLine());
        if (a <= 1)
            return false;
        else if (a == 2 || a == 3)
            return true;
        else {
            for (int i = 2; i < a; i++)
                if (a % i == 0)
                    return false;
            return true;
        }
    }

    public static void main(String[] args) {
        Ex4 obj = new Ex4();
        Scanner scanner = new Scanner(System.in);
        obj.n = Integer.parseInt(scanner.nextLine());
        
        int dem = 0;
        int j = 2;
        while (dem < obj.n) {
            if (obj.isPrime(j) == true ) {
                System.out.println(j + " ");
                dem++;
            }
            j++;
        }
    }
}