package exercicios_sec06_pt2;

import java.util.Locale;
import java.util.Scanner;

public class quest03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double first = 0.0;
        double second = 0.0;
        double third = 0.0;
        double media = 0.0;

        System.out.println("Digite um valor inteiro: ");

        N = sc.nextInt();

        for(int i=0 ; i<N ; i++){
            first = sc.nextDouble();
            second = sc.nextDouble();
            third = sc.nextDouble();

            media = ((first * 2) + (second * 3) + (third * 5))/10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
