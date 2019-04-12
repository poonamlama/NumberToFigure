package com.numbertofigure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnConvert;
    private EditText etNumber;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConvert = findViewById(R.id.btnConvert);
        etNumber = findViewById(R.id.etNumber);
        tvOutput = findViewById(R.id.tvOutput);

        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etNumber.getText().toString())){
            etNumber.setError("Please enter number.");
            etNumber.requestFocus();
            return;
        }
        int number = Integer.parseInt(etNumber.getText().toString());

        tvOutput.setText(NumberConvert.convert(number));

    }
}
