package aula_61;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Enter three numbers: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int higher = max(num1, num2, num3);

        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;

        if(x > y && x > z) {
            aux = x;
        } else if(y > x && y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    public static void showResult(int num) {
        System.out.printf("Higherst number: %d", num);
    }
}
