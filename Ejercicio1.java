import java.util.Scanner;

/**
 * This program receives two numbers through the standard input and prints their
 * product
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce a number: ");
        double x = s.nextFloat();
        System.out.print("Please introduce another number: ");
        double y = s.nextFloat();
        if (y < 0)
            System.out.printf("%.1f * (%.1f) = %.1f", x, y, x * y);
        else
            System.out.printf("%.1f * %.1f = %.1f", x, y, x * y);
    }
}
