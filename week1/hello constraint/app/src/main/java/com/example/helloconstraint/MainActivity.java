package com.example.helloconstraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.color.holo_blue_light;

public class MainActivity extends AppCompatActivity {
    TextView mShowCount;
    private int mCount = 0;
    Button btnzero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnzero = (Button) findViewById(R.id.btnzero);
    }

    public void show_toast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void nullify(View view) {
        mShowCount.setText(Integer.toString(0));
        btnzero.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));

    }

    public void showCount(View view) {
        mCount = Integer.parseInt(mShowCount.getText().toString());
                ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        btnzero.setBackgroundColor(getResources().getColor(android.R.color.black));


    }
}
