package com.teachsoft.dynamicclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InbetweenExercisesActivity extends BaseActivity {
    private Button mButtonNextExercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbetween_exercises);

        mButtonNextExercise = findViewById(R.id.buttonNextExercise);

        mButtonNextExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InbetweenExercisesActivity.this, CurrentChapterActivity.class);
                startActivity(intent);
            }
        });
    }
}
