package com.example.diana.testrhythmer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loginAdvanced extends AppCompatActivity {
    private TextView textView;
    private static final String SHARED_PREF_NAME = "username";
    private static final String KEY_NAME = "key_username";


    public void onExpert(View view) {
        //display a message that clarifies you can not start Expert level without doing Advanced and Beginner first
        textView = findViewById(R.id.startA);
        textView.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_advanced);

        textView=findViewById(R.id.textViewGoodJob);
        displayName();

    }

    public void howToLA(View view) {
        // Do something in response to button; goes to the first of the how to play screens
        Intent intent = new Intent(this, metronomeLA.class);
        startActivity(intent);
    }

    public void backtoBeginner(View view) {
        // Do something in response to button; goes back to beginner activity
        Intent intent = new Intent(this, beginnerActivity.class);
        startActivity(intent);
        textView = findViewById(R.id.startA);
        textView.setVisibility(View.INVISIBLE);
    }

    public void toAdvanced(View view) {
        // Do something in response to button; goes to advanced activity
        Intent intent = new Intent(this, AdvancedActivity.class);
        startActivity(intent);
        textView = findViewById(R.id.startA);
        textView.setVisibility(View.INVISIBLE);
    }

    private void displayName() { //this method displays the name previously saved in the MainActivity with the method "SaveName()";
        SharedPreferences sp = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        String name = sp.getString(KEY_NAME, null);
        if (name != null) {
            textView.setText(String.format("%s %s \nKeep on going with the next level!", getString(R.string.goodJob), name));
        }

    }

}



