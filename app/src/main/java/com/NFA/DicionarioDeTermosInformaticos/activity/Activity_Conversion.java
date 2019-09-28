package com.NFA.DicionarioDeTermosInformaticos.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.NFA.DicionarioDeTermosInformaticos.R;

import java.util.Objects;

public class Activity_Conversion extends AppCompatActivity {

    private EditText inputText;
    private TextView textBinary;
    private TextView decimal;
    private TextView textOctal;
    private TextView textHexadecimal;
    private final String[] spinConversionItem = {"Decimal", "Binary", "Octal", "Hexadecimal"};
    private int spinPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        textBinary = findViewById(R.id.textBinary);
        decimal = findViewById(R.id.textDecimal);
        textOctal = findViewById(R.id.textOctal);
        textHexadecimal = findViewById(R.id.textHexadecimal);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        inputText = findViewById(R.id.inputText);
        Spinner spinConversionSelection = findViewById(R.id.spinConversionSelection);

        ArrayAdapter<String> spinAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, spinConversionItem);
        spinConversionSelection.setAdapter(spinAdapter);

        spinConversionSelection.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinPosition = i;

                inputText.setText("");
                decimal.setText("");
                textBinary.setText("");
                textOctal.setText("");
                textHexadecimal.setText("");
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBinary();
                calculateDecimal();
                calculateOctal();
                calculateHexadecimal();
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void calculateBinary() {
        String value = inputText.getText().toString();

        if (checkingInputValidation()) {
            switch (spinPosition) {
                case 0:
                    try {
                        textBinary.setText("" + Long.toBinaryString(Long.valueOf(value)));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 1:
                    try {
                        textBinary.setText(value);
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 2:
                    try {
                        textBinary.setText("" + Long.toBinaryString(Long.parseLong(value, 8)));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong) + " 1234");
                    }
                    break;
                case 3:
                    try {
                        textBinary.setText("" + Long.toBinaryString(Long.parseLong(value, 16)));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private void calculateDecimal() {
        String value = inputText.getText().toString();

        if (checkingInputValidation()) {
            switch (spinPosition) {
                case 0:
                    try {
                        decimal.setText(value);
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 1:
                    try {
                        decimal.setText("" + Long.parseLong(value, 2));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 2:
                    try {
                        decimal.setText("" + Long.parseLong(value, 8));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 3:
                    try {
                        decimal.setText("" + Long.parseLong(value, 16));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private void calculateOctal() {
        String value = inputText.getText().toString();

        if (checkingInputValidation()) {
            switch (spinPosition) {
                case 0:
                    try {
                        textOctal.setText("" + Long.toOctalString(Long.valueOf(value)));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 1:
                    try {
                        long l = Long.parseLong(value, 2);
                        textOctal.setText("" + Long.toOctalString(l));

                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 2:
                    try {
                        textOctal.setText(value);

                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 3:
                    try {
                        textOctal.setText("" + Long.toOctalString(Long.parseLong(value, 16)));

                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private void calculateHexadecimal() {
        String value = inputText.getText().toString();

        if (checkingInputValidation()) {
            switch (spinPosition) {
                case 0:
                    try {
                        textHexadecimal.setText("" + Long.toHexString(Long.valueOf(value)));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 1:
                    try {
                        textHexadecimal.setText("" + Long.toHexString(Long.parseLong(value, 2)));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 2:
                    try {
                        textHexadecimal.setText("" + Long.toHexString(Long.parseLong(value, 8)));
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
                case 3:
                    try {
                        textHexadecimal.setText(value);
                    } catch (Exception e) {
                        inputText.setError(getString(R.string.something_wrong));
                    }
                    break;
            }
        }
    }

    private boolean checkingInputValidation() {

        String gettingInput = inputText.getText().toString();

        if (inputText.getText().toString().trim().isEmpty()) {
            inputText.setError(getString(R.string.fill_field));
            return false;

        } else if (gettingInput.matches(".*[G-Z].*") || gettingInput.matches(".*[g-z].*")) {
            inputText.setError(getString(R.string.enter_letter_from));
            return false;

        } else if (spinPosition == 2 && gettingInput.matches(".*[8-9].*")) {
            inputText.setError(getString(R.string.value_should_be));
            return false;

        } else if (spinPosition == 1 && gettingInput.matches(".*[2-9].*")) {
            inputText.setError(getString(R.string.value_should_be_));
            return false;

        } else if (gettingInput.length() > 15) {
            inputText.setError(getString(R.string.value_limit));
            return false;
        }
        return true;
    }
}