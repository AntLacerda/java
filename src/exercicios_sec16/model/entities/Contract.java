package exercicios_sec16.model.entities;

import exercicios_sec12_pt3.quest01.entities.OrderItem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    private List<Installment> installmentList = new ArrayList<>();

    public Contract() {

    }

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

    public void addInstallment(Installment installment) {
        this.installmentList.add(installment);
    }

    public void removeInstallment(Installment installment) {
        this.installmentList.remove(installment);
    }
}
