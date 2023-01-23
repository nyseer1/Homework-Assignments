import java.time.LocalDate;
import java.time.Period;
    public class CDAccount extends BankAccount {
    
        private LocalDate start;
        private Period term;

        public CDAccount(String accountNumber, MonetaryValue balance
            , LocalDate start, Period term){
            super(accountNumber, balance);
            this.start = start;
            this.term = term;
        }

        public LocalDate getTermEnd(){
            //System.out.println("start " + start + " term " + term.getMonths() + " ");
            LocalDate termEnd = start;
            return termEnd.plus(term);
            
        }
        @Override
        protected boolean withdrawalNotAllowed(MonetaryValue amount) {
            return super.withdrawalNotAllowed(amount) || getTermEnd().isAfter(LocalDate.now());
        }
    }