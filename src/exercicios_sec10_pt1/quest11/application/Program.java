package exercicios_sec10_pt1.quest11.application;

import exercicios_sec10_pt1.quest11.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many people are you going to type? ");
        int N = sc.nextInt();
        Person[] people = new Person[N];
        double height;
        char gender;

        for (int i = 0; i < people.length; i++) {
            System.out.printf((i+1) + "a person height: ");
            height = sc.nextDouble();
            System.out.printf((i+1) + "a person gender: ");
            gender = sc.next().charAt(0);
            people[i] = new Person(height, gender);
        }

        double shorterHeight = people[0].getHeight();
        double greaterHeight = people[0].getHeight();
        double sum = 0.0;
        int womanAmount = 0;
        int menAmount = 0;


        for (int i = 0; i < people.length; i++) {
            if (people[i].getHeight() > greaterHeight) {
                greaterHeight = people[i].getHeight();
            }

            if (people[i].getHeight() < shorterHeight) {
                shorterHeight = people[i].getHeight();
            }

            if (Character.compare(people[i].getGender(), 'F') == 0){
                sum += people[i].getHeight();
                womanAmount++;
            } else {
                menAmount++;
            }
        }

        System.out.printf("Shorter Height = %.2f%n", shorterHeight);
        System.out.printf("Greater Height = %.2f%n", greaterHeight);
        System.out.printf("Women Height Average = %.2f%n", (sum/womanAmount));
        System.out.printf("Men Amount = %d", menAmount);

        sc.close();
    }
}
