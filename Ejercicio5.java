import java.util.Scanner;

/**
 * This program calculates the area of a rectangle
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce the width and height (cm) of a rectangle: ");
        float ancho = s.nextFloat();
        float alto = s.nextFloat();
        float area = ancho * alto;
        System.out.print("The area of the rectangle of " + ancho + " cm width and " + alto + " cm height is " + area);
    }
}