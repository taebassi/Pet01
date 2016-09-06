package com.example.taeba.pet01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_regis);
        //String fullname = findViewById(R.id.editTextUsername).toString();
        //String username = findViewById(R.id.editTextUsername).toString();
        //String email = findViewById(R.id.editTextEmail).toString();
        //String password = findViewById(R.id.editTextPassword).toString();
        Button btRegister = (Button)findViewById(R.id.btRegister);
        /*btRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(RegisActivity.this,RegisterResaultActivity.class);
                    startActivity(intent);
            }
        });*/
    }
}
