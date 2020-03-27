package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Four_Activity extends AppCompatActivity implements View.OnClickListener  {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_);
        button=(Button)findViewById(R.id.confirm);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(Four_Activity.this,"Your order has been placed",Toast.LENGTH_LONG).show();
    }
}
