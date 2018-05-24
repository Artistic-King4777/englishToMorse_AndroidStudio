package com.example.jojo.englishtomorsetranslator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = findViewById(R.id.inputMain);
        final TextView output = findViewById(R.id.outputMain);
        final Button morsePush = findViewById(R.id.morseButton);
        final Button englishPush = findViewById(R.id.englishButton);


        // english to morse button
        morsePush.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v){
                String englishInput = input.getText().toString();

                output.setText(MorseCodeChart.stringToMorse(englishInput));
            }
        });

        // morse to English button
        englishPush.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v){
                String morseInput = input.getText().toString();

                output.setText(MorseCodeChart.stringToEnglish(morseInput));
            }
        });

    } // end of onCreate()




} // end of class
