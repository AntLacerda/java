package exercicios_sec13_pt1.quest03.application;

import exercicios_sec13_pt1.quest03.entities.LegalEntity;
import exercicios_sec13_pt1.quest03.entities.NaturalPerson;
import exercicios_sec13_pt1.quest03.entities.Taxpayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number of tax payers: ");
        int N = sc.nextInt();

        List<Taxpayer> taxpayers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.printf("Individual or company (i/c)? ");
            char resp = sc.next().charAt(0);
            sc.nextLine();
            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (resp == 'i') {
                System.out.printf("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxpayers.add(new NaturalPerson(name, anualIncome, healthExpenditures));
            } else if (resp == 'c') {
                System.out.printf("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                taxpayers.add(new LegalEntity(name, anualIncome, numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Taxpayer payers : taxpayers) {
            System.out.println(payers.getName() + ": $ " + String.format("%.2f", payers.tax()));
            sum += payers.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: " + sum);

        sc.close();
    }
}
