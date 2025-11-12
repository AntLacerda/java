package exercicios_sec10_pt1.quest09.application;

import exercicios_sec10_pt1.quest09.entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many people are you going to type? ");
        int N = sc.nextInt();
        Person[] people = new Person[N];
        String name;
        int age;

        for (int i = 0; i < people.length; i++) {
            System.out.println((i+1) + "a person data: ");
            System.out.printf("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.printf("Age: ");
            age = sc.nextInt();
            people[i] = new Person(name, age);
        }

        int oldestAge = 0;
        int oldestPersonPosition = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() > oldestAge) {
                oldestAge = people[i].getAge();
                oldestPersonPosition = i;
            }
        }

        System.out.printf("OLDEST PERSON: %s", people[oldestPersonPosition].getName());

        sc.close();
    }
}
