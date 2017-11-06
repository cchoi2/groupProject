package project;

import java.util.ArrayList;

public class Accounts {

    protected String username;
    protected String password;

    public Accounts(String usn, String pswd) {

        username = usn;
        password = pswd;

    }//end constructor

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void removeAccount(String lookFor, int i) {
        Accounts tempAcc; 
        tempAcc = projectMain.searchAccounts(lookFor);
        projectMain.accountList.remove(tempAcc);
    }//end removeAccount

}//end class Account
