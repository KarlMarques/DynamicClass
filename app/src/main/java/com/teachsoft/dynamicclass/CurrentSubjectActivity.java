package com.teachsoft.dynamicclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class CurrentSubjectActivity extends BaseActivity {
    private Button mButtonCurrentChapter;
    private Button mButtonSubjectPerformance;
    private TextView mTextViewCurrentSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_subject);

        Intent intent = getIntent();
        Subject subject = (Subject) intent.getSerializableExtra(MY_SUBJECTS_TRANSFER);

        mButtonCurrentChapter = findViewById(R.id.buttonCurrentChapter);
        mButtonSubjectPerformance = findViewById(R.id.buttonSubjectPerformance);
        mTextViewCurrentSubject = findViewById(R.id.textViewCurrentSubject);

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

        mTextViewCurrentSubject.setText(subject.getTitle());
    }


}
