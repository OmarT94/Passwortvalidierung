
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_PasswortValidierung {


    @Test
    void Check_If_Passwort_IstGrosserAls_Acht_Zeichen() {

        String Acceptedpasswort ="qwertamr" ;
        String actulPasswort=PasswortValidierung.IstPasswortGrosserAls_AchtZeichen(Acceptedpasswort);
        Assertions.assertEquals(Acceptedpasswort,actulPasswort);


    }

    @Test

    void Chech_If_Passwort_enthaelt_Ziffern(){
        String Acceptedpasswort ="Omartamr1" ;
        String actulPasswort= PasswortValidierung.Passwortenthaelt_Ziffern(Acceptedpasswort);
        Assertions.assertEquals(Acceptedpasswort,actulPasswort);

    }


    @Test
    void Check_If_PasswortEnthealt_GrossUndKlein_Buchstaben(){

        String Acceptedpasswort ="OMAR TAMr" ;
        String actulPasswort= PasswortValidierung.Passwort_Enthaelt_GrossUndKleinBuchstaben(Acceptedpasswort);
        Assertions.assertEquals(Acceptedpasswort,actulPasswort);
    }

    @Test
    void Check_If_Passwoet_HaeufigVerwendet(){
          String haeufigVerwendet ="Aa345678" ;
//        String nichHaeufigpasswort="Omar Tamr";
          Assertions.assertTrue(PasswortValidierung.IstPasswort_Haufig_Verwendet(haeufigVerwendet));
//        Assertions.assertTrue(PasswortValidierung.IstPasswort_Haufig_Verwendet("12345678tt"));
    }

}
