package com.activity.devibar.memegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MemeScreen extends AppCompatActivity {

    private ImageView mImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_screen);

        TextView topDisplay = (TextView) findViewById(R.id.txtTop);
        TextView bottomDisplay = (TextView) findViewById(R.id.txtBottom);

        mImage = (ImageView) findViewById(R.id.memeView);
        Intent intent = getIntent();

        if (intent!=null){

            Random i = new Random();
            int rand = i.nextInt(4)+1;

            switch (rand){
                case 1: mImage.setImageResource(R.drawable.meme);
                    break;
                case 2: mImage.setImageResource(R.drawable.meme2);
                    break;
                case 3: mImage.setImageResource(R.drawable.meme3);
                    break;
                case 4: mImage.setImageResource(R.drawable.meme4);
                    break;}


                String messageBottom = intent.getStringExtra("bottom");
            bottomDisplay.setText(messageBottom);
            String messageTop = intent.getStringExtra("top");
            topDisplay.setText(messageTop);

        }


    }
}
