package ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.R
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.models.DictionaryWordModel
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.adapters.DictionaryWordAdapter.DictionaryWordHolder
import java.util.*

class DictionaryWordAdapter(private val context: Context,
                            private val modelDictionaryWordsList: MutableList<DictionaryWordModel>,
                            dictionaryWordClick: DictionaryWordClick)
    : RecyclerView.Adapter<DictionaryWordHolder>() {

    private val arrayList: ArrayList<DictionaryWordModel> = ArrayList()
    private val dictionaryWordClick: DictionaryWordClick

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DictionaryWordHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_dictionary_word, parent, false)
        return DictionaryWordHolder(view)
    }

    override fun onBindViewHolder(holderDictionaryWords: DictionaryWordHolder, position: Int) {

        val animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left)
        holderDictionaryWords.itemView.startAnimation(animation)

        holderDictionaryWords.holderTitle.text = modelDictionaryWordsList[position].title

        holderDictionaryWords.itemView.setOnClickListener {
            dictionaryWordClick.onClick(modelDictionaryWordsList[position])
        }
    }

    override fun getItemCount(): Int {
        return modelDictionaryWordsList.size
    }

    class DictionaryWordHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var holderTitle: TextView = itemView.findViewById(R.id.structure_title)
    }

    interface DictionaryWordClick {
        fun onClick(dictionaryWordModel: DictionaryWordModel?)
    }

    fun filter(text: String) {
        var text: String = text
        if (text.isEmpty()) {
            modelDictionaryWordsList.clear()
            modelDictionaryWordsList.addAll(arrayList)
        } else {
            val result = ArrayList<DictionaryWordModel>()
            text = text.toLowerCase()
            for (item in arrayList) {
                if (item.title!!.toLowerCase().contains(text) || item.title!!.toLowerCase().contains(text)) {
                    result.add(item)
                }
            }
            modelDictionaryWordsList.clear()
            modelDictionaryWordsList.addAll(result)
        }
        notifyDataSetChanged()
    }

    init {
        arrayList.addAll(modelDictionaryWordsList)
        this.dictionaryWordClick = dictionaryWordClick
    }
}