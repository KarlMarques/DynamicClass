package com.teachsoft.dynamicclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class HomeActivity extends BaseActivity {
    private Button mButtonMySubjects;
    private Button mButtonAddSubject;
    private Button mButtonMyProfile;
    private Button mButtonStudentPerformance;

    private MySubjectsRecyclerViewAdapter mMySubjectsRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mButtonMySubjects = findViewById(R.id.buttonMySubjects);
        mButtonAddSubject = findViewById(R.id.buttonAddSubject);
        mButtonMyProfile = findViewById(R.id.buttonMyProfile);
        mButtonStudentPerformance = findViewById(R.id.buttonStudentPerformance);

        mButtonMySubjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MySubjectsActivity.class);
                startActivity(intent);
            }
        });

        mButtonAddSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AddSubjectActivity.class);
                startActivity(intent);
            }
        });

        mButtonMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MyProfileActivity.class);
                startActivity(intent);
            }
        });

        mButtonStudentPerformance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, StudentPerformanceActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerMySubjects);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.addOnItemTouchListener(new MySubjectsRecyclerItemClickListener(this, recyclerView, this));

        mMySubjectsRecyclerViewAdapter = new MySubjectsRecyclerViewAdapter(this, new ArrayList<MySubjectsRecyclerCell>());
        recyclerView.setAdapter(mMySubjectsRecyclerViewAdapter);

    }
}
