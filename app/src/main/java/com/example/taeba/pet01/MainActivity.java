package com.example.taeba.pet01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvGuestLogin = (TextView)findViewById(R.id.tvGuestLogin);
        tvGuestLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GuestActivity.class);
                startActivity(intent);
            }
        });

        final TextView tvRegister = (TextView) findViewById(R.id.tvRegister);
        tvRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegisActivity.class);
                startActivity(intent);
            }
        });

        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userN = (EditText)findViewById(R.id.editText);
                EditText pass = (EditText)findViewById(R.id.simplePassword);

                 if(userN.getText().toString().matches("taeza") & pass.getText().toString().matches("1234")){
                     Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                     startActivity(intent);
                 }
                else{
                     Toast.makeText(MainActivity.this,"Username or Password Invalid", LENGTH_SHORT).show();
                 }

            }
        });

    }

}
