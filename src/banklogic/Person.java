package banklogic;

public class Person {
    private String userName;
    private String userSurname;
    private String userMiddleName;
    private String userPhone;

    public Person(String userName, String userSurname, String userMiddleName, String userPhone){
        this.userName = userName;
        this.userSurname = userSurname;
        this.userMiddleName = userMiddleName;
        this.userPhone = userPhone;
    }

    public String getUserName() {return userName;}

    public String getUserSurname() {return userSurname;}

    public String getUserMiddleName() {return userMiddleName;}

    public String getUserPhone() {return userPhone;}

    public void setUserName(String userName) {this.userName = userName;}

    public void setUserSurname(String userSurname) {this.userSurname = userSurname;}

    public void setUserMiddleName(String userMiddleName) {this.userMiddleName = userMiddleName;}

    public void setUserPhone(String userPhone) {this.userPhone = userPhone;}
    

}
