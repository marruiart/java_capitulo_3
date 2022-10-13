import java.util.Scanner;

/**
 * This program converts Mb into Kb
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce Mb: ");
        float mb = s.nextFloat();
        float kb = mb * 1024;
        System.out.printf("%.2f Mb = %.2f Kb", mb, kb);
    }
}
