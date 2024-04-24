package BankLogic;

public class Transaction {

    public void moneyTransfer(Account accountFromWhere, Account accountWhereTo, double deposit){
        if (accountFromWhere.getBalance() == 0){
            System.out.println("Ошибка перевода: Недостаточно денежных средств");
        }
        else{
            accountFromWhere.sendBalance(deposit);
            accountWhereTo.addBalance(deposit);
        }
    }
}
