package com.NFA.DicionarioDeTermosInformaticos.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.NFA.DicionarioDeTermosInformaticos.R;
import com.NFA.DicionarioDeTermosInformaticos.models.Model_Dictionary_Words;
import com.NFA.DicionarioDeTermosInformaticos.activity.receive_data.Dictionary_Words;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Dictionary_Words extends RecyclerView.Adapter<Adapter_Dictionary_Words.Holder_Dictionary_Words> {

    private final Context context;
    private final List<Model_Dictionary_Words> modelDictionaryWordsList;
    private final ArrayList<Model_Dictionary_Words> arrayList;

    public Adapter_Dictionary_Words(Context context, List<Model_Dictionary_Words> modelDictionaryWordsList) {
        this.context = context;
        this.modelDictionaryWordsList = modelDictionaryWordsList;
        this.arrayList = new ArrayList<>();
        this.arrayList.addAll(modelDictionaryWordsList);
    }

    @NonNull
    @Override
    public Holder_Dictionary_Words onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.structure_dictionary_words, null);
        return new Holder_Dictionary_Words(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder_Dictionary_Words holderDictionaryWords, final int position) {
        holderDictionaryWords.holder_title.setText(modelDictionaryWordsList.get(position).getTitle());
        holderDictionaryWords.holder_meaning.setText(modelDictionaryWordsList.get(position).getMeaning());

        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        holderDictionaryWords.itemView.startAnimation(animation);

        holderDictionaryWords.setMeaningClickListener(new MeaningClickListener() {
            @Override
            public void meaningItemClick(int position) {
                String title_dictionary_words = modelDictionaryWordsList.get(position).getTitle();
                String description_dictionary_words = modelDictionaryWordsList.get(position).getMeaning();

                Intent intent = new Intent(context, Dictionary_Words.class);
                intent.putExtra("title", title_dictionary_words);
                intent.putExtra("meaning", description_dictionary_words);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelDictionaryWordsList.size();
    }

    public class Holder_Dictionary_Words extends RecyclerView.ViewHolder implements View.OnClickListener {

        final TextView holder_title;
        final TextView holder_meaning;

        private MeaningClickListener meaningClickListener;

        Holder_Dictionary_Words(@NonNull View itemView) {
            super(itemView);
            this.holder_title = itemView.findViewById(R.id.structure_title);
            this.holder_meaning = itemView.findViewById(R.id.structure_meaning);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            this.meaningClickListener.meaningItemClick(getLayoutPosition());
        }

        void setMeaningClickListener(MeaningClickListener clickListener) {
            this.meaningClickListener = clickListener;
        }
    }

    interface MeaningClickListener {
        void meaningItemClick(int pos);
    }

    public void filter(String text) {
        if (text.isEmpty()) {
            modelDictionaryWordsList.clear();
            modelDictionaryWordsList.addAll(arrayList);

        } else {
            ArrayList<Model_Dictionary_Words> result = new ArrayList<>();
            text = text.toLowerCase();

            for (Model_Dictionary_Words item : arrayList) {
                if (item.getTitle().toLowerCase().contains(text) || item.getTitle().toLowerCase().contains(text)) {
                    result.add(item);
                }
            }
            modelDictionaryWordsList.clear();
            modelDictionaryWordsList.addAll(result);
        }
        notifyDataSetChanged();
    }
}
