package exercicios_sec13_pt1.quest01.application;

import exercicios_sec13_pt1.quest01.entities.Employee;
import exercicios_sec13_pt1.quest01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number of employees: ");
        int N = sc.nextInt();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i+1) + " data: ");
            System.out.printf("Outsourced (y/n)? ");
            sc.nextLine();
            String resp = sc.nextLine();

            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Hours: ");
            int hours = sc.nextInt();
            System.out.printf("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (resp.equals("n")) {
                employees.add(new Employee(name, hours, valuePerHour));
            }

            if (resp.equals("y")) {
                System.out.printf("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee i : employees) {
            System.out.println(i.getName() + " - $ " + i.payment());
        }

        sc.close();
    }
}
