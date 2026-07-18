package userdefinedexception;

// User Defined Exception: Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// User Defined Exception: Invalid Deposit
class InvalidDepositException extends Exception {
    public InvalidDepositException(String message) {
        super(message);
    }
}

// User Defined Exception: Invalid Withdrawal
class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(String message) {
        super(message);
    }
}

// User Defined Exception: Minimum Balance
class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

// User Defined Exception: Maximum Deposit Limit
class MaximumDepositLimitException extends Exception {
    public MaximumDepositLimitException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 1000;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0)
            balance = 0;
        else
            balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount)
            throws InvalidDepositException, MaximumDepositLimitException {

        if (amount <= 0)
            throw new InvalidDepositException("Deposit amount must be greater than zero.");

        if (amount > 50000)
            throw new MaximumDepositLimitException("Deposit limit exceeded! Maximum 50000 allowed.");

        balance += amount;
        System.out.println("Successfully deposited: " + amount);
    }

    // Withdraw Method
    public void withdraw(double amount)
            throws InvalidWithdrawalException,
            InsufficientBalanceException,
            MinimumBalanceException {

        if (amount <= 0)
            throw new InvalidWithdrawalException("Withdrawal amount must be greater than zero.");

        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");

        if ((balance - amount) < MIN_BALANCE)
            throw new MinimumBalanceException("Minimum balance of 1000 must be maintained.");

        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount);
    }

    // Display Balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main Class
public class UserDefinedException {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        account.displayBalance();

        // Valid Deposit
        try {
            account.deposit(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Invalid Deposit
        try {
            account.deposit(-500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Deposit Above Limit
        try {
            account.deposit(60000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Valid Withdrawal
        try {
            account.withdraw(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Invalid Withdrawal
        try {
            account.withdraw(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Withdrawal More Than Balance
        try {
            account.withdraw(10000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Minimum Balance Exception
        try {
            account.withdraw(3500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        account.displayBalance();
    }
}
