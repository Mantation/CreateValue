package com.example.bombo.createvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    RelativeLayout SinIng;
    RelativeLayout Reg;
    TextView SwitchToSignIn;
    TextView SwitchToRegister;
    View myview;
    private int MinHeight = 65;
    private int MaxHeight = 120;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SinIng =  findViewById(R.id.sign);
        Reg = findViewById(R.id.reg);
        SwitchToRegister =  findViewById(R.id.tabregister);
        SwitchToSignIn = findViewById(R.id.tabsignin);
        //SwitchToRegister.setVisibility(View.VISIBLE);
        rehideView(Reg);
        SwitchToRegister.setOnClickListener(this);
        SwitchToSignIn.setOnClickListener(this);



    }


    private void hideView(final View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide_out_right);
        //use this to make it longer:  animation.setDuration(1000);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(View.GONE);
            }
        });

        view.startAnimation(animation);
    }

    private void showView(final View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide_in_left);
        //use this to make it longer:  animation.setDuration(1000);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                //view.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(View.VISIBLE);
            }
        });

        view.startAnimation(animation);
    }


    private void rehideView(final View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide_out_left);
        //use this to make it longer:  animation.setDuration(1000);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(View.GONE);
            }
        });

        view.startAnimation(animation);
    }

    private void reshowView(final View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide_in_right);
        //use this to make it longer:  animation.setDuration(1000);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                //view.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(View.VISIBLE);
            }
        });

        view.startAnimation(animation);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.tabregister){
            rehideView(SinIng);
            showView(Reg);
            //reshowView(Reg);
            //showView(Reg);
            //showView(SinIng);
            //hideView(SinIng);
        }else if (id == R.id.tabsignin){
            reshowView(SinIng);
            hideView(Reg);

        }
    }
}
