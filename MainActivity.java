package com.example.uitutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private CheckBox checkBoxblack , checkBoxforlife, checkBoxVikings;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxblack = findViewById(R.id.checkboxblcklist);
        checkBoxforlife = findViewById(R.id.checkboxforlife);
        checkBoxVikings = findViewById(R.id.checkboxVikings);

        if (checkBoxblack.isChecked()){
            Toast.makeText(MainActivity.this, "You have Watched The Blacklist", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "You need to the Blacklist all the 8 seasons", Toast.LENGTH_SHORT).show();
        }

        checkBoxblack.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "You have watched The Blacklist", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "You need to watch The Blacklist", Toast.LENGTH_SHORT).show();
                }
            }
        });



        if(checkBoxforlife.isChecked()){
            Toast.makeText(MainActivity.this, "You have watched For Life", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "You need to watch For Life it's amazing", Toast.LENGTH_SHORT).show();
        }
        checkBoxforlife.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "You have watched For Life", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "You need to watch For Life it's amazing", Toast.LENGTH_SHORT).show();
                }
            }
        });


        if(checkBoxVikings.isChecked()){
            Toast.makeText(MainActivity.this, "You have watched Vikings", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "You need to watch Vikings it's amazing", Toast.LENGTH_SHORT).show();
        }

        checkBoxVikings.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "You have watched Vikings", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "You need to watch Vikings it's amazing", Toast.LENGTH_SHORT).show();
                }
            }
        });
















}}


