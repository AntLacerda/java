package exercicios_sec13_pt1.quest03.entities;

public class LegalEntity extends Taxpayer{
    private Integer numberOfEmployees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double taxPercentage = 0.16;

        if (numberOfEmployees > 10) {
           taxPercentage = 0.14;
        }

        return getAnnualIncome() * taxPercentage;
    }
}
