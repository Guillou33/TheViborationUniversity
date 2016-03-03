package acy.iut.theviborationuniversity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by autierg on 12/02/2016.
 */
public class ProfileEtudiant extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_etudiant);


    }

    public void accessStudents(View v){
        Context context = getApplicationContext();
        Intent intentAccessStudents = new Intent(this, LesProfiles.class);
        startActivity(intentAccessStudents);
    }

    public void accessModifProfil(View v){
        Context context = getApplicationContext();
        Intent intentAccessModfiProfil = new Intent(this, ModifProfil.class);
        startActivity(intentAccessModfiProfil);
    }

    public void accessChats(View v){
        Context context = getApplicationContext();
        Intent intentAccessChats = new Intent(this, LesChats.class);
        startActivity(intentAccessChats);
    }
}
