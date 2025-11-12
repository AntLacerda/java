package exercicios_sec10_pt1.quest08.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many elements will vector have? ");
        int N = sc.nextInt();
        int[] vect = new int[N];
        int sum = 0;
        int evenAmount = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Enter a number: ");
            vect[i] = sc.nextInt();
            if(vect[i] % 2 == 0) {
                sum += vect[i];
                evenAmount++;
            }
        }

        if (evenAmount == 0) {
            System.out.println("NO EVEN NUMBER");
        } else {
            double average = sum / evenAmount;
            System.out.printf("EVEN'S AVERAGE = %.1f", average);
        }

        sc.close();
    }
}
