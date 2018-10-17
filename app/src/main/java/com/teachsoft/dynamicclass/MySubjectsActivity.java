package com.teachsoft.dynamicclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MySubjectsActivity extends BaseActivity implements MySubjectsRecyclerItemClickListener.OnRecyclerClickListener {
    private static final String TAG = "MySubjectsActivity";
    private Button mButtonCurrentSubject;
    private MySubjectsRecyclerViewAdapter mMySubjectsRecyclerViewAdapter;

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

        RecyclerView recyclerView = findViewById(R.id.recyclerMySubjects);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.addOnItemTouchListener(new MySubjectsRecyclerItemClickListener(MySubjectsActivity.this, recyclerView, MySubjectsActivity.this));

        mMySubjectsRecyclerViewAdapter = new MySubjectsRecyclerViewAdapter(MySubjectsActivity.this, new ArrayList<MySubjectsRecyclerCell>());
        recyclerView.setAdapter(mMySubjectsRecyclerViewAdapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Log.d(TAG, "onItemClick: starts");
        Toast.makeText(MySubjectsActivity.this, "Normal tap at position " + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemLongClick(View view, int position) {
        Log.d(TAG, "onItemLongClick: starts");
//        Toast.makeText(MainActivity.this, "Long tap at position " + position, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MySubjectsActivity.this, MySubjectsActivity.class);
//        intent.putExtra(MY_SUBJECTS_TRANSFER, MySubjectsRecyclerViewAdapter.getPhoto(position));
        startActivity(intent);
    }


}
