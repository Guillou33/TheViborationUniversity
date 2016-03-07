package acy.iut.theviborationuniversity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by autierg on 01/03/2016.
 */
public class ProfileAutreEtudiant extends Activity {

    public ListView uneliste;

    private HashMap<String, String> fillHashMap(String Title, String summary, String icon){
        HashMap<String, String> item = new HashMap<String, String>();
        item.put("TextAppTitle", Title);
        item.put("TextAppSummary", summary);
        item.put("App_icon", icon);
        return item;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_autre_etudiant);

        uneliste = (ListView)findViewById(R.id.listMusiques);


        ArrayList<HashMap<String, String>> laliste = new ArrayList<HashMap<String, String>>();
        laliste.add(fillHashMap("SoundCloud","J'aime tapper du pied",String.valueOf(R.drawable.enceinte)));
        laliste.add(fillHashMap("Téléphone","Appel à un ami",String.valueOf(R.drawable.champi)));
        laliste.add(fillHashMap("Calculatrice", "Calculer avec la machine", String.valueOf(R.drawable.calcul)));

        SimpleAdapter itemsAdapter = new SimpleAdapter (this.getBaseContext(),laliste, R.layout.app_item,
                new String[] {"TextAppTitle", "TextAppSummary", "App_icon"}, new int[] {R.id.TextAppTitle,
                R.id.TextAppSummary, R.id.App_icon});
        uneliste.setAdapter(itemsAdapter);
        uneliste.setClickable(true);
        uneliste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                switch (position) {
                    case 0:

                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    default:
                        Log.d("Error", "Erreur dans le lancement");
                }
            }
        });
    }
}
