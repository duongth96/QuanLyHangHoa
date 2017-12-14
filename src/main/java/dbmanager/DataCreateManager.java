package dbmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by duongth on 14-Dec-17.
 */

public class DataCreateManager extends SQLiteOpenHelper {

    static final String NAME = "PRODUCT_MANAGER.db";

    public DataCreateManager(Context context) {
        super(context, NAME, null , 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // create table in here.
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion == newVersion){
            db.execSQL("drop if exists PRODUCT_MANAGER");

            onCreate(db);
        }
    }

    // co the tao ca ham truy xuat du lieu tu db tai day.
}
