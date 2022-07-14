package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        Log.i("Info","image tapped");

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView_j = (ImageView) findViewById(R.id.imageView3);
        if(imageView.getAlpha()==1){
        imageView.animate().alpha(0).setDuration(2000);}
        else{
            imageView.animate().alpha(1).setDuration(2000);
        }
        if(imageView_j.getAlpha()==0) {
            imageView_j.animate().alpha(1).setDuration(2000);
        }
        else{imageView_j.animate().alpha(0).setDuration(2000);}




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}