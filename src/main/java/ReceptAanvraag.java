import java.util.Scanner;

public class ReceptAanvraag extends Recepten {
    public ReceptAanvraag(String recept, int receptNr, double pricePerGram) {
        super(recept, receptNr, pricePerGram);
    }
    Psychiater a = new Psychiater("", 1);
    Scanner scanner = new Scanner(System.in);

    public void aanvraag(){
        boolean temp = a.getMagReceptAanvragen();
        if(temp) {
            receptLoop();
            System.out.println("Welk recept heeft u nodig? Typ het nummer:");
            int tempRNummer = scanner.nextInt();
            System.out.println("Hoeveel heeft u van dit recept nodig? (in gram aangeven, maximaal 5 gram, minimaal 0,5 gram.)");
            double tempHNummer = scanner.nextDouble();
            System.out.println("Waarom heeft u een nieuw recept nodig?");
            String uitleg = scanner.nextLine();
            scanner.nextLine();
            for (Recepten i : getReceptList()) {
                if (tempHNummer <= 5 && tempHNummer >= 0.5 && tempRNummer == i.getReceptNr()) {
                    System.out.println("Uw aanvraag van: " + tempHNummer + " gram " + i.getRecept() + " is goedgekeurd!");
                }
                if (tempHNummer > 5 && tempRNummer == i.getReceptNr()) {
                    System.out.println("U heeft te veel van uw gekozen recept aangevraagd, de maximum aanvraag is 5 gram.");
                }

                if (tempHNummer < 0.5 && tempRNummer == i.getReceptNr()) {
                    System.out.println("U heeft te weinig van uw gekozen recept aangevraagd, de minimum aanvraag is 0,5 gram.");
                }
            }
        }
        if(!temp){
            System.out.println("U moet eerst een psychiater kiezen. (punt 10 in het menu)");
        }
    }
}