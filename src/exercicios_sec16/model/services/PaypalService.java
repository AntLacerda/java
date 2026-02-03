package exercicios_sec16.model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        double avarage = (double) months / 100;

        return amount * avarage;
    }
}
