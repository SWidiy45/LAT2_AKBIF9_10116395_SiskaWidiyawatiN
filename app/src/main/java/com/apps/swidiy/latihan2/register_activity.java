package com.apps.swidiy.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class register_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void register2(View view) {
        startActivity(new Intent(this,almost_there_activity.class));
    }
    public void login(View view) {
        startActivity(new Intent(this, login_activity.class));
    }
}
