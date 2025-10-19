package exercicios_sec06_pt1;

import java.util.Scanner;

public class quest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X;
        int Y;

        System.out.println("Digite as coordenadas de X e Y: ");

        X = sc.nextInt();
        Y = sc.nextInt();

        while(X != 0 && Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("First");
            } else if(X < 0 && Y > 0) {
                System.out.println("Second");
            } else if(X < 0 && Y < 0) {
                System.out.println("Third");
            } else {
                System.out.println("Fourth");
            }

            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
}
