package exercicios_sec08_pt1.quest03.entities;

public class Student {
    public String name;
    public Grade grades;

    public void checkGrades() {
        double sumGrades = grades.sumGrades();

        if(sumGrades >= 60.00) {
            System.out.println("FINAL GRADe = " + sumGrades);
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60.00 - sumGrades) + " POINTS");
        }
    }
}
