package com.anningtex.recyclerview.activity.eleven;

import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.entity.node.BaseNode;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @Author: Song
 */
public class ElevenAdapter extends BaseNodeAdapter {

    public ElevenAdapter() {
        super();
        addFullSpanNodeProvider(new ElevenParentProvider());
        addNodeProvider(new ElevenChildProvider());
    }

    @Override
    protected int getItemType(@NotNull List<? extends BaseNode> data, int position) {
        BaseNode node = data.get(position);
        if (node instanceof ElevenParentNodeBean) {
            return 0;
        } else if (node instanceof ElevenChildNodeBean) {
            return 1;
        }
        return -1;
    }
}
