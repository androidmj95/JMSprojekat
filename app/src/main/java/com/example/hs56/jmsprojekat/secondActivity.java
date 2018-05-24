package com.example.hs56.jmsprojekat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class secondActivity extends AppCompatActivity implements View.OnClickListener {

   // public static final String KOMENTAR_EXTRA = "com.example.hs56.jmsprojekat.secondActivity.KOMENTAR";
    //public static final String RADIOB_EXTRA = "com.example.hs56.jmsprojekat.secondActivity.RADIOB";
    //public static final String CBPAL_EXTRA = "com.example.hs56.jmsprojekat.secondActivity.CBPAL";
    //public static final String CBKROF_EXTRA = "com.example.hs56.jmsprojekat.secondActivity.CBPAL";
    //public static final String CBCAJ_EXTRA = "com.example.hs56.jmsprojekat.secondActivity.CBPAL";
    //public static final String CBSOK_EXTRA = "com.example.hs56.jmsprojekat.secondActivity.CBPAL";



    Bundle extra = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.cb_sok).setOnClickListener(this);
        findViewById(R.id.cb_caj).setOnClickListener(this);
        findViewById(R.id.cb_krofna).setOnClickListener(this);
        findViewById(R.id.cb_palacinka).setOnClickListener(this);
        findViewById(R.id.radioGroup).setOnClickListener(this);
        findViewById(R.id.id_rbPoneti).setOnClickListener(this);
        findViewById(R.id.id_rbRest).setOnClickListener(this);


        Button otvoriNarudzbinu = (Button) findViewById(R.id.button);
        otvoriNarudzbinu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pregled();
            }
        });
    }

    @Override
    public void onClick(View v) {

        RadioGroup rGrupa = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton poneti = (RadioButton) findViewById(R.id.id_rbPoneti);
        RadioButton rest = (RadioButton) findViewById(R.id.id_rbRest);
        extra.putString("RBPON_EXTRA", poneti.getText().toString());


        switch (v.getId()) {

            case R.id.cb_caj:
                CheckBox caj = (CheckBox) findViewById(R.id.cb_caj);
                if (caj.isChecked()) {
                    extra.putString("CBCAJ_EXTRA",caj.getText().toString());
                }
                else {
                    extra.remove("CBCAJ_EXTRA");
                }
                break;

            case R.id.cb_sok:
                CheckBox sok = (CheckBox) findViewById(R.id.cb_sok);
                if (sok.isChecked()) {
                    extra.putString("CBSOK_EXTRA",sok.getText().toString());
                }
                else {
                    extra.remove("CBSOK_EXTRA");
                }
                break;



            case R.id.cb_krofna:
                CheckBox krofna = (CheckBox) findViewById(R.id.cb_krofna);
                if (krofna.isChecked()) {
                    extra.putString("CBKROF_EXTRA",krofna.getText().toString());
                }
                else {
                    extra.remove("CBKROF_EXTRA");
                }
                break;


            case R.id.cb_palacinka:
                CheckBox palacinka = (CheckBox) findViewById(R.id.cb_palacinka);
                if (palacinka.isChecked()) {
                    extra.putString("CBPAL_EXTRA",palacinka.getText().toString());
                }
                else {
                    extra.remove("CBPAL_EXTRA");
                }
                break;


            case R.id.id_rbPoneti:
                if (poneti.isChecked()){
                    extra.putString("RBPON_EXTRA", poneti.getText().toString());
                }
                else {
                    extra.remove("RBPON_EXTRA");
                }

            case R.id.id_rbRest:
                if (rest.isChecked()){
                    extra.putString("RBRES_EXTRA", rest.getText().toString());
                }
                else {
                    extra.remove("RBRES_EXTRA");
                }
                break;



        }

    }

    public void pregled(){

        Intent iPregled = new Intent(this, narudzbina.class);

        EditText komentar = (EditText) findViewById(R.id.editText_koment);
        extra.putString("KOMENTAR_EXTRA", komentar.getText().toString());

        iPregled.putExtras(extra);
        startActivity(iPregled);

    }
}
