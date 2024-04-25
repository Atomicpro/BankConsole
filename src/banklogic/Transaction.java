package banklogic;

import java.time.LocalDate;

public class Transaction {
    protected LocalDate dateTransaction;
    protected Account accountFromWhere;
    protected Account accountWhereTo;

    public void sendMoney(Account accountFromWhere, Account accountWhereTo, double deposit){
        this.accountFromWhere = accountFromWhere;
        this.accountWhereTo = accountWhereTo;
        if (this.accountFromWhere.getBalance() <= 0){
            System.out.println("Ошибка перевода: недостаточно денежных средств");
        }
        else{
            this.accountFromWhere.sendBalance(deposit);
            this.accountWhereTo.addBalance(deposit);
            dateTransaction = LocalDate.now();

        }
    }
}
