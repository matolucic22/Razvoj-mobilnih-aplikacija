package hr.etfos.mlucic.testzaband.Activities.Activities.Greske.Ispis_greske;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hr.etfos.mlucic.testzaband.R;



public class Ispis_gresaka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ispis_gresaka);

        Button btn_ispis_greske_miro= (Button) findViewById(R.id.ispis_gresaka_miro);
        Button btn_ispis_greske_mato= (Button) findViewById(R.id.ispis_gresaka_mato);
        Button btn_ispis_greske_nikola= (Button) findViewById(R.id.ispis_gresaka_nikola);
        Button btn_ispis_greske_davor= (Button) findViewById(R.id.ispis_gresaka_davor);
        Button btn_ispis_greske_tomislav= (Button) findViewById(R.id.ispis_gresaka_tomislav);

        btn_ispis_greske_miro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ispis_gresaka.this, Ispis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_ISPIS", "MIRO");
                startActivity(intent);
            }
        });

        btn_ispis_greske_mato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ispis_gresaka.this, Ispis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_ISPIS", "MATO");
                startActivity(intent);
            }
        });

        btn_ispis_greske_nikola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ispis_gresaka.this, Ispis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_ISPIS", "NIKOLA");
                startActivity(intent);
            }
        });

        btn_ispis_greske_davor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ispis_gresaka.this, Ispis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_ISPIS", "DAVOR");
                startActivity(intent);
            }
        });

        btn_ispis_greske_tomislav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ispis_gresaka.this, Ispis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_ISPIS", "TOMISLAV");
                startActivity(intent);
            }
        });
    }


}


