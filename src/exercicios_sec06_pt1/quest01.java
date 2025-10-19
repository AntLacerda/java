package exercicios_sec06_pt1;

import java.util.Scanner;

public class quest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password = 2002;
        int attempt;

        System.out.println("Enter your Password: ");
        attempt = sc.nextInt();

        while(attempt != password) {
            System.out.println("Wrong Password");
            attempt = sc.nextInt();
        }

        System.out.println("Acess allowed!");
    }
}
