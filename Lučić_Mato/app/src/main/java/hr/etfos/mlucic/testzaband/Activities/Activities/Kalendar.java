package hr.etfos.mlucic.testzaband.Activities.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import hr.etfos.mlucic.testzaband.R;

public class Kalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalendar);

        RelativeLayout btn_unos= (RelativeLayout) findViewById(R.id.id_unos);
        RelativeLayout btn_ispis= (RelativeLayout) findViewById(R.id.id_ispis);

        btn_unos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://calendar.google.com/calendar/gpcal?tab=wc");
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btn_ispis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Kalendar.this, Ispis.class);
                startActivity(intent);
            }
        });
    }
}
