package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Third_Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView backbutton;
    TextView order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);
        backbutton = (ImageView) findViewById(R.id.backbutton);
        order = (TextView) findViewById(R.id.order);
        backbutton.setOnClickListener(this);
        order.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.order) {
            Intent placeOrder = new Intent(Third_Activity.this, Four_Activity.class);
           startActivity(placeOrder);
        }
        if(v.getId()==R.id.backbutton)
        {
            Intent back=new Intent(Third_Activity.this,Second_Activity.class);
            startActivity(back);
        }
    }
}
