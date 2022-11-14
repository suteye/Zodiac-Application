package com.suncode.horoscope;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView zodiac_text_result;
    String zodiac;
    ImageView zodiac_sign;
    Button zodiac_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        zodiac = intent.getStringExtra("Zodiac");
        zodiac_text_result = findViewById(R.id.zodiac);
        zodiac_sign = findViewById(R.id.logo);
        zodiac_btn = (Button)findViewById(R.id.button);

        if(zodiac.equals("Capricorn")){
            zodiac_sign.setImageResource(R.drawable.capricorn);
            zodiac_text_result.setText(zodiac);
        } else if (zodiac.equals("Aquarius")){
            zodiac_sign.setImageResource(R.drawable.aquarius);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Pisces")){
            zodiac_sign.setImageResource(R.drawable.pisces);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Aries")){
            zodiac_sign.setImageResource(R.drawable.aries);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Taurus")){
            zodiac_sign.setImageResource(R.drawable.taurus);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Gemini")){
            zodiac_sign.setImageResource(R.drawable.gemini);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Cancer")){
            zodiac_sign.setImageResource(R.drawable.cancer);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Leo")){
            zodiac_sign.setImageResource(R.drawable.leo);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Virgo")){
            zodiac_sign.setImageResource(R.drawable.virgo);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Scorpio")){
            zodiac_sign.setImageResource(R.drawable.scorpio);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Libra")){
            zodiac_sign.setImageResource(R.drawable.libra);
            zodiac_text_result.setText(zodiac);
        }else if (zodiac.equals("Sagittarius")){
            zodiac_sign.setImageResource(R.drawable.sagittarius);
            zodiac_text_result.setText(zodiac);
        }

        zodiac_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ResultActivity.this, DetailActivity.class);
                intent.putExtra("HOROSCOPE_NAME", zodiac);
                startActivity(intent);
            }
        });
    }
    
}