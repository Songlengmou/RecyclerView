package com.anningtex.recyclerview.activity.eleven;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anningtex.recyclerview.R;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Song
 * @desc:伸缩与Recycle
 */
public class ElevenActivity extends AppCompatActivity {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private String json = "{\"code\":1,\"msg\":\"Success\",\"data\":{\"ID\":\"81\",\"PIID\":\"81\",\"BvCode\":\"BV2019264087\",\"LoadDate\":\"2020-09-08\",\"FromPort\":\"Kampala\",\"ToCountryID\":\"1\",\"ToPort\":\"Ishasha\",\"ClearBorder\":\"Ishasha\",\"DeliveryNo\":\"AOCG20191102-9\",\"PlateNo\":\"123456\",\"Driver\":\"kyrie\",\"PhoneNo\":\"15209891396\",\"Notes\":\"ok\",\"VolumeTotal\":\"2.0069\",\"WeightTotal\":\"1530.5\",\"QBalesTotal\":\"17\",\"PackingList\":[{\"TexName_Show\":\"TR\",\"OrderList\":[{\"PIGLID\":1369,\"PIID\":\"81\",\"BGLID\":\"1102\",\"QBales\":3,\"InDate\":\"2020-09-15\",\"BLNo\":\"584305620\",\"ContainerNo\":\"MRSU3660766\",\"OrderNo\":\"TR190828A\",\"VolumeUnit\":\"0.1100\",\"WeightUnit\":\"79.0000\",\"MetersPerBale\":\"297.0000\",\"MetersPerBaleUnitID\":\"1\",\"TexID_01\":\"4\",\"TexType\":\"IsColor\",\"TexName_Show\":\"TR\",\"UnitName\":\"码\",\"UnitNameEN\":\"y\"}]},{\"TexName_Show\":\"SJ\",\"OrderList\":[{\"PIGLID\":1363,\"PIID\":\"81\",\"BGLID\":\"1106\",\"QBales\":2,\"InDate\":\"2020-09-16\",\"BLNo\":\"584305600\",\"ContainerNo\":\"MRKU8865128\",\"OrderNo\":\"SJ190803A\",\"VolumeUnit\":\"0.1217\",\"WeightUnit\":\"103.0000\",\"MetersPerBale\":\"600.0000\",\"MetersPerBaleUnitID\":\"1\",\"TexID_01\":\"336\",\"TexType\":\"IsFlower\",\"TexName_Show\":\"SJ\",\"UnitName\":\"码\",\"UnitNameEN\":\"y\"}]},{\"TexName_Show\":\"AN\",\"OrderList\":[{\"PIGLID\":1361,\"PIID\":\"81\",\"BGLID\":\"6\",\"QBales\":5,\"InDate\":\"2018-08-29\",\"BLNo\":\"588007878\",\"ContainerNo\":\"MRKU7857257\",\"OrderNo\":\"AN170530A\",\"VolumeUnit\":\"0.1217\",\"WeightUnit\":\"91.0000\",\"MetersPerBale\":\"600.0000\",\"MetersPerBaleUnitID\":\"1\",\"TexID_01\":\"73\",\"TexType\":\"IsFlower\",\"TexName_Show\":\"AN\",\"UnitName\":\"码\",\"UnitNameEN\":\"y\"},{\"PIGLID\":1371,\"PIID\":\"81\",\"BGLID\":\"5\",\"QBales\":5,\"InDate\":\"2018-08-29\",\"BLNo\":\"588007878\",\"ContainerNo\":\"MRKU7857257\",\"OrderNo\":\"AN170529A\",\"VolumeUnit\":\"0.1250\",\"WeightUnit\":\"98.5000\",\"MetersPerBale\":\"600.0000\",\"MetersPerBaleUnitID\":\"1\",\"TexID_01\":\"73\",\"TexType\":\"IsFlower\",\"TexName_Show\":\"AN\",\"UnitName\":\"码\",\"UnitNameEN\":\"y\"}]},{\"TexName_Show\":\"MF\",\"OrderList\":[{\"PIGLID\":1448,\"PIID\":\"81\",\"BGLID\":\"529\",\"QBales\":2,\"InDate\":\"2019-07-06\",\"BLNo\":\"585759171\",\"ContainerNo\":\"MRKU7261123\",\"OrderNo\":\"MF190214A\",\"VolumeUnit\":\"0.1000\",\"WeightUnit\":\"70.0000\",\"MetersPerBale\":\"600.0000\",\"MetersPerBaleUnitID\":\"1\",\"TexID_01\":\"218\",\"TexType\":\"IsFlower\",\"TexName_Show\":\"MF\",\"UnitName\":\"码\",\"UnitNameEN\":\"y\"}]}]}}";
    private ElevenAdapter mElevenAdapter;
    private TextView tvBV, tvLoadDate, tvDeliveryNo, tvDriver, tvFromPort, tvToPort, tvVolumeTotal, tvWeightTotal, tvQBalesTotal;
    private ElevenBean elevenBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);
        ButterKnife.bind(this);
        setTitle("Eleven");
        initRecycler();
    }

    private void initRecycler() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mElevenAdapter = new ElevenAdapter();
        recyclerView.setAdapter(mElevenAdapter);

        View view = getLayoutInflater().inflate(R.layout.eleven_header, recyclerView, false);
        mElevenAdapter.addHeaderView(view);
        tvBV = view.findViewById(R.id.tv_BV);
        tvLoadDate = view.findViewById(R.id.tv_load_date);
        tvDeliveryNo = view.findViewById(R.id.tv_delivery_no);
        tvDriver = view.findViewById(R.id.tv_driver);
        tvFromPort = view.findViewById(R.id.tv_from_port);
        tvToPort = view.findViewById(R.id.tv_to_port);
        tvVolumeTotal = view.findViewById(R.id.tv_volume_total);
        tvWeightTotal = view.findViewById(R.id.tv_weight_total);
        tvQBalesTotal = view.findViewById(R.id.tv_q_bales_total);
        getListData();
    }

    private void getListData() {
        List<BaseNode> list = new ArrayList<>();
        elevenBean = new Gson().fromJson(json, ElevenBean.class);
        ElevenBean.DataBean data = elevenBean.getData();
        if (data != null) {
            List<ElevenBean.DataBean.PackingListBean> packingList = data.getPackingList();
            for (ElevenBean.DataBean.PackingListBean packingListBean : packingList) {
                ElevenParentNodeBean elevenParentNodeBean = new ElevenParentNodeBean();
                //1.parent
                elevenParentNodeBean.setTitle(packingListBean.getTexName_Show());
                //2.child
                List<BaseNode> packingOrders = new ArrayList<>();
                List<ElevenBean.DataBean.PackingListBean.OrderListBean> orderList = packingListBean.getOrderList();
                if (orderList != null && orderList.size() > 0) {
                    for (ElevenBean.DataBean.PackingListBean.OrderListBean orderListBean : orderList) {
                        ElevenChildNodeBean elevenChildNodeBean = new ElevenChildNodeBean();
                        elevenChildNodeBean.setBGLID(orderListBean.getBGLID());
                        elevenChildNodeBean.setContainerNo(orderListBean.getContainerNo());
                        elevenChildNodeBean.setBLNo(orderListBean.getBLNo());
                        elevenChildNodeBean.setInDate(orderListBean.getInDate());
                        elevenChildNodeBean.setOrderNo(orderListBean.getOrderNo());
                        elevenChildNodeBean.setQBales(orderListBean.getQBales());
                        elevenChildNodeBean.setMetersPerBale(orderListBean.getMetersPerBale());
                        elevenChildNodeBean.setVolumeUnit(orderListBean.getVolumeUnit());
                        elevenChildNodeBean.setWeightUnit(orderListBean.getWeightUnit());
                        elevenChildNodeBean.setUnitName(orderListBean.getUnitName());
                        elevenChildNodeBean.setUnitNameEN(orderListBean.getUnitNameEN());
                        elevenChildNodeBean.setWeightUnit(orderListBean.getWeightUnit());
                        elevenChildNodeBean.setWeightUnit(orderListBean.getWeightUnit());
                        packingOrders.add(elevenChildNodeBean);
                    }
                }
                elevenParentNodeBean.setChildNode(packingOrders);
                list.add(elevenParentNodeBean);
            }
            setPacking(list, data);
            Log.e("TAG", "list : " + list.size());
        }
    }

    public void setPacking(List<BaseNode> list, ElevenBean.DataBean packingListEntity) {
        tvBV.setText(packingListEntity.getBvCode());
        tvLoadDate.setText(packingListEntity.getLoadDate());
        tvDeliveryNo.setText(packingListEntity.getDeliveryNo());
        tvFromPort.setText(packingListEntity.getFromPort());
        tvToPort.setText(packingListEntity.getToPort() + " ( " + packingListEntity.getClearBorder() + " )");
        tvVolumeTotal.setText(packingListEntity.getVolumeTotal());
        tvWeightTotal.setText(packingListEntity.getWeightTotal());
        tvQBalesTotal.setText(packingListEntity.getQBalesTotal());
        mElevenAdapter.setNewData(list);
    }
}