import java.util.ArrayList;
import java.util.List;

public class InlogSysteem {
    private List<Persoon> gebruikers;

    public InlogSysteem() {
        this.gebruikers = new ArrayList<>();
        // Voeg beheerders en COA-medewerkers toe
        gebruikers.add(new Beheerder("admin", "admin123"));
        gebruikers.add(new COAMedewerker("coaUser", "coa123"));
    }

    public Persoon inloggen(String gebruikersnaam, String wachtwoord) {
        for (Persoon gebruiker : gebruikers) {
            if (gebruiker.validerenInloggegevens(gebruikersnaam, wachtwoord)) {
                return gebruiker;
            }
        }
        return null;
    }

    public void registreerVluchteling(String gebruikersnaam, String wachtwoord) {
        VluchtelingInlog vluchteling = new VluchtelingInlog(gebruikersnaam, wachtwoord);
        gebruikers.add(vluchteling);
    }
}
