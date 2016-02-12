package acy.iut.theviborationuniversity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by autierg on 12/02/2016.
 */
public class Profiles extends Activity {
    //fonction Hashmap pour la liste
    private HashMap<String, String> fillHashMap(String Title, String summary, String icon){
        HashMap<String, String> item = new HashMap<String, String>();
        item.put("TextAppTitle", Title);
        item.put("TextAppSummary", summary);
        item.put("App_icon", icon);
        return item;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_profiles);

        ListView uneliste;
        uneliste = (ListView)findViewById(R.id.listEtudiant);


        ArrayList<HashMap<String, String>> laliste = new ArrayList<HashMap<String, String>>();
        laliste.add(fillHashMap("SoundCloud","J'aime tapper du pied",String.valueOf(R.drawable.enceinte)));
        laliste.add(fillHashMap("T�l�phone","Appel � un ami",String.valueOf(R.drawable.champi)));
        laliste.add(fillHashMap("Calculatrice","Calculer avec la machine",String.valueOf(R.drawable.calcul)));


    }

    public void onClick(View v){

    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id){

    }
}
