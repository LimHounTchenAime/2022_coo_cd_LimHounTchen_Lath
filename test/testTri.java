import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTri {
    @Test
    public void testTrierArtiste() throws IOException {
        ChargeurMagasin chargeurMagasin=new ChargeurMagasin("musiqueTest");
        Magasin magasin=chargeurMagasin.chargerMagasin();

        assertEquals("The Meters", magasin.getCDs().get(0).getNomArtiste());
        assertEquals("Gorillaz", magasin.getCDs().get(1).getNomArtiste());
        assertEquals("Justin Bieber", magasin.getCDs().get(2).getNomArtiste());

        magasin.trierArtiste();

        assertEquals("Gorillaz", magasin.getCDs().get(0).getNomArtiste());
        assertEquals("Justin Bieber", magasin.getCDs().get(1).getNomArtiste());
        assertEquals("The Meters", magasin.getCDs().get(2).getNomArtiste());
    }

    @Test
    public void testComparateurArtiste() throws IOException{
        ChargeurMagasin chargeurMagasin=new ChargeurMagasin("musiqueTest");
        Magasin magasin=chargeurMagasin.chargerMagasin();

        assertEquals("The Meters", magasin.getCDs().get(0).getNomArtiste());
        assertEquals("Gorillaz", magasin.getCDs().get(1).getNomArtiste());
        assertEquals("Justin Bieber", magasin.getCDs().get(2).getNomArtiste());

        magasin.trier(new ComparateurArtiste());

        assertEquals("Gorillaz", magasin.getCDs().get(0).getNomArtiste());
        assertEquals("Justin Bieber", magasin.getCDs().get(1).getNomArtiste());
        assertEquals("The Meters", magasin.getCDs().get(2).getNomArtiste());
    }
}
