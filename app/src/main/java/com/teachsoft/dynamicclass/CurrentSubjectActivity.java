package com.teachsoft.dynamicclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CurrentSubjectActivity extends BaseActivity {
    private Button mButtonCurrentChapter;
    private Button mButtonSubjectPerformance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_subject);

        mButtonCurrentChapter = findViewById(R.id.buttonCurrentChapter);
        mButtonSubjectPerformance = findViewById(R.id.buttonSubjectPerformance);

        mButtonCurrentChapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentSubjectActivity.this, CurrentChapterActivity.class);
                startActivity(intent);
            }
        });

        mButtonSubjectPerformance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentSubjectActivity.this, SubjectPerformanceActivity.class);
                startActivity(intent);
            }
        });
    }
}
