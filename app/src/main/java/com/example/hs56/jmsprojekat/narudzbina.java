package com.example.hs56.jmsprojekat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class narudzbina extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narudzbina);


        Bundle extra = getIntent().getExtras();

        String krofna = extra.getString("CBKROF_EXTRA");
        String palacinka = extra.getString("CBPAL_EXTRA");
        String caj = extra.getString("CBCAJ_EXTRA");
        String sok = extra.getString("CBSOK_EXTRA");
        String komentar = extra.getString("KOMENTAR_EXTRA");
        String restoran = extra.getString("RBRES_EXTRA");
        String poneti = extra.getString("RBPON_EXTRA");
        String tekstPregleda = "OVO JE VASA NARUDZBINA \n\n";

        String usluga;
        if (restoran != null){
            usluga = restoran;
        }
        else {
            usluga = poneti;
        }



        tekstPregleda+="   Hrana:\n ";
        if (krofna != null)
            tekstPregleda += "   "+krofna+"\n";

        if (palacinka != null)
            tekstPregleda += "   "+palacinka+"\n";

        tekstPregleda+="\n   Pice:\n";
        if (sok != null)
            tekstPregleda += "   "+sok+"\n";

        if (caj != null)
            tekstPregleda += "   "+caj+"\n";

        tekstPregleda+="\n   Dodatni komentar:\n";
        if (komentar != null)
            tekstPregleda += "   "+komentar+"\n";

        tekstPregleda+="\n   Nacin usluge:\n";
        if (usluga != null)
        {tekstPregleda += "   "+usluga+"\n";}

        tekstPregleda += "\n\n                                        PRIJATNO!";



        TextView prikazTekstaPregleda = (TextView) findViewById(R.id.labelNaruceno);
        prikazTekstaPregleda.setText(tekstPregleda);


    }
}
