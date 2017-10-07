package com.re_coded.example.android.mybeats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Payments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments);

        Button returnButton = (Button) findViewById(R.id.return_home_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tracksActivity = new Intent(Payments.this, MainActivity.class);
                startActivity(tracksActivity);
            }
        });
    }
}

