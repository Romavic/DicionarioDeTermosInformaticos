package ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.List;

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.R;
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.models.DictionaryWordModel;
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter.DictionaryWordPresenter;
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter.utils.AppUtil;
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.adapters.DictionaryWordAdapter;
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.views.DictionaryWordView;

public class DictionaryWordActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, DictionaryWordView {

    private DrawerLayout drawer;
    private RecyclerView recycler;
    private NavigationView navigation;
    private ActionBarDrawerToggle toggle;

    private DictionaryWordAdapter dictionary_wordAdapter;
    private DictionaryWordPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary_word);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_dictionary_word);
        recycler = findViewById(R.id.recycler_dictionary_word);
        navigation = findViewById(R.id.navigation_dictionary_word);

        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigation.setNavigationItemSelectedListener(this);

        presenter = new DictionaryWordPresenter(this);
        presenter.getDictionaryWord();
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            AppUtil.dialogFinishApp(this);
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_settings: {
                startActivity(new Intent(DictionaryWordActivity.this, ConfigurationAppActivity.class));
                break;
            }
            case R.id.nav_conversion: {
                startActivity(new Intent(DictionaryWordActivity.this, ConversionActivity.class));
                break;
            }
            case R.id.nav_save: {
                startActivity(new Intent(DictionaryWordActivity.this, WordsSavedActivity.class));
                break;
            }

            case R.id.nav_about:
                AppUtil.dialogAboutUs(this);
                break;

            case R.id.nav_share:
                AppUtil.sendApp(this);
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.menu_app_bar_search);

        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                dictionary_wordAdapter.filter(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                dictionary_wordAdapter.filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public void onSuccessGetListWords(List<DictionaryWordModel> wordModelList) {
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recycler.setHasFixedSize(true);

        dictionary_wordAdapter = new DictionaryWordAdapter(this, wordModelList, dictionaryWordModel -> {
            Intent intent = new Intent(DictionaryWordActivity.this, ReceiveDictionaryWordActivity.class);
            intent.putExtra("title", dictionaryWordModel.getTitle());
            intent.putExtra("meaning", dictionaryWordModel.getMeaning());
            startActivity(intent);
        });
        recycler.setAdapter(dictionary_wordAdapter);
    }

    @Override
    public void onErrorGetListWords(String messageError) {
        AppUtil.customToast(this, messageError);
    }
}