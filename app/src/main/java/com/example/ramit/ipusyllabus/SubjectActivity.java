package com.example.ramit.ipusyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class SubjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_subject_activity);
    }
    /** Called when the user clicks the Send button */
    public void callSelectBranchBtech(View view) {
        // Do something in response to button
       Intent intent = new Intent(this, BranchBtechActivity.class);
        startActivity(intent);
    }
}
