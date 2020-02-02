package ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.R;

public class ConfigurationAppActivity extends AppCompatActivity {

    private final Integer[] array_text_size = new Integer[]{12, 14, 16, 18};
    private final String[] array_list_font = new String[]{"Arial", "Juice", "Regular", "Times New Roman"};

    private Toolbar toolbar;
    private Spinner spinner_text_size, spinner_text_font;
    private Button btnSaveConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration_app);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(view -> finish());

        spinner_text_size = findViewById(R.id.spinner_text_size);
        spinner_text_font = findViewById(R.id.spinner_text_font);
        btnSaveConfiguration = findViewById(R.id.btnSaveConfiguration);

        ArrayAdapter<Integer> adapter_text_weight = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array_text_size);
        spinner_text_size.setAdapter(adapter_text_weight);

        ArrayAdapter<String> adapter_font = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array_list_font);
        spinner_text_font.setAdapter(adapter_font);

        spinner_text_size.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String txt = spinner_text_size.getSelectedItem().toString();
                Toast.makeText(ConfigurationAppActivity.this, txt, Toast.LENGTH_SHORT).show();

                getApplicationContext().setTheme(R.style.CustomStyle1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_text_font.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnSaveConfiguration.setOnClickListener(v -> {

        });
    }
}