import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testChargerMagasin {

    @Test
    public void chargerMagasin(){




    }

    @Test
    public void chargerMagasinValide() throws IOException {
        String repertoire = "musique/Benabar_RisquesMetier.xml";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin resultat = charge.chargerMagasin();
        assertEquals("test", resultat.toString());
    }
}
