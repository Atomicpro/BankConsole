package banklogic;

import java.util.ArrayList;

public class TransactionReceipt {
    private ArrayList<String> transactionList = new ArrayList<>();
    //В дальнейшем тут будет реализация передачи этого говна в аккаунт
    public void createReceipt(Transaction transaction){
        transactionList.add(transaction.accountFromWhere + " " + transaction.accountWhereTo + transaction.dateTransaction);
    }
}
