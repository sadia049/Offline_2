package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Second_Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView image2,image3, image4,image5,image6,image7,image8,image9,image10;
    Button viewDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        image2=(ImageView)findViewById(R.id.image2);
        image3=(ImageView)findViewById(R.id.image3);
        image4=(ImageView)findViewById(R.id.image4);
        image5=(ImageView)findViewById(R.id.image5);
        image6=(ImageView)findViewById(R.id.image6);
        image7=(ImageView)findViewById(R.id.image7);
        image8=(ImageView)findViewById(R.id.image8);
        image9=(ImageView)findViewById(R.id.image9);
        image10=(ImageView)findViewById(R.id.image10);
        viewDetails=findViewById(R.id.viewDetails);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);
        image9.setOnClickListener(this);
        image10.setOnClickListener(this);
        viewDetails.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.image10)
        {
           image10.setVisibility(View.GONE);
           image2.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.image2)
        {
            image2.setVisibility(View.GONE);
            image3.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.image3)
        {
            image3.setVisibility(View.GONE);
            image2.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.image2)
        {
            image2.setVisibility(View.GONE);
            image10.setVisibility(View.VISIBLE);
        }


        if(v.getId()==R.id.image4)
        {
            image4.setVisibility(View.GONE);
            image5.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.image5)
        {
            image5.setVisibility(View.GONE);
            image4.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.image6)
        {
            image6.setVisibility(View.GONE);
            image7.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.image7)
        {
            image7.setVisibility(View.GONE);
            image6.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.image8)
        {
            image8.setVisibility(View.GONE);
            image9.setVisibility(View.VISIBLE);
        }
        if(v.getId()==R.id.image9)
        {
            image9.setVisibility(View.GONE);
            image8.setVisibility(View.VISIBLE);

        }
        if(v.getId()==R.id.viewDetails)
        {
            Intent second =new Intent(Second_Activity.this,Third_Activity.class);
            startActivity(second);
        }
    }
}
