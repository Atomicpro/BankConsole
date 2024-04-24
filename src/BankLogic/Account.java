package BankLogic;

public class Account extends Person{
    private String userLogin;
    private String userPassword;
    private double balance;

    public Account(String userName, String userSurname, String userMiddleName, String userPhone, String userLogin, String userPassword){
        super(userName,userSurname,userMiddleName,userPhone);
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    public String getUserLogin() {return userLogin;}
    public void setUserLogin(String userLogin) {this.userLogin = userLogin;}

    public String getUserPassword() {return userPassword;}
    public void setUserPassword(String userPassword) {this.userPassword = userPassword;}

    public double getBalance() {return balance;}
    public void addBalance(double deposit) {this.balance =+ deposit;}
    public void sendBalance(double deposit){this.balance =- deposit;}
}
