package exercicios_sec10_pt1.quest04.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to type: ");
        int N = sc.nextInt();
        int[] vect = new int[N];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        int evenAmount = 0;
        System.out.println("EVEN NUMBERS: ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i]%2 == 0){
                System.out.print(vect[i] + "  ");
                evenAmount++;
            }
        }

        System.out.printf("%nQuantity of even numbers: %d", evenAmount);

        sc.close();
    }
}
