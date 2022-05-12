import java.io.IOException;


/**
 * permet de charger un magasin de test
 */
public class MainChargeurMagasin {

    /**
     * methode principale
     *
     * @param args inutilise
     * @throws IOException en cas de probleme de lecture entree/sortie
     */
    public static void main(String[] args) throws IOException {

        String repertoire = "musique";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin resultat = charge.chargerMagasin();

       	resultat.trierArtiste();
        System.out.println(resultat);


        resultat.trierAlbum();
        System.out.println(resultat);
    }

}
