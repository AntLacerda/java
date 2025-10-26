package exercicios_sec08_pt1.quest02.entities;

public class Employee {
    public String name;
    public double glossSalary;
    public double tax;

    public double netSalary() {
        return this.glossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        glossSalary += ((percentage/100)*glossSalary);
    }

    public String toString() {
        return this.name + ", $ " + this.netSalary();
    }

}
