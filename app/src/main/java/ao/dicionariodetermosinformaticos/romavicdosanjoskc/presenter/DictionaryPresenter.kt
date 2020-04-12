package ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter

import android.util.Log
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.views.DictionaryView
import com.google.firebase.firestore.FirebaseFirestore

class DictionaryPresenter(dictionaryView: DictionaryView) {

    val view = dictionaryView

    private val db = FirebaseFirestore.getInstance()
    private val dictionaryReference = db.collection("Dictionary")

    fun getDictionary() {
        dictionaryReference.get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        view.onDictionaryError(document.getDocumentReference("10Base-2").toString())
                    }
                }
                .addOnFailureListener { exception ->
                    Log.w("TAG", "Error getting documents.", exception)
                }
    }
}