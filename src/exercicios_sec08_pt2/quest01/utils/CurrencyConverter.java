package exercicios_sec08_pt2.quest01.utils;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double convertion(double dollarPrice, double amount) {
        return (dollarPrice * amount) + ((dollarPrice * amount) * IOF);
    }
}
