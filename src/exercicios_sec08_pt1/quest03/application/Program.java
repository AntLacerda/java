package exercicios_sec08_pt1.quest03.application;

import exercicios_sec08_pt1.quest03.entities.Grade;
import exercicios_sec08_pt1.quest03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.grades = new Grade();

        System.out.println("Enter the student's name and his(er) grades: ");
        student.name = sc.nextLine();
        student.grades.first = sc.nextDouble();
        student.grades.second = sc.nextDouble();
        student.grades.third = sc.nextDouble();

        student.checkGrades();

        sc.close();
    }
}
