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
    private int age;
    private String sexe;
    private String pathImage;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public Etudiant(int ideleve, String nomeleve, String prenomeleve, String logineleve, String passwordeleve, String sectioneleve, String pseudoeleve, int age, String sexe, String pathImage) {
        this.ideleve = ideleve;
        this.nomeleve = nomeleve;
        this.prenomeleve = prenomeleve;
        this.logineleve = logineleve;
        this.passwordeleve = passwordeleve;
        this.sectioneleve = sectioneleve;
        this.pseudoeleve = pseudoeleve;
        this.age = age;
        this.sexe = sexe;
        this.pathImage = pathImage;
    }

    public Etudiant(){

    }
    public Etudiant(String logineleve, String passwordeleve){
        this.logineleve = logineleve;
        this.passwordeleve = passwordeleve;
    }



}
