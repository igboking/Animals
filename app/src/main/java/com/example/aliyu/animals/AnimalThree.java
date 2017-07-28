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

public class AnimalThree extends AppCompatActivity {
    TextView tvScore;
    int score = 0;
    RadioButton rbA, rbB, rbC, rbD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_three);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rbA = (RadioButton) findViewById(R.id.rd3Chicken);
        rbB = (RadioButton) findViewById(R.id.rd3Rabbit);
        rbC = (RadioButton) findViewById(R.id.rd3Fish);
        rbD = (RadioButton) findViewById(R.id.rd3Bird);

        tvScore = (TextView) findViewById(R.id.txtScore);

        Bundle bundle = getIntent().getExtras();
        score = bundle.getInt("score");

        tvScore.setText("Score: "+score+"/3");
    }

    public void onRadioButtonClicked(View view) {
        //Bundle bundle = new Bundle();
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rd3Chicken:
                if (checked)
                    rbA.setTextColor(Color.RED);
                    Toast.makeText(AnimalThree.this, "Wrong answer ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AnimalThree.this, AnimalFour.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("score", score);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    break;
            case R.id.rd3Rabbit:
                if (checked)
                    rbB.setTextColor(Color.RED);
                    Toast.makeText(AnimalThree.this, "Wrong answer ", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(AnimalThree.this, AnimalFour.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("score", score);
                    intent2.putExtras(bundle2);
                    startActivity(intent2);
                    break;
            case R.id.rd3Fish:
                if (checked)
                    rbC.setTextColor(Color.RED);
                    Toast.makeText(AnimalThree.this, "Wrong answer ", Toast.LENGTH_SHORT).show();
                    Intent intent3 = new Intent(AnimalThree.this, AnimalFour.class);
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("score", score);
                    intent3.putExtras(bundle3);
                    startActivity(intent3);
                    break;
            case R.id.rd3Bird:
                if (checked)
                    rbD.setTextColor(Color.GREEN);
                    Toast.makeText(AnimalThree.this, "Correct answer ", Toast.LENGTH_SHORT).show();
                    Intent intent4 = new Intent(AnimalThree.this, AnimalFour.class);
                    Bundle bundle4 = new Bundle();
                    int newScore = score + 1;
                    bundle4.putInt("score", newScore);
                    intent4.putExtras(bundle4);
                    startActivity(intent4);
                    break;
        }
    }

}
