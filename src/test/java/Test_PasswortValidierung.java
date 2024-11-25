
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_PasswortValidierung {


    @Test
    void Check_If_Passwort_IstGrosserAls_Acht_Zeichen() {

        String actulPasswort ="qqqqqqqq" ;
        String  Acceptedpasswort=PasswortValidierung.IstPasswortGrosserAls_AchtZeichen(actulPasswort);
        Assertions.assertEquals(Acceptedpasswort,actulPasswort);


    }

    @Test

    void Chech_If_Passwort_enthaelt_Ziffern(){
        String  actulPasswort ="Omartamr1" ;
        String Acceptedpasswort= PasswortValidierung.Passwortenthaelt_Ziffern( actulPasswort);
        Assertions.assertEquals(Acceptedpasswort,actulPasswort);

    }


    @Test
    void Check_If_PasswortEnthealt_GrossUndKlein_Buchstaben(){

        String actulPasswort ="OMAR TAMr" ;
        String Acceptedpasswort= PasswortValidierung.Passwort_Enthaelt_GrossUndKleinBuchstaben(actulPasswort);
        Assertions.assertEquals(Acceptedpasswort,actulPasswort);
    }

    @Test
    void Check_If_Passwoet_HaeufigVerwendet(){
          String haeufigVerwendet ="passwort11" ;
//        String nichHaeufigpasswort="Omar Tamr";
          Assertions.assertTrue(PasswortValidierung.IstPasswort_Haufig_Verwendet(haeufigVerwendet));
//        Assertions.assertTrue(PasswortValidierung.IstPasswort_Haufig_Verwendet("12345678tt"));
    }

    @Test
    void Check_If_Passwortenthaelt_Sonderzeichen(){
        String actualPasswort ="testOmarTamr@" ;
        String CheckSonderzeichen=PasswortValidierung.Passwortenthaelt_Sonderzeichen(actualPasswort);
        Assertions.assertEquals(CheckSonderzeichen,actualPasswort);
    }

}
