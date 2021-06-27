import java.util.Scanner;

public class Menu {
    public static boolean finish = false;

    public static void optieLijst(){
        SwitchCases e = new SwitchCases();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij PsyQ!\n");
        printWeergave();
        while(!finish) {
            System.out.println("\nTerug naar menu? Typ 0.");
            int choice = scanner.nextInt();
            e.switchCaseMenu(choice);
        }
    }

    public static void printWeergave(){
        System.out.println("\nMaak een keuze door het cijfer in te typen van opdracht die u wilt uitvoeren." +
                "\nMenu:\n1. Nieuwe account aanmaken\n2. Inloggen\n3. Lijst van alle gebruikers\n4. Lijst van alle recepten\n" +
                "5. Beschrijving van alle recepten\n6. " +
                "Regels bij het aanvragen van een recept\n7. Recept aanvragen\n8. Lijst van psychiaters\n9. Programma stoppen");
    }
}