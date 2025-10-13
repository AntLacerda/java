package exercicios_sec05;

import java.util.Scanner;

public class quest_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;

        System.out.println("Enter two numbers: ");

        A = sc.nextInt();
        B = sc.nextInt();

        if(A % B == 0 || B % A == 0) {
            System.out.println("Are multiple!");
        } else {
            System.out.println("Are not multiple!");
        }

        sc.close();
    }
}
