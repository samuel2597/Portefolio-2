import java.util.Random;
import java.util.UUID;

public class Vluchteling  extends Persoon{
        private String id;
        private String naam;
        private Land landVanHerkomst;


        public Vluchteling(String naam, Land landVanHerkomst) {
            super(naam, generatePassword(naam)); // Gebruik de naam als gebruikersnaam en genereer een wachtwoord
            this.id = UUID.randomUUID().toString();
            this.naam = naam;
            this.landVanHerkomst = landVanHerkomst;
        }
        public Vluchteling(String naam, Land landVanHerkomst, String id) {
            super(naam, generatePassword(naam)); // Gebruik de naam als gebruikersnaam en genereer een wachtwoord
            this.id = id;
            this.naam = naam;
            this.landVanHerkomst = landVanHerkomst;  // Referentie naar het Land-object
        }
        private static String generatePassword(String naam) {
            Random random = new Random();
            int digits = 100 + random.nextInt(900); // Genereert een getal tussen 100 en 999
            return naam.substring(0, Math.min(naam.length(), 2)).toLowerCase() + digits;
        }

        public String getId() {
            return id;
        }

        public String getNaam() {
            return naam;
        }

        public Land getLandVanHerkomst() {
            return landVanHerkomst;
        }


        @Override
        public String toString() {
            return String.format("ID: %s, Naam: %s, Gebruikersnaam: %s, Wachtwoord: %s, Land van Herkomst: %s", id, naam, getGebruikersnaam(), getWachtwoord(), landVanHerkomst.getNaam());
        }



    }
