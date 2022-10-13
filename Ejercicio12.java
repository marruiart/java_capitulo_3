import java.util.Scanner;

/**
 * This program calculates the mark you need to get on the second exam in order
 * to reach the desired mark at the end of the term
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio12 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce the mark of the first exam: ");
        float firstExam = s.nextFloat();
        System.out.print("What mark would you like this term? ");
        float finalMark = s.nextFloat();
        float secondExam = (finalMark - 0.40f * firstExam) / 0.60f;
        System.out.printf("In order to reach a final mark of %.2f you need to get a mark of %.2f on the second exam",
                finalMark, secondExam);
    }
}
