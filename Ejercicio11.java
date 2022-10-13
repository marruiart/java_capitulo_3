import java.util.Scanner;

/**
 * This program converts Mb into Kb
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio11 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce Kb: ");
        float kb = s.nextFloat();
        float mb = kb / 1024;
        System.out.printf("%.2f Kb = %.2f Mb", kb, mb);
    }
}
