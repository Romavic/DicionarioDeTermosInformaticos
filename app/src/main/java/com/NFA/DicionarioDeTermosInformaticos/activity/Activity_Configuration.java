package com.NFA.DicionarioDeTermosInformaticos.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.NFA.DicionarioDeTermosInformaticos.R;

public class Activity_Configuration extends AppCompatActivity {

    Spinner spinnerIncreaseText, spinnerTypeFont;
    Button btnSaveConfiguration;
    String[] array_text_weight = new String[]{"12", "14", "16", "18"};
    String[] array_list_font = new String[]{"Arial", "Juice", "Regular", "Times New Roman"};
    ArrayAdapter<String> adapter_text_weight;
    ArrayAdapter<String> adapter_font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        spinnerIncreaseText = findViewById(R.id.spinnerIncreaseText);
        spinnerTypeFont = findViewById(R.id.spinnerTypeFont);
        btnSaveConfiguration = findViewById(R.id.btnSaveConfiguration);

        adapter_text_weight = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array_text_weight);
        spinnerIncreaseText.setAdapter(adapter_text_weight);

        adapter_font = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array_list_font);
        spinnerTypeFont.setAdapter(adapter_font);

        spinnerIncreaseText.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerTypeFont.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnSaveConfiguration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
