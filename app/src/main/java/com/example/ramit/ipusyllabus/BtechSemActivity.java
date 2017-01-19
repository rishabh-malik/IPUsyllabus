package com.example.ramit.ipusyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BtechSemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_sem_btech_activity);

        Button sem1 = (Button) findViewById(R.id.sem1);
        Intent mintent = getIntent();
        int categoryNumber = mintent.getIntExtra("categoryNumberint", 0);

        // Set a click listener on that View
        sem1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the cse View is clicked on.
            @Override
            public void onClick(View view) {
                Intent sem1Intent = new Intent(BtechSemActivity.this, ContentSem1Activity.class);
                startActivity(sem1Intent);
            }
        });
    }
}
