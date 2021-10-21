package com.example.projectradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int windowsVote = 0;

    private int ubnutuVote = 0;

    private int iosVote = 0;

    private int androidVote = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cargarResultadosVotos(View v) {


        TextView windowsVotes = (TextView) findViewById(R.id.tv_VoteWindows);
        TextView ubuntuVotes = (TextView) findViewById(R.id.tv_VoteUbuntu);
        TextView iosVotes = (TextView) findViewById(R.id.tv_VoteIos);
        TextView androidVotes = (TextView) findViewById(R.id.tv_VoteAndroid);

        RadioGroup rgQualities = (RadioGroup) findViewById(R.id.rg_OS);

        switch (rgQualities.getCheckedRadioButtonId()) {

            case R.id.rb_Windows:
                Toast.makeText(this, "Windows selecionado", Toast.LENGTH_SHORT).show();
                windowsVote++;
                windowsVotes.setText("" + windowsVote);
                break;

            case R.id.rb_Appel:
                Toast.makeText(this, "Ios selecionadonado", Toast.LENGTH_SHORT).show();
                iosVote++;
                ubuntuVotes.setText("" + iosVote);
                break;

            case R.id.rb_Ubuntu:
                Toast.makeText(this, "Ubuntu selecionado", Toast.LENGTH_SHORT).show();
                ubnutuVote++;
                iosVotes.setText("" + ubnutuVote);
                break;

            case R.id.rb_Android:
                Toast.makeText(this, "Android selecionado", Toast.LENGTH_SHORT).show();
                androidVote++;
                androidVotes.setText("" + androidVote);
                break;
        }
    }
}