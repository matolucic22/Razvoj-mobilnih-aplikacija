package hr.etfos.mlucic.testzaband.Activities.Activities.Greske;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import hr.etfos.mlucic.testzaband.Activities.Activities.Greske.Ispis_greske.Ispis_gresaka;
import hr.etfos.mlucic.testzaband.Activities.Activities.Greske.Upis_gresaka.Upis_greske;
import hr.etfos.mlucic.testzaband.R;

public class Greske extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greske);

        RelativeLayout btn_unos_greske = (RelativeLayout) findViewById(R.id.id_unos_greske);
        RelativeLayout btn_ispis_greske = (RelativeLayout) findViewById(R.id.id_ispis_gresaka);

        btn_unos_greske.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Greske.this, Upis_greske.class);
                startActivity(intent);
            }
        });

        btn_ispis_greske.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Greske.this, Ispis_gresaka.class);
                startActivity(intent);
            }
        });

    }
}
