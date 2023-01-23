import java.time.LocalDate;
import java.time.Period;

public class TestCDAccount2 {
    public static void main(String[] args) {
        BankAccount account = new CDAccount("123456", new MonetaryValue(150.00), LocalDate.parse("2022-09-15"), Period.ofMonths(6));
        withdrawAndPrint(account);
    }

    public static void withdrawAndPrint(BankAccount account) {
        account.withdraw(new MonetaryValue(100.00));
        System.out.println(account);
    }
}