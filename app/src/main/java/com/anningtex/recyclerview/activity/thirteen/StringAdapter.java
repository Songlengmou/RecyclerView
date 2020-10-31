package com.anningtex.recyclerview.activity.thirteen;

import com.anningtex.recyclerview.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @Author: Song
 */
public class StringAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public StringAdapter(List<String> list) {
        super(R.layout.item_child_thirteen, list);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder helper, @NotNull String item) {
        helper.setText(R.id.item_tv_child, item);
    }
}
