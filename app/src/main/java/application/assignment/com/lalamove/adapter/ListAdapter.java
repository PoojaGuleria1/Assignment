package application.assignment.com.lalamove.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import application.assignment.com.lalamove.R;
import application.assignment.com.lalamove.databinding.ItemRowLayoutBinding;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemRowLayoutBinding itemRowLayoutBinding = DataBindingUtil.inflate
                (LayoutInflater.from(parent.getContext()), R.layout.item_row_layout,parent,false);

        return new ViewHolder(itemRowLayoutBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(ItemRowLayoutBinding itemRowLayoutBinding) {
            super(itemRowLayoutBinding.getRoot());
        }
    }
}
