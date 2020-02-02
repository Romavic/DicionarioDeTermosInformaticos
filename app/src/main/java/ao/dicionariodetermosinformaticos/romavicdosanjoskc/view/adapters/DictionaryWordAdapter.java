package ao.dicionariodetermosinformaticos.romavicdosanjoskc.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ao.dicionariodetermosinformaticos.romavicdosanjoskc.R;
import ao.dicionariodetermosinformaticos.romavicdosanjoskc.models.DictionaryWordModel;

public class DictionaryWordAdapter extends RecyclerView.Adapter<DictionaryWordAdapter.DictionaryWordHolder> {

    private final Context context;
    private final List<DictionaryWordModel> modelDictionaryWordsList;
    private final ArrayList<DictionaryWordModel> arrayList;
    private DictionaryWordClick dictionaryWordClick;

    public DictionaryWordAdapter(Context context, List<DictionaryWordModel> modelDictionaryWordsList, DictionaryWordClick dictionaryWordClick) {
        this.context = context;
        this.modelDictionaryWordsList = modelDictionaryWordsList;
        this.arrayList = new ArrayList<>();
        this.arrayList.addAll(modelDictionaryWordsList);
        this.dictionaryWordClick = dictionaryWordClick;
    }

    @NonNull
    @Override
    public DictionaryWordHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_dictionary_word, parent, false);
        return new DictionaryWordHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DictionaryWordHolder holderDictionaryWords, final int position) {

        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        holderDictionaryWords.itemView.startAnimation(animation);

        holderDictionaryWords.holder_title.setText(modelDictionaryWordsList.get(position).getTitle());

        holderDictionaryWords.itemView.setOnClickListener(view -> {
            dictionaryWordClick.onClick(modelDictionaryWordsList.get(position));
        });
    }

    public void filter(String text) {
        if (text.isEmpty()) {
            modelDictionaryWordsList.clear();
            modelDictionaryWordsList.addAll(arrayList);

        } else {
            ArrayList<DictionaryWordModel> result = new ArrayList<>();
            text = text.toLowerCase();

            for (DictionaryWordModel item : arrayList) {
                if (item.getTitle().toLowerCase().contains(text) || item.getTitle().toLowerCase().contains(text)) {
                    result.add(item);
                }
            }
            modelDictionaryWordsList.clear();
            modelDictionaryWordsList.addAll(result);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return modelDictionaryWordsList.size();
    }

    public interface DictionaryWordClick {
        void onClick(DictionaryWordModel dictionaryWordModel);
    }

    interface MeaningClickListener {
        void meaningItemClick(int pos);
    }

    public class DictionaryWordHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        final TextView holder_title;

        private MeaningClickListener meaningClickListener;

        DictionaryWordHolder(@NonNull View itemView) {
            super(itemView);
            this.holder_title = itemView.findViewById(R.id.structure_title);
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
}
