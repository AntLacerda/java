package exercicios_sec16.model.services;

import exercicios_sec16.model.entities.Contract;
import exercicios_sec16.model.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        OnlinePaymentService service = this.onlinePaymentService;
        double amount = contract.getTotalValue() / months;
        double interest = 0.0;
        double paymentFee = 0.0;
        double finalValue = 0.0;

        for (int i = 0; i < months; i++) {
            interest = service.interest(amount, (i+1));
            paymentFee = service.paymentFee(amount + interest);
            finalValue = amount + paymentFee + interest;
            contract.addInstallment(new Installment(contract.getDate().plusMonths(i+1), finalValue));
        }
    }
}
