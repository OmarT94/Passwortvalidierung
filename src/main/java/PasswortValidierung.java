import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PasswortValidierung {

    public static String IstPasswortGrosserAls_AchtZeichen(String passwort) {

//        return passwort != null && passwort.length()>=8;
        if (passwort != null && passwort.length() >= 8) {
            return passwort;

        }return null;
    }

    public static String Passwortenthaelt_Ziffern(String passwort) {
        if (passwort != null && passwort.matches(".*\\d.*")) {
            return passwort;
        }return null;
    }

    public static String Passwort_Enthaelt_GrossUndKleinBuchstaben(String passwort) {
        if (passwort != null && passwort.matches(".*[a-z].*") && passwort.matches(".*[A-Z].*")) {
            return passwort;
        }return null;
    }

    public static boolean IstPasswort_Haufig_Verwendet(String passwort) {

        String [] haeufigeVerwendetesPasswort={"Aa345678","12345678","qwertzui","qwerty","passwort","abcdefghi",
                "passwort1","passwort2","passwort3","passwort4"};
        for (String commonPasswort: haeufigeVerwendetesPasswort) {
            if (commonPasswort.equals(passwort)) {
                return false;
            }
        }return true;

    }

    public static String Passwortenthaelt_Sonderzeichen(String passwort) {
        if (passwort != null && passwort.matches(".*[!@#$%^&*()_+-=\\\\[\\\\]{};':\\\\\\\\|,.<>\\\\/?].*")) {
            return passwort;
        }return null;
    }





}

