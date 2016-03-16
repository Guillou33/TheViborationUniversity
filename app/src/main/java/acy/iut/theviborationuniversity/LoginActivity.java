package acy.iut.theviborationuniversity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.ContentResolver;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

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
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity implements OnClickListener {

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */

    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;
    private ProgressBar progressBarC;
    private static final String FLAG_SUCCESS = "success";
    private static final String FLAG_MESSAGE = "message";
    private static final String LOGIN_URL = "http://houdayec.alwaysdata.net/login.php"; // ajustez selon votre adresse de serveur
    public TextView connectionStatus;
    Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogin = (Button)findViewById(R.id.loginButton);
        //EditText email = (EditText)findViewById(R.id.emailBox);
        //EditText password = (EditText)findViewById(R.id.passwordBox);
        connectionStatus = (TextView)findViewById(R.id.connectionStatus);

        progressBarC = (ProgressBar)findViewById(R.id.progressBarC);
        // Set up the login form.
        mEmailView = (AutoCompleteTextView) findViewById(R.id.emailBox);


        mPasswordView = (EditText) findViewById(R.id.passwordBox);
        mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == R.id.login || id == EditorInfo.IME_NULL) {

                    return true;
                }
                return false;
            }
        });

        Button mEmailSignInButton = (Button) findViewById(R.id.loginButton);
        mEmailSignInButton.setOnClickListener(this);

        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginButton:
                Log.d("Connexion", "Connect Button Pressed !");
                try {
                    Log.d("Retour tostring", mEmailView.getText().toString());
                    Etudiant Coco = new Etudiant(mEmailView.getText().toString(), mPasswordView.getText().toString());

                    progressBarC.setVisibility(View.VISIBLE);
                    progressBarC.setProgress(0);
                    new LoginTask().execute(Coco);
                } catch (Exception k) {
                    Log.e("Erreur lors de la tache", "damn");
                }
        }





    }

    private class LoginTask extends AsyncTask<Etudiant, Integer, JSONObject> {

        private AutoCompleteTextView mEmailView;
        private EditText mPasswordView;
        private View mProgressView;
        private View mLoginFormView;
        private ProgressBar progressBarC;
        private static final String FLAG_SUCCESS = "success";
        private static final String FLAG_MESSAGE = "message";
        private static final String LOGIN_URL = "http://houdayec.alwaysdata.net/login.php"; // ajustez selon votre adresse de serveur
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
                Log.e("JSONException", String.valueOf(e));
            }

            return jsonResponse;
        }

        protected void onPostExecute(JSONObject response) {
            Log.d("OnPostExecute", "2eme para");
            try {
                Toast loginLoadToast = Toast.makeText(getApplicationContext(),"Connexion en cours..", Toast.LENGTH_SHORT);
                loginLoadToast.show();
                int loginOK = response.getInt(FLAG_SUCCESS);
                Log.d(response.getString(FLAG_MESSAGE), "bug");

                Toast loginOkToast = Toast.makeText(getApplicationContext(),"Connexion réussie !", Toast.LENGTH_LONG);
                Toast loginFailToast = Toast.makeText(getApplicationContext(),"Connexion fail !", Toast.LENGTH_LONG);

                Log.d("retour du json", response.getString(FLAG_MESSAGE));

                if(loginOK == 1){
                    loginOkToast.show();
                    Intent launchProfile = new Intent(getApplicationContext(), ProfileEtudiant.class);
                    launchProfile.putExtra("firstKeyName","FirstKeyValue");
                    startActivity(launchProfile);
                }else{
                    loginFailToast.show();
                }

                Log.d("YOlooooloooo", "2eme para");

                if (loginOK != 0) {

                } else {

                    // TODO : faire un autre truc
                }
            } catch (JSONException e) {
                Log.e("JSONException", String.valueOf(e));
            }
        }

        protected void onProgressUpdate(Integer... progress) {
            progressBarC.setProgress(progress[0]);
        }

        public String convertStreamToString(java.io.InputStream is) {
            java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
            return s.hasNext() ? s.next() : "";
        }
    }

}

