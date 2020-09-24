package com.anningtex.recyclerview.activity.ten;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anningtex.recyclerview.R;
import com.anningtex.recyclerview.common.BaseRecycleAdapter;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Song
 * @desc: 在列表中增加新的数值
 */
public class TenActivity extends AppCompatActivity {
    @BindView(R.id.rv_ten)
    RecyclerView rvTen;
    @BindView(R.id.btn_add)
    Button btnAdd;

    String json = "{\"code\":1,\"msg\":\"Success\",\"data\":{\"tex_type\":\"IsFlower\",\"goods_spec_in_list\":[{\"id\":29,\"container_id\":1141,\"order_no\":\"MF181229A\",\"bales\":4,\"meters_per_bale\":600,\"meters_per_bale_unit_id\":1,\"volume_unit\":\"0.1000\",\"weight_unit\":\"71.0000\",\"is_manual\":1,\"notes\":\"\"}]}}";
    private BaseRecycleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        ButterKnife.bind(this);
        setTitle("Ten");
        initView();
    }

    private void initView() {
        TenBean tenBean = new Gson().fromJson(json, TenBean.class);
        TenBean.DataBean data = tenBean.getData();
        List<TenBean.DataBean.GoodsSpecInListBean> goodsSpecInList = data.getGoods_spec_in_list();
        rvTen.setLayoutManager(new LinearLayoutManager(TenActivity.this));
        adapter = new BaseRecycleAdapter(R.layout.item_ten, goodsSpecInList);
        rvTen.setAdapter(adapter);
        adapter.setOnDataToViewListener((helper, item, position) -> {
            TenBean.DataBean.GoodsSpecInListBean specInListBean = (TenBean.DataBean.GoodsSpecInListBean) item;
            TextView mTvBales = helper.getView(R.id.tv_bales);
            TextView mTvMetersPerBale = helper.getView(R.id.tv_meters_per_bale);
            TextView mTvVolumeUnit = helper.getView(R.id.tv_volume_unit);
            TextView mTvWeightUnit = helper.getView(R.id.tv_weight_unit);

            if (("IsFlower").equals(data.getTex_type())) {
                mTvBales.setText(specInListBean.getBales() + " ");
                mTvMetersPerBale.setText(specInListBean.getMeters_per_bale() + "");
                mTvVolumeUnit.setText(specInListBean.getVolume_unit() + " m³");
                mTvWeightUnit.setText(specInListBean.getWeight_unit() + " kg");
            }
        });
    }

    @OnClick(R.id.btn_add)
    public void onViewClicked() {
        List<TenBean.DataBean.GoodsSpecInListBean> data = adapter.getData();
        if (data != null) {
            TenBean.DataBean.GoodsSpecInListBean datum = new TenBean.DataBean.GoodsSpecInListBean();
            datum.setBales(666);
            datum.setMeters_per_bale(8023);
            datum.setVolume_unit("13.14");
            datum.setWeight_unit("521");
            data.add(datum);
            adapter.notifyDataSetChanged();
        }
    }
}