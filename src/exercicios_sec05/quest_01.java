package exercicios_sec05;

import java.util.Scanner;

public class quest_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter any number: ");

        num = sc.nextInt();

        if(num >= 0) {
            System.out.println("Not Negative!");
        } else {
            System.out.println("Negative!");
        }
    }
}
