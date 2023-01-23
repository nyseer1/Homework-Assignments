public class MinMaxAccount extends BankAccount{
    private MonetaryValue min, max;

    public MinMaxAccount(String accountNumber, MonetaryValue balance){
        super(accountNumber, balance);
        min = balance;
        max = balance;
    }
    public MonetaryValue getMin(){
        return min;
    }
    public MonetaryValue getMax(){
        return max;
    }
    @Override
    public String toString(){
        return super.toString() + " [min=" + min
         + ", max=" + max + "]";
    }
    @Override
    public boolean deposit(MonetaryValue amount) {
        if (amount.isNegative()) {
            return false;
        }

        balance = balance.plus(amount);
        if(balance.isGreaterThan(max)){
            max = balance;
        }
        return true;
    }
    
    @Override
    public boolean withdraw(MonetaryValue amount) {
        if (withdrawalNotAllowed(amount)) {
            return false;
        }

        balance = balance.minus(amount);
        if(balance.isLessThan(min)){
            min = balance;
        }
        return true;
    }

}
