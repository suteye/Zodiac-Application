package com.suncode.horoscope;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    Button DateButt;
    Button zodiac;
    TextView Date;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        DateButt = findViewById(R.id.date);
        Date = findViewById(R.id.enterYourDate);

        DateButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, MainActivity.this,year,month,day );
                datePickerDialog.show();
            }
        });

        zodiac = (Button)findViewById(R.id.date2);
        zodiac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        
    }

    public void  onDateSet(DatePicker view, int year, int month, int dayOfMonth){
        String my_zodiac = getZodiac(dayOfMonth,month);
        intent = new Intent(MainActivity.this,ResultActivity.class);

        intent.putExtra("Zodiac",my_zodiac);
        startActivity(intent);
    }

    private String getZodiac(int day,int month){
        String zodiacSign="";
        if(month==0){
            if (day<20){
                zodiacSign="Capricorn";
            }else {
                zodiacSign="Aquarius";
            }
        }else if(month==1){
            if (day<19){
                zodiacSign="Aquarius";
            }else {
                zodiacSign="Pisces";
            }
        }else if(month==2){
            if (day<21){
                zodiacSign="Pisces";
            }else {
                zodiacSign="Aries";
            }
        }else if(month==3){
            if (day<20){
                zodiacSign="Aries";
            }else {
                zodiacSign="Taurus";
            }
        }else if(month==4){
            if (day<21){
                zodiacSign="Taurus";
            }else {
                zodiacSign="Gemini";
            }
        }else if(month==5){
            if (day<22){
                zodiacSign="Gemini";
            }else {
                zodiacSign="Cancer";
            }
        }else if(month==6){
            if (day<23){
                zodiacSign="Cancer";
            }else {
                zodiacSign="Leo";
            }
        }else if(month==7){
            if (day<23){
                zodiacSign="Leo";
            }else {
                zodiacSign="Virgo";
            }
        }else if(month==8){
            if (day<23){
                zodiacSign="Virgo";
            }else {
                zodiacSign="Libra";
            }
        }else if(month==9){
            if (day<24){
                zodiacSign="Libra";
            }else {
                zodiacSign="Scorpio";
            }
        }else if(month==10){
            if (day<23){
                zodiacSign="Scorpio";
            }else {
                zodiacSign="Sagittarius";
            }
        }else if(month==11){
            if (day<22){
                zodiacSign="Sagittarius";
            }else {
                zodiacSign="Capricorn";
            }
        }
        return zodiacSign;
    }
}