package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button buttonZero;
    private Button buttonCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        buttonZero =(Button) findViewById(R.id.button_zero);
        buttonCount = (Button) findViewById(R.id.button_count);
        buttonZero.setBackgroundColor(Color.GRAY);
        buttonCount.setBackgroundColor(ContextCompat.getColor(this,R.color.purple_700));

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {

        mCount++;
        if (this.mShowCount != null)
            this.mShowCount.setText(Integer.toString(mCount));
        buttonZero.setBackgroundColor(ContextCompat.getColor(this,R.color.pink));
        buttonCount.setBackgroundColor(ContextCompat.getColor(this,R.color.green));

    }

    public void countZero(View view) {
        mCount = 0;
        this.mShowCount.setText(Integer.toString(mCount));
        buttonZero.setBackgroundColor(Color.GRAY);
        buttonCount.setBackgroundColor(ContextCompat.getColor(this,R.color.purple_700));
    }
}