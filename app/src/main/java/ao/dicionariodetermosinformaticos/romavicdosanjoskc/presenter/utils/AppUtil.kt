package ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.R
import java.io.File

object AppUtil {
    fun dialogFinishApp(activity: Activity) {
        val builder = AlertDialog.Builder(activity)
        builder.setMessage(R.string.close_app)
        builder.setPositiveButton("Sim") { _: DialogInterface?, _: Int -> activity.finish() }
        builder.setNegativeButton("Não") { _: DialogInterface?, _: Int -> }.create().show()
    }

    fun dialogAboutUs(activity: Activity) {
        val mBuilder = AlertDialog.Builder(activity)
        @SuppressLint("InflateParams") val view = activity.layoutInflater.inflate(R.layout.layout_about, null)
        mBuilder.setView(view)
        mBuilder.create()
        mBuilder.show()
    }

    fun sendApp(activity: Activity) {
        try {
            val api = activity.applicationContext.applicationInfo
            val apkPath = api.sourceDir
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "application/vnd.android.package-archive"
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(File(apkPath)))
            activity.startActivity(Intent.createChooser(intent, "Partilhar Apk: "))
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            Log.i("Enviando", activity.packageName)
        }
    }

    @JvmStatic
    fun customToast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    @JvmStatic
    fun shareInformation(context: Context, title: String, meaning: String?) {
        try {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, meaning)
            intent.type = "text/plain"
            val shareUtility = Intent.createChooser(intent, "Partilhar Significado de: $title")
            context.startActivity(shareUtility)
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            Log.i("ShareInformation", "Ok")
        }
    }
}