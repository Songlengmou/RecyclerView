package com.anningtex.recyclerview.activity.eleven;

import androidx.annotation.Nullable;

import com.anningtex.recyclerview.R;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;

/**
 * @Author: Song
 */
public class ElevenChildProvider extends BaseNodeProvider {
    @Override
    public int getItemViewType() {
        return 1;
    }

    @Override
    public int getLayoutId() {
        return R.layout.eleven_child;
    }

    @Override
    public void convert(@NotNull BaseViewHolder helper, @Nullable BaseNode data) {
        ElevenChildNodeBean entity = (ElevenChildNodeBean) data;
        helper.setText(R.id.item_tv_container_no, entity.getContainerNo());
        helper.setText(R.id.item_tv_bl_no, entity.getBLNo());
        helper.setText(R.id.item_tv_in_date, entity.getInDate());
        helper.setText(R.id.item_tv_order_no, entity.getOrderNo());
        helper.setText(R.id.item_tv_q_bales, entity.getQBales() + entity.getUnitNameEN());
        helper.setText(R.id.item_tv_bales_unit, entity.getMetersPerBale());
        helper.setText(R.id.item_tv_volume_unit, entity.getVolumeUnit() + " M³/B");
        helper.setText(R.id.item_tv_weight_unit, entity.getWeightUnit() + " KG/B");
    }

}
