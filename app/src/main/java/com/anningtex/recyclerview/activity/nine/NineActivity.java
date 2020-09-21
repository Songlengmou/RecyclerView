package com.anningtex.recyclerview.activity.nine;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anningtex.recyclerview.R;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @Author Song
 * @Desc: 使用 Grouped   伸缩
 */
public class NineActivity extends AppCompatActivity {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private String json = "{\"code\":1,\"msg\":\"Success\",\"data\":[{\"ID\":\"74\",\"PIID\":\"74\",\"BvCode\":\"\",\"LoadDate\":\"2019-11-08\",\"FromPort\":\"Kampala \",\"ToCountryID\":\"2\",\"ToPort\":\"Kampala\",\"ClearBorder\":\"Kampala \",\"DeliveryNo\":\"AOAD20191108 \",\"PlateNo\":\"\",\"Driver\":\"\",\"PhoneNo\":\"\",\"Notes\":\"\",\"VolumeTotal\":\"32.08\",\"WeightTotal\":\"6596\",\"QBalesTotal\":\"302\",\"PullerGoodsList\":[{\"PIID\":\"74\",\"BGLID\":\"760\",\"QBales\":87,\"InDate\":\"2019-10-05\",\"BLNo\":\"585758711\",\"ContainerNo\":\"HASU4605547\",\"OrderNo\":\"BG190615A\",\"VolumeUnit\":\"0.2200\",\"WeightUnit\":\"28.0000\"},{\"PIID\":\"74\",\"BGLID\":\"759\",\"QBales\":200,\"InDate\":\"2019-10-05\",\"BLNo\":\"585758711\",\"ContainerNo\":\"HASU4605547\",\"OrderNo\":\"FX190325A\",\"VolumeUnit\":\"0.0563\",\"WeightUnit\":\"14.8000\"},{\"PIID\":\"74\",\"BGLID\":\"770\",\"QBales\":15,\"InDate\":\"2019-10-05\",\"BLNo\":\"585758711\",\"ContainerNo\":\"HASU4605547\",\"OrderNo\":\"TR190313A\",\"VolumeUnit\":\"0.1120\",\"WeightUnit\":\"80.0000\"}]},{\"ID\":\"70\",\"PIID\":\"70\",\"BvCode\":\"BV2019264087\",\"LoadDate\":\"2019-11-02\",\"FromPort\":\"Kampala\",\"ToCountryID\":\"1\",\"ToPort\":\"Ishasha\",\"ClearBorder\":\"Ishasha\",\"DeliveryNo\":\"AOCG20191102-1\",\"PlateNo\":\"987\",\"Driver\":\"sasaas\",\"PhoneNo\":\"123456788\",\"Notes\":\"\",\"VolumeTotal\":\"58.304\",\"WeightTotal\":\"34848.5\",\"QBalesTotal\":\"491\",\"PullerGoodsList\":[{\"PIID\":\"70\",\"BGLID\":\"870\",\"QBales\":85,\"InDate\":\"2019-10-29\",\"BLNo\":\"585758784\",\"ContainerNo\":\"SUDU7725003\",\"OrderNo\":\"PJX190628A\",\"VolumeUnit\":\"0.1100\",\"WeightUnit\":\"74.0000\"},{\"PIID\":\"70\",\"BGLID\":\"891\",\"QBales\":60,\"InDate\":\"2019-10-29\",\"BLNo\":\"585758785\",\"ContainerNo\":\"MSKU7850568\",\"OrderNo\":\"PJ190805A\",\"VolumeUnit\":\"0.1000\",\"WeightUnit\":\"73.0000\"}]}]}";
    private NineAdapter nineAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        NineBean nineBean = new Gson().fromJson(json, NineBean.class);
        List<NineBean.DataBean> data = nineBean.getData();
        if (data != null && data.size() > 0) {
            nineAdapter = new NineAdapter();
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            nineAdapter.setData(data);
            recyclerView.setAdapter(nineAdapter);
            nineAdapter.setOnHeaderClickListener(((groupedRecyclerViewAdapter, holder, groupPosition) -> {
                if (groupedRecyclerViewAdapter.isExpand(groupPosition)) {
                    groupedRecyclerViewAdapter.collapseGroup(groupPosition);
                } else {
                    groupedRecyclerViewAdapter.expandGroup(groupPosition);
                }
            }));
        }
    }
}
