package BankLogic;

public class Person {
    private String userName;
    private String userSurname;
    private String userMiddleName;
    private String userPhone;

    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}
    
    public String getUserSurname() {return userSurname;}
    public void setUserSurname(String userSurname) {this.userSurname = userSurname;}
    
    public String getUserMiddleName() {return userMiddleName;}
    public void setUserMiddleName(String userMiddleName) {this.userMiddleName = userMiddleName;}
    
    public String getUserPhone() {return userPhone;}
    public void setUserPhone(String userPhone) {this.userPhone = userPhone;}
    
    public Person(String userName, String userSurname, String userMiddleName, String userPhone){
        this.userName = userName;
        this.userSurname = userSurname;
        this.userMiddleName = userMiddleName;
        this.userPhone = userPhone;
    }
}
