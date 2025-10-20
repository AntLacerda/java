package exercicios_sec06_pt2;

import java.util.Scanner;

public class quest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X;

        System.out.println("Digite um valor inteiro: ");

        X = sc.nextInt();

        for(int num = 1; num <= X; num++) {
            if(num%2 != 0){
                System.out.println(num);
            }
        }

        sc.close();
    }
}
