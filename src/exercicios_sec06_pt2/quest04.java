package exercicios_sec06_pt2;

import java.util.Locale;
import java.util.Scanner;

public class quest04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        int num1;
        int num2;
        double division = 0.0;

        System.out.println("Digite um numero inteiro: ");

        N = sc.nextInt();

        for(int i=0; i<N ; i++) {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            if(num2 == 0) {
                System.out.println("Divisao Impossivel!");
            } else {
                division = (double) num1/num2;
                System.out.printf("%.1f%n", division);
            }
        }

        sc.close();
    }
}
