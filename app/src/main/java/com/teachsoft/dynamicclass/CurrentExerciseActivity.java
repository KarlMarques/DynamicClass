package com.teachsoft.dynamicclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CurrentExerciseActivity extends BaseActivity {
    private Button mButtonInbetweenExercises;
    private Button mButtonReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_exercise);

        mButtonInbetweenExercises = findViewById(R.id.buttonInbetweenExercises);
        mButtonReturn = findViewById(R.id.buttonReturn);

        mButtonInbetweenExercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrentExerciseActivity.this, InbetweenExercisesActivity.class);
                startActivity(intent);
            }
        });
    }
}
