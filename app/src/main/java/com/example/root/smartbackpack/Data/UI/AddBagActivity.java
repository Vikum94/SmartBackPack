package com.example.root.smartbackpack.Data.UI;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.root.smartbackpack.Data.Model.Controller;
import com.example.root.smartbackpack.R;

public class AddBagActivity extends AppCompatActivity {
    Button addBag;
    Controller controller = new Controller();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bag);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addBag = (Button) findViewById(R.id.addBag);

        addBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.setBagDetails();
                Intent intent = new Intent(AddBagActivity.this, BagActivity.class);
                startActivity(intent);
            }
        });


    }

}
