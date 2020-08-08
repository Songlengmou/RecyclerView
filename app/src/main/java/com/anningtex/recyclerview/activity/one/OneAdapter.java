package com.anningtex.recyclerview.activity.one;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anningtex.recyclerview.R;
import com.anningtex.recyclerview.utils.DoubleUtil;
import com.anningtex.recyclerview.utils.StringUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Author Song
 * @Desc:
 */
public class OneAdapter extends RecyclerView.Adapter<OneAdapter.MyViewHolder> {
    public String mCurrencyName;
    public double mCredit;
    public String mDate;

    private List<OneBean.DataBean.ListDetailsBean> beans;

    public void setBeans(List<OneBean.DataBean.ListDetailsBean> beans) {
        this.beans = beans;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_one, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.setData(i);
    }

    @Override
    public int getItemCount() {
        return beans == null ? 0 : beans.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv1)
        TextView tv1;
        @BindView(R.id.tv2)
        TextView tv2;
        @BindView(R.id.tv3)
        TextView tv3;
        @BindView(R.id.tv4)
        TextView tv4;
        @BindView(R.id.tv5)
        TextView tv5;
        @BindView(R.id.tv6)
        TextView tv6;
        @BindView(R.id.tv7)
        TextView tv7;
        @BindView(R.id.tv8)
        TextView tv8;
        @BindView(R.id.tv9)
        TextView tv9;
        @BindView(R.id.tv10)
        TextView tv10;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setData(int i) {
            try {
                OneBean.DataBean.ListDetailsBean listDetailsBean = beans.get(i);
                double sellMoney = Double.parseDouble(listDetailsBean.getSellMoney());
                double texNumber = Double.parseDouble(listDetailsBean.getTexNumber());
                double receiveMoney = Double.parseDouble(listDetailsBean.getReceiveMoney());

                tv1.setText((++i) + "");
                tv2.setText(listDetailsBean.getSellDate());
                tv3.setText(listDetailsBean.getTexName_Show());
                tv4.setText(StringUtils.addComma(StringUtils.formatFloatNumber1(Double.parseDouble(listDetailsBean.getTexNumber()))));
                tv5.setText("");
                tv6.setText(StringUtils.addComma(StringUtils.formatFloatNumber1(Double.parseDouble(listDetailsBean.getSellMoney()))));
                if (sellMoney > 0 && texNumber > 0) {
                    double d7 = DoubleUtil.divide(sellMoney, texNumber, 0);
                    tv7.setText(StringUtils.addComma(StringUtils.formatFloatNumber1(Double.parseDouble(DoubleUtil.getDoubleString(d7)))));
                }
                tv8.setText(StringUtils.addComma(StringUtils.formatFloatNumber1(Double.parseDouble(listDetailsBean.getReceiveMoney()))));
                tv10.setText("");

                if (mCredit == 0) {
                    double d9 = DoubleUtil.sub(DoubleUtil.add(Double.valueOf(0), sellMoney), receiveMoney);
                    tv9.setText(StringUtils.addComma(StringUtils.formatFloatNumber1(Double.parseDouble(DoubleUtil.getDoubleString(d9)))));
                } else {
                    double d9 = DoubleUtil.sub(DoubleUtil.add(mCredit, sellMoney), receiveMoney);
                    tv9.setText(StringUtils.addComma(StringUtils.formatFloatNumber1(Double.parseDouble(DoubleUtil.getDoubleString(d9)))));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
