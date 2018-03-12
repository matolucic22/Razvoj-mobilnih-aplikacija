package hr.etfos.mlucic.testzaband.Activities.Activities.Greske.Ispis_greske;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import hr.etfos.mlucic.testzaband.Activities.Activities.DividerItemDecoration;
import hr.etfos.mlucic.testzaband.Activities.Adapters.PjesmeAdapters;
import hr.etfos.mlucic.testzaband.Activities.Adapters.RecyclerItemClickListener;
import hr.etfos.mlucic.testzaband.Activities.Data.Pjesme;
import hr.etfos.mlucic.testzaband.Activities.Database.DatabaseAccess;
import hr.etfos.mlucic.testzaband.R;

public class Ispis_greske_final extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PjesmeAdapters pjesmeAdapters;
    private List<Pjesme> pjesmeList=new ArrayList<Pjesme>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ispis_greske_final);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        Button btn_obrisi_sve= (Button) findViewById(R.id.btn_obrisi_sve);

        final DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        databaseAccess.open();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String ime = extras.getString("IME_ZA_ISPIS");
            pjesmeList = databaseAccess.PopisGresaka(ime);

        }

        if (databaseAccess != null) {
            databaseAccess.close();
        }

        pjesmeAdapters = new PjesmeAdapters(pjesmeList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(pjesmeAdapters);







        final DatabaseAccess databaseAccess1 = DatabaseAccess.getInstance(this);
        databaseAccess1.open();

        btn_obrisi_sve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    String ime = extras.getString("IME_ZA_ISPIS");

                    Cursor rs = databaseAccess1.deleteGreska(ime);
                    try {
                        if (rs != null && rs.moveToFirst()) {

                            String tekst = rs.getString(rs.getColumnIndex("tekst"));
                            System.out.println(tekst);
                        }
                    } catch (Throwable e) {
                        e.printStackTrace();
                    }
                    Toast toast = Toast.makeText(getBaseContext(), "Unosi obrisani", Toast.LENGTH_SHORT);
                    toast.show();

                }

            }

        });

    }


}
