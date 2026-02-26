class BankAccount {

    String accountNumber;
    String ownerName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    double getBalance() {
        return balance;
    }

    boolean hasSufficientFunds(double amount) {
        return balance >= amount;
    }

    void printStatement() {
        System.out.println("Account:  " + accountNumber);
        System.out.println("Owner:    " + ownerName);
        System.out.println("Balance:  K" + balance);
        System.out.println("----------------------------");
    }
    boolean isOverdrawn() {
    return balance < 0;
}
void applyInterest(double rate) {
    balance = balance + (balance * rate);
}
    public static void main(String[] args) {
        Main.main(args);
    }
}
