import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    private BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    BankAccount(final String name, final BankAccountType accountCategory) {
        Bank.totalAccounts++;
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public double getBalance() {
        return accountBalance;
    }
    public String getName() {
        return ownerName;
    }
    public BankAccountType getAccountType() {
        return accountType;
    }
    public void setName(String newName) {
        ownerName = newName;
    }
}
