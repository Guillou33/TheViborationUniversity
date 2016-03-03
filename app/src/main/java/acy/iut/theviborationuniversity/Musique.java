package acy.iut.theviborationuniversity;

/**
 * Created by autierg on 03/03/2016.
 */
public class Musique {
    private int idmusique;
    private String titremusique;
    private String artistemusique;
    private String lesgenreassocies;

    public String getLesgenreassocies() {
        return lesgenreassocies;
    }

    public void setLesgenreassocies(String lesgenreassocies) {
        this.lesgenreassocies = lesgenreassocies;
    }

    public int getIdmusique() {
        return idmusique;
    }

    public void setIdmusique(int idmusique) {
        this.idmusique = idmusique;
    }

    public String getTitremusique() {
        return titremusique;
    }

    public void setTitremusique(String titremusique) {
        this.titremusique = titremusique;
    }

    public String getArtistemusique() {
        return artistemusique;
    }

    public void setArtistemusique(String artistemusique) {
        this.artistemusique = artistemusique;
    }

    public Musique(int idmusique, String titremusique, String artistemusique, String lesgenreassocies) {
        this.idmusique = idmusique;
        this.titremusique = titremusique;
        this.artistemusique = artistemusique;
        this.lesgenreassocies = lesgenreassocies;
    }
}
