package com.teachsoft.dynamicclass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends BaseActivity {
    private Button mButtonSignIn;
    private Button mButtonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mButtonSignIn = findViewById(R.id.buttonSignIn);
        mButtonSignUp = findViewById(R.id.buttonSignUp);

        mButtonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, MySubjectsActivity.class);
                startActivity(intent);
            }
        });

        mButtonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (SignInActivity.this, MySubjectsActivity.class);
                startActivity(intent);
            }
        });

    }
}
