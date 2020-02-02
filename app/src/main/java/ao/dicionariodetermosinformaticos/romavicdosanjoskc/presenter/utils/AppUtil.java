package ao.dicionariodetermosinformaticos.romavicdosanjoskc.presenter.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import java.io.File;

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.R;

public class AppUtil {

    public static void dialogFinishApp(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setMessage(R.string.close_app);
        builder.setPositiveButton("Sim", (dialog, which) -> activity.finish());
        builder.setNegativeButton("Não", (dialog, which) -> {
        }).create().show();
    }

    public static void dialogAboutUs(Activity activity) {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(activity);
        @SuppressLint("InflateParams") View view = activity.getLayoutInflater().inflate(R.layout.layout_about, null);
        mBuilder.setView(view);
        mBuilder.create();
        mBuilder.show();
    }

    public static void sendApp(Activity activity) {
        try {
            ApplicationInfo api = activity.getApplicationContext().getApplicationInfo();
            String apkPath = api.sourceDir;

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("application/vnd.android.package-archive");
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkPath)));
            activity.startActivity(Intent.createChooser(intent, "Partilhar Apk: "));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Log.i("Enviando", activity.getPackageName());
        }
    }

    public static void customToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void shareInformation(Context context, String title, String meaning) {
        try {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, meaning);
            intent.setType("text/plain");
            Intent share_utility = Intent.createChooser(intent, "Partilhar Significado de: " + title);
            context.startActivity(share_utility);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Log.i("ShareInformation", "Ok");
        }
    }
}