package com.example.lenovog40.tampilanawal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_full_image);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                Intent i = getIntent();
                int position = i.getExtras().getInt("id");
                ImageAdapter adapter = new ImageAdapter(this);
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.setImageResource(adapter.images[position]);

        }

        public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                ;
                int id = item.getItemId();
                if(id == android.R.id.home){
                        Intent intent = new Intent(this, Gallery.class);
                        startActivity(intent);
                        return true;
                }
                //noinspection SimplifiableIfStatement

                return super.onOptionsItemSelected(item);
        }

}