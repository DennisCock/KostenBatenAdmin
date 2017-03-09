package domein.kostenbatenoverzicht;

import java.util.List;
import domein.kostenbatenoverzicht.kosten.*;
        
public class Kosten {
    //Patronale bijdrage (in %)
    private int patronaleBijdrage;
    
    //LIJSTEN
    //[K1.1]
    //Welke nieuwe functies zet u in
    private List<Functie> functies;
    //[K1.1]
    //Hoeveel betaalt u als u werk laten uitvoeren door maatwerkbedrijf
    //via enclave of onderaanneming
    private List<WerkBuitenBedrijf> werkBijtenBedrijf;
    //[K6]
    //Hoeveel uren spendeert u jaarlijks aan extra administratie en
    //interne begelijding (voor toelichting)
    private List<ExtraAdministratieBegeleiding> extraAdministratieBegeleiding;
    //[K3]
    //Welke extra kosten moet u structureel extra maken voor deze inhuur
    //(alleen kosten zoals werkkleding bij normale inhuur en 
    //bij reshoring alle kosten)
    private List<KostVoorInhuur> kostenVoorInhuur;
    //[K5]
    //Welke opleidingskosten moeten er gemaakt worden om de nieuwe krachten 
    //op het gewenste niveau te krijgen
    private List<KostOpleiding> kostenOpleiding;
    //[K2]
    //Welke kosten moet u ter voorbereiding maken om dit te implementeren
    private List<KostVoorbereidingImplementatie> kostenVoorbereidingImplementatie;
    //[K4]
    //Welke kosten moet u structureel jaarlijks extra maken voor deze inhuur
    //(vul hier de gereedschapkosten in)
    private List<KostStructureelInhuur> kostenStructureelInhuur;
    //[K7]
    //Aanwelke kosten kan nog meer worden gedacht?
    private List<KostExtra> kostenExtra;
    
    public Kosten() {
    }
}
