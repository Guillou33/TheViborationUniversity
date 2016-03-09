package acy.iut.theviborationuniversity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
/**
 * Created by houdayec on 09/03/2016.
 */
public class MaBaseSQLite extends SQLiteOpenHelper {

    private static final String TABLE_PROFIL = "table_profil";
    private static final String COL_ID = "Id";
    private static final String COL_LASTNAME= "Lastname";
    private static final String COL_FIRSTNAME = "Firstname";
    private static final String COL_AGE = "Age";
    private static final String COL_SEXE= "Sexe";
    private static final String COL_PATHIMAGE = "Path_image";

    private static final String CREATE_BDD = "CREATE TABLE " + TABLE_PROFIL + " ("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_LASTNAME + " TEXT NOT NULL, "
            + COL_FIRSTNAME + " TEXT NOT NULL," + COL_AGE + " TEXT NOT NULL,"
            + COL_SEXE + "TEXT NOT NULL," + COL_PATHIMAGE + "TEXT NOT NULL);";

    public MaBaseSQLite(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //on créé la table à partir de la requête écrite dans la variable CREATE_BDD
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //On peut fait ce qu'on veut ici moi j'ai décidé de supprimer la table et de la recréer
        //comme ça lorsque je change la version les id repartent de 0
        db.execSQL("DROP TABLE " + TABLE_PROFIL + ";");
        onCreate(db);
    }
}
