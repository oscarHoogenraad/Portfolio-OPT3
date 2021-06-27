import java.util.Scanner;

public class Login extends Account {
    public Login(String userName, String passWord) {
        super(userName, passWord);
    }

    public boolean getInlogSi() {
        return inlogSi;
    }
    private String checkName;
    private String checkPassWord;
    Scanner scanner = new Scanner(System.in);
    private boolean inlogSi = false;
    public void checkLogin(){
        login1();
        checkLoginFor();
    }
    public void checkLoginFor(){
        for(Account i : Account.getAccountList()){
            if(checkName.equals(i.getUserName())){
                login2();
                for(Account y : Account.getAccountList()){
                    if(checkPassWord.equals(i.getPassWord())){ System.out.println("U bent ingelod op account: " + i.getUserName()); inlogSi = true; }
                    if(!checkPassWord.equals(i.getPassWord())){ System.out.println("Het ingevoerde Password is onjuist, probeer het opnieuw."); }
                }
            }
            if(!checkName.equals(i.getUserName())){ System.out.println("De ingevoerd Username klopt niet, probeer het opnieuw."); }
        }
    }

    public void login2(){
        System.out.println("Password:");
        checkPassWord=scanner.nextLine();
    }

    public void login1() {
        System.out.println("Username:");
        checkName = scanner.nextLine();
    }
}
