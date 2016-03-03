package acy.iut.theviborationuniversity;

import java.util.List;

/**
 * Created by autierg on 03/03/2016.
 */
public class Chat {
    private int idchat;
    private String typechat;
    private List<Etudiant> lesetudiants;
    private List<Genre> lesgenres;

    public List<Genre> getLesgenres() {
        return lesgenres;
    }

    public void setLesgenres(List<Genre> lesgenres) {
        this.lesgenres = lesgenres;
    }

    public List<Etudiant> getLesetudiants() {
        return lesetudiants;
    }

    public void setLesetudiants(List<Etudiant> lesetudiants) {
        this.lesetudiants = lesetudiants;
    }

    public int getIdchat() {
        return idchat;
    }

    public void setIdchat(int idchat) {
        this.idchat = idchat;
    }

    public String getTypechat() {
        return typechat;
    }

    public void setTypechat(String typechat) {
        this.typechat = typechat;
    }

    public Chat(int idchat, String typechat, List<Etudiant> lesetudiants, List<Genre> lesgenres) {
        this.idchat = idchat;
        this.typechat = typechat;
        this.lesetudiants = lesetudiants;
        this.lesgenres = lesgenres;
    }
}
