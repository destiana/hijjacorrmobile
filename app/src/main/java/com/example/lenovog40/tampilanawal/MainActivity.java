package com.example.lenovog40.tampilanawal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button knowledgeButton, scanButton, helpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        knowledgeButton = (Button) findViewById(R.id.buttonKnow);
        scanButton = (Button) findViewById(R.id.buttonScan);
        helpButton = (Button) findViewById(R.id.buttonHelp);

        knowledgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(menut);
                finish();
            }

        });

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(MainActivity.this, Coba.class);
                startActivity(menut);
                finish();
            }

        });


        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(MainActivity.this, Help.class);
                startActivity(menut);
                finish();
            }

        });
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        ;

        //noinspection SimplifiableIfStatement
        if (item.getItemId() == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;


        }
        return super.onOptionsItemSelected(item);
    }


}

