import java.util.Scanner;

/**
 * This program calculates the area of a triangle
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce the width and height (cm) of a triangle: ");
        float width = s.nextFloat();
        float height = s.nextFloat();
        float area = width * height / 2;
        System.out.print("The area of the triangle of " + width + " cm width and " + height + " cm height is " + area);
    }
}
