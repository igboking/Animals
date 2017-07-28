package com.example.aliyu.animals;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {
    TextView tvRemark,tvScore;
    int score = 0;
    Button btnMain, btnPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvScore = (TextView) findViewById(R.id.txtScore);
        tvRemark = (TextView) findViewById(R.id.txtRemark);

        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("score");

        if(score == 5){
            tvRemark.setText("Excellent Job \nYou know the Animal very well!!!");
        }else if(score == 4){
            tvRemark.setText("Good Job \nYou know the Animal well!!!");
        }else if(score == 3){
            tvRemark.setText("Well done \nYou can do better!!!");
        }else if(score == 2){
            tvRemark.setText("Less than average \nYou need to learn more!!!");
        }else if(score == 1){
            tvRemark.setText("Opps!!! \nYou have a lot to learn.");
        }else{
            tvRemark.setText("Oooh No \nYou need to study all over again!!!");
        }

        tvScore.setText("Score: "+score+"/5");

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnMain = (Button) findViewById(R.id.btnMain);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinishActivity.this, AnimalOne.class);
                startActivity(intent);
            }
        });

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinishActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
