package exercicios_sec06_pt2;

import java.util.Scanner;

public class quest02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N;
        int number;
        int in = 0;
        int out = 0;

        System.out.println("Digite um valor inteiro: ");

        N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            number = sc.nextInt();

            if(number >= 10 && number <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in %n%d out", in, out);

        sc.close();
    }
}
