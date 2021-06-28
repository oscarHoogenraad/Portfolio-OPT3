import java.util.ArrayList;

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

}
