package banklogic;

import java.util.ArrayList;

public class Transaction {

    ArrayList<String> transactionList = new ArrayList<>();

    public void sendMoney(Account accountFromWhere, Account accountWhereTo, double deposit){
        if (accountFromWhere.getBalance() <= 0){
            System.out.println("Ошибка перевода: недостаточно денежных средств");
        }
        else{
            accountFromWhere.sendBalance(deposit);
            accountWhereTo.addBalance(deposit);
        }
    }
}
