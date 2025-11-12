package exercicios_sec10_pt1.quest06.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many values will each vector have? ");
        int N = sc.nextInt();
        int[] vectA = new int[N];
        int[] vectB = new int[N];
        int[] vectC = new int[N];

        System.out.println("Enter the vector's A values: ");
        for (int i = 0; i < N; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Enter the vector's B values: ");
        for (int i = 0; i < N; i++) {
            vectB[i] = sc.nextInt();
        }

        System.out.println("RESULTING VECTOR: ");
        for (int i = 0; i < N; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}
