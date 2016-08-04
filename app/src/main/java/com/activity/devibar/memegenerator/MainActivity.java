package com.activity.devibar.memegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mTop;
    private EditText mBottom;
    private Button mGenerate;
    String top;
    String bottom;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        work();





    }



        public void work(){


            mTop = (EditText) findViewById(R.id.etTop);
            mBottom = (EditText) findViewById(R.id.etBottom);
            mGenerate = (Button) findViewById(R.id.btnGenerate);




            mGenerate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    top = mTop.getText().toString();
                    bottom = mBottom.getText().toString();

                    if(!(top.equals("")) && !(bottom.equals(""))){
                        Intent intentTop = new Intent(MainActivity.this, MemeScreen.class);
                        intentTop.putExtra("top", top);
                        intentTop.putExtra("bottom", bottom);
                        startActivity(intentTop);
                    }
                    else {
                        mTop.setText("");
                        mBottom.setText("");

                    }


                }
            });

        }

}
