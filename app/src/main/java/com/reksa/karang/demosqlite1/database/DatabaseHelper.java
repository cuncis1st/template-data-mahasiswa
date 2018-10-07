package com.reksa.karang.demosqlite1.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = DatabaseHelper.class.getName();

    private static final String DATABASE_NAME = "student.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE biodata(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nama TEXT NOT NULL, tanggal TEXT NOT NULL, jk TEXT NOT NULL, " +
                "alamat TEXT NOT NULL)";
        Log.d(TAG, "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata(nama, tanggal, jk, alamat) VALUES " +
                "('Karang', '1997-10-18', 'L', 'PBI')";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS biodata");
        onCreate(db);
    }
}
