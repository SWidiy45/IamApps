package com.apps.swidiy.semangatsiska;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PostingAdapter extends RecyclerView.Adapter<PostingAdapter.PostingViewHolder> {

    private ArrayList<Posting> postings;
   private Context context;

    public PostingAdapter(Context context, ArrayList<Posting> postings) {
        this.postings = postings;
        this.context=context;
    }
    public void SetPosting(ArrayList<Posting> postings)
    {
        this.postings=postings;
    }
    public ArrayList<Posting> getPostings(){
        return postings;
    }

    @Override
    public PostingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       /// LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.from(context).inflate(R.layout.view_item, parent, false);
        return new PostingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostingViewHolder holder, final int position) {
        Posting posting = getPostings().get(position);
        holder.txtTitle.setText(postings.get(position).getTitle());
        holder.txtDescription.setText(postings.get(position).getDescription());

            }



    @Override
    public int getItemCount() {
        return postings.size();
    }

    public class PostingViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle, txtDescription;

        public PostingViewHolder(View itemView) {
            super(itemView);
            txtTitle =  itemView.findViewById(R.id.title_tv);
            txtDescription =  itemView.findViewById(R.id.description_tv);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int i = getAdapterPosition();
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_POSTING,postings.get(i));
                    context.startActivity(intent);
                }
            });
        }
    }

}
