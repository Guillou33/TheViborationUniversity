package acy.iut.theviborationuniversity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by autierg on 03/03/2016.
 */
public class LesGenres extends Activity {

    private HashMap<String, String> fillHashMap(String Title, String summary, String icon){
        HashMap<String, String> item = new HashMap<String, String>();
        item.put("TextAppTitle", Title);
        item.put("TextAppSummary", summary);
        item.put("App_icon", icon);
        return item;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_genre);

        ListView uneliste;
        uneliste = (ListView)findViewById(R.id.listGenres);


        ArrayList<HashMap<String, String>> laliste = new ArrayList<HashMap<String, String>>();
        laliste.add(fillHashMap("SoundCloud","J'aime tapper du pied",String.valueOf(R.drawable.enceinte)));
        laliste.add(fillHashMap("T�l�phone","Appel � un ami",String.valueOf(R.drawable.champi)));
        laliste.add(fillHashMap("Calculatrice","Calculer avec la machine",String.valueOf(R.drawable.calcul)));

        SimpleAdapter itemsAdapter = new SimpleAdapter (this.getBaseContext(),laliste, R.layout.app_item,
                new String[] {"TextAppTitle", "TextAppSummary", "App_icon"}, new int[] {R.id.TextAppTitle,
                R.id.TextAppSummary, R.id.App_icon});
        uneliste.setAdapter(itemsAdapter);
    }

    public void onClick(View v){

    }

    public void ajoutGenre(View v){

    }
}
