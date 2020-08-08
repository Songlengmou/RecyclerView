package com.anningtex.recyclerview.activity.seven;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anningtex.recyclerview.R;
import com.anningtex.recyclerview.common.BaseRecycleAdapter;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @Author Song
 * @Desc: json: {"code":1,"msg":"Success","data":{"Info_Container":{"ID":"1371","BLNo":"584305619","ContainerNo":"HASU5070898","ContainerSize":"1×40","LoadDate":"2019-10-16 00:00:00.000","ToCountryName":"肯尼亚","ToPort":"MOMBASA","SealNo":"MLCN3475055"},"List_GoodsList":[{"OrderNo":"SJ190827A","TexID_01":"336","QBales":60,"VolumeTotal":"7.32","WeightTotal":6180,"Notes":"冠中发货，花色不齐20包，余仓库","DeliveryNote":"YD-AN191012K","MetersSum":32918.4,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1220","WeightUnit":"103.0000","TexName_01":"SJ","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1220","AWeight":103},{"OrderNo":"AFX190717A","TexID_01":"496","QBales":30,"VolumeTotal":"3.69","WeightTotal":3015,"Notes":"WAXWAX，冠中发货，M,Z转K，余仓库","DeliveryNote":"YD-AN191012B","MetersSum":16459.2,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1230","WeightUnit":"100.5000","TexName_01":"AFX","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1230","AWeight":100.5},{"OrderNo":"MF190611A","TexID_01":"218","QBales":10,"VolumeTotal":"1.00","WeightTotal":720,"Notes":"鸿鑫达发货，余仓库","DeliveryNote":"YD-AN190907D","MetersSum":5486.4,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1000","WeightUnit":"72.0000","TexName_01":"MF","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1000","AWeight":72},{"OrderNo":"BZ190708K","TexID_01":"41","QBales":40,"VolumeTotal":"3.84","WeightTotal":3120,"Notes":"600码，浙江灏宇发货，余仓库","DeliveryNote":"YD-AN190913K","MetersSum":21945.6,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.0960","WeightUnit":"78.0000","TexName_01":"BZ","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.0960","AWeight":78},{"OrderNo":"TC190924K","TexID_01":"8","QBales":90,"VolumeTotal":"11.48","WeightTotal":5760,"Notes":"黑色，凌立发货，安泰报关，余仓库","DeliveryNote":"YD-AN191012G","MetersSum":49377.6,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"64.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":64},{"OrderNo":"TC190911K","TexID_01":"8","QBales":4,"VolumeTotal":"0.51","WeightTotal":252,"Notes":"黑色，凌立发货，本清报关，余仓库","DeliveryNote":"YD-AN190928P","MetersSum":2194.56,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC190924K","TexID_01":"8","QBales":60,"VolumeTotal":"7.65","WeightTotal":3780,"Notes":"黑色，凌立发货，安泰报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":32918.4,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC191012K","TexID_01":"8","QBales":99,"VolumeTotal":"12.62","WeightTotal":6237,"Notes":"黑色，凌立发货，安泰报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":54315.36,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC191007K","TexID_01":"8","QBales":22,"VolumeTotal":"2.81","WeightTotal":1386,"Notes":"凌立发货，本清报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":12070.08,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC190906K","TexID_01":"8","QBales":14,"VolumeTotal":"1.79","WeightTotal":882,"Notes":"凌立发货，本清报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":7680.96,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC190918K","TexID_01":"8","QBales":46,"VolumeTotal":"5.87","WeightTotal":2852,"Notes":"凌立发货，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":25237.44,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"62.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":62}],"volume_sum":58.58,"weight_sum":34184,"qbales_sum":475}}
 */
public class ContainerReport01Fragment extends Fragment {
    @BindView(R.id.rv_schedule)
    RecyclerView rvSchedule;
    @BindView(R.id.ll_one)
    LinearLayout llOne;
    @BindView(R.id.ll_two)
    LinearLayout llTwo;
    @BindView(R.id.tv_null)
    TextView tvNull;
    @BindView(R.id.tv_ContainerSize)
    TextView tvContainerSize;
    @BindView(R.id.tv_LoadDate)
    TextView tvLoadDate;
    @BindView(R.id.tv_ToCountryName)
    TextView tvToCountryName;
    @BindView(R.id.tv_ToPort)
    TextView tvToPort;
    @BindView(R.id.tv_ContainerNo)
    TextView tvContainerNo;
    @BindView(R.id.tv_BLNo)
    TextView tvBLNo;
    @BindView(R.id.tv_SealNo)
    TextView tvSealNo;
    @BindView(R.id.tv_Sum_bales)
    TextView tvSumBales;
    @BindView(R.id.tv_Sum_Volume)
    TextView tvSumVolume;
    @BindView(R.id.tv_Sum_Weight)
    TextView tvSumWeight;

    private Unbinder unbinder;
    private BaseRecycleAdapter baseRecycleAdapter;

    private String json = "{\"code\":1,\"msg\":\"Success\",\"data\":{\"Info_Container\":{\"ID\":\"1371\",\"BLNo\":\"584305619\",\"ContainerNo\":\"HASU5070898\",\"ContainerSize\":\"1×40\",\"LoadDate\":\"2019-10-16 00:00:00.000\",\"ToCountryName\":\"肯尼亚\",\"ToPort\":\"MOMBASA\",\"SealNo\":\"MLCN3475055\"},\"List_GoodsList\":[{\"OrderNo\":\"SJ190827A\",\"TexID_01\":\"336\",\"QBales\":60,\"VolumeTotal\":\"7.32\",\"WeightTotal\":6180,\"Notes\":\"冠中发货，花色不齐20包，余仓库\",\"DeliveryNote\":\"YD-AN191012K\",\"MetersSum\":32918.4,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1220\",\"WeightUnit\":\"103.0000\",\"TexName_01\":\"SJ\",\"TexType\":\"IsFlower\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1220\",\"AWeight\":103},{\"OrderNo\":\"AFX190717A\",\"TexID_01\":\"496\",\"QBales\":30,\"VolumeTotal\":\"3.69\",\"WeightTotal\":3015,\"Notes\":\"WAXWAX，冠中发货，M,Z转K，余仓库\",\"DeliveryNote\":\"YD-AN191012B\",\"MetersSum\":16459.2,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1230\",\"WeightUnit\":\"100.5000\",\"TexName_01\":\"AFX\",\"TexType\":\"IsFlower\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1230\",\"AWeight\":100.5},{\"OrderNo\":\"MF190611A\",\"TexID_01\":\"218\",\"QBales\":10,\"VolumeTotal\":\"1.00\",\"WeightTotal\":720,\"Notes\":\"鸿鑫达发货，余仓库\",\"DeliveryNote\":\"YD-AN190907D\",\"MetersSum\":5486.4,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1000\",\"WeightUnit\":\"72.0000\",\"TexName_01\":\"MF\",\"TexType\":\"IsFlower\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1000\",\"AWeight\":72},{\"OrderNo\":\"BZ190708K\",\"TexID_01\":\"41\",\"QBales\":40,\"VolumeTotal\":\"3.84\",\"WeightTotal\":3120,\"Notes\":\"600码，浙江灏宇发货，余仓库\",\"DeliveryNote\":\"YD-AN190913K\",\"MetersSum\":21945.6,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.0960\",\"WeightUnit\":\"78.0000\",\"TexName_01\":\"BZ\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.0960\",\"AWeight\":78},{\"OrderNo\":\"TC190924K\",\"TexID_01\":\"8\",\"QBales\":90,\"VolumeTotal\":\"11.48\",\"WeightTotal\":5760,\"Notes\":\"黑色，凌立发货，安泰报关，余仓库\",\"DeliveryNote\":\"YD-AN191012G\",\"MetersSum\":49377.6,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1275\",\"WeightUnit\":\"64.0000\",\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1275\",\"AWeight\":64},{\"OrderNo\":\"TC190911K\",\"TexID_01\":\"8\",\"QBales\":4,\"VolumeTotal\":\"0.51\",\"WeightTotal\":252,\"Notes\":\"黑色，凌立发货，本清报关，余仓库\",\"DeliveryNote\":\"YD-AN190928P\",\"MetersSum\":2194.56,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1275\",\"WeightUnit\":\"63.0000\",\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1275\",\"AWeight\":63},{\"OrderNo\":\"TC190924K\",\"TexID_01\":\"8\",\"QBales\":60,\"VolumeTotal\":\"7.65\",\"WeightTotal\":3780,\"Notes\":\"黑色，凌立发货，安泰报关，余仓库\",\"DeliveryNote\":\"YD-AN191019F\",\"MetersSum\":32918.4,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1275\",\"WeightUnit\":\"63.0000\",\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1275\",\"AWeight\":63},{\"OrderNo\":\"TC191012K\",\"TexID_01\":\"8\",\"QBales\":99,\"VolumeTotal\":\"12.62\",\"WeightTotal\":6237,\"Notes\":\"黑色，凌立发货，安泰报关，余仓库\",\"DeliveryNote\":\"YD-AN191019F\",\"MetersSum\":54315.36,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1275\",\"WeightUnit\":\"63.0000\",\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1275\",\"AWeight\":63},{\"OrderNo\":\"TC191007K\",\"TexID_01\":\"8\",\"QBales\":22,\"VolumeTotal\":\"2.81\",\"WeightTotal\":1386,\"Notes\":\"凌立发货，本清报关，余仓库\",\"DeliveryNote\":\"YD-AN191019F\",\"MetersSum\":12070.08,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1275\",\"WeightUnit\":\"63.0000\",\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1275\",\"AWeight\":63},{\"OrderNo\":\"TC190906K\",\"TexID_01\":\"8\",\"QBales\":14,\"VolumeTotal\":\"1.79\",\"WeightTotal\":882,\"Notes\":\"凌立发货，本清报关，余仓库\",\"DeliveryNote\":\"YD-AN191019F\",\"MetersSum\":7680.96,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1275\",\"WeightUnit\":\"63.0000\",\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1275\",\"AWeight\":63},{\"OrderNo\":\"TC190918K\",\"TexID_01\":\"8\",\"QBales\":46,\"VolumeTotal\":\"5.87\",\"WeightTotal\":2852,\"Notes\":\"凌立发货，余仓库\",\"DeliveryNote\":\"YD-AN191019F\",\"MetersSum\":25237.44,\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"VolumeUnit\":\"0.1275\",\"WeightUnit\":\"62.0000\",\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"AVolume\":\"0.1275\",\"AWeight\":62}],\"volume_sum\":58.58,\"weight_sum\":34184,\"qbales_sum\":475}}\n";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_container_report01, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        ContainerReport01Bean report01Bean = new Gson().fromJson(json, ContainerReport01Bean.class);
        ContainerReport01Bean.DataBean data = report01Bean.getData();
        ContainerReport01Bean.DataBean.InfoContainerBean info_container = report01Bean.getData().getInfo_Container();
        List<ContainerReport01Bean.DataBean.ListGoodsListBean> list_goodsList = report01Bean.getData().getList_GoodsList();
        tvContainerSize.setText("箱型: " + info_container.getContainerSize());
        tvLoadDate.setText("装箱日期: " + info_container.getLoadDate());
        tvToCountryName.setText("国别: " + info_container.getToCountryName());
        tvToPort.setText("目的港: " + info_container.getToPort());
        tvContainerNo.setText("集装箱号: " + info_container.getContainerNo());
        tvBLNo.setText("提单号: " + info_container.getBLNo());
        tvSealNo.setText("封签号: " + info_container.getSealNo());

        tvSumBales.setText("总包数: " + data.getQbales_sum() + " 包");
        tvSumVolume.setText("总体积: " + data.getVolume_sum() + " m³");
        tvSumWeight.setText("总重量: " + data.getWeight_sum() + " kg");

        if (list_goodsList != null || list_goodsList.size() != 0) {
            baseRecycleAdapter = new BaseRecycleAdapter(R.layout.item_rv_schedule, list_goodsList);
            rvSchedule.setLayoutManager(new LinearLayoutManager(getContext()));
            rvSchedule.setAdapter(baseRecycleAdapter);

            baseRecycleAdapter.setOnDataToViewListener((helper, item, position) -> {
                ContainerReport01Bean.DataBean.ListGoodsListBean goodsListBean = (ContainerReport01Bean.DataBean.ListGoodsListBean) item;
                helper.setText(R.id.tv_OrderNo, goodsListBean.getOrderNo());
                helper.setText(R.id.tv_TexName, goodsListBean.getTexName_01());
                helper.setText(R.id.tv_QBales, goodsListBean.getQBales() + " 包");
                helper.setText(R.id.tv_MetersPerBale, goodsListBean.getMetersPerBale() + " " + goodsListBean.getMetersPerBaleUnitName());
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }
}
