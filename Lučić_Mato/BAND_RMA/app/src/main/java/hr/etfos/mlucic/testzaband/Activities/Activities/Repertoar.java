package hr.etfos.mlucic.testzaband.Activities.Activities;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import hr.etfos.mlucic.testzaband.Activities.Adapters.PjesmeAdapters;
import hr.etfos.mlucic.testzaband.Activities.Data.Pjesme;
import hr.etfos.mlucic.testzaband.Activities.Database.DatabaseAccess;
import hr.etfos.mlucic.testzaband.Activities.Adapters.RecyclerItemClickListener;
import hr.etfos.mlucic.testzaband.R;

public class Repertoar extends AppCompatActivity  {

    private RecyclerView recyclerView;
    private PjesmeAdapters pjesmeAdapters;
    private List<Pjesme> pjesmeList=new ArrayList<Pjesme>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repertoar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        final DatabaseAccess databaseAccess=DatabaseAccess.getInstance(this);
        databaseAccess.open();
        pjesmeList=databaseAccess.getIme();
        databaseAccess.close();

        pjesmeAdapters = new PjesmeAdapters(pjesmeList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(pjesmeAdapters);



        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {

                        Intent intent=new Intent(Repertoar.this, Tekst_pjesme.class);
                        intent.putExtra("POSITION", position);
                        startActivity(intent);
                    }
                })
        );

    }

}
