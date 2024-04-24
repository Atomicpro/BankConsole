package BankLogic;

public class Transaction {

    public void sendMoney(Account accountFromWhere, Account accountWhereTo){
        if (accountFromWhere.getBalance() == 0){
            System.out.println("Ошибка перевода: Недостаточно денежных средств");
        }
    }
}
