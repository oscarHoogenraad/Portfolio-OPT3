import java.util.Scanner;

public class ReceptBeschrijvingenSub extends ReceptBeschrijvingen {
    public ReceptBeschrijvingenSub(String recept, int receptNr, double pricePerGram) {
        super();
    }

    public void beschrijving(){
        Recepten a = new Recepten("", 1, 1);
        Scanner scanner = new Scanner(System.in);
        a.addRecept();
        a.receptLoop();
        System.out.println("Over welk recept wilt u meer weten? Typ het nummer");
        int besChoice = scanner.nextInt();
        switch(besChoice){
            case 1 -> beschrijving1();
            case 2  -> beschrijving2();
            case 3 -> beschrijving3();
            case 4 -> beschrijving4();
            case 5 -> beschrijving5();
            case 6 -> beschrijving6();
            case 7 -> beschrijving7();
            case 8 -> beschrijving8();
            case 9 -> beschrijving9();
            case 10 -> beschrijving10();
            case 11 -> beschrijving11();
            case 12 -> beschrijving12();
            case 13 -> beschrijving13();
            case 14 -> beschrijving14();
            case 15 -> beschrijving15();
            case 16 -> beschrijving16();
            case 17 -> beschrijving17();
            case 18 -> beschrijving18();
            case 19 -> beschrijving19();
            case 20 -> beschrijving20();
        }
    }


    @Override
    void beschrijving1() {
        System.out.println("Lisinopril verlaagt de bloeddruk en verbetert de pompkracht van het hart.\n" +
                "Bij hoge bloeddruk, hartfalen, nierziekten en na een hartinfarct.\n" +
                "Het effect komt geleidelijk gedurende 6 weken tot stand. Dan is te meten hoeveel uw bloeddruk is gedaald. Bij hartfalen merkt u dat u minder last heeft van benauwdheid en dikke enkels.\n" +
                "Door het medicijn elke dag te gebruiken heeft u minder kans op hart- en vaatziekten.\n" +
                "Krijgt u last van kriebelhoest? Overleg met uw arts als dit niet overgaat.\n" +
                "De eerste paar weken kunt u duizelig worden als u gaat staan. Neem het medicijn daarom de eerste dagen 's avonds in, als u op uw bed zit. Dan kunt u gaan liggen als u duizelig wordt.\n" +
                "Er zijn een paar belangrijke wisselwerkingen met andere middelen. Vraag uw apotheker of u lisinopril veilig kunt gebruiken met uw andere medicijnen, ook medicijnen die u zonder recept heeft gekocht.\n" +
                "Niet gebruiken als u zwanger bent.");
    }

    @Override
    void beschrijving2() {
        System.out.println("Atorvastatine verlaagt cholesterol en andere vetten in uw bloed. Ook zorgt het voor minder verstopping van uw aderen.\n" +
                "Bij een te hoog cholesterol en bij hart- en vaatziekten.\n" +
                "Slik atorvastatine elke dag. Dan heeft u minder kans op een hartaanval (hartinfarct) of een beroerte. Neem atorvastatine op een vast tijdstip, zodat u het niet vergeet.\n" +
                "In het begin kunt u last krijgen van klachten in de maag of darm. Ook kunt u hoofdpijn krijgen, duizelig worden, vermoeid raken of juist moeite hebben om in slaap te vallen. Deze klachten zijn na een paar dagen weg.\n" +
                "Ook kunt u spierpijn krijgen. Dit is meestal niet ernstig. Krijgt u erge spierpijn? Ga dan naar uw arts.\n" +
                "Grapefruit(sap) vergroot de kans op bijwerkingen. Lees in de folder hoeveel grapefruit(sap) u veilig kunt gebruiken.\n" +
                "Dit medicijn heeft veel wisselwerkingen met andere middelen. Laat uw apotheker daarom controleren of u atorvastatine veilig kunt gebruiken met uw andere medicijnen. Ook medicijnen die u zonder recept heeft gekocht.\n" +
                "Niet gebruiken als u zwanger bent.\n" +
                "Geef geen borstvoeding als u dit medicijn gebruikt. Het is niet zeker of dit medicijn veilig is voor de baby.");
    }

    @Override
    void beschrijving3() {
        System.out.println("Levothyroxine is een schildklierhormoon. Het is nodig voor allerlei processen in het lichaam. Zoals lichaamsgroei, stofwisseling en verstandelijk vermogen.\n" +
                "Bij een traag werkende schildklier. Hierbij bent u traag, kouwelijk, lusteloos en neemt uw gewicht toe. Ook samen met medicijnen die de schildklier remmen: deze kunnen een tekort aan schildklierhormoon veroorzaken. Levothyroxine heft dit op.\n" +
                "Het duurt enkele dagen voordat u iets merkt. Meestal moet u het medicijn levenslang gebruiken.\n" +
                "Neem de tabletten, capsules of drank elke dag op een vast tijdstip in en op een lege maag. Op een lege maag wordt het medicijn beter in het bloed opgenomen. Bijvoorbeeld een half uur voor het ontbijt of 2 uur na het avondeten.\n" +
                "Het kan een paar maanden duren voor de arts de juiste dosering voor u heeft gevonden. Als u goed bent ingesteld op het schildklierhormoon, zijn er vrijwel geen bijwerkingen.\n" +
                "Krijgt u hartkloppingen, een gejaagd gevoel, diarree of transpireert u veel en valt u af? Dan is de dosis misschien te hoog. Uw arts zal uw bloed regelmatig controleren om te bepalen of de dosis moet worden aangepast.\n" +
                "Veel wisselwerkingen met andere medicijnen. Laat uw apotheker controleren of u levothyroxine veilig kunt gebruiken met uw andere medicijnen, ook medicijnen die u zonder recept heeft gekocht.");
    }

    @Override
    void beschrijving4() {
        System.out.println("Metformine verlaagt uw bloedsuiker. Te veel suiker in uw bloed maakt u ziek en is schadelijk voor uw hart, bloedvaten, ogen, nieren en zenuwen.\n" +
                "Als u minder vruchtbaar bent, verhoogt metformine de kans dat een eicel uit uw eierstok vrijkomt.\n" +
                "Bij diabetes mellitus (suikerziekte). Soms ook als u minder vruchtbaar bent geworden door vergroeiing van uw eierstokken (PCOS).\n" +
                "De klachten van diabetes zoals dorst, vaak plassen en een droge mond verdwijnen meestal binnen een paar dagen. Binnen een paar weken bent u minder moe.\n" +
                "Gebruikt u de tabletten? Neem deze met een half glas water. De tabletten met verlengde afgifte (Glucient) moet u heel doorslikken.\n" +
                "Neem metformine elke dag in. Dan heeft u minder kans op schade door diabetes. Zoals wonden die slecht genezen, nierproblemen, hartziekten, vaatziekten, blindheid en pijn door schade aan een zenuw (zenuwpijn).\n" +
                "U kunt last krijgen van diarree, misselijkheid en braken. Wordt u misselijk? Neem metformine dan bij het eten. Dan heeft u er minder last van.\n" +
                "Verder kan u minder zin hebben om te eten en kunt u een vreemde smaak in uw mond krijgen, vooral in het begin van de behandeling.\n" +
                "Bent u zwanger? Of wilt u zwanger worden? Vraag aan uw arts of apotheker of u dit medicijn mag gebruiken.\n");
    }

    @Override
    void beschrijving5() {
        System.out.println("Amlodipine maakt uw bloedvaten wijder en verlaagt uw bloeddruk. Ook zal er meer zuurstof naar uw hart gaan.\n" +
                "Bij hoge bloeddruk en angina pectoris (pijnlijk en drukkend gevoel op uw borst).\n" +
                "Amlodipine laat uw bloeddruk binnen 6 weken langzaam dalen. Ook uw andere klachten worden minder.\n" +
                "Door het medicijn elke dag te gebruiken heeft u minder kans op hart- en vaatziekten.\n" +
                "U kunt last krijgen van dikke enkels en onderbenen, hoofdpijn, blozen, duizeligheid en maagdarmklachten. Ook kunt het plotseling heel warm krijgen, waardoor u bijvoorbeeld veel moet zweten. Dit wordt een opvlieger genoemd.\n" +
                "De meeste bijwerkingen verdwijnen binnen een paar weken. Blijft u last hebben? Overleg dan met uw arts.\n" +
                "Let op! Niet gebruiken als u zwanger bent. Het is niet zeker of dit medicijn veilig is voor zwangere vrouwen.\n" +
                "Geeft u borstvoeding? Dit medicijn komt in de moedermelk. Het is niet zeker of dit medicijn veilig is voor de baby. Vraag aan uw arts of apotheker of u dit medicijn mag gebruiken.");
    }

    @Override
    void beschrijving6() {
        System.out.println("Metoprolol vertraagt uw hartslag en maakt uw bloeddruk lager. Hierdoor heeft uw hart minder zuurstof nodig.\n" +
                "Bij hoge bloeddruk, angina pectoris (pijnlijk en drukkend gevoel op de borst), hartritmestoornissen, migraine, als u schildklier te snel werkt, bij hartfalen en na een hartinfarct (hartaanval).\n" +
                "Metoprolol laat uw bloeddruk binnen 6 weken langzaam dalen. Ook uw andere klachten worden minder.\n" +
                "Neem metoprolol op vaste tijden in. Dan zult u minder snel vergeten om het te gebruiken.\n" +
                "Mogelijke bijwerkingen: duizeligheid door een lage bloeddruk, koude handen en voeten, maagdarmklachten en hoofdpijn. Blijft u hier last van houden? Overleg dan met uw arts.\n" +
                "Bent u duizelig, moe of suf? Dan mag u niet autorijden.\n" +
                "Bent u zwanger? Of wilt u zwanger worden? Vraag aan uw arts of apotheker of u dit medicijn mag gebruiken.\n" +
                "Geeft u borstvoeding? Dit medicijn kan in de moedermelk komen. Vraag aan uw arts of apotheker of u dit medicijn mag gebruiken.\n" +
                "Dit medicijn heeft veel wisselwerkingen met andere medicijnen. Vraag aan uw apotheker of u dit medicijn veilig kunt gebruiken met uw andere medicijnen. Ook medicijnen die u zonder recept heeft gekocht.");
    }

    @Override
    void beschrijving7() {
        System.out.println("Omeprazol zorgt voor minder maagzuur.\n" +
                "Bij maagklachten zoals brandend maagzuur, maagzweren en darmzweren. Ook bij het syndroom van Zollinger-Ellison. Dit is een ziekte met veel maagklachten.\n" +
                "Omeprazol helpt ook om uw maag te beschermen als u andere medicijnen gebruikt die maagklachten geven. U hoeft omeprazol dan alleen te slikken op dagen dat u medicijnen gebruikt die de maag kunnen beschadigen.\n" +
                "Binnen een paar dagen heeft u minder last van uw maag.\n" +
                "Gebruikt u de capsules? Deze moet u heel slikken, zonder te kauwen. Heeft u moeite met slikken? U mag de capsule openen en de korreltjes innemen met water, yoghurt of vruchtensap.\n" +
                "Gebruikt u de tabletten: Deze moet u heel slikken, zonder te kauwen. Heeft u moeite met slikken? Doe de tablet in een half glas water. Roer om en drink op.\n" +
                "Hoelang u omeprazol moet gebruiken, hangt af van uw ziekte. Soms moet u het langdurig gebruiken, zodat de maagklachten niet terugkomen.\n" +
                "U kunt misselijk worden of buikpijn krijgen. Ook kunt u last krijgen van hoofdpijn. Heeft u veel last van bijwerkingen? Vraag uw arts of apotheker om advies.\n" +
                "Dit medicijn heeft veel wisselwerkingen met andere medicijnen. Laat uw apotheker daarom controleren of u omeprazol veilig kunt gebruiken met uw andere medicijnen. Ook medicijnen die u zonder recept heeft gekocht.");
    }

    @Override
    void beschrijving8() {
        System.out.println("Simvastatine verlaagt cholesterol en andere bloedvetten in uw bloed. Van te veel cholesterol gaan uw bloedvaten dicht zitten.\n" +
                "Bij een te hoog cholesterol en bij hart- en vaatziekten.\n" +
                "Neem simvastatine 's avonds in. 's Nachts maakt uw lever namelijk meer cholesterol aan. Slik simvastatine elke dag, dan heeft u minder kans op een hartaanval of beroerte.\n" +
                "In het begin van de behandeling kunt u last krijgen van klachten in de maag of darm. Ook kunt u hoofdpijn krijgen, duizelig worden of moeite hebben met in slaap vallen. Deze klachten zijn na een paar dagen weg.\n" +
                "Ook kunt u spierpijn krijgen. Dit is meestal niet ernstig. Ga naar uw arts als u erge spierpijn krijgt.\n" +
                "Drink geen grapefruitsap en eet geen grapefruit als u dit medicijn gebruikt. U kunt dan last krijgen van bijwerkingen.\n" +
                "Dit medicijn heeft veel wisselwerkingen met andere medicijnen. Laat uw apotheker daarom controleren of u simvastatine veilig kunt gebruiken met uw andere medicijnen. Ook medicijnen die u zonder recept heeft gekocht.\n" +
                "Niet gebruiken als u zwanger bent. Het is niet zeker of dit medicijn veilig is voor zwangere vrouwen.\n" +
                "Geef geen borstvoeding als u dit medicijn gebruikt. Het is niet zeker of dit medicijn veilig is voor de baby.");
    }

    @Override
    void beschrijving9() {
        System.out.println("Losartan verlaagt de bloeddruk, verbetert de pompkracht van het hart, voorkomt nierbeschadiging en gaat vaatvernauwing tegen.\n" +
                "Bij hoge bloeddruk, hartfalen en nierziekten.\n" +
                "Het effect komt geleidelijk gedurende 6 weken tot stand. Dan is te meten hoeveel uw bloeddruk is gedaald. Bij hartfalen merkt u dat u minder last heeft van benauwdheid en dikke enkels.\n" +
                "Door het medicijn elke dag te gebruiken heeft u minder kans op hart- en vaatziekten.\n" +
                "De eerste paar weken kunt u duizelig worden als u gaat staan. Neem het medicijn daarom de eerste dagen 's avonds in, als u op uw bed zit. Dan kunt u gaan liggen als u duizelig wordt.\n" +
                "Er zijn een paar belangrijke wisselwerkingen met andere middelen. Vraag uw apotheker of u losartan veilig kunt gebruiken met uw andere medicijnen, ook medicijnen die u zonder recept heeft gekocht.\n" +
                "Niet gebruiken als u zwanger bent.\n" +
                "Wilt u borstvoeding geven, overleg dan met uw arts of apotheker. Het is niet bekend of dit medicijn in de moedermelk terechtkomt en of het schadelijk voor de baby is.");
    }

    @Override
    void beschrijving10() {
        System.out.println("Salbutamol opent uw luchtwegen. Hierdoor wordt u minder benauwd.\n" +
                "Bij de longziekten astma en COPD (chronische obstructieve longziekte).\n" +
                "Binnen 5 minuten na het inademen van salbutamol merkt u dat u minder benauwd bent. Daarom wordt dit medicijn een snelwerkende luchtwegverwijder genoemd. Het werkt 4 tot 6 uur lang.\n" +
                "Salbutamol inademen is niet makkelijk. Een apotheekmedewerker kan u laten zien hoe het moet. Of bekijk het instructiefilmpje op deze website. Laat elk jaar in de apotheek controleren of u dit medicijn nog juist inademt.\n" +
                "Heeft u moeite met het gebruik van uw inhalatie-apparaat? Er zijn verschillende inhalatie-apparaatjes beschikbaar. Vraag uw arts of apotheek of een ander soort apparaatje geschikter voor u is.\n" +
                "U kunt last krijgen van irritatie van mond en keel en van gaatjes in uw gebit (cariës). Spoel altijd uw mond nadat u dit mediijn heeft ingeademd.\n" +
                "U kunt hartkloppingen, trillende handen of hoofdpijn krijgen. Ook kunt u gaan hoesten. Deze bijwerkingen horen binnen een paar uur na inademen van dit medicijn te verdwijnen. U zult hier na verloop van tijd minder last van krijgen, omdat u eraan zult wennen. Heeft u na 2 weken nog steeds deze klachten? Vraag dan uw arts om advies.");
    }

    @Override
    void beschrijving11() {
        System.out.println("Gabapentine brengt overprikkelde zenuwen in de hersenen tot rust.\n" +
                "Bij epilepsie en zenuwpijn. Soms ook bij het complex regionaal pijnsyndroom (CRPS, ook posttraumatische dystrofie genoemd), voortdurende hik, spierkrampen, rusteloze benen en om opvliegers tegen te gaan na de behandeling van borstkanker.\n" +
                "Het kan enkele weken duren voordat u het effect merkt.\n" +
                "Bijwerkingen in het begin: sufheid, duizeligheid of slapeloosheid. Verder problemen met bewegen, zoals onzeker lopen. Deze bijwerkingen verdwijnen binnen enkele weken vanzelf. U heeft meer kans op infecties, zoals verkoudheid.\n" +
                "U heeft minder kans op bijwerkingen als u met een lage dosis begint en de dosering daarna langzaam opbouwt.\n" +
                "Pas op met alcohol. Dit kan u nog suffer maken.\n" +
                "U mag de eerste week niet autorijden. Nadat u 1 week lang dezelfde dosering heeft gebruikt mag u weer autorijden. Rijd daarna alleen als u geen bijwerkingen heeft.\n" +
                "Heeft u het een lange tijd gebruikt en wilt u stoppen? Stop dan niet in één keer. U kunt last krijgen van ontwenningsverschijnselen zoals: angst, niet kunnen slapen, misselijk worden en zweten. Vraag u arts of apotheker om advies.\n" +
                "Bent u zwanger of wilt u zwanger worden? Vraag aan uw arts of u dit medicijn mag gebruiken.\n" +
                "Geeft u borstvoeding? Dit medicijn komt in de moedermelk en dat kan slecht zijn voor uw baby. Vraag aan uw arts of apotheker of u dit medicijn mag gebruiken");
    }

    @Override
    void beschrijving12() {
        System.out.println("Hydrochloorthiazide is een plasmiddel. Het verlaagt de bloeddruk en verbetert de pompkracht van het hart. Triamtereen voorkomt dat u te veel kalium uitplast.\n" +
                "Bij hoge bloeddruk, hartfalen en oedeem (vochtophoping).\n" +
                "Het effect komt geleidelijk gedurende 6 weken tot stand. Dan is te meten hoeveel uw bloeddruk is gedaald. Bij hartfalen merkt u dat u minder last heeft van benauwdheid en dikke enkels.\n" +
                "Door het medicijn elke dag te gebruiken, heeft u minder kans op hart- en vaatziekten.\n" +
                "Moet u veel plassen op onhandige momenten? Dan kunt u het tijdstip van inname aanpassen. Neem hydrochloorthiazide niet later in dan 16.00 uur. Anders moet u vaak 's nachts opstaan om te plassen.\n" +
                "Wisselwerkingen met andere middelen. Laat uw apotheker controleren of u dit medicijn veilig kunt gebruiken met uw andere medicijnen, ook medicijnen die u zonder recept heeft gekocht.");
    }

    @Override
    void beschrijving13() {
        System.out.println("Metamizol stilt pijn, vermindert spierkrampen, ontstekingen en verlaagt koorts.\n" +
                "Bij pijn, zoals pijn na een operatie, pijnaanval door niersteen (niersteenkoliek) en pijn bij kanker en bij migraine.\n" +
                "De pijn wordt binnen 30 minuten minder. Metamizol werkt ongeveer 4 uur. Koorts vermindert binnen 30 minuten tot 1 uur. Dit effect houdt 4 tot 6 uur aan.\n" +
                "Bijwerkingen zijn huiduitslag, pijn en plaatselijke reacties op de injectieplaats.\n" +
                "Let op: kans op maag- en darmzweren en bloedingen. Bent u ouder dan 70 jaar, heeft u eerder een maag- of darmzweer gehad of gebruikt u anti-bloedstollingsmedicijnen? Dan heeft u een maagbeschermer nodig. Vraag uw arts of apotheker hiernaar.\n" +
                "Metamizolde kan uw plas een andere kleur geven.\n" +
                "Veel wisselwerkingen met andere medicijnen. Vraag uw apotheker of u metamizol veilig kunt gebruiken met uw andere geneesmiddelen. Ook als u die zonder recept heeft gekocht.\n" +
                "Bent u zwanger of wilt u zwanger worden? Vraag aan uw arts of u dit medicijn mag gebruiken. Dit medicijn kan slecht zijn voor de baby. NIET gebruiken bij pijn in de laatste 3 maanden van uw zwangerschap.\n" +
                "Geeft u borstvoeding? Dit medicijn komt in de moedermelk. Het is niet zeker of dit medicijn veilig is voor de baby. Vraag aan uw arts of apotheker of u dit medicijn mag gebruiken.");
    }

    @Override
    void beschrijving14() {
        System.out.println("Sertraline verbetert uw stemming en maakt u minder angstig. Hierdoor heeft u minder last van piekeren, slaapproblemen, prikkelbaarheid en trillen. Ook vertraagt sertraline de zaadlozing.\n" +
                "Bij depressie en angststoornissen, zoals sociale fobie, specifieke fobie, dwangstoornis, paniekstoornis en angststoornissen na ernstige gebeurtenissen (posttraumatische stressstoornis). Ook bij menstruatieklachten, jeuk en hik. Verder kan het ook helpen bij vroegtijdige zaadlozing (te vroeg klaarkomen).\n" +
                "U merkt na een paar weken dat de behandeling werkt.\n" +
                "U kunt wel meteen last krijgen van maagdarmklachten en een droge mond. Door een droge mond ontstaan sneller gaatjes. Poets daarom goed. Ook kunt u minder zin krijgen in vrijen.\n" +
                "U kunt de eerste tijd suf zijn. Rijd dan geen auto.\n" +
                "Pas op met alcohol. Dit kan u nog suffer maken.\n" +
                "Dit medicijn heeft veel wisselwerkingen met andere medicijnen. Laat uw apotheker daarom controleren of u sertraline veilig kunt gebruiken met uw andere medicijnen. Ook medicijnen die u zonder recept heeft gekocht.\n" +
                "Gebruikt u sertraline al een paar weken? Stop dan niet in één keer. Bespreek dit eerst met uw arts of apotheker.\n" +
                "Bent u zwanger of wilt u zwanger worden? Overleg met uw arts of u dit medicijn mag gebruiken.");
    }

    @Override
    void beschrijving15() {
        System.out.println("Fluticason is een bijnierschorshormoon (corticosteroïd). De neusspray of neusdruppels met fluticason remmen ontstekingen in de neus.\n" +
                "Bij langdurig ontstoken neusslijmvlies, allergie, hooikoorts en neuspoliepen.\n" +
                "Het kan een week duren voor de verschijnselen minder worden. In een maand tijd kan het effect nog verder verbeteren.\n" +
                "Snuit vooraf uw neus. Schud het flesje of de ampul goed.\n" +
                "Neusspray: druk het ene neusgat dicht en spray in het andere neusgat, richting buitenkant van uw neus. Terwijl u sprayt moet u de vloeistof opsnuiven.\n" +
                "Neusdruppels: open de ampul. Ga staan of kniel en buig voorover. Plaats de ampul in een neusgat en druk er zacht op. Doe dat ook bij het andere neusgat. Blijf daarna nog een minuut voorovergebogen zitten of staan.\n" +
                "Lees verder de instructie op de site.\n" +
                "U kunt last krijgen van een bloedneus, irritatie of een droog gevoel in de neus, hoofdpijn, en een vieze smaak of geur.\n" +
                "Heeft u dit medicijn meerdere weken gebruikt en u wilt stoppen? Bouw langzaam af in overleg met uw arts.");
    }

    @Override
    void beschrijving16() {
        System.out.println("Montelukast remt ontstekingen in longen en in de neus.\n" +
                "Bij astma. Ook bij neusklachten door hooikoorts bij mensen met astma.\n" +
                "U merkt binnen een paar dagen dat uw klachten verminderen.\n" +
                "Neem montelukast in voor u gaat slapen. In de meeste gevallen werkt dat het beste.\n" +
                "Kauwtabletten: neem in op een lege maag, dat is 1 uur voor of 2 uur na de maaltijd. Dan neemt het lichaam het beter op.\n" +
                "Korrels en gewone tabletten: neem in zonder kauwen. Korrels mag u mengen met wat koude of lauwe voeding, zoals appelmoes.\n" +
                "U heeft meer kans op infecties van neus en keel. Raadpleeg uw arts als u last heeft van rode slijmvliezen en een pijnlijke neus en keel.\n" +
                "Maagdarmklachten gaan meestal binnen een paar dagen over, als uw lichaam gewend is aan het medicijn.");
    }

    @Override
    void beschrijving17() {
        System.out.println("Furosemide is een plasmiddel. Het zorgt ervoor dat u onnodig vocht uitplast. Dit verbetert de pompkracht van het hart.\n" +
                "Bij hartfalen (als uw hart het bloed minder goed rondpompt), oedeem(als uw lichaam te veel vocht vasthoudt), nierziekten en hoge bloeddruk.\n" +
                "Door furosemide moet u meer plassen. Vaak binnen u een half uur tot ongeveer 8 uur nadat u het hebt gebruikt.\n" +
                "Binnen enkele dagen heeft u minder last van benauwdheid en dikke enkels.\n" +
                "Door furosemide elke dag te gebruiken blijft de pompkracht van uw hart beschermd. U bent dan minder snel moe.\n" +
                "Moet u veel plassen op onhandige momenten? Dan kunt u furosemide op een ander moment slikken. Neem furosemide niet later in dan 17.00 uur. Want dan moet u 's nachts vaak plassen.\n" +
                "De eerste dagen kunt u last krijgen van hoofdpijn, droge mond, dorst, slechter zien en duizeligheid. Dit komt doordat u in korte tijd veel vocht verliest. Heeft u hier veel last van? Overleg dan met uw arts.\n" +
                "Bent u duizelig? Sta dan niet te snel op uit uw bed of stoel.\n" +
                "Dit medicijn heeft veel wisselwerkingen met andere medicijnen. Laat uw apotheker daarom controleren of u furosemide veilig kunt gebruiken met uw andere medicijnen. Ook medicijnen die u zonder recept heeft gekocht.");
    }

    @Override
    void beschrijving18() {
        System.out.println("Amoxicilline doodt bacteriën (antibioticum).\n" +
                "Bij infecties van onder andere longen, luchtpijp, keel, bijholtes, middenoor, blaas, huid, hart, maag en darmen. Ook bij de ziekte van Lyme, hersenvliesontsteking en geslachtsziekten zoals chlamydia en gonorroe.\n" +
                "Amoxicilline werkt binnen enkele dagen. Neem amoxicilline goed verdeeld over de dag in. Het werkt dan beter.\n" +
                "Gebruikt u de capsules? Neem deze dan in met een half glas water.\n" +
                "Gebruikt u de oplostabletten ('disper')? Laat de tablet uiteen vallen in water. Roer even en drink dan op. Spoel het glas daarna na met een beetje water. En drink dat ook op.\n" +
                "Gebruikt u de drank? Goed omschudden voor gebruik. Gebruik een maatbeker of meetlepel om de juiste hoeveelheid af te meten.\n" +
                "U kunt diarree of buikkramp krijgen. Dit is normaal en gaat vanzelf over. Heeft u meerdere keren per dag diarree met buikkrampen? Waarschuw dan een arts.\n" +
                "Drink voldoende water als u diarree heeft, anders raakt u uitgedroogd.\n" +
                "Huiduitslag komt voor. Een enkele keer komt dit door overgevoeligheid. Ook kunt u dan benauwd worden, koorts krijgen of flauwvallen. Als u overgevoelig bent, mag u dit medicijn niet meer gebruiken. Geef dat door aan uw apotheker.\n" +
                "Een kuur duurt meestal 5 tot 10 dagen, soms langer. Maak de kuur af. Ook als u genezen lijkt te zijn, want er kunnen nog bacteriën over zijn.");
    }

    @Override
    void beschrijving19() {
        System.out.println("Pantoprazol zorgt voor minder maagzuur.\n" +
                "Bij maagklachten zoals brandend maagzuur, maagzweren en darmzweren. Ook bij het syndroom van Zollinger-Ellison. Dit is een ziekte met veel maagklachten.\n" +
                "Pantoprazol helpt ook om uw maag te beschermen als u andere medicijnen gebruikt die maagklachten geven. U hoeft pantoprazol dan alleen te slikken op dagen dat u medicijnen gebruikt die de maag kunnen beschadigen\n" +
                "Binnen een paar dagen heeft u minder last van uw maag.\n" +
                "Neem de tabletten heel in, zonder te kauwen.\n" +
                "Hoelang u pantoprazol moet gebruiken, hangt af van uw ziekte. Soms moet u het langdurig gebruiken, zodat de maagklachten niet terugkomen.\n" +
                "U kunt misselijk worden of buikpijn krijgen. Ook kunt u last krijgen van hoofdpijn en duizeligheid. Heeft u veel last van bijwerkingen? Vraag uw arts of apotheker om advies.\n" +
                "Dit medicijn heeft veel wisselwerkingen met andere medicijnen. Laat uw apotheker daarom controleren of u pantoprazol veilig kunt gebruiken met uw andere medicijnen. Ook medicijnen die u zonder recept heeft gekocht.");
    }

    @Override
    void beschrijving20() {
        System.out.println("Escitalopram verbetert uw stemming en vermindert angsten en angstverschijnselen zoals piekeren, slaapproblemen, prikkelbaarheid en trillen.\n" +
                "Bij depressie en angststoornissen, zoals dwangstoornis, paniekstoornis, sociale fobie, specifieke fobie en posttraumatische stressstoornis.\n" +
                "Neem de tabletten en druppels in met een half glas water. U kunt de druppels ook mengen met bijvoorbeeld sinaasappel- of appelsap.\n" +
                "U merkt pas na een paar weken dat de behandeling werkt.\n" +
                "U kunt wel meteen last hebben van bijwerkingen zoals maagdarmklachten, hoofpijn en duizeligheid. Ook kunt u last krijgen van seksuele klachten zoals minder zin hebben in seks.\n" +
                "U kunt de eerste tijd suf zijn. Rijd dan geen auto.\n" +
                "Pas op met alcohol. Dit kan u nog suffer maken.\n" +
                "Bent u zwanger of wilt u zwanger worden? Overleg met uw arts of u dit medicijn mag gebruiken.\n" +
                "Dit medicijn heeft veel wisselwerking met andere medicijnen. Laat uw apotheker daarom controleren of u escitalopram veilig kunt gebruiken met uw andere medicijnen. Ook medicijnen die u zonder recept heeft gekocht.\n" +
                "Als u escitalopram al een paar weken gebruikt, stop dan niet in één keer. Bespreek dit eerst met uw arts of apotheker.");
    }
}