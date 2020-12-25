/* Code by KingNNT */

import java.lang.*;
import java.util.*;

/**
 * Ex5
 */
public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n / 2; i++ )
            if (n % i == 0) System.out.println(i + " ");


    }
}