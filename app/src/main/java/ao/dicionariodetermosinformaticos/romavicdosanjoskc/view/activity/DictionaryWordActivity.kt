package ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.R
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.models.DictionaryWordModel
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter.DictionaryWordPresenter
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter.utils.AppUtil
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.adapters.DictionaryWordAdapter
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.adapters.DictionaryWordAdapter.DictionaryWordClick
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.views.DictionaryWordView
import com.google.android.material.navigation.NavigationView

class DictionaryWordActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, DictionaryWordView {

    private var drawer: DrawerLayout? = null
    private var recycler: RecyclerView? = null
    private var navigation: NavigationView? = null
    private var toggle: ActionBarDrawerToggle? = null
    private var dictionaryWordAdapter: DictionaryWordAdapter? = null
    private var presenter: DictionaryWordPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionary_word)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.setTitleTextAppearance(this, R.style.CustomStyle1)

        drawer = findViewById(R.id.drawer_dictionary_word)
        recycler = findViewById(R.id.recycler_dictionary_word)
        navigation = findViewById(R.id.navigation_dictionary_word)

        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer?.addDrawerListener(toggle!!)
        toggle!!.syncState()
        navigation?.setNavigationItemSelectedListener(this)

        presenter = DictionaryWordPresenter(this)
        presenter!!.dictionaryWord()
    }

    override fun onBackPressed() {
        if (drawer!!.isDrawerOpen(GravityCompat.START)) {
            drawer!!.closeDrawer(GravityCompat.START)
        } else {
            AppUtil.dialogFinishApp(this)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_settings -> startActivity(Intent(this@DictionaryWordActivity, ConfigurationAppActivity::class.java))
            R.id.nav_conversion -> startActivity(Intent(this@DictionaryWordActivity, ConversionActivity::class.java))
            R.id.nav_save -> startActivity(Intent(this@DictionaryWordActivity, WordsSavedActivity::class.java))
            R.id.nav_about -> AppUtil.dialogAboutUs(this)
            R.id.nav_share -> AppUtil.sendApp(this)
        }
        drawer!!.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        val menuItem = menu.findItem(R.id.menu_app_bar_search)
        val searchView = menuItem.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                dictionaryWordAdapter!!.filter(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                dictionaryWordAdapter!!.filter(newText)
                return true
            }
        })
        return true
    }

    override fun onSuccessGetListWords(wordModelList: List<DictionaryWordModel>) {
        recycler!!.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycler!!.setHasFixedSize(true)
        dictionaryWordAdapter = DictionaryWordAdapter(this, wordModelList as MutableList<DictionaryWordModel>, object : DictionaryWordClick {
            override fun onClick(dictionaryWordModel: DictionaryWordModel?) {
                val intent = Intent(this@DictionaryWordActivity, ReceiveDictionaryWordActivity::class.java)
                intent.putExtra("title", dictionaryWordModel!!.title)
                intent.putExtra("meaning", dictionaryWordModel.meaning)
                startActivity(intent)
            }
        })
        recycler!!.adapter = dictionaryWordAdapter
    }

    override fun onErrorGetListWords(messageError: String?) {
        AppUtil.customToast(this, messageError)
    }
}