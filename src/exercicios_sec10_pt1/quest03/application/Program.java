package exercicios_sec10_pt1.quest03.application;

import exercicios_sec10_pt1.quest03.entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many people are you going to type: ");
        int N = sc.nextInt();
        People[] people = new People[N];

        double sum = 0.0;

        for (int i = 0; i < people.length; i++) {
            System.out.println((i+1) + "a person data: ");
            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Age: ");
            int age = sc.nextInt();
            System.out.printf("Height: ");
            double height = sc.nextDouble();

            sum += height;
            people[i] = new People(name, age, height);
        }

        double average = sum / N;
        System.out.printf("Height average: %.1f% %n", average);

        int underSixteen = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i].getAge() < 16){
                underSixteen++;
            }
        }
        double percentageUnderSixteen = (100 * underSixteen) / N;
        System.out.printf("Person under 16 years old: %.2f%n", percentageUnderSixteen);

        for (int i = 0; i < people.length; i++) {
            if(people[i].getAge() < 16){
                System.out.println(people[i].getName());
            }
        }

        sc.close();
    }
}
