package me.zujko.abcs.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.zujko.abcs.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    public final String[] ITEMS = {"Connections","New Device","Settings"};
    public final int[] ITEM_IMAGES = {R.drawable.ic_bluetooth_connected_black_48dp,
            R.drawable.ic_bluetooth_searching_black_48dp, R.drawable.ic_settings_black_48dp };
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(ITEMS[position]);
        holder.mImageView.setImageResource(ITEM_IMAGES[position]);
    }

    @Override
    public int getItemCount() {
        return ITEMS.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.main_card_image) ImageView mImageView;
        @Bind(R.id.main_card_text)TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

}
