package hr.etfos.mlucic.testzaband.Activities.Adapters;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import hr.etfos.mlucic.testzaband.Activities.Data.Pjesme;
import hr.etfos.mlucic.testzaband.R;

/**
 * Created by Home on 15.12.2016..
 */

public class PjesmeAdapters extends RecyclerView.Adapter<PjesmeAdapters.MyViewHolder>{
    private List<Pjesme> pjesmeLista;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView ime;
        public MyViewHolder(View view) {
            super(view);
            ime = (TextView) view.findViewById(R.id.ime_id);
        }
    }

    public PjesmeAdapters(List<Pjesme> pjesmeLista) {
        this.pjesmeLista = pjesmeLista;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //inflates movie list--to instante XML in file
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ime_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {//set data to each row.
        Pjesme pjesme=pjesmeLista.get(position);
        holder.ime.setText(pjesme.getIme());



    }

    @Override
    public int getItemCount() {
        return pjesmeLista.size();
    }
}
