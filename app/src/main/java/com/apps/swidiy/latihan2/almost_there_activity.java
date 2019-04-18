package com.apps.swidiy.latihan2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class almost_there_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }
    public void verify(View view) {
        startActivity(new Intent(this,verify_activity.class));
    }
}
