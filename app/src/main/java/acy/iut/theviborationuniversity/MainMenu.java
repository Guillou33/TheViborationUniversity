package acy.iut.theviborationuniversity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by autierg on 07/03/2016.
 */
public class MainMenu extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
    }

    public void accessProfil(View v){
        Context context = getApplicationContext();
        Intent intentAccessStudents = new Intent(this, ProfileEtudiant.class);
        startActivity(intentAccessStudents);
    }

    public void accessLesGenres(View v){
        Context context = getApplicationContext();
        Intent intentAccessStudents = new Intent(this, LesGenres.class);
        startActivity(intentAccessStudents);
    }

    public void accessLesEtudiants(View v){
        Context context = getApplicationContext();
        Intent intentAccessStudents = new Intent(this, LesProfiles.class);
        startActivity(intentAccessStudents);
    }

    public void accessLesChats(View v){
        Context context = getApplicationContext();
        Intent intentAccessStudents = new Intent(this, LesChats.class);
        startActivity(intentAccessStudents);
    }

}
