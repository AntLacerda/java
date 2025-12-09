package exercicios_sec13_pt1.quest03.entities;

public class NaturalPerson extends Taxpayer{
    private Double healthSpending;

    public NaturalPerson(){
        super();
    }

    public NaturalPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public Double tax() {
        double taxPercentage;

        if (getAnnualIncome() < 20000.0) {
            taxPercentage = 0.15;
        } else {
            taxPercentage = 0.25;
        }

        double healthSpendingDiscount = 0.0;

        if (healthSpending > 0) {
            healthSpendingDiscount = 0.5;
        }

        return (getAnnualIncome() * taxPercentage) - (getHealthSpending() * healthSpendingDiscount);
    }
}
