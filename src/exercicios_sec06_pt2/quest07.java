package exercicios_sec06_pt2;

import java.util.Scanner;

public class quest07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int quadrado = 0;
        int cubo = 0;

        System.out.println("Digite um numero positivo: ");

        N = sc.nextInt();

        for(int i=1;i<=N;i++){
            System.out.printf("%d ", i);
            quadrado = (int) Math.pow(i, 2);
            System.out.printf("%d ", quadrado);
            cubo = (int) Math.pow(i, 3);
            System.out.printf("%d%n", cubo);
        }

        sc.close();
    }
}
