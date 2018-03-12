package hr.etfos.mlucic.testzaband.Activities.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;


import hr.etfos.mlucic.testzaband.Activities.Activities.Greske.Greske;
import hr.etfos.mlucic.testzaband.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout btn_repertoar = (RelativeLayout) findViewById(R.id.id_repertoar);
        RelativeLayout btn_kalendar = (RelativeLayout) findViewById(R.id.id_kalendar);
        RelativeLayout btn_greske = (RelativeLayout) findViewById(R.id.id_greske);

        btn_kalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Kalendar.class);
                startActivity(intent);
            }
        });

        btn_repertoar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Repertoar.class);
                startActivity(intent);
            }
        });

        btn_greske.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Greske.class);
                startActivity(intent);
            }
        });


    }
}
