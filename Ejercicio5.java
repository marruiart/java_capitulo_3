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
        float width = s.nextFloat();
        float height = s.nextFloat();
        float area = width * height;
        System.out.print("The area of the rectangle of " + width + " cm width and " + height + " cm height is " + area);
    }
}