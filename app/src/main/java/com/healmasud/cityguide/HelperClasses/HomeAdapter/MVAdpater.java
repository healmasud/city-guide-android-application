package com.healmasud.cityguide.HelperClasses.HomeAdapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.healmasud.cityguide.R;

import java.util.ArrayList;

public class MVAdpater extends RecyclerView.Adapter<MVAdpater.MVViewHolder> {

    ArrayList<MVHelperClass> MVLocations;

    public MVAdpater(ArrayList<MVHelperClass> MVLocations) {
        this.MVLocations = MVLocations;
    }

    @NonNull
    @Override
    public MVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_card_design,parent,false);
        MVViewHolder mvViewHolder = new MVViewHolder(view);
        return mvViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MVViewHolder holder, int position) {

        MVHelperClass mvHelperClass = MVLocations.get(position);

        holder.image.setImageResource(mvHelperClass.getImage());
        holder.title.setText(mvHelperClass.getTitle());
        holder.desc.setText(mvHelperClass.getDescription());

    }

    @Override
    public int getItemCount() {
        return MVLocations.size();
    }


    public static class MVViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title, desc;

        public MVViewHolder(@NonNull View itemView) {
            super(itemView);

            //Hooks
                image = itemView.findViewById(R.id.mv_image);
                title = itemView.findViewById(R.id.mv_title);
                desc = itemView.findViewById(R.id.mv_desc);
        }
    }
}
