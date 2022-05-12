import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class testChargerMagasin {

    @Test
    public void chargerMagasinValide() throws IOException {
        ChargeurMagasin cM = new ChargeurMagasin("musique");
        Magasin m = cM.chargerMagasin();
        assertEquals(12, m.getNombreCds());

    }

    @Test
    public void testTrieAlbum() throws FileNotFoundException {
        ChargeurMagasin cM = new ChargeurMagasin("musique");
        Magasin m = cM.chargerMagasin();
        m.trierAlbum();
        assertEquals("Bénabar", m.getCd(0).getNomCD());
        assertEquals("Zebda", m.getCd(11).getNomCD());

    }
}
