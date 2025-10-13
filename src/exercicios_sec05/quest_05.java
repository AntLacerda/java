package exercicios_sec05;

import java.util.Locale;
import java.util.Scanner;

public class quest_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code;
        int amount;
        double finalPrice = 0.00;

        System.out.println("Enter the product code and the amount: ");

        code = sc.nextInt();
        amount = sc.nextInt();

        if(code == 1) {
            finalPrice = amount * 4.00;
        } else if (code == 2) {
            finalPrice = amount * 4.50;
        } else if (code == 3) {
            finalPrice = amount * 5.00;
        } else if (code == 4) {
            finalPrice = amount * 2.00;
        } else if (code == 5) {
            finalPrice = amount * 1.50;
        } else {
            System.out.println("Code doesn't exist!");
        }

        System.out.printf("Total: R$ %.2f", finalPrice);
    }
}
