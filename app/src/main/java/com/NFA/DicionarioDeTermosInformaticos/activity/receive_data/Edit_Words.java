package com.NFA.DicionarioDeTermosInformaticos.activity.receive_data;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.NFA.DicionarioDeTermosInformaticos.R;

import java.util.Objects;

public class Edit_Words extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_words);
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

        EditText editTitle = findViewById(R.id.editTitle);
        EditText editMeaning = findViewById(R.id.editMeaning);

        Intent intent = getIntent();
        String receiveDataTitle = intent.getStringExtra("title");
        String receiveDataMeaning = intent.getStringExtra("meaning");

        editTitle.setText(receiveDataTitle);
        editMeaning.setText(receiveDataMeaning);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}
