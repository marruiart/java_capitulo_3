import java.util.Scanner;

/**
 * This program calculates the weekly salary of a worker earning 12€/h
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please, how many hours did you work this week? ");
        int workedHours = s.nextInt();
        int weeklySalary = workedHours * 12;
        System.out.printf("The weekly salary after working %d hours, is %d", workedHours, weeklySalary);
    }
}
