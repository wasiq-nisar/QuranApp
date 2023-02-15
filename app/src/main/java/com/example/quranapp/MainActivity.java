package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHandler databaseHelper = new DBHandler(this);
        databaseHelper.createDataBase();
        databaseHelper.openDataBase();
        Cursor cursor = databaseHelper.query("SELECT * FROM QuranMetaData");
        //helloText =  findViewById(R.id.helloText);
        if(cursor.moveToFirst())
        {
            helloText.setText(cursor.getString(1));
        }
    }

}
