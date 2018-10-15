package com.teachsoft.dynamicclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CurrentChapterActivity extends BaseActivity {
    private Button mButtonCurrentExercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_chapter);

        mButtonCurrentExercise = findViewById(R.id.buttonCurrentExercise);

        mButtonCurrentExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentChapterActivity.this, CurrentExerciseActivity.class);
                startActivity(intent);
            }
        });
    }
}
