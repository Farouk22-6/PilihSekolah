package com.example.pilihsekolah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSekolahAdapter extends RecyclerView.Adapter<ListSekolahAdapter.ListViewHolder> {
    private ArrayList<sekolah> listSekolah;

    public ListSekolahAdapter(ArrayList<sekolah> list) {
        this.listSekolah = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View sekolah = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_sekolah, parent, false);
        return new ListViewHolder(sekolah);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder,final int position) {
        sekolah sekolah = listSekolah.get(position);

        Glide.with(holder.itemView.getContext())
                .load(sekolah.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvname.setText(sekolah.getName());
        holder.tvDetail.setText(sekolah.getDetails());
    }

    @Override
    public int getItemCount() {
        return listSekolah.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvname,tvDetail;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            tvname = itemView.findViewById(R.id.tv_item_name);
        }
    }
}

