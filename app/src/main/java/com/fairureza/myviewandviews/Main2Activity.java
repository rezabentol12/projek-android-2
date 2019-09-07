package com.fairureza.myviewandviews;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnDialPhone = findViewById(R.id.button5);
        btnDialPhone.setOnClickListener(this);

        Button btninstagram = findViewById(R.id.button7);
        btninstagram.setOnClickListener(this);

        Button btnfacebook= findViewById(R.id.button6);
        btnfacebook.setOnClickListener(this);
//        CardView cardView = (CardView)findViewById(R.id.reza);
//        cardView.setCardElevation(2.8f);
//        CardView cardView1 = (CardView)findViewById(R.id.reza1);
//        cardView1.setCardElevation(2.8f);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button5:
                String phoneNumber = "081299321658";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.button6:
                Intent dialPhoneIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/?_rdc=1&_rdr"));
                startActivity(dialPhoneIntent1);
                break;
            case R.id.button7:
                Intent dialPhoneIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/muhammad_reza12_/?hl=id"));
                startActivity(dialPhoneIntent2);
                break;



        }

    }
}
