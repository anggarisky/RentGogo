package com.example.anggarisky.rentgogo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSplash;
    Button btnSplash;
    ImageView imageView2;
    Animation fromtopbottom, smtobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fromtopbottom = AnimationUtils.loadAnimation(this, R.anim.fromtopbottom);
        smtobig = AnimationUtils.loadAnimation(this, R.anim.smtobig);

        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");


        tvSplash = (TextView) findViewById(R.id.tvSplash);
        btnSplash = (Button) findViewById(R.id.btnSplash);
        imageView2 = (ImageView) findViewById(R.id.imageView2);


        tvSplash.setTypeface(MRegular);
        btnSplash.setTypeface(MMedium);

        tvSplash.startAnimation(fromtopbottom);
        btnSplash.startAnimation(fromtopbottom);

        imageView2.startAnimation(smtobig);

        btnSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,HomeAct.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });




    }
}
