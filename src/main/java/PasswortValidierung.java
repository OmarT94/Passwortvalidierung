import org.w3c.dom.ls.LSOutput;

import java.security.SecureRandom;
import java.util.Scanner;

public class PasswortValidierung {

    public static String IstPasswortGrosserAls_AchtZeichen(String passwort) {

//        return passwort != null && passwort.length()>=8;
        if (passwort != null && passwort.length() >= 8) {
            return passwort;

        }
        return null;
    }

    public static String Passwortenthaelt_Ziffern(String passwort) {
        if (passwort != null && passwort.matches(".*\\d.*")) {
            return passwort;
        }
        return null;
    }

    public static String Passwort_Enthaelt_GrossUndKleinBuchstaben(String passwort) {
        if (passwort != null && passwort.matches(".*[a-z].*") && passwort.matches(".*[A-Z].*")) {
            return passwort;
        }
        return null;
    }

    public static boolean IstPasswort_Haufig_Verwendet(String passwort) {

        String[] haeufigeVerwendetesPasswort = {"Aa345678", "12345678", "qwertzui", "qwerty", "passwort", "abcdefghi",
                "passwort1", "passwort2", "passwort3", "passwort4"};
        for (String commonPasswort : haeufigeVerwendetesPasswort) {
            if (commonPasswort.equals(passwort)) {
                return false;
            }
        }
        return true;

    }

    public static String Passwortenthaelt_Sonderzeichen(String passwort) {
        if (passwort != null && passwort.matches(".*[!@#$%^&*()_+-=\\\\[\\\\]{};':\\\\\\\\|,.<>\\\\/?].*")) {
            return passwort;
        }
        return null;
    }

    //    public static String passwortGrosserAlsAchtZeichen=IstPasswortGrosserAls_AchtZeichen();
    public static final String grossUndKleinBuchstaben = Passwort_Enthaelt_GrossUndKleinBuchstaben("ABCDEFGHIJKLMNOPQRSTUVWXYZ,abcdefghijklmnopqrstuvwxyz");
    public static final String zifffern = Passwortenthaelt_Ziffern("1234567890");
    public static final String sonderZeichen = Passwortenthaelt_Sonderzeichen("!@#$%^&*()_+-=[]{}|;':\",.<>?/");
    public static int passwortGrosserAlsAchtZeichen = 9;
    public static SecureRandom ran = new SecureRandom();

    public static String erstelleSicheresPasswort() {

        StringBuilder passwort = new StringBuilder();
        passwort.append(GetZufallZeichen(grossUndKleinBuchstaben));
        passwort.append(GetZufallZeichen(zifffern));
        passwort.append(GetZufallZeichen(sonderZeichen));

        String passwortStringAlleZeichen = (grossUndKleinBuchstaben + zifffern + sonderZeichen);

//        System.out.println("GrossUndKlein/"+grossUndKleinBuchstaben);
//        System.out.println("Ziffern/"+zifffern);
//        System.out.println("Sonder/"+sonderZeichen);
//        System.out.println("PasswortString/"+ passwortStringAlleZeichen);
//        System.out.println("Passwortlänge/"+passwort.length());

        if(passwortStringAlleZeichen.isEmpty()){

            throw new IllegalStateException("zeichen ist Leer");
        }
        while (passwort.length() < passwortGrosserAlsAchtZeichen) {
            passwort.append(GetZufallZeichen(passwortStringAlleZeichen));
//            System.out.println("/passwort in Schleife"+passwort.toString());
        }

        char [] arrayPasswort = passwort.toString().toCharArray();
        for (int i =arrayPasswort.length -1; i > 0 ; i--) {
            int j = ran.nextInt(i+1 );
            char temp = arrayPasswort[i];
            arrayPasswort[i] = arrayPasswort[j];
            arrayPasswort[j] = temp;
        }
        String fertigesPasswort = new String(arrayPasswort);
        if(!IstPasswort_Haufig_Verwendet(fertigesPasswort)) {
            return erstelleSicheresPasswort();
        }

      return fertigesPasswort;
    }



    public static char GetZufallZeichen(String zeichen) {
        if(zeichen==null || zeichen.isEmpty()) {
            throw new IllegalArgumentException("Passwort ist Leer");
        }
        return zeichen.charAt(ran.nextInt(zeichen.length()));
    }



}

