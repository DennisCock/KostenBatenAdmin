package domein.kostenbatenoverzicht;

import java.util.List;
import domein.kostenbatenoverzicht.baten.*;

public class Baten {
    //Hoeveel uren telt een voltijdse werkweek
    private int urenVoltijdseWerkweek;
    //[B3 & B4]
    //Patronale Bijdrage (in %) voor lonen op hetzelfde & hoger niveau 
    private int patronaleBijdrage_HetzelfdeNiveau;
    private int patronaleBijdrage_HogerNiveau;
    //[B8]
    //hoeveel denkt u te kunnen besparen op overuren
    private int besparenOpOveruren;
    //[B10.1]
    //Wat zijn de transportkosten van eventueel uitbesteedde zaken
    private int transportKosten;
    //[B10.2]
    //Wat zijn de logistieke handelingskosten van eventueel uitbesteedde zaken
    private int logistieke_handelingskosten;
    //[B6]
    //Hoeveel omzet mist u doordat u personeel tekort komt
    private int gemisteOmzet_PersoneelTekort;
    //[B7]
    //Hoeveel extra productiviteit denkt u te kunnen maken door inzet 
    //van mensen met een grote afstand tot de arbeidsmarkt
    private int extraProductiviteit_GroteAfstand;
    //[B2]
    //Welk bedrag krijgt u aan subsidie door eventuele 
    //aanpassingen aan de werkomgeving
    private int subsidie_AanpassenWerkomgeving;
    
    // LIJSTEN
    //[B3]
    //Vul hier de lonen op HETZELFDE niveau in die mogelijk vervangen worden,
    //met het geschatte aantal uren dat per week weggehaald wordt.
    private List<BatenLoonHetzelfdeNiveau> batenLonenHetzelfdeNiveau;
    //[B4]
    //Vul hier de lonen op EEN HOGER niveau die mogelijk vervangen worden,
    //met het geschatte aantal uren dat per week weggehaald wordt.
    private List<BatenLoonHogerNiveau> batenLonenHogerNiveau;
    //[B5]
    //Welke besparingen denkt u te kunnen maken op uitzendkrachten
    private List<BesparingUitzendkracht> besparingenUitzendKrachten;
    //[B9]
    //Welke zaken worden extern ingekocht en kan op worden bespaard
    //Denk hierbij aan bijvoorbeeld uitbesteedde 
    //producie, schoonmaak, hoveniers, enz.
    private List<ZaakExternIngekocht> zakenExternIngekocht;
    //[B11]
    //Aan welke besparingen kan er nog meer gedacht worden
    //Vul de bedragen in per jaar
    private List<MeerBedachteBesparing> meerBedachteBesparingen;
    
    
    public Baten() {
    }
    
    
}
