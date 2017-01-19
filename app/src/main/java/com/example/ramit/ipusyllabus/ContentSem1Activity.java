package com.example.ramit.ipusyllabus;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContentSem1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_sem1);

        TextView tx = (TextView)findViewById(R.id.instructionssem1_1);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/ArimaKoshi-Bold.otf");
        tx.setTypeface(custom_font);

        TextView tx1 = (TextView)findViewById(R.id.instructionssem1_2);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(),  "fonts/ArimaKoshi-Bold.otf");
        tx1.setTypeface(custom_font1);
    }
}
