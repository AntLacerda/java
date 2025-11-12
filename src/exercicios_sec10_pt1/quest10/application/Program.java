package exercicios_sec10_pt1.quest10.application;

import exercicios_sec10_pt1.quest10.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many students are you going type? ");
        int N = sc.nextInt();
        Student[] students = new Student[N];
        String name;
        double firstScore;
        double secondScore;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the name, first and second " + (i+1) + "o student score: ");
            sc.nextLine();
            name = sc.nextLine();
            firstScore = sc.nextDouble();
            secondScore = sc.nextDouble();
            students[i]  = new Student(name, firstScore, secondScore);
        }

        System.out.println("APPROVED STUDENTS: ");
        for (int i = 0; i < students.length; i++) {
            if(students[i].gradeConference()){
                System.out.println(students[i].getName());
            }
        }

        sc.close();
    }
}
