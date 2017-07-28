package com.example.aliyu.animals;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class AnimalFive extends AppCompatActivity {
    TextView tvScore;
    int score = 0;
    RadioButton rbA, rbB, rbC, rbD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_five);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rbA = (RadioButton) findViewById(R.id.rd5Camel);
        rbB = (RadioButton) findViewById(R.id.rd5Goat);
        rbC = (RadioButton) findViewById(R.id.rd5Donkey);
        rbD = (RadioButton) findViewById(R.id.rd5Sheep);

        tvScore = (TextView) findViewById(R.id.txtScore);

        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("score");

        tvScore.setText("Score: "+score+"/5");
    }

    public void onRadioButtonClicked(View view) {
        //Bundle bundle = new Bundle();
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rd5Camel:
                if (checked)
                    rbA.setTextColor(Color.RED);
                Toast.makeText(AnimalFive.this, "Wrong answer ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AnimalFive.this, FinishActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("score", score);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.rd5Goat:
                if (checked)
                    rbB.setTextColor(Color.GREEN);
                Toast.makeText(AnimalFive.this, "Correct answer ", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(AnimalFive.this, FinishActivity.class);
                Bundle bundle2 = new Bundle();
                int newScore = score + 1;
                bundle2.putInt("score", newScore);
                intent2.putExtras(bundle2);
                startActivity(intent2);
                break;
            case R.id.rd5Donkey:
                if (checked)
                    rbC.setTextColor(Color.RED);
                Toast.makeText(AnimalFive.this, "Wrong answer ", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(AnimalFive.this, FinishActivity.class);
                Bundle bundle3 = new Bundle();
                bundle3.putInt("score", score);
                intent3.putExtras(bundle3);
                startActivity(intent3);
                break;
            case R.id.rd5Sheep:
                if (checked)
                    rbD.setTextColor(Color.RED);
                Toast.makeText(AnimalFive.this, "Wrong answer ", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(AnimalFive.this, FinishActivity.class);
                Bundle bundle4 = new Bundle();
                bundle4.putInt("score", score);
                intent4.putExtras(bundle4);
                startActivity(intent4);
                break;
        }
    }

}
