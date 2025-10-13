package exercicios_sec05;

import java.util.Scanner;

public class quest_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter any number: ");

        num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Even number!");
        } else {
            System.out.println("Odd number!");
        }

        sc.close();
    }
}
