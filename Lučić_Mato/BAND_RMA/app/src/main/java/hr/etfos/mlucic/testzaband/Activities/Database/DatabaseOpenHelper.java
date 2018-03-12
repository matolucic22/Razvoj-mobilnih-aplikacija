package hr.etfos.mlucic.testzaband.Activities.Database;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


/**
 * Created by Home on 31.12.2016..
 */

public class DatabaseOpenHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "BAND_DATABASE_main.db";
    private static final int DATABASE_VERSION = 1;

    // Contacts table name
    public static final String TABLE_PJESME = "PJESME";

    // Contacts Table Columns names
    private static final String KEY_ID_RED = "id";
    private static final String KEY_IME_RED = "ime";
    private static final String KEY_TEKST_RED = "tekst";


    public DatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
