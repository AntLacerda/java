package exercicios_sec16.application;

import exercicios_sec16.model.entities.Contract;
import exercicios_sec16.model.entities.Installment;
import exercicios_sec16.model.services.ContractService;
import exercicios_sec16.model.services.PaypalService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.printf("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.printf("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.printf("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        System.out.printf("Entre com o numero de parcelas: ");
        int months = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);

        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, months);

        for(Installment installment : contract.getInstallmentList()) {
            System.out.println(installment.getDueDate().format(fmt) + " - " + installment.getAmount());
        }

        sc.close();
    }
}
