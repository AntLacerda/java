package exercicios_sec10_pt1.quest07.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many elements will vector have? ");
        int N = sc.nextInt();
        double[] vect = new double[N];
        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Enter a number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double average = sum / N;

        System.out.printf("AVERAGE'S VECTOR = %.3f%n", average);
        System.out.println("ELEMENTS BELOW THE AVERAGE: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < average) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
