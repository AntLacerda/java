package exercicios_sec09.application;

import exercicios_sec09.entities.BankAccount;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int accountNumber;
        String accountHolder;
        String initialDepositOption;
        double tempValue;
        
        System.out.printf("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.printf("Enter account holder: ");
        sc.nextLine();
        accountHolder = sc.nextLine();
        System.out.printf("Is there an initial deposit (y/n)? ");
        initialDepositOption = sc.nextLine();

        BankAccount bankAccount;
        
        if(Objects.equals(initialDepositOption, "y")) {
            System.out.printf("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
        } else {
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println("Account data: ");
        System.out.println(bankAccount.toString());
        System.out.println();

        System.out.printf("Enter a deposit value: ");
        tempValue = sc.nextDouble();
        bankAccount.deposit(tempValue);
        System.out.println("Update account data: ");
        System.out.println(bankAccount.toString());

        System.out.printf("Enter a withdraw value: ");
        tempValue = sc.nextDouble();
        bankAccount.withdrawal(tempValue);
        System.out.println("Update account data: ");
        System.out.println(bankAccount.toString());

        sc.close();
    }
}
