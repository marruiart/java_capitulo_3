import java.util.Scanner;

/**
 * This program calculates the volume of a cone
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please introduce the height of the cone (cm): ");
        double height = s.nextDouble();
        System.out.print("Introduce the radius of the cone (cm): ");
        double radius = s.nextDouble();
        double volume = 1f / 3f * Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("The volume of a cone of %.2f cm radius and %.2f cm height is %.2f", radius, height, volume);
    }
}
