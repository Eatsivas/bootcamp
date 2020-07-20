package bank;

import java.util.ArrayList;
import java.util.Objects;

/*Create a BankAccount class with variables number(int), amount(double), name(String), active(boolean), transactions(ArrayList<String>)
Add getters/setters
Create methods deposit(), withdraw(). Do you need the setter for amount variable?
Store each action (deposit, withdraw, creation) in the transactions list.
Ιf account doesn't have amount, what can you withdraw?
Create a variable(accountsOpened) that counts the number of accounts opened. This variable shows how many accounts have been opened.
Create 3 contructors (default, name-number, all(except transactions)). When created all will be active. */

public class BankAccount {

    private int number;
    private double amount;
    private String name;
    private boolean active;
    private ArrayList<String> transactions;

    private static int accountsOpened;

    public BankAccount() {
        accountsOpened++;
        this.transactions = new ArrayList();
        this.transactions.add("Account created");
        active = true;
    }

    public BankAccount(String name, int number) {
        this();
        this.name = name;
        this.number = number;

    }

    public BankAccount(String name, int number, double amount) {
        this(name, number);
        this.amount = amount;

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

//    public void setAmount(double amount) {
//        this.amount = amount;
//    }

    public double getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

//    public void setTransactions(ArrayList<String> transactions) {
//        this.transactions =transactions ; 
//    }
    public void deposit(double amount) {
        this.amount += amount;
        String message = String.format("Deposit amount: %.2f ,Total Amount: %.2f ", amount, this.amount);
        transactions.add(message);
    }

    public void withdraw(double amount) {
        if (this.amount < amount) {
            amount = this.amount;
//            message = String.format("Withdraw amount: %.2f ,Total Amount: %.2f ", this.amount, 0.0);
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
        String message = String.format("Withdraw amount: %.2f ,Total Amount: %.2f ", amount, this.amount);
        transactions.add(message);
    }

    public static void printAccountsOpened() {
        System.out.println(accountsOpened + " accounts have been created !");
    }

//     public BankAccount(){
//        // An account must be active when created
//        this.active = true;
//        this.amount = 0;
//        accountsOpened++;
//        this.name = "No name";
//        // Use the number of accounts opened as a unique ID
//        this.number = accountsOpened;
//        // Create transactions list and store its first entry
//        this.transactions = new ArrayList<String>();
//        this.transactions.add("Account creation");
//        System.out.println("Account created.");
// }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.number;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + (this.active ? 1 : 0);
        hash = 31 * hash + Objects.hashCode(this.transactions);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BankAccount other = (BankAccount) obj;
        if (this.number != other.number) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (this.active != other.active) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.transactions, other.transactions)) {
            return false;
        }
        return true;
    }

    public void printTransactions() {
        int counter = 1;
        System.out.println("\n***Printing transactions of account" + name + "***");
        for (String transaction : transactions) {
            System.out.println(counter + ". " + transaction);
            counter++;
        }
    }

}
