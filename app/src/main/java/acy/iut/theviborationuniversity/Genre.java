package acy.iut.theviborationuniversity;

/**
 * Created by autierg on 03/03/2016.
 */
public class Genre {
    private int idgenre;
    private String typegenre;

    public int getIdgenre() {
        return idgenre;
    }

    public void setIdgenre(int idgenre) {
        this.idgenre = idgenre;
    }

    public String getTypegenre() {
        return typegenre;
    }

    public void setTypegenre(String typegenre) {
        this.typegenre = typegenre;
    }

    public Genre(int idgenre, String typegenre) {
        this.idgenre = idgenre;
        this.typegenre = typegenre;
    }
}
