
/* Code by KingNNT*/
import java.lang.*;
import java.util.*;

/**
 * Ex2
 */
public class Ex2 {

    public int countUppercase() {
        Scanner scanner = new Scanner(System.in);
        int dem = 0;
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.charAt(i);
            if (temp >= 65 && temp <=90) dem++;
        }
        return dem;
    }
    public static void main(String[] args) {
        Ex2 obj = new Ex2();
        System.out.println(obj.countUppercase());
        
    }
}