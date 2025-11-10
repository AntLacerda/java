package exercicios_sec10_pt1.quest02.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int N = sc.nextInt();
        double[] vect = new double[N];
        double sum = 0.0;

        for (int i = 0; i < N; i++) {
            System.out.printf("Enter a number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double average = sum / N;

        System.out.print("VALORES = ");
        for (int i = 0; i < N; i++) {
            System.out.print("  " + vect[i]);
        }

        System.out.printf("%nSUM = %.2f%n", sum);
        System.out.printf("AVERAGE = %.2f%n", average);

        sc.close();
    }
}
