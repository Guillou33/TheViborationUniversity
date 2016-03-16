package acy.iut.theviborationuniversity;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Created by houdayec on 16/03/2016.
 */
/*
public class LoginTask extends AsyncTask<Etudiant, Integer, JSONObject> {

    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;
    private ProgressBar progressBarC;
    private static final String FLAG_SUCCESS = "success";
    private static final String FLAG_MESSAGE = "message";
    private static final String LOGIN_URL = "http://houdayec.alwaysdata.net/login.php"; // ajustez selon votre adresse de serveur
    private TextView connectionStatus;
    Button buttonLogin;



    @Override
    protected JSONObject doInBackground(Etudiant... params) {

        //connectionStatus = (TextView)findViewById(R.id.connectionStatus);
        JSONObject jsonResponse = new JSONObject();

        try {
            URL url = new URL(LOGIN_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            Log.d("1er try doInBck", "Work in progress");
            connection.setRequestMethod("POST");

            String urlParameters = "loginEtudiant=" + params[0].getLogineleve() + "&passwordEtudiant=" + params[0].getPasswordeleve();
            byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
            connection.setRequestProperty("Content-Length", "" + postData.length);
            try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                Log.d("DataOutputStream", "Work in progress");
                wr.write(postData);
            }


            Log.d("HttpRequestTaskManager", "ready to send request...");
            connection.connect();

            InputStream in = new BufferedInputStream(connection.getInputStream());
            jsonResponse = new JSONObject(convertStreamToString(in));

        } catch (IOException e) {
            Log.e("IOException", String.valueOf(e));
        } catch (JSONException e) {
            Log.e("JSONException",String.valueOf(e));
        }

        return jsonResponse;
    }

    protected void onPostExecute(JSONObject response){
        Log.d("OnPostExecute", "2eme para");
        try {

            int loginOK = response.getInt(FLAG_SUCCESS);


            connectionStatus.setText(response.getString(FLAG_MESSAGE));
            Log.d("YOlooooloooo", "2eme para");
            progressBarC.setVisibility(View.GONE);
            if (loginOK != 0) {

            } else {

                // TODO : faire un autre truc
            }
        }catch (JSONException e) {
            Log.e("JSONException", String.valueOf(e));
        }
    }

    protected void onProgressUpdate(Integer... progress){
        progressBarC.setProgress(progress[0]);
    }

    public String convertStreamToString(java.io.InputStream is){
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
*/