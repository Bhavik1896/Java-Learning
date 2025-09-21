class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Balance: $" + balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit must be positive!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal!");
        }
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Cannot withdraw! Minimum balance $100 required.");
        }
    }

    void deposit(double amount, double bonus) {
        balance += (amount + bonus);
        System.out.println("Deposited: $" + amount + " + bonus $" + bonus);
    }
}

// Main class
class SimpleBanking {
    public static void main(String[] args) {
        // Regular account
        BankAccount account = new BankAccount(500);
        account.checkBalance();
        account.deposit(200);
        account.withdraw(100);
        account.checkBalance();

        System.out.println("------ Savings Account ------");

        // Savings account
        SavingsAccount savings = new SavingsAccount(500);
        savings.checkBalance();
        savings.deposit(200);
        savings.deposit(100, 20);
        savings.withdraw(550);
        savings.checkBalance();
    }
}
