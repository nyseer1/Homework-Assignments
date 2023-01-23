public class TestCheckingAccount2 {
    public static void main(String[] args) {
        BankAccount account = new CheckingAccount("123456", new MonetaryValue(50.00), new MonetaryValue(100.00));
        withdrawAndPrint(account);
    }

    public static void withdrawAndPrint(BankAccount account) {
        account.withdraw(new MonetaryValue(100.00));
        System.out.println(account);
    }
}