import java.util.ArrayList;
import java.util.Scanner;

public class Psychiater {

    public Psychiater(String pNaam, int pNummer){
        this.pNaam = pNaam;
        this.pNummer = pNummer;
    }

    public String getpNaam() {
        return pNaam;
    }

    public int getpNummer() {
        return pNummer;
    }

    private String pNaam;
    private int pNummer;

    public boolean getMagReceptAanvragen() {
        return magReceptAanvragen;
    }

    private static boolean magReceptAanvragen = false;

    public static ArrayList<Psychiater> getPsychiaterList() {
        return psychiaterList;
    }

    public static ArrayList<Psychiater> psychiaterList = new ArrayList<Psychiater>();

    public void addPsychiater(){
        psychiaterList.add(new Psychiater("Peter Adriaenssens", 1));
        psychiaterList.add(new Psychiater("Alois Alzheimer", 2));
        psychiaterList.add(new Psychiater("Vladimir Bechterew", 3));
        psychiaterList.add(new Psychiater("Jan Bastiaans", 4));
        psychiaterList.add(new Psychiater("Kuno van Dijk", 5));
        psychiaterList.add(new Psychiater("Frederik van Eeden", 6));
        psychiaterList.add(new Psychiater("Jan Foudraine", 7));
        psychiaterList.add(new Psychiater("Sigmund Freud", 8));
        psychiaterList.add(new Psychiater("Kurt Goldstein", 9));
        psychiaterList.add(new Psychiater("Carl Gustav Jung", 10));
    }

    public void psychiaterLoop(){
        for(int i = 0; i < psychiaterList.size(); i++){
            System.out.println(psychiaterList.get(i));
        }
    }

    public String toString(){
        String printPNaam = "";
        printPNaam+= "Nummer: " + getpNummer() + ", Naam: " + getpNaam();
        return printPNaam;
    }

    public Boolean pKiezen(){
        Scanner scanner = new Scanner(System.in);
        psychiaterLoop();
        System.out.println("Welke psychiater moet voor u de aanvraag verwerken? Typ het nummer:");
        int tempPsych = scanner.nextInt();
        for (Psychiater i: getPsychiaterList()){
            if(tempPsych == i.getpNummer()){
                System.out.println("Psychiater: " + i.getpNaam() + " gaat het recept voor u uitschrijven bij uw volgende aanvraag.");

                return magReceptAanvragen = true;
            }
        }
        return magReceptAanvragen;
    }




}
