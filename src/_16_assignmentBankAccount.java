//1. Write a Java program that defines a class BankAccount with the following private attributes:
//
//    accountNumber (String)
//    balance (double)
//
//Implement methods for both attributes and methods that
// allow balance updates but prevent negative values from being set.

import java.util.Scanner;

class BankAccount{

    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        if (balance > 0){
            this.balance = balance;
            System.out.printf("\n Account %s is credited with balance Rs.%.3f only.",this.accountNumber,this.balance);
        }else {
            System.out.println("Negative Balance cannot be implemented so it is set to 0");
            this.balance = 0.00;
        }

    }

    //Getters
    String getAccountNumber(){
        return accountNumber;
    }

    double getBalance(){
        return balance;
    }

    //Setters
    void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance){
        this.balance = balance;
    }


    public void updateBalance(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Do you want to update the existing balance?");
        String input = sc.nextLine().toUpperCase();


        if (input.equals("Y")) {
            System.out.println("Enter the Amount you want to update the current balance to: ");
            double updateAmt = sc.nextDouble();
            if (updateAmt > 0) {
                System.out.println("Amount updated successfully.");
                setBalance(updateAmt);
                System.out.println("The new Amount is Rs."+getBalance()+" only.");
            }else {
                System.out.println("Due to Input error Amount cannot be updated.");
            }


        }
    }

}


public class _16_assignmentBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accInput = sc.nextLine();
        System.out.print("\nEnter Balance for "+accInput+" :");
        double balInput = sc.nextDouble();

        BankAccount acc = new BankAccount(accInput,balInput);

        acc.updateBalance();

        sc.close();

}
}

