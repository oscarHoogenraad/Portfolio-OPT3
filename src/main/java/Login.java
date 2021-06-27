import java.util.Scanner;

public class Login extends Account {
    public Login(String userName, String passWord) {
        super(userName, passWord);
    }

    public boolean getInlogSi() {
        return inlogSi;
    }

    private boolean inlogSi = false;
    public void checkLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");
        String checkName = scanner.nextLine();
        for(Account i : Account.getAccountList()){
            if(checkName.equals(i.getUserName())){
                System.out.println("Password:");
                String checkPassWord = scanner.nextLine();
                for(Account y : Account.getAccountList()){
                    if(checkPassWord.equals(i.getPassWord())){
                        System.out.println("U bent ingelod op account: " + i.getUserName());
                        inlogSi = true;

                    }
                    if(!checkPassWord.equals(i.getPassWord())){
                        System.out.println("Het ingevoerde Password is onjuist, probeer het opnieuw.");
                    }
                }
            }
            if(!checkName.equals(i.getUserName())){
                System.out.println("De ingevoerd Username klopt niet, probeer het opnieuw.");
            }
        }
    }

}
