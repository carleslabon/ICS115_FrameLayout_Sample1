package com.example.siremil.framelayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image1,image2;
    Button btnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView)findViewById(R.id.ivImage1);
        image2 = (ImageView)findViewById(R.id.ivImage2);
        btnChange = (Button)findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(image1.getVisibility()==View.VISIBLE){
                    image2.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.GONE);
                }
                else{
                    image2.setVisibility(View.GONE);
                    image1.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
