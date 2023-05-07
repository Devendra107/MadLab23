package com.example.earth_india;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isEarth=true;
    public void change(View view){
        ImageView imageView=findViewById(R.id.earth);
        ImageView imageView1=findViewById(R.id.india);
        imageView1.animate().alpha(0).setDuration(200);
        if(isEarth){
            imageView1.animate().alpha(1).setDuration(1000);
            imageView.animate().alpha(0).setDuration(900);
            isEarth =false;
        }
        else{
            imageView1.animate().alpha(0).setDuration(1000);
            imageView.animate().alpha(1).setDuration(900);
            isEarth =true;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}