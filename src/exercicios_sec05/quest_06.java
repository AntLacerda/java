package exercicios_sec05;

import java.util.Locale;
import java.util.Scanner;

public class quest_06 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num;

        System.out.println("Enter any number between 0 and 100: ");

        num = sc.nextDouble();

        if(num >= 0 && num<= 25) {
            System.out.println("[0, 25] interval");
        } else if (num > 25 && num <= 50) {
            System.out.println("(25, 50] interval");
        } else if (num > 50 && num <= 75) {
            System.out.println("(50, 75] interval");
        } else if (num > 75 && num <= 100) {
            System.out.println("(75, 100] interval");
        } else {
            System.out.println("Out of interval");
        }

        sc.close();
    }
}
