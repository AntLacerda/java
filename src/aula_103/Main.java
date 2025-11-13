package aula_103;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N]; //[linhas][colunas]

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int negativeNumbers = 0;
        System.out.println("Principal Diagonal: ");
        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.printf(mat[i][i] + " ");
            for (int j = 0; j < N; j++) {
                if(mat[i][j] < 0) {
                    negativeNumbers++;
                }

            }
        }

        System.out.println("Negative Numbers = " + negativeNumbers);

        sc.close();
    }
}
