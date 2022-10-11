import java.util.Scanner;

/**
 * This program converts a variable given in euros through the standard input, into pesetas
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce amount in euros: ");
        float euros = s.nextFloat();
        float pesetas = euros * 166.386f;
        System.out.print(euros + " euros = " + pesetas + " pesetas");
    }
}
