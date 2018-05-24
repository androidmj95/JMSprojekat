package com.example.hs56.jmsprojekat;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iLogo = (ImageView) findViewById(R.id.imageLogo);
        iLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.tripadvisor.rs/Restaurants-g294472-Belgrade.html";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        Button but_secAct = (Button) findViewById(R.id.button_secondActivity);
        but_secAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_secAct = new Intent(MainActivity.this, secondActivity.class);
                startActivity(intent_secAct);
            }
        });





    }
}
