import java.util.Scanner;
//
public class Menu {
    public void optieLijst(){
        Login c = new Login("", "");
        Account a = new Account("", "");
        Recepten b = new Recepten("a", 1, 1);
        boolean finish = false;
        System.out.println("Welkom bij PsyQ!\n");
        printWeergave();
        while(!finish) {
            System.out.println("\nTerug naar menu? Typ 0.");
        Scanner scanner  = new Scanner(System.in);
        int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printWeergave();
                    break;

                case 1:
                    a.accountAanmaken();
                    break;

                case 2:
                    c.checkLogin();
                    break;

                case 3:
                    if(c.getInlogSi()){
                        a.accountLoop();
                    }
                    else{
                        System.out.println("U kunt deze functie niet gebruiken als u niet bent ingelogd. Log in als u deze functie wilt gebruiken.");
                    }
                    break;

                case 4:
                    if(c.getInlogSi()){
                        b.addRecept();
                        b.receptLoop();
                    }
                    else{
                        System.out.println("U kunt deze functie niet gebruiken als u niet bent ingelogd. Log in als u deze functie wilt gebruiken.");
                    }

                case 5:
                    if(c.getInlogSi()){

                    }
                    else{
                        System.out.println("U kunt deze functie niet gebruiken als u niet bent ingelogd. Log in als u deze functie wilt gebruiken.");
                    }
            }
        }
    }

    public void printWeergave(){
        System.out.println("\nMaak een keuze door het cijfer in te typen van opdracht die u wilt uitvoeren." +
                "\nMenu:\n1. Nieuwe account aanmaken\n2. Inloggen\n3. Lijst van alle gebruikers\n4. Lijst van alle recepten\n5. Beschrijving van alle recepten\n6. " +
                "Regels bij het aanvragen van een recept\n7. Recept aanvragen\n8. Lijst van psychiaters");
    }
}