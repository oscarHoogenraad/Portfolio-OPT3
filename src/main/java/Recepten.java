import java.util.ArrayList;

public class Recepten {

    public Recepten(String recept, int receptNr, double pricePerGram, boolean available) {
        this.recept = recept;
        this.receptNr = receptNr;
        this.pricePerGram = pricePerGram;

    }

    public static ArrayList<Recepten> getReceptList() {
        return receptList;
    }

    public static ArrayList<Recepten> receptList = new ArrayList<Recepten>();
    private String recept;
    private int receptNr;
    private double pricePerGram;
    public boolean listen = false;

    public boolean isAvailable() {
        return available;
    }

    private boolean available;

    public int getReceptNr() {
        return this.receptNr;
    }

    public String getRecept() {
        return this.recept;
    }

    public double getPricePerGram() {
        return this.pricePerGram;
    }

    public void addRecept() {
        receptList.add(new Recepten("Lisinopril", 1, 5.50, true));
        receptList.add(new Recepten("Atorvastatin", 2, 4.20, true));
        receptList.add(new Recepten("Levothyroxine", 3, 6.90, true));
        receptList.add(new Recepten("Metformin", 4, 20, true));
        receptList.add(new Recepten("Almodipine", 5, 2.35, true));
        receptList.add(new Recepten("Metoprolol", 6, 10, true));
        receptList.add(new Recepten("Omeprazole", 7, 7.30, true));
        receptList.add(new Recepten("Simvastatin", 8, 1.20, true));
        receptList.add(new Recepten("Losartan", 9, 4.40, true));
        receptList.add(new Recepten("Albuterol", 10, 35.10, true));
        receptList.add(new Recepten("Gabapentin", 11, 17, true));
        receptList.add(new Recepten("Hydrochlorothiazide", 12, 8.40, false));
        receptList.add(new Recepten("Acetaminophen", 13, 4.35, true));
        receptList.add(new Recepten("Sertraline", 14, 2.50, true));
        receptList.add(new Recepten("Fluticasone", 15, 56.37, false));
        receptList.add(new Recepten("Montelukast", 16, 82.18, true));
        receptList.add(new Recepten("Furosemide", 17, 9.14, true));
        receptList.add(new Recepten("Amoxicillin", 18, 16.27, true));
        receptList.add(new Recepten("Pantoprazole", 19, 38.40, false));
        receptList.add(new Recepten("Escitalopram", 20, 5.30, true));
    }

    public void receptLoop(){
        for(int i = 0; i < receptList.size(); i++){
            System.out.println(receptList.get(i));
        }
    }

    public void availability(){
        if(!isAvailable()){
            listen = true;
            System.out.println("Dit recept is momenteel niet beschikbaar, onze excuses voor het ongemak.");
        }
    }

    public String toString() {
        String printName = "";
        printName+="Nummer: " +getReceptNr() + ", Recept: " + getRecept() + ", Prijs per gram: " + getPricePerGram();
        return printName;
    }
}
