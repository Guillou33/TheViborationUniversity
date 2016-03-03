package acy.iut.theviborationuniversity;

import java.util.List;

/**
 * Created by autierg on 03/03/2016.
 */
public class Genre {
    private int idgenre;
    private String typegenre;
    private List<Chat> leschats;

    public List<Chat> getLeschats() {
        return leschats;
    }

    public void setLeschats(List<Chat> leschats) {
        this.leschats = leschats;
    }

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

    public Genre(int idgenre, String typegenre, List<Chat> leschats) {
        this.idgenre = idgenre;
        this.typegenre = typegenre;
        this.leschats = leschats;
    }
}
