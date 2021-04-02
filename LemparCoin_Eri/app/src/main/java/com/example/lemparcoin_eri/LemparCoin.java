package com.example.lemparcoin_eri;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import  android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class LemparCoin extends Activity implements View.onClickListener {
    private Button buttonLempar;
    private Button buttonUlang;
    private Button buttonKeluar;
    private Random acak;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        acak = new Random();
        setContentView(R.layout.activity_lemparcoin);
        buttonLempar=(Button)findViewById(R.id.buttonlempar);
        buttonUlang=(Button)findViewById(R.id.buttonulang);
        buttonKeluar=(Button)findViewById(R.id.buttonkeluar);
        buttonLempar.setOnClickListener(this);
        buttonUlang.setOnClickListener(this);
        buttonKeluar.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        if (view==buttonLempar){

            Log.d("CLICK EVENT", "Lempar button diClick!");
            TextView tw=(TextView)findViewById(R.id.textView1);
            ImageView iw=(ImageView)findViewById(R.id.imageView1);

            if (acak.nextDouble() 0.5) {
                tw.setText("kepala");
                iw.setImageResource(R.drawable.head);
            } else {
                tw.setText("Cross");
                iw.setImageResource(R.drawable.tail);
            }

            buttonLempar.setVisibility(View.INVISIBLE);
            buttonUlang.setVisibility(View.VISIBLE);
            buttonKeluar.setVisibility(View.VISIBLE);

        } else if (view==buttonUlang){
            TextView tw=(TextView)findViewById(R.id.textView1);
            ImageView iw=(ImageView)findViewById(R.id.imageView1);

            buttonLempar.setVisibility(view.VISIBLE);
            buttonUlang.setVisibility(view.INVISIBLE);
            buttonKeluar.setVisibility(view.INVISIBLE);

        }else if(view==buttonKeluar){
            this.finish();
        }
    }
}












