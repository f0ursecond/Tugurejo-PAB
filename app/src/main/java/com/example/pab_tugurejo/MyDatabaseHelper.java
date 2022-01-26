//package com.example.pab_tugurejo;
//
//
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//
//public class MyDatabaseHelper extends SQLiteOpenHelper {
//
//    private Context context;
//    private static final String DATABASE_NAME = "pab_tugurejo";
//    private static final int DATABASE_VERSION =  1;
//
//    private static final String TABLE_NAME = "cater";
//    private static final String COLUMN_ID = "_id";
//    private static final String COLUMN_NAME  = "nama";
//    private static final String COLUMN_RT = "rt";
//    private static final String COLUMN_RW = "rw";
//
//    public MyDatabaseHelper(@Nullable Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//        this.context = context;
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        String query =
//                "CREATE TABLE " + TABLE_NAME +
//                        " (" + COLUMN_ID  + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                        COLUMN_NAME + " TEXT," +
//                        COLUMN_RT + " INTEGER, " +
//                        COLUMN_RW + " INTEGER);";
//        db.execSQL(query);
//
//
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase  db, int i, int i1) {
//
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//        onCreate(db);
//
//    }
//    void addName(String nama, int rt, int rw) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues cv = new ContentValues();
//
//        cv.put(COLUMN_NAME, nama);
//        cv.put(COLUMN_RT, nama);
//        cv.put(COLUMN_RW, nama);
//        long result  = db.insert(TABLE_NAME, null , cv);
//        if (result == -1){
//            Toast.makeText(context, "Gagal Menambahkan", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(context, "Sukses Menambahkan", Toast.LENGTH_SHORT).show();
//        }
//    }
//}
