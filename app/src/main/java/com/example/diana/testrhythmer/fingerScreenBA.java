package com.example.diana.testrhythmer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fingerScreenBA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finger_screen2_b);
    }

    public void backToGameBA(View view) {
        // Do something in response to button;from the help screen goes back to beginner activity
        Intent intent = new Intent(this, beginnerActivity.class);
        startActivity(intent);
    }


}
