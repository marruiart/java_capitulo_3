import java.util.Scanner;

/**
 * This program calculates the final price of a product after taxes
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please, introduce the price of the product before taxes: ");
        float price = s.nextFloat();
        System.out.print("Introduce the percentage of taxes: ");
        float taxes = s.nextFloat();
        float total = price + price*taxes/100;
        System.out.printf("The final price of the product is %.2f euros", total);
    }
}
