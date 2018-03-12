package hr.etfos.mlucic.testzaband.Activities.Activities;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import hr.etfos.mlucic.testzaband.Activities.Data.Pjesme;
import hr.etfos.mlucic.testzaband.Activities.Database.DatabaseAccess;
import hr.etfos.mlucic.testzaband.R;

public class Tekst_pjesme extends AppCompatActivity {

    TextView tekstpjesme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final DatabaseAccess databaseAccess=DatabaseAccess.getInstance(this);
        setContentView(R.layout.activity_tekst_pjesme);
        tekstpjesme= (TextView) findViewById(R.id.textView);
        databaseAccess.open();
        Bundle extras = getIntent().getExtras();
        if(extras !=null) {
            int position = extras.getInt("POSITION");
            Cursor rs = databaseAccess.getTekstpjesme(position+1);
            if(rs != null && rs.moveToFirst()) {

                String tekst = rs.getString(rs.getColumnIndex("tekst"));
                tekstpjesme.setText(tekst);
                rs.close();
            }
        }

        databaseAccess.close();


    }
}
