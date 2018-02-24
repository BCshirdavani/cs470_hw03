package com.example.shymacbook.madlib;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class inputActivity extends AppCompatActivity {
    private Button goToLib;
    private String[] myInputs;
    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;
    private EditText input5;
    private EditText input6;
    private EditText input7;
    private EditText input8;
    private EditText input9;
    private EditText input10;
    private EditText input11;
    private EditText input12;
    private EditText input13;
    private String concatLIB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        input1 = (EditText) findViewById(R.id.in_1);
        input2 = (EditText) findViewById(R.id.in_2);
        input3 = (EditText) findViewById(R.id.in_3);
        input4 = (EditText) findViewById(R.id.in_4);
        input5 = (EditText) findViewById(R.id.in_5);
        input6 = (EditText) findViewById(R.id.in_6);
        input7 = (EditText) findViewById(R.id.in_7);
        input8 = (EditText) findViewById(R.id.in_8);
        input9 = (EditText) findViewById(R.id.in_9);
        input10 = (EditText) findViewById(R.id.in_10);
        input11 = (EditText) findViewById(R.id.in_11);
        input12 = (EditText) findViewById(R.id.in_12);
        input13 = (EditText) findViewById(R.id.in_13);

        goToLib = (Button) findViewById(R.id.to_lib);
        goToLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = inputActivity.this;
                Intent goToStory = new Intent(context, storyActivity.class);
                myInputs = new String[]{
                        (String) input1.getText().toString(),
                        (String) input2.getText().toString(),
                        (String) input3.getText().toString(),
                        (String) input4.getText().toString(),
                        (String) input5.getText().toString(),
                        (String) input6.getText().toString(),
                        (String) input7.getText().toString(),
                        (String) input8.getText().toString(),
                        (String) input9.getText().toString(),
                        (String) input10.getText().toString(),
                        (String) input11.getText().toString(),
                        (String) input12.getText().toString(),
                        (String) input13.getText().toString(),
                };
                
                concatLIB = "One of the most" + myInputs[0] +
                "characters in fiction is named Tarzan of the "+ myInputs[1] +
                " Tarzan was raised by a/an" + myInputs[2] +
                " and lives in the " + myInputs[3] +
                " jungle in the heart of darkest " + myInputs[4] +
                " . He spends most of his time eating " + myInputs[5] +
                " and swinging from tree to " + myInputs[6] +
                " Whenever he gets angry, he beats on his chest and says " + myInputs[7] +
                " !\" This is his war cry. Tarzan always dresses in " + myInputs[8] +
                " shorts made from the skin of a/an " + myInputs[9] +
                "and his best friend is a/an " + myInputs[10] +
                " chimpanzee named Cheetah. He is supposed to be able to speak to elephants and" + myInputs[11] +
                " . In the movies, Tarzan is played by " + myInputs[12];

                goToStory.putExtra(Intent.EXTRA_TEXT,concatLIB);
//                goToStory.putExtra("string",myInputs);
                startActivity(goToStory);
            }
        });
    }
}
