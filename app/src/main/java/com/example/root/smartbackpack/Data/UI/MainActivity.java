package com.example.root.smartbackpack.Data.UI;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Switch;

import com.example.root.smartbackpack.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> bagList;
    private HashMap<String, List<String>> aaa;
    private ExpandableListView expBag;
    private Button testBag;
    //public void addBagByName(String bagName){
        //this.bagName=bagName;
    //}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testBag = (Button) findViewById(R.id.testBag);

        //expBag = (ExpandableListView) findViewById(R.id.selectBag);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.addBag);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddBagActivity.class);
                startActivity(intent);
            }
        });

    }
}
