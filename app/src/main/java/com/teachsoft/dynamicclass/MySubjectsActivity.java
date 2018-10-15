package com.teachsoft.dynamicclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MySubjectsActivity extends BaseActivity {
    private Button mButtonCurrentSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_subjects);

        mButtonCurrentSubject = findViewById(R.id.buttonCurrentSubject);

        mButtonCurrentSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MySubjectsActivity.this, CurrentSubjectActivity.class);
                startActivity(intent);
            }
        });
    }
}
