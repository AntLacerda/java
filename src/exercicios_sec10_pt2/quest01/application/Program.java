package exercicios_sec10_pt2.quest01.application;

import exercicios_sec10_pt2.quest01.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many employees will be registered? ");
        int N = sc.nextInt();
        List<Employee> list = new ArrayList<>();

        int id;
        String name;
        double salary;

        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i+1));
            System.out.printf("Id: ");
            id = sc.nextInt();
            System.out.printf("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.printf("Salary: ");
            salary = sc.nextDouble();
            System.out.println();

            list.add(new Employee(id, name, salary));
        }

        System.out.printf("Enter the employee id that will have salary increase: ");
        int increaseEmployeeId = sc.nextInt();
        System.out.printf("Enter the percentage: ");
        double increasePercentage = sc.nextDouble();

        Employee increaseEmployee = list.stream().filter(x -> x.getId() == increaseEmployeeId).findFirst().orElse(null);

        if (increaseEmployee == null){
            System.out.println("Invalid ID!");
        } else {
            increaseEmployee.increaseSalary(increasePercentage);
        }

        System.out.println("List of employees: ");
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }

        sc.close();
    }
}
