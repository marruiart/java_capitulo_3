import java.util.Scanner;

/**
 * This program adds, subtracts, multiplies and divides two numbers given
 * through the standard input
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce a number: ");
        float x = s.nextFloat();
        System.out.print("Please introduce another number: ");
        float y = s.nextFloat();
        System.out.printf("x = %.2f | y = %.2f\n", x, y);
        System.out.printf("x + y = %.2f\n", x + y);
        System.out.printf("x - y = %.2f\n", x - y);
        System.out.printf("x * y = %.2f\n", x * y);
        System.out.printf("x / y = %.2f\n", x / y);
    }
}
