package hr.etfos.mlucic.testzaband.Activities.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import hr.etfos.mlucic.testzaband.Activities.Adapters.RecyclerItemClickListener;
import hr.etfos.mlucic.testzaband.Activities.Data.Pjesme;

/**
 * Created by Home on 31.12.2016..
 */

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */
    public DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public List<Pjesme> getIme() {
        List<Pjesme> pjesmeList = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT ime FROM "+ DatabaseOpenHelper.TABLE_PJESME, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast())
        {
            Pjesme pjesme = new Pjesme();
            pjesme.setIme(cursor.getString(0));
            pjesmeList.add(pjesme);
            cursor.moveToNext();
        }
        cursor.close();
        return pjesmeList;

    }
   public Cursor getTekstpjesme(int position)
    {
        Cursor cursor = database.rawQuery("SELECT tekst FROM "+DatabaseOpenHelper.TABLE_PJESME+" WHERE id="+position+"", null);
        return cursor;
    }

    public Cursor insertGreska(int position, String ime)
    {
        Cursor cursor=database.rawQuery("INSERT INTO "+ime+"(pjesme_err) SELECT ime FROM PJESME WHERE id="+position+"", null);
        return cursor;
    }


    public List<Pjesme> PopisGresaka(String ime) {
        List<Pjesme> pjesmeList = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM "+ime, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast())
        {
            Pjesme pjesme = new Pjesme();
            pjesme.setIme(cursor.getString(1));
            pjesmeList.add(pjesme);
            cursor.moveToNext();
        }
        cursor.close();
        return pjesmeList;

    }



    public Cursor deleteGreska(String ime)
    {
        Cursor cursor=database.rawQuery("DELETE FROM "+ime, null);
        return cursor;
    }





}