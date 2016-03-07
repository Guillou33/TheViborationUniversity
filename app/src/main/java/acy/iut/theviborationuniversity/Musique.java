package acy.iut.theviborationuniversity;

import java.util.List;

/**
 * Created by autierg on 03/03/2016.
 */
public class Musique {
    private int idmusique;
    private String titremusique;
    private String artistemusique;
    private List<Genre> lesgenresassocies;
    private String urlfile;

    public List<Genre> getLesgenresassocies() {
        return lesgenresassocies;
    }

    public void setLesgenresassocies(List<Genre> lesgenresassocies) {
        this.lesgenresassocies = lesgenresassocies;
    }

    public String getUrlfile() {
        return urlfile;
    }

    public void setUrlfile(String urlfile) {
        this.urlfile = urlfile;
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

    public Musique(int idmusique, String titremusique, String artistemusique, List<Genre> lesgenresassocies, String urlfile) {
        this.idmusique = idmusique;
        this.titremusique = titremusique;
        this.artistemusique = artistemusique;
        this.lesgenresassocies = lesgenresassocies;
        this.urlfile = urlfile;
    }
}
