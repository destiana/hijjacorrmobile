package com.example.lenovog40.tampilanawal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by WIN8Ori on 16/01/2017.
 */
public class Katalogactivity extends AppCompatActivity {

    Button button1, button2, button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.katalog_hijab);
        button1 = (Button) findViewById(R.id.button4);
        button2 = (Button) findViewById(R.id.button5);
        button3 = (Button) findViewById(R.id.button6);
        button4 = (Button) findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(Katalogactivity.this, Model1.class);
                startActivity(menut);
                finish();
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(Katalogactivity.this, Model2.class);
                startActivity(menut);
                finish();
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(Katalogactivity.this, Model3.class);
                startActivity(menut);
                finish();
            }

        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menut = new Intent(Katalogactivity.this, Model4.class);
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
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
            return true;
        }
        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }
}
