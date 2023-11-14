package FirstTest;

public class User {


    private String userName;
    private String password;
    private String typeOfUser;

    public User(String myUserName, String myPassword) {
        userName = myUserName;
        password = myPassword;

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    public String getTypeOfUser(){

        return typeOfUser;
    }

}







