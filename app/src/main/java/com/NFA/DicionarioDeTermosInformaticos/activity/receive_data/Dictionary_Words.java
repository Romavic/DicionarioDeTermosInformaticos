package com.NFA.DicionarioDeTermosInformaticos.activity.receive_data;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.NFA.DicionarioDeTermosInformaticos.R;

import java.util.Objects;

public class Dictionary_Words extends AppCompatActivity {

    private static final String TAG = "Exception";
    
    TextView receiveTitle, receiveMeaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dictionary_words);
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

        receiveTitle = findViewById(R.id.receiveTitle);
        receiveMeaning = findViewById(R.id.receiveMeaning);

        Intent intent = getIntent();
        String receiveDataTitle = intent.getStringExtra("title");
        String receiveDataMeaning = intent.getStringExtra("meaning");

        try {
            receiveTitle.setText(receiveDataTitle);
            receiveMeaning.setText(receiveDataMeaning);

            if (receiveTitle.getText().toString().isEmpty() || receiveMeaning.getText().toString().isEmpty()) {
                finish();
            }

        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_share_save_edit, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_share) {

            try {
                String get_receive_title = receiveTitle.getText().toString();
                String get_receive_meaning = receiveMeaning.getText().toString();

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, get_receive_meaning);
                intent.setType("text/plain");
                Intent share_utility = Intent.createChooser(intent, "Partilhar Significado de: " + get_receive_title);
                startActivity(share_utility);

            } catch (Exception e) {
                Log.e(TAG, e.toString());
            }
        }

        if (id == R.id.menu_save) {
            Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.menu_edit) {

            String title = receiveTitle.getText().toString();
            String meaning = receiveMeaning.getText().toString();

            Intent intent = new Intent(this, Edit_Words.class);
            intent.putExtra("title", title);
            intent.putExtra("meaning", meaning);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}