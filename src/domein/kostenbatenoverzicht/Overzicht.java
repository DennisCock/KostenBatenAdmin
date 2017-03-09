package domein.kostenbatenoverzicht;

import domein.gebruikers.JobCoach;

public class Overzicht {
    private String naamKostenBaten;
    private String datumAangemaakt;
    private String datumGewijzigd;
    
    private JobCoach author;
    

    private Kosten kosten;
    private Baten baten;
    
    public Overzicht() {
    }

    
    
    
    
    
    
    
    public Kosten getKosten() {
        return kosten;
    }
    public Baten getBaten() {
        return baten;
    }
}
