package com.example.ramit.ipusyllabus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_activity);
    }

    public void callSubject(View view) {
        Intent intent = new Intent(this, SubjectActivity.class);
        startActivity(intent);
    }
}
