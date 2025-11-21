package exercicios_sec12_pt1.quest01.application;

import exercicios_sec12_pt1.quest01.entities.Department;
import exercicios_sec12_pt1.quest01.entities.Worker;
import exercicios_sec12_pt1.quest01.entities.enums.WorkerLevel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter department's name: ");
        String departmentName = sc.nextLine();
        Department department = new Department(departmentName);

        System.out.println("Enter worker data: ");
        System.out.printf("Name: ");
        //sc.nextLine();
        String workerName = sc.nextLine();
        System.out.printf("Level");
        //sc.nextLine();
        String level = sc.nextLine();
        WorkerLevel workerLevel = WorkerLevel.valueOf(level);
        System.out.printf("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, workerLevel, baseSalary, department);

        System.out.printf("How many contracts to this worker? ");
        int contractsAmount = sc.nextInt();

        sc.close();
    }
}
