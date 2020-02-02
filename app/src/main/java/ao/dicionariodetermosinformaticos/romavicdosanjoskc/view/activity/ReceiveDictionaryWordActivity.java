package ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.R;
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter.utils.AppUtil;

public class ReceiveDictionaryWordActivity extends AppCompatActivity {

    private TextView receiveTitle;
    private TextView receiveMeaning;

    private String receiveDataTitle, receiveDataMeaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_dictionary_word);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(v -> finish());

        receiveTitle = findViewById(R.id.receiveTitle);
        receiveMeaning = findViewById(R.id.receiveMeaning);

        Intent intent = getIntent();
        receiveDataTitle = intent.getStringExtra("title");
        receiveDataMeaning = intent.getStringExtra("meaning");

        if (Objects.requireNonNull(receiveDataMeaning).isEmpty() || Objects.requireNonNull(receiveDataTitle).isEmpty()) {
            finish();
        } else {
            receiveTitle.setText(receiveDataTitle);
            receiveMeaning.setText(receiveDataMeaning);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_share_save, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_share: {
                AppUtil.shareInformation(this, receiveDataTitle, receiveDataMeaning);
                break;
            }
            case R.id.menu_save: {
                AppUtil.customToast(this, "Save");
                break;
            }

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}