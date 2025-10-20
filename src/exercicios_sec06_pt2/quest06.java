package exercicios_sec06_pt2;

import java.util.Scanner;

public class quest06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("Digite um valor inteiro: ");

        N = sc.nextInt();

        for(int i=1;i<=N;i++){
            if(N%i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
