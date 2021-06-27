import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    public Account(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }

    private String userName;
    private String passWord;


    public static ArrayList<Account> getAccountList() {
        return accountList;
    }

    public static ArrayList<Account>accountList = new ArrayList<Account>();


    public String getPassWord() {
        return this.passWord;
    }

    public String getUserName() {
        return this.userName;
    }

    public void accountAanmaken(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("U gaat nu een nieuw account aanmaken.");
        System.out.println("Wat wordt uw Username? :");
        String tempName = scanner.nextLine();
        System.out.println("wat wordt uw Password? :");
        String tempPassWord = scanner.nextLine();
        accountList.add(new Account(tempName, tempPassWord));
        System.out.println("U heeft een nieuw account ingeschreven!");
    }

    public String toString(){
        String printAccounts = "";
        printAccounts+= "Username: " + this.userName + ", Password: " + this.passWord;
        return printAccounts;
    }

    public void accountLoop() {
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(i + ", " + accountList.get(i));
        }
    }

}