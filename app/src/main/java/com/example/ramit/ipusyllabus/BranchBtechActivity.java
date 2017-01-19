package com.example.ramit.ipusyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BranchBtechActivity extends AppCompatActivity {
 int categoryNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_branch_btech_activity);


        Button csesem = (Button) findViewById(R.id.cse);

// Set a click listener on that View
        csesem.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the cse View is clicked on.
            @Override
            public void onClick(View view) {
                categoryNumber = 1;
                Intent cseIntent = new Intent(BranchBtechActivity.this, BtechSemActivity.class);
                cseIntent.putExtra("categoryNumberint", categoryNumber);
                startActivity(cseIntent);
            }
        });

        Button ecesem = (Button) findViewById(R.id.ece);

// Set a click listener on that View
        ecesem.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the ece View is clicked on.
            @Override
            public void onClick(View view) {
                categoryNumber = 2;
                Intent eceIntent = new Intent(BranchBtechActivity.this, BtechSemActivity.class);
                eceIntent.putExtra("categoryNumberint", categoryNumber);
                startActivity(eceIntent);
            }
        });

        Button itsem = (Button) findViewById(R.id.it);

// Set a click listener on that View
        itsem.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the it View is clicked on.
            @Override
            public void onClick(View view) {
                categoryNumber = 3;
                Intent itIntent = new Intent(BranchBtechActivity.this, BtechSemActivity.class);
                itIntent.putExtra("categoryNumberint", categoryNumber);
                startActivity(itIntent);
            }
        });

        Button elecsem = (Button) findViewById(R.id.eleceeng);

// Set a click listener on that View
        elecsem.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the eleceeng View is clicked on.
            @Override
            public void onClick(View view) {
                categoryNumber = 4;
                Intent elecIntent = new Intent(BranchBtechActivity.this, BtechSemActivity.class);
                elecIntent.putExtra("categoryNumberint", categoryNumber);
                startActivity(elecIntent);
            }
        });
    }
}
