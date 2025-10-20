package exercicios_sec06_pt2;

import java.util.Scanner;

public class quest05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int result = 1;

        System.out.println("Digite um valor: ");

        N = sc.nextInt();

        if(N != 0) {
            for(int i=N; i>0 ; i--){
                result *= i;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
