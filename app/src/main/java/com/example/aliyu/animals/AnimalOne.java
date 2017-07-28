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

public class AnimalOne extends AppCompatActivity {
    int score = 0;
    TextView tvScore;
    RadioButton rbA, rbB, rbC, rbD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvScore = (TextView) findViewById(R.id.txtScore);

        tvScore.setText("score : 0/1");

        rbA = (RadioButton) findViewById(R.id.rd1cat);
        rbB = (RadioButton) findViewById(R.id.rd1goat);
        rbC = (RadioButton) findViewById(R.id.rd1dog);
        rbD = (RadioButton) findViewById(R.id.rd1lion);

    }

    public void onRadioButtonClicked(View view) {
        //Bundle bundle = new Bundle();
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rd1cat:
                if (checked)
                    rbA.setTextColor(Color.RED);
                    Toast.makeText(AnimalOne.this, "Wrong answer ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AnimalOne.this, AnimalTwo.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("score", 0);
                    intent.putExtras(bundle);
                    startActivity(intent);
                break;
            case R.id.rd1goat:
                if (checked)
                    rbB.setTextColor(Color.RED);
                    Toast.makeText(AnimalOne.this, "Wrong answer ", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(AnimalOne.this, AnimalTwo.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("score", 0);
                    intent2.putExtras(bundle2);
                    startActivity(intent2);
                break;
            case R.id.rd1dog:
                if (checked)
                    rbC.setTextColor(Color.GREEN);
                    Toast.makeText(AnimalOne.this, "Correct answer ", Toast.LENGTH_SHORT).show();
                    Intent intent3 = new Intent(AnimalOne.this, AnimalTwo.class);
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("score", 1);
                    intent3.putExtras(bundle3);
                    startActivity(intent3);
                break;
            case R.id.rd1lion:
                if (checked)
                    rbD.setTextColor(Color.RED);
                    Toast.makeText(AnimalOne.this, "Wrong answer ", Toast.LENGTH_SHORT).show();
                    Intent intent4 = new Intent(AnimalOne.this, AnimalTwo.class);
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("score", 0);
                    intent4.putExtras(bundle4);
                    startActivity(intent4);
                break;
        }
    }

}
