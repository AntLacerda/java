package exercicios_sec08_pt2.quest01.application;

import exercicios_sec08_pt2.quest01.utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarPrice;
        double amount;

        System.out.print("What is the dollar price? ");
        dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        amount = sc.nextDouble();

        double convertion = CurrencyConverter.convertion(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais = %.2f", convertion);

        sc.close();
    }
}
