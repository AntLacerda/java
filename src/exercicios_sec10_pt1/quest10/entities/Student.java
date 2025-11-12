package exercicios_sec10_pt1.quest10.entities;

public class Student {
    private String name;
    private double firstScore;
    private double secondScore;

    public Student(String name, double firstScore, double secondScore) {
        this.name = name;
        this.firstScore = firstScore;
        this.secondScore = secondScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(double firstScore) {
        this.firstScore = firstScore;
    }

    public double getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(double secondScore) {
        this.secondScore = secondScore;
    }

    public boolean gradeConference() {
        double average = (this.firstScore + this.secondScore) / 2;
        if(average >= 6.0) {
            return true;
        } else {
            return false;
        }
    }
}
