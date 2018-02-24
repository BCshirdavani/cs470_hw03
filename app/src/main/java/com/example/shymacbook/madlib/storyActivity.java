package com.example.shymacbook.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class storyActivity extends AppCompatActivity {

    private TextView mLibText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mLibText = findViewById(R.id.lib_display);

        // GET the INTENT from input
        Intent fromINPUT = getIntent();
        if(fromINPUT.hasExtra(Intent.EXTRA_TEXT)){
            String textEntered = fromINPUT.getStringExtra(Intent.EXTRA_TEXT);
            mLibText.setText(textEntered);
        }
    }
}
