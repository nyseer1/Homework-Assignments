/**
 * CheckingAccount
 */
public class CheckingAccount extends BankAccount{
    private MonetaryValue overdraft;

    public CheckingAccount(String accountNum, 
    MonetaryValue balance, MonetaryValue overdraft){
        super(accountNum, balance);
        this.overdraft = overdraft;

    }

    public MonetaryValue getOverdraftLimit(){
        return overdraft;
    }
    @Override
    protected boolean withdrawalNotAllowed(MonetaryValue amount) {
        return amount.isNegative() || amount.isGreaterThan(overdraft.plus(this.balance));
    }
    
}