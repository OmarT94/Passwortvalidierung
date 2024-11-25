import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Passwort ein:");
        String passwort = scanner.nextLine();

        String laengePruefen =PasswortValidierung.IstPasswortGrosserAls_AchtZeichen(passwort);
        String beinhaltetZiffern = PasswortValidierung.Passwortenthaelt_Ziffern(passwort);
        String beinthaelt_GrossUndKleinBuchstaben =PasswortValidierung.Passwort_Enthaelt_GrossUndKleinBuchstaben(passwort);
        boolean haeufigbenutzt = PasswortValidierung.IstPasswort_Haufig_Verwendet(passwort);

        System.out.println("\nCheckPasswortValidation");
        if (laengePruefen != null) {
            System.out.println("😍 Das Passwort hat 8 Zeichen.");
        }else {
            System.out.println("😒 Das Passwort ist Kurz, Mindesten 8 Zeichen.");}

        if (beinhaltetZiffern != null) {
            System.out.println("😍 Das Passwort enthält Ziffern.");
        }else {
            System.out.println("😒 Das Passwort enthält keine Ziffern.");}

       if (beinthaelt_GrossUndKleinBuchstaben !=null) {

           System.out.println("😍 Das Passwort enthält Groß und Klein Buchstaben.");
       }else {
           System.out.println("😒 Das Passwort soll Groß und Klein Buchstaben enthalten.");}

       if (haeufigbenutzt )  {
           System.out.println("😍 Das Passwort ist Ok .");

       }else { System.out.println("😒 Ein starkes Passwort ist immer Sicherer,bitte geben Sie ein andere Passwort ein");

       }


       if(laengePruefen != null && beinhaltetZiffern != null && beinthaelt_GrossUndKleinBuchstaben != null && haeufigbenutzt) {

           System.out.println("\n😍 Starkes Passwort");
       }else {
           System.out.println("\n😒 Schwaches Passwort und einfach zu erraten!");
       }

       scanner.nextLine();
       scanner.close();


        System.out.println("Hier ist ein Automatische Empfholene Passwort für Sie generiert.Falls Sie es verwendwn möchten");
        String sicheresPasswort = PasswortValidierung.erstelleSicheresPasswort();
        System.out.println(sicheresPasswort);
        System.out.println("Drücken, um das Programm zu beenden!!");

    }

}
