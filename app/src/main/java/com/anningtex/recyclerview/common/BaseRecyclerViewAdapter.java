package com.anningtex.recyclerview.common;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Song
 */
public abstract class BaseRecyclerViewAdapter<D, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    public List<D> data = new ArrayList<>();

    public void setData(List<D> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public List<D> getData() {
        return data;
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public void appendItems(List<D> items) {
        if (items != null && (items.size() != 0) && data != null) {
            data.addAll(items);
            notifyDataSetChanged();
        }
    }

    public void appendItems(List<D> items, int index) {
        if (items != null && (items.size() != 0) && data != null) {
            data.addAll(index, items);
            notifyDataSetChanged();
        }
    }

    public void removeItem(D item) {
        data.remove(item);
        notifyDataSetChanged();
    }

    public void clear() {
        if (data != null) {
            data.clear();
            notifyDataSetChanged();
        }
    }
}
