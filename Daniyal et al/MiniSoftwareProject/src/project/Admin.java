package project;

import java.util.ArrayList;

public class Admin extends Accounts {

    String title;

    public Admin(String username, String password, String t) {
        super(username, password);
        title = t;

    }//end constructor

    public static void removeProduct(ArrayList<Products> productlist, String lookFor) {
        //projectMain.searchProducts(productlist, lookFor);
        
        for (int i = 0; i < productlist.size(); i++) {
            if (productlist.get(i).equals(lookFor)) {
               productlist.remove(i);
            }
        }
        
    }//end removeProduct

}//end class

