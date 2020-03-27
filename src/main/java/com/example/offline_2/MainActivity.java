package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image1, image2;
    Button button;
    String name, email;
    EditText edit1, edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);

        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        name = edit1.getText().toString();
        email = edit2.getText().toString();

        if (name.isEmpty() || email.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please fill up the information", Toast.LENGTH_SHORT).show();
            Log.i("Main","Toast");
        }
        else {
            Intent intent = new Intent(MainActivity.this, Second_Activity.class);
            startActivity(intent);
        }
    }
}
