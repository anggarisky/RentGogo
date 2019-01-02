package com.example.anggarisky.rentgogo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeAct extends AppCompatActivity {

    TextView tvSweet, tvSweetSub, tvCate, tvRare, tvItemOne, tvItemPriceOne,
            tvItemTwo, tvItemPriceTwo, tvItemThree, tvItemPriceThree;
    Animation fromtopbottom, fromtopbottomtwo, fromtopbottomthree;
    LinearLayout itemOne, itemTwo, itemThree;
    HorizontalScrollView categoryItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fromtopbottom = AnimationUtils.loadAnimation(this, R.anim.fromtopbottom);
        fromtopbottomtwo = AnimationUtils.loadAnimation(this, R.anim.fromtopbottomtwo);
        fromtopbottomthree = AnimationUtils.loadAnimation(this, R.anim.fromtopbottomthree);


        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");

        itemOne = (LinearLayout) findViewById(R.id.itemOne);
        itemTwo = (LinearLayout) findViewById(R.id.itemTwo);
        itemThree = (LinearLayout) findViewById(R.id.itemThree);

        categoryItem = (HorizontalScrollView) findViewById(R.id.categoryItem);


        tvSweet = (TextView) findViewById(R.id.tvSweet);
        tvSweetSub = (TextView) findViewById(R.id.tvSweetSub);
        tvCate = (TextView) findViewById(R.id.tvCate);

        tvRare = (TextView) findViewById(R.id.tvRare);
        tvItemOne = (TextView) findViewById(R.id.tvItemOne);
        tvItemPriceOne = (TextView) findViewById(R.id.tvItemPriceOne);

        tvItemTwo = (TextView) findViewById(R.id.tvItemTwo);
        tvItemPriceTwo = (TextView) findViewById(R.id.tvItemPriceTwo);

        tvItemThree = (TextView) findViewById(R.id.tvItemThree);
        tvItemPriceThree = (TextView) findViewById(R.id.tvItemPriceThree);

        tvSweet.setTypeface(MMedium);
        tvSweetSub.setTypeface(MLight);
        tvCate.setTypeface(MMedium);

        tvRare.setTypeface(MMedium);
        tvItemOne.setTypeface(MRegular);
        tvItemPriceOne.setTypeface(MLight);

        tvItemTwo.setTypeface(MRegular);
        tvItemPriceTwo.setTypeface(MLight);

        tvItemThree.setTypeface(MRegular);
        tvItemPriceThree.setTypeface(MLight);


        tvSweet.startAnimation(fromtopbottom);
        tvSweetSub.startAnimation(fromtopbottom);

        tvCate.startAnimation(fromtopbottom);
        tvRare.startAnimation(fromtopbottom);

        categoryItem.startAnimation(fromtopbottom);

        itemOne.startAnimation(fromtopbottom);
        itemTwo.startAnimation(fromtopbottomtwo);
        itemThree.startAnimation(fromtopbottomthree);


    }
}
