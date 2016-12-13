package com.example.root.smartbackpack.Data.UI;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.root.smartbackpack.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.lang.*;

public class SignupActivity extends AppCompatActivity {
    Button signUp;
    EditText fname;
    EditText lname;
    EditText email;
    EditText password1;
    EditText password2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signUp = (Button) findViewById(R.id.createAccount);
        this.fname = (EditText) findViewById(R.id.fname);
        this.lname = (EditText) findViewById(R.id.lname);
        this.password1 = (EditText) findViewById(R.id.password1);
        this.password2 = (EditText) findViewById(R.id.password2);
        this.email = (EditText) findViewById(R.id.email);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fname.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),"Please enter your first name",Toast.LENGTH_SHORT);
                    toast.show();
                    fname.setHintTextColor(Color.RED);
                }
                if(password1.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),"Please enter a Password",Toast.LENGTH_SHORT);
                    toast.show();
                    password1.setHintTextColor(Color.RED);
                }
                if(!password1.getText().toString().equals(password2.getText().toString())){
                    password1.getText().clear();
                    password2.getText().clear();
                    password1.setHintTextColor(Color.RED);
                    password2.setHintTextColor(Color.RED);
                    Toast toast = Toast.makeText(getApplicationContext(),"Two passwords does not match",Toast.LENGTH_SHORT);
                    toast.show();
                }

                else{
                    signUp = (Button) findViewById(R.id.signUp);

                    signUp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(SignupActivity.this, AddBagActivity.class);
                            startActivity(intent);
                        }
                    });
                }
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Signup Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
