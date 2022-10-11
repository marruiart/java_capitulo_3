import java.util.Scanner;

/**
 * This program converts a variable given in pesetas through the standard input, into euros
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce amount in pesetas: ");
        float pesetas = s.nextFloat();
        float euros = pesetas / 166.386f;
        System.out.print(pesetas + " pesetas = " + euros + " euros");
    }
}
