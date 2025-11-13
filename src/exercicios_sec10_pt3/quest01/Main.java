package exercicios_sec10_pt3.quest01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the line numbers: ");
        int N = sc.nextInt();

        System.out.printf("Enter the column numbers: ");
        int M = sc.nextInt();

        int[][] mat = new int[N][M];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("["+i+"]["+j+"]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.printf("Choose a number: ");
        int chosenNumber = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == chosenNumber) {
                    System.out.println("Position ["+i+"]["+j+"]: ");

                    if (i > 0) {
                        System.out.println("TOP: " + mat[i-1][j]);
                    }

                    if (j > 0) {
                        System.out.println("LEFT: " + mat[i][j-1]);
                    }

                    if (j+1 < mat.length){
                        System.out.println("RIGHT: " + mat[i][j+1]);
                    }

                    if (i+1 < mat.length){
                        System.out.println("DOWN: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
