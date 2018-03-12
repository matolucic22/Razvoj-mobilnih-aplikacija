package hr.etfos.mlucic.testzaband.Activities.Activities.Greske.Upis_gresaka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import hr.etfos.mlucic.testzaband.R;

public class Upis_greske extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upis_greske);

        Button btn_upis_greske_miro= (Button) findViewById(R.id.upis_gresaka_miro);
        Button btn_upis_greske_mato= (Button) findViewById(R.id.upis_gresaka_mato);
        Button btn_upis_greske_nikola= (Button) findViewById(R.id.upis_gresaka_nikola);
        Button btn_upis_greske_davor= (Button) findViewById(R.id.upis_gresaka_davor);
        Button btn_upis_greske_tomislav= (Button) findViewById(R.id.upis_gresaka_tomislav);

        btn_upis_greske_miro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Upis_greske.this, Upis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_UPIS", "MIRO");
                startActivity(intent);
            }
        });

        btn_upis_greske_mato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Upis_greske.this, Upis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_UPIS", "MATO");
                startActivity(intent);
            }
        });

        btn_upis_greske_nikola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Upis_greske.this, Upis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_UPIS", "NIKOLA");
                startActivity(intent);
            }
        });

        btn_upis_greske_davor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Upis_greske.this, Upis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_UPIS", "DAVOR");
                startActivity(intent);
            }
        });

        btn_upis_greske_tomislav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Upis_greske.this, Upis_greske_final.class);
                startActivity(intent);
                intent.putExtra("IME_ZA_UPIS", "TOMISLAV");
                startActivity(intent);
            }
        });
    }
}
