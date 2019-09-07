package com.fairureza.myviewandviews;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.button4);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveActivity1 = findViewById(R.id.button2);
        btnMoveActivity1.setOnClickListener(this);

        Button btnMoveActivity3 = findViewById(R.id.button1);
        btnMoveActivity3.setOnClickListener(this);

        Button btnMoveActivity4 = findViewById(R.id.button3);
        btnMoveActivity4.setOnClickListener(this);
        Button btnMoveActivity5 = findViewById(R.id.button5);
        btnMoveActivity5.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button4:
                Intent moveIntent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(moveIntent);
                break;

            case R.id.button1:
                Intent moveIntent1 = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(moveIntent1);
                break;

            case R.id.button2:
                Intent moveIntent2 = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(moveIntent2);
                break;

            case R.id.button3:
                Intent moveIntent3 = new Intent(MainActivity.this,Main5Activity.class);
                startActivity(moveIntent3);
                break;

            case R.id.button5:
                Intent dialPhoneIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://prtfairureza.hopecoding.com/public/"));
                startActivity(dialPhoneIntent2);
                break;




        }



    }

    }

