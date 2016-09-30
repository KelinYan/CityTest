package com.publicbicycle.skyware.citytest.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hc on 2016/9/30.
 */

public class DbUtil extends SQLiteOpenHelper {
    public static final String name = "city";
    public DbUtil(Context context) {
        super(context, name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
