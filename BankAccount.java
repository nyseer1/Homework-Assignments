public class BankAccount {
    private String accountNumber;
    protected MonetaryValue balance;

    public BankAccount(String accountNumber, MonetaryValue balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accountNumber + " " + balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public MonetaryValue getBalance() {
        return balance;
    }

    public boolean deposit(MonetaryValue amount) {
        if (amount.isNegative()) {
            return false;
        }

        balance = balance.plus(amount);
        return true;
    }

    public boolean withdraw(MonetaryValue amount) {
        if (withdrawalNotAllowed(amount)) {
            return false;
        }

        balance = balance.minus(amount);
        return true;
    }
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }
        if (!(o instanceof BankAccount)) {
            return false;
        }
        BankAccount c = (BankAccount)o;
        return this.accountNumber.equals(c.accountNumber)
         && this.balance.equals(c.balance);

    }

	/* Determines if a withdrawal is not allowed to be made from from this BankAccount. 
	 * Withdrawals are not allowed if the amount to withdraw is negative, 
	 * or if there isn't enough money in the account such that performing the withdrawal would make the balance go below $0.00. 
	 */
    protected boolean withdrawalNotAllowed(MonetaryValue amount) {
        return amount.isNegative() || amount.isGreaterThan(balance);
    }
}