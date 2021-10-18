package Transaction;

import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

    private void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else {
            if (amount > balance) {
                System.out.println("So tien ban rut vuot qua so du!");
            } else {
                balance -= amount;
            }
        }
    }

    /**
     *
     * @param amount as value.
     * @param operation as operator.
     */
    public void addTransaction(double amount, String operation) {
        if (operation != "deposit" && operation != "withdraw") {
            System.out.println("Yeu cau khong hop le!");
        } else {
            if (operation == "deposit") {
                deposit(amount);
            }
            if (operation == "withdraw") {
                withdraw(amount);
            }
        }
    }

    /**
     *
     */
    public void printTransaction() {

    }
}
