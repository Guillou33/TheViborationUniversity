package acy.iut.theviborationuniversity;

/**
 * Created by autierg on 03/03/2016.
 */
public class Etudiant {
    private int ideleve;
    private String nomeleve;
    private String prenomeleve;
    private String logineleve;
    private String passwordeleve;
    private String sectioneleve;
    private String pseudoeleve;

    public int getIdeleve() {
        return ideleve;
    }

    public void setIdeleve(int ideleve) {
        this.ideleve = ideleve;
    }

    public String getNomeleve() {
        return nomeleve;
    }

    public void setNomeleve(String nomeleve) {
        this.nomeleve = nomeleve;
    }

    public String getPrenomeleve() {
        return prenomeleve;
    }

    public void setPrenomeleve(String prenomeleve) {
        this.prenomeleve = prenomeleve;
    }

    public String getLogineleve() {
        return logineleve;
    }

    public void setLogineleve(String logineleve) {
        this.logineleve = logineleve;
    }

    public String getPasswordeleve() {
        return passwordeleve;
    }

    public void setPasswordeleve(String passwordeleve) {
        this.passwordeleve = passwordeleve;
    }

    public String getSectioneleve() {
        return sectioneleve;
    }

    public void setSectioneleve(String sectioneleve) {
        this.sectioneleve = sectioneleve;
    }

    public String getPseudoeleve() {
        return pseudoeleve;
    }

    public void setPseudoeleve(String pseudoeleve) {
        this.pseudoeleve = pseudoeleve;
    }

    public Etudiant(int ideleve, String nomeleve, String prenomeleve, String logineleve, String passwordeleve, String sectioneleve, String pseudoeleve) {
        this.ideleve = ideleve;
        this.nomeleve = nomeleve;
        this.prenomeleve = prenomeleve;
        this.logineleve = logineleve;
        this.passwordeleve = passwordeleve;
        this.sectioneleve = sectioneleve;
        this.pseudoeleve = pseudoeleve;
    }
}
