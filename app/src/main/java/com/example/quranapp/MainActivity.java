package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView parah,surrah;
    String browseCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parah = findViewById(R.id.parrah);
        surrah = findViewById(R.id.surrah);

        parah.setOnClickListener(this);
        surrah.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.parrah:
                browseCategory = "p";
                loadIndex();
                break;
            case R.id.surrah:
                browseCategory = "s";
                loadIndex();
                break;
        }
    }

    private void loadIndex() {
        //Starting a new Activity
        Intent intent = new Intent(getApplicationContext(), IndexActivity.class);
        //IndexActivity.class, why .class file because JAVA code when compiled is converted into a byte code
        //getApplicationContext() -> Gets the context of the current application running
        if(browseCategory.equals("p"))
        {
            intent.putExtra("category","p");
        }
        else
        {
            intent.putExtra("category","s");
        }
        startActivity(intent);
    }

}