package exercicios_sec05;

import java.util.Locale;
import java.util.Scanner;

public class quest_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X;
        double Y;

        System.out.println("Enter the X and Y value: ");

        X = sc.nextDouble();
        Y = sc.nextDouble();

        if (X > 0  && Y > 0) {
            System.out.println("Q1");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X == 0 && Y == 0) {
            System.out.println("Origin");
        } else if (X == 0) {
            System.out.println("Axle Y");
        } else if (Y == 0) {
            System.out.println("Axle X");
        }

        sc.close();
    }
}
