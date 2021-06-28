import java.util.Scanner;

public class PsychiaterBeschrijvingen extends Beschrijvingen {

    public void beschrijving(){
        Psychiater a = new Psychiater("", 1);
        Scanner scanner = new Scanner(System.in);
        a.psychiaterLoop();
        System.out.println("Over welke psychiater wilt u meer weten? Typ het nummer");
        int besChoice = scanner.nextInt();
        switch(besChoice){
            case 1 -> beschrijving1();case 2 -> beschrijving2();case 3 -> beschrijving3();case 4 -> beschrijving4();case 5 -> beschrijving5();
            case 6 -> beschrijving6();case 7 -> beschrijving7();case 8 -> beschrijving8();case 9 -> beschrijving9();case 10 -> beschrijving10();
        }

    }

    @Override
    void beschrijving1() {
        System.out.println("Peter Frans Ghislain Adriaenssens (Wilrijk, 3 september 1954)[1] is Belgisch kinder- en jeugdpsychiater,\n " +
                "en deeltijds hoofddocent aan de Katholieke Universiteit Leuven. Daarnaast is hij directeur van het Vertrouwenscentrum\n" +
                " kindermishandeling van Vlaams-Brabant en Kliniekhoofd kinderpsychiatrie Universitair Ziekenhuis Leuven (UZ Leuven).");
    }

    @Override
    void beschrijving2() {
        System.out.println("Alois Alzheimer (Marktbreit, 14 juni 1864 — Breslau, 19 december 1915) was een Duits neuropatholoog en psychiater. \n" +
                "Hij is vooral beroemd door de ziekte van Alzheimer, die naar hem genoemd is.");
    }

    @Override
    void beschrijving3() {
        System.out.println("Vladimir Michajlovitsj Bechterev (Russisch: Владимир Михайлович Бехтерев) (Sorali, 20 januari 1857 – Moskou, 24 december 1927)\n" +
                " was een Russisch neuroloog en psychiater. Hij was een tijdgenoot van Pavlov, met wie hij meningsverschillen had.\n" +
                "Bechterev (vroeger getranslitereerd als Bechterew) werd geboren in het gouvernement Vjatka in Rusland. In 1878 \n" +
                "studeerde hij aan de Militaire Medische Academie in Sint-Petersburg en werd daar assistent van de psychiater Merzjejevski. \n" +
                "In 1881 studeerde Bechterev daar ook af en werd vervolgens arts aan de Medische en Chirurgische Academie in Sint-Petersburg.\n" +
                "In 1884 verbleef hij in Leipzig, Duitsland en Parijs, Frankrijk en werkte samen met Paul Flechsig, Jean-Martin Charcot en Wilhelm Wundt. \n" +
                "In 1885 werd hij hoogleraar in de psychiatrie aan de Universiteit van Kazan. Hij volgde in 1893 Merzjejevski op aan de Militaire Medische \n" +
                "Academie.\n" +
                "Hij richtte het Psychoneurologisch Instituut in Sint-Petersburg op waar hij werkzaam was van 1913 tot 1918. Van 1918 tot 1927 werkte hij \n" +
                "op het Hersenonderzoeksinstituut in Sint-Petersburg.");
    }

    @Override
    void beschrijving4() {
        System.out.println("Jan Bastiaans (Rotterdam, 27 mei 1917 – Warmond, 31 oktober 1997) was zenuwarts en hoogleraar psychiatrie. \n" +
                "In 1957 promoveerde hij op een proefschrift getiteld: Psychosomatische gevolgen van onderdrukking en verzet.\n" +
                "Bastiaans was een geleerde die grote roem en bekendheid verwierf maar steeds omstreden was. \n" +
                "Zijn behandeling van de PvdA-senator Eibert Meester leidde tot een eerste schandaal. \n" +
                "Als patiënt fabuleerde de politicus een verzetsverleden en Bastiaans begreep onvoldoende dat zijn patiënt \n" +
                "gebeurtenissen verzon. Prof. Bastiaans publiceerde een boek over zijn patiënt en diens verzetswerk, \n" +
                "de gruwelijke gevangenschap in Duitsland, de neurosen en de succesvolle therapie. Pas toen het boek[1] al uit was, \n" +
                "zocht de ex-echtgenote van Meester de openbaarheid met de mededeling dat Meester nooit in het verzet had gezeten en \n" +
                "nooit gevangene in Duitsland was geweest.");
    }

    @Override
    void beschrijving5() {
        System.out.println("Wybe Kuno van Dijk (Karuni, Soemba, 7 januari 1924 – Paterswolde, 31 augustus 2005) was een Nederlands hoogleraar en psychiater. " +
                "Van 1963 tot 1985 werkte hij als hoogleraar psychiatrie aan de Rijksuniversiteit Groningen.");
    }

    @Override
    void beschrijving6() {
        System.out.println("Frederik Willem van Eeden (Haarlem, 3 april 1860 – Bussum, 16 juni 1932) was een Nederlandse schrijver, vooral bekend geworden door " +
                "zijn romans De kleine Johannes (1887) en Van de koele meren des doods (1900). Van oorsprong was hij huisarts en daarna psychiater. " +
                "Van Eeden hield zich vaak diepgaand bezig met taal- en begripskritiek.");
    }

    @Override
    void beschrijving7() {
        System.out.println("Jan Foudraine (Amsterdam, 25 februari 1929 – 27 februari 2016) was een Nederlandse psychiater, " +
                "psychotherapeut en publicist, die ook bekend was onder de naam Swami Deva Amrito.");
    }

    @Override
    void beschrijving8() {
        System.out.println("Sigmund Freud, geboren als Sigismund Schlomo Freud (Freiberg (Moravië), 6 mei 1856 – Londen, 23 september 1939) was een zenuwarts uit " +
                "Oostenrijk-Hongarije en de grondlegger van de psychoanalyse. Hij was van joodse afkomst. Hoewel Freuds theorieën en methodes omstreden zijn, " +
                "wordt hij gezien als een van de meest invloedrijke psychologen en denkers van de 20e eeuw.");
    }

    @Override
    void beschrijving9() {
        System.out.println("Kurt Goldstein (Katowice, 6 november 1878 - New York, 19 september 1965) was een Duitse neuroloog en psychiater, " +
                "die als pionier geldt in het vakgebied van de neuropsychologie.");
    }

    @Override
    void beschrijving10() {
        System.out.println("Carl Gustav Jung (Kesswil, 26 juli 1875 – Küsnacht, 6 juni 1961) was een Zwitsers psychiater en psycholoog. " +
                "Hij was de grondlegger van de analytische psychologie.");
    }

    @Override
    void beschrijving11() { }
    @Override
    void beschrijving12() { }
    @Override
    void beschrijving13() { }
    @Override
    void beschrijving14() { }
    @Override
    void beschrijving15() { }
    @Override
    void beschrijving16() { }
    @Override
    void beschrijving17() { }
    @Override
    void beschrijving18() { }
    @Override
    void beschrijving19() { }
    @Override
    void beschrijving20() { }
}
