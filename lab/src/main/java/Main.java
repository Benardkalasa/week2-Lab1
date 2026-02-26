class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();

        acc1.accountNumber = "ZNB-001";
        acc1.ownerName = "Chanda Mutale";

        acc1.deposit(5000.00);
        acc1.deposit(2000.00);
        acc1.withdraw(1500.00);

        acc1.printStatement();

        BankAccount acc2 = new BankAccount();

        acc2.accountNumber = "ZNB-002";
        acc2.ownerName = "Bwalya Phiri";

        acc2.deposit(1800.00);
        acc2.withdraw(300.00);

        acc2.printStatement();

        System.out.println("acc1 balance: K" + acc1.getBalance());
        System.out.println("acc2 balance: K" + acc2.getBalance());

        if (acc1.hasSufficientFunds(4000.00)) {
            System.out.println(acc1.ownerName + " can afford K4000");
        } else {
            System.out.println(acc1.ownerName + " cannot afford K4000");
        }
        acc2.withdraw(2000.00);

if (acc2.isOverdrawn()) {
    System.out.println(acc2.ownerName + "'s account is overdrawn!");
} else {
    System.out.println(acc2.ownerName + "'s account is fine.");
}
    }
}