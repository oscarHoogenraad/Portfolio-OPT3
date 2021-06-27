import java.util.Scanner;

public class SwitchCases {
    Menu d = new Menu();
    Login c = new Login("", "");
    Account a = new Account("", "");
    Recepten b = new Recepten("a", 1, 1);


    public void switchCases(int choice){
        Scanner scanner = new Scanner(System.in);
        switch(choice) {
            case 0 -> switch0();
            case 1 -> switch1();
            case 2 -> switch2();
            case 3 -> switch3();
            case 4 -> switch4();
            case 5 -> switch5();
            case 6 -> switch6();
            case 7 -> switch7();
            case 8 -> switch8();
            case 9 -> switch9();
        }
    }
    public void switch0(){
        d.printWeergave();
    }

    public void switch1(){
        a.accountAanmaken();
    }

    public void switch2(){
        c.checkLogin();
    }

    public void switch3(){
        if(c.getInlogSi()){
            a.accountLoop();
        }
        else{
            System.out.println("U kunt deze functie niet gebruiken als u niet bent ingelogd. Log in als u deze functie wilt gebruiken.");
        }
    }

    public void switch4(){
        if(c.getInlogSi()){
            b.addRecept();
            b.receptLoop();
        }
        else{
            System.out.println("U kunt deze functie niet gebruiken als u niet bent ingelogd. Log in als u deze functie wilt gebruiken.");
        }
    }

    public void switch5(){
        if(c.getInlogSi()){

        }
        else{
            System.out.println("U kunt deze functie niet gebruiken als u niet bent ingelogd. Log in als u deze functie wilt gebruiken.");
        }
    }

    public void switch6(){

    }

    public void switch7(){

    }

    public void switch8(){

    }

    public void switch9(){
        Menu.finish=true;
    }
}
