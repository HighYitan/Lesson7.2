package com.example.yitan.lesson7;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void boton_color(View view) {
        Button button=(Button) view;
        ((Button) view).setText("Clicked");
        ((Button) view).setTextColor(Color.RED);
    }
    ImageButton Demo_button = (ImageButton)findViewById(R.btn_star_big_off);

// when you click this demo button
Demo_button.setOnClickListener(new OnClickListener() {
        public void onClick(View v) {
            Demo_button.setImageResource(R.drawable.secondimage);
        }
    }
}
