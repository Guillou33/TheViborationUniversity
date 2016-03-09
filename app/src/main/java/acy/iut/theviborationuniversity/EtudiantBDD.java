package acy.iut.theviborationuniversity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/**
 * Created by houdayec on 09/03/2016.
 */
public class EtudiantBDD {

    private static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "profil.db";

    private static final String TABLE_ETUDIANT = "table_profil";
    private static final String COL_ID = "Id";
    private static final String COL_LASTNAME= "Lastname";
    private static final String COL_FIRSTNAME = "Firstname";
    private static final String COL_LOGIN = "Login";
    private static final String COL_PASSWORD = "Password";
    private static final String COL_PSEUDO = "Pseudo";
    private static final String COL_SECTION = "Section";
    private static final String COL_AGE = "Age";
    private static final String COL_SEXE= "Sexe";
    private static final String COL_PATHIMAGE = "Path_image";

    private SQLiteDatabase bdd;

    private MaBaseSQLite maBaseSQLite;

    public EtudiantBDD(Context context){
        //On créer la BDD et sa table
        maBaseSQLite = new MaBaseSQLite(context, NOM_BDD, null, VERSION_BDD);
    }

    public void open(){
        //on ouvre la BDD en écriture
        bdd = maBaseSQLite.getWritableDatabase();
    }

    public void close(){
        //on ferme l'accès à la BDD
        bdd.close();
    }

    public SQLiteDatabase getBDD(){
        return bdd;
    }

    public long insertEtudiant(Etudiant etudiant){
        //Création d'un ContentValues (fonctionne comme une HashMap)
        ContentValues values = new ContentValues();
        //on lui ajoute une valeur associé à une clé (qui est le nom de la colonne dans laquelle on veut mettre la valeur)
        values.put(COL_ID, etudiant.getIdeleve());
        values.put(COL_LASTNAME, etudiant.getNomeleve());
        values.put(COL_FIRSTNAME, etudiant.getPrenomeleve());
        values.put(COL_LOGIN, etudiant.getLogineleve());
        values.put(COL_PASSWORD, etudiant.getPrenomeleve());
        values.put(COL_PSEUDO, etudiant.getPseudoeleve());
        values.put(COL_SECTION, etudiant.getSectioneleve());
        values.put(COL_AGE, etudiant.getAge());
        values.put(COL_SEXE, etudiant.getSexe());
        values.put(COL_PATHIMAGE, etudiant.getPathImage());
        //on insère l'objet dans la BDD via le ContentValues
        return bdd.insert(TABLE_ETUDIANT, null, values);
    }

    public int updateEtudiant(int id, Etudiant etudiant){
        //La mise à jour d'un livre dans la BDD fonctionne plus ou moins comme une insertion
        //il faut simple préciser quelle livre on doit mettre à jour grâce à l'ID
        ContentValues values = new ContentValues();
        values.put(COL_ID, etudiant.getIdeleve());
        values.put(COL_LASTNAME, etudiant.getNomeleve());
        values.put(COL_FIRSTNAME, etudiant.getPrenomeleve());
        values.put(COL_LOGIN, etudiant.getLogineleve());
        values.put(COL_PASSWORD, etudiant.getPrenomeleve());
        values.put(COL_PSEUDO, etudiant.getPseudoeleve());
        values.put(COL_SECTION, etudiant.getSectioneleve());
        values.put(COL_AGE, etudiant.getAge());
        values.put(COL_SEXE, etudiant.getSexe());
        values.put(COL_PATHIMAGE, etudiant.getPathImage());
        return bdd.update(TABLE_ETUDIANT, values, COL_ID + " = " +id, null);
    }

    public int removeEtudiantWithID(int id){
        //Suppression d'un livre de la BDD grâce à l'ID
        return bdd.delete(TABLE_ETUDIANT, COL_ID + " = " +id, null);
    }

    public Etudiant getEtudiantWithLoginPassword(String login, String password){
        //Récupère dans un Cursor les valeur correspondant à un livre contenu dans la BDD (ici on sélectionne le livre grâce à son titre)
        Cursor c = bdd.query(TABLE_ETUDIANT, new String[] {COL_ID, COL_FIRSTNAME, COL_LASTNAME}, COL_LOGIN + " LIKE " + login + " OR " + COL_PASSWORD + " LIKE " + password + "", null, null, null, null);
        return cursorToEtudiant(c);
    }

    //Cette méthode permet de convertir un cursor en un livre
    private Etudiant cursorToEtudiant(Cursor c){
        //si aucun élément n'a été retourné dans la requête, on renvoie null
        if (c.getCount() == 0)
            return null;

        //Sinon on se place sur le premier élément
        c.moveToFirst();
        //On créé un livre
        Etudiant etudiant = new Etudiant(0,null,null,null,null,null,null,0,null,null);
        //on lui affecte toutes les infos grâce aux infos contenues dans le Cursor
        etudiant.setIdeleve(c.getInt(Integer.valueOf(COL_ID)));
        etudiant.setPrenomeleve(c.getString(Integer.valueOf(COL_FIRSTNAME)));
        etudiant.setNomeleve(c.getString(Integer.valueOf(COL_LASTNAME)));
        etudiant.setLogineleve(c.getString(Integer.valueOf(COL_LOGIN)));
        etudiant.setPasswordeleve(c.getString(Integer.valueOf(COL_PASSWORD)));
        etudiant.setPseudoeleve(c.getString(Integer.valueOf(COL_PSEUDO)));
        etudiant.setSectioneleve(c.getString(Integer.valueOf(COL_SECTION)));
        etudiant.setAge(c.getInt(Integer.valueOf(COL_AGE)));
        etudiant.setSexe(c.getString(Integer.valueOf(COL_SEXE)));
        etudiant.setPathImage(c.getString(Integer.valueOf(COL_PATHIMAGE)));
        //On ferme le cursor
        c.close();

        //On retourne le livre
        return etudiant;
    }
}
