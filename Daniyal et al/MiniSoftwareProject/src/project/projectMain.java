package project;

import java.util.*;
import java.io.*;

public class projectMain {

    public static Scanner wordscan = new Scanner(System.in);
    public static Scanner numscan = new Scanner(System.in);
    public static ArrayList<Products> productList = new ArrayList();
    public static ArrayList<Accounts> accountList = new ArrayList();

    public static void main(String[] args) {

        new GUI_startupFrame().setVisible(true);
        //loadFile("accounts.txt", accountList);
        int currentID = 1000;
        
        productList.add(new Products(0.50, "fidget spinner", "Cool guy365", 4, currentID++));
        productList.add(new Products(45, "bookshelf", "BookLover12", 100, currentID++));
        productList.add(new Products(10, "shorts", "Sarah's_Shop", 20, currentID++));
        productList.add(new Products(63, "Season 7: Doctor Who", "Whovian4Life", 100, currentID++));
        productList.add(new Products(12, "Alice's Adventures in Wonderland", "BookWorm01",25, currentID++));
        productList.add(new Products(126, "desk", "CharlieSmith", 200, currentID++));
        productList.add(new Products(14, "skirt", "Sarah's_Shop", 20, currentID++));
        /*int choice;
        System.out.println("Please pick an option.\n 1.Login list\n 2.Create Account\n 3.Show full product list");
        choice = numscan.nextInt();
        if (choice == 2) {
            createAccount();
        }
         */
        accountList.add(new Customer("CoolDude5", "password", 500));
        accountList.add(new Customer("_cow_lover", "milk", 225));
        accountList.add(new Customer("puppysDogsPets", "dogname", 345));
        accountList.add(new Admin("BigBoss", "no", "CEO"));
        accountList.add(new Admin("littlecheese", "iwantapromotion", "Tech Assistant"));
        accountList.add(new Admin("millenial123", "yikes", "Intern"));
        
    }

    public static void saveFile(String filename, ArrayList<Accounts> tempList) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {

                String toSave = tempList.get(i).username;
                toSave += "," + tempList.get(i).password;
                //toSave += "," + tempList.get(i).balance; //Just needs getBalance method in Customer

                file.println(toSave);
            }
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }

    public static void loadFile(String filename, ArrayList tempList, ArrayList<Accounts> accountList) {
        String temp = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                temp = file.readLine();
                String tempArray[] = temp.split(",");

                //    tempList.add(new accountList(tempArray[0]));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Products searchProducts(int lookFor) {
        Products tempPro = new Products(0, "", "", 0, 0);
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getID() == lookFor) {
                // System.out.println("List of accounts" + accountList.get(i));
                tempPro = productList.get(i);
                return tempPro;
            }
        }
        return tempPro;
    }

    public static Accounts searchAccounts(String lookFor) {
        Accounts tempAcc = new Accounts("good", "good");
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).username.equals(lookFor)) {
                // System.out.println("List of accounts" + accountList.get(i));
                tempAcc = accountList.get(i);
                return tempAcc;
            }
        }
        return tempAcc;
    }

    public static void createAccount(String newusername, String newpass) {
        accountList.add(new Customer(newusername, newpass, 0));
        //saveFile(String filename, ArrayList<Accounts> tempList)
    }
}
