package exercicios_sec10_pt1.quest01.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("How many numbers are you going to type? ");
        N = sc.nextInt();

        int[] vect = new int[N];

        for(int i=0;i<N;i++) {
            System.out.println("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NEGATIVE NUMBERS: ");
        for (int i = 0; i < N; i++) {
            if(vect[i]< 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
