package com.example.formysoul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Middle extends AppCompatActivity {
    private Button Love, Dates, Photo, Need;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle);
        Love=(Button)findViewById(R.id.button);
        Love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".Love");
                startActivity(intent);


            }
        });
    }
}
