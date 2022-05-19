

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * <p>
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 */
public class Magasin {

    /**
     * la liste des CDs disponibles en magasin
     */
    private ArrayList<CD> listeCds;

    /**
     * construit un magasin par defaut qui ne contient pas de CD
     */
    public Magasin() {
        listeCds = new ArrayList<CD>();
    }

    /**
     * ajoute un cd au magasin
     *
     * @param cdAAjouter le cd a ajouter
     */
    public void ajouteCd(CD cdAAjouter) {
        listeCds.add(cdAAjouter);
    }

    @Override
    /**
     * affiche le contenu du magasin
     */
    public String toString() {
        String chaineResultat = "";
        //parcours des Cds
        for (int i = 0; i < listeCds.size(); i++) {
            chaineResultat += listeCds.get(i);
        }
        chaineResultat += "nb Cds: " + listeCds.size();
        return (chaineResultat);

    }

    /**
     * @return le nombre de Cds du magasin
     */
    public int getNombreCds() {
        return listeCds.size();
    }

    /**
     * permet d'acceder � un CD
     *
     * @return le cd a l'indice i ou null si indice est non valide
     */
    public CD getCd(int i) {
        CD res = null;
        if ((i >= 0) && (i < this.listeCds.size()))
            res = this.listeCds.get(i);
        return (res);
    }

    // TODO  ajouter une methode de tri
    public void trierArtiste() {
        int taille = this.listeCds.size();
        if(this.listeCds.size()>0) {
            CD tmp = this.listeCds.get(0);
            for (int i = 0; i < taille; i++) {
                for (int j = 1; j < (taille - i); j++) {
                    if (this.listeCds.get(j - 1).getNomArtiste().compareTo(this.listeCds.get(j).getNomArtiste()) > 0) {
                        //echanges des elements
                        tmp = this.listeCds.get(j - 1);
                        this.listeCds.set(j - 1, this.listeCds.get(j));
                        this.listeCds.set(j, tmp);
                    }
                }
            }
        }
    }

    public void trierAlbum() {
        int taille = this.listeCds.size();
        if(this.listeCds.size()>0) {
            CD tmp = this.listeCds.get(0);
            for (int i = 0; i < taille; i++) {
                for (int j = 1; j < (taille - i); j++) {
                    if (this.listeCds.get(j - 1).getNomCD().compareTo(this.listeCds.get(j).getNomCD()) > 0) {
                        //echanges des elements
                        tmp = this.listeCds.get(j - 1);
                        this.listeCds.set(j - 1, this.listeCds.get(j));
                        this.listeCds.set(j, tmp);
                    }
                }
            }
        }
    }

    public void trier(ComparateurCd comparateurCd){
        int taille = this.listeCds.size();
        if(this.listeCds.size()>0) {
            CD tmp = this.listeCds.get(0);
            for (int i = 0; i < taille; i++) {
                for (int j = 1; j < (taille - i); j++) {
                    if (!comparateurCd.etreAvant(this.listeCds.get(j-1), this.listeCds.get(j))) {
                        //echanges des elements
                        tmp = this.listeCds.get(j - 1);
                        this.listeCds.set(j - 1, this.listeCds.get(j));
                        this.listeCds.set(j, tmp);
                    }
                }
            }
        }
    }

    public ArrayList<CD> getCDs() {
        return this.listeCds;
    }
}
