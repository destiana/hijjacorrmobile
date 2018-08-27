package com.example.lenovog40.tampilanawal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button buttonw, buttonww, buttonwww;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity3_main);
        buttonw = (Button) findViewById(R.id.button);
        buttonww = (Button) findViewById(R.id.button2);
        buttonwww = (Button) findViewById(R.id.button3);

        buttonw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(MainActivity3.this, KnowLedge.class);
                startActivity(menut);
                finish();
            }

        });

        buttonww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(MainActivity3.this, Tuntunan.class);
                startActivity(menut);
                finish();
            }

        });

        buttonwww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(MainActivity3.this, Katalogactivity.class);
                startActivity(menut);
                finish();
            }

        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        ;
        int id = item.getItemId();
        if(id == android.R.id.home){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }





}
