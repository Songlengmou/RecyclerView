package com.anningtex.recyclerview.activity.eleven;

import android.view.View;
import android.widget.ImageView;

import com.anningtex.recyclerview.R;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;

/**
 * @Author Song
 */
public class ElevenParentProvider extends BaseNodeProvider {
    @Override
    public int getItemViewType() {
        return 0;
    }

    @Override
    public int getLayoutId() {
        return R.layout.eleven_parent_header;
    }

    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder, BaseNode data) {
        ElevenParentNodeBean entity = (ElevenParentNodeBean) data;
        baseViewHolder.setText(R.id.item_tv, entity.getTitle());
    }

    @Override
    public void onClick(@NotNull BaseViewHolder helper, @NotNull View view, BaseNode data, int position) {
        getAdapter().expandOrCollapse(position);
        ElevenParentNodeBean entity = (ElevenParentNodeBean) data;
        ImageView imageView = helper.getView(R.id.item_img_arrow);
        if (entity.isExpanded()) {
            imageView.setRotation(0f);
        } else {
            imageView.setRotation(270f);
        }
        getAdapter().notifyDataSetChanged();
    }
}
