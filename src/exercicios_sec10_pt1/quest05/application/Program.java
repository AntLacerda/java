package exercicios_sec10_pt1.quest05.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many numbers are you going to type? ");
        int N = sc.nextInt();
        double[] vect = new double[N];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        double highestNumber = 0.0;
        int highestNumberPosition = 0;

        for (int i = 0; i < vect.length; i++) {
            if(highestNumber <= vect[i]){
                highestNumber = vect[i];
                highestNumberPosition = i;
            }
        }

        System.out.printf("HIGUEST NUMBER: %.1f%n", highestNumber);
        System.out.printf("HIGUEST NUMBER POSITION: %d", highestNumberPosition);

        sc.close();
    }
}
