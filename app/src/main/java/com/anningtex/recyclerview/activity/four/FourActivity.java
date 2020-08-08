package com.anningtex.recyclerview.activity.four;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
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

/**
 * @author Administrator
 */
public class FourActivity extends AppCompatActivity {
    @BindView(R.id.rv_four)
    RecyclerView mRvFour;

    private BaseRecycleAdapter mBaseRecycleAdapter;
    private String json = "{\"code\":1,\"msg\":\"Success\",\"data\":[{\"id\":\"109\",\"load_date\":\"2020-05-08\",\"supplier_delivery_no\":\"YD-AN200509D\",\"is_delivery\":\"1\",\"is_deliver_status\":\"运输中\",\"deliver_list_detail\":[{\"delivery_id\":\"109\",\"order_no\":\"AFX190618A\",\"supplier_id\":\"251\",\"bales_quantity\":80,\"meters_per_bale\":600,\"meters_per_bale_unit_id\":\"1\",\"notes\":\"\",\"supplier_delivery_no\":\"YD-AN200509D\",\"warehouse_count\":11,\"checked\":1,\"supplier_name\":\"临清三和纺织集团有限公司\",\"meters_per_bale_unit_name_en\":\"y\"},{\"delivery_id\":\"109\",\"order_no\":\"AN190521A\",\"supplier_id\":\"251\",\"bales_quantity\":5,\"meters_per_bale\":600,\"meters_per_bale_unit_id\":\"1\",\"notes\":\"\",\"supplier_delivery_no\":\"YD-AN200509D\",\"warehouse_count\":5,\"checked\":1,\"supplier_name\":\"临清三和纺织集团有限公司\",\"meters_per_bale_unit_name_en\":\"y\"},{\"delivery_id\":\"109\",\"order_no\":\"IB190121A\",\"supplier_id\":\"251\",\"bales_quantity\":44,\"meters_per_bale\":600,\"meters_per_bale_unit_id\":\"1\",\"notes\":\"\",\"supplier_delivery_no\":\"YD-AN200509D\",\"warehouse_count\":7,\"checked\":1,\"supplier_name\":\"临清三和纺织集团有限公司\",\"meters_per_bale_unit_name_en\":\"y\"},{\"delivery_id\":\"109\",\"order_no\":\"IB190329A\",\"supplier_id\":\"251\",\"bales_quantity\":8,\"meters_per_bale\":600,\"meters_per_bale_unit_id\":\"1\",\"notes\":\"\",\"supplier_delivery_no\":\"YD-AN200509D\",\"warehouse_count\":4,\"checked\":1,\"supplier_name\":\"临清三和纺织集团有限公司\",\"meters_per_bale_unit_name_en\":\"y\"}],\"order_no_list\":[\"AFX190618A\",\"AN190521A\",\"IB190121A\",\"IB190329A\"],\"supplier_name_list\":[\"临清三和纺织集团有限公司\"]},{\"id\":\"106\",\"load_date\":\"2020-05-07\",\"supplier_delivery_no\":\"YD-AN200509A\",\"is_delivery\":\"1\",\"is_deliver_status\":\"运输中\",\"deliver_list_detail\":[{\"delivery_id\":\"106\",\"order_no\":\"AN180329A\",\"supplier_id\":\"251\",\"bales_quantity\":20,\"meters_per_bale\":600,\"meters_per_bale_unit_id\":\"1\",\"notes\":\"\",\"supplier_delivery_no\":\"YD-AN200509A\",\"warehouse_count\":9,\"checked\":1,\"supplier_name\":\"临清三和纺织集团有限公司\",\"meters_per_bale_unit_name_en\":\"y\"},{\"delivery_id\":\"106\",\"order_no\":\"SJ190716A\",\"supplier_id\":\"251\",\"bales_quantity\":3,\"meters_per_bale\":600,\"meters_per_bale_unit_id\":\"1\",\"notes\":\"\",\"supplier_delivery_no\":\"YD-AN200509A\",\"warehouse_count\":35,\"checked\":1,\"supplier_name\":\"临清三和纺织集团有限公司\",\"meters_per_bale_unit_name_en\":\"y\"},{\"delivery_id\":\"106\",\"order_no\":\"SJ190724M\",\"supplier_id\":\"251\",\"bales_quantity\":3,\"meters_per_bale\":600,\"meters_per_bale_unit_id\":\"1\",\"notes\":\"\",\"supplier_delivery_no\":\"YD-AN200509A\",\"warehouse_count\":0,\"checked\":1,\"supplier_name\":\"临清三和纺织集团有限公司\",\"meters_per_bale_unit_name_en\":\"y\"},{\"delivery_id\":\"106\",\"order_no\":\"SJ191003A\",\"supplier_id\":\"251\",\"bales_quantity\":10,\"meters_per_bale\":600,\"meters_per_bale_unit_id\":\"1\",\"notes\":\"\",\"supplier_delivery_no\":\"YD-AN200509A\",\"warehouse_count\":10,\"checked\":0,\"supplier_name\":\"临清三和纺织集团有限公司\",\"meters_per_bale_unit_name_en\":\"y\"}],\"order_no_list\":[\"AN180329A\",\"SJ190716A\",\"SJ190724M\",\"SJ191003A\"],\"supplier_name_list\":[\"临清三和纺织集团有限公司\"]}]}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        ButterKnife.bind(this);
        setTitle("Four");
        initView();
    }

    private void initView() {
        FourBean fourBean = new Gson().fromJson(json, FourBean.class);
        List<FourBean.DataBean> data = fourBean.getData();
        Log.e("TAG", data.size() + "");

        mBaseRecycleAdapter = new BaseRecycleAdapter(R.layout.item_four, data);
        mRvFour.setLayoutManager(new LinearLayoutManager(FourActivity.this));
        mRvFour.setAdapter(mBaseRecycleAdapter);

        mBaseRecycleAdapter.setOnDataToViewListener((BaseRecycleAdapter.OnDataToViewListener<FourBean.DataBean>) (helper, item, position) -> {
            helper.setText(R.id.deliveryNo, item.getSupplier_delivery_no());

            //------------
            TextView name = helper.getView(R.id.name);
            TextView order = helper.getView(R.id.orderNo);
            List<String> orderNoList = item.getOrder_no_list();
            List<String> supplierNameList = item.getSupplier_name_list();
            String tempOrder = "";
            String tempName = "";
            for (int i = 0; i < orderNoList.size(); i++) {
                tempOrder += orderNoList.get(i) + " , ";
            }

            for (int i = 0; i < supplierNameList.size(); i++) {
                tempName += supplierNameList.get(i);
            }

            if (TextUtils.isEmpty(tempOrder)) {
                order.setVisibility(View.GONE);
            } else {
                order.setVisibility(View.VISIBLE);
                order.setText(tempOrder);
            }

            if (TextUtils.isEmpty(tempName)) {
                name.setVisibility(View.GONE);
            } else {
                name.setVisibility(View.VISIBLE);
                name.setText(tempName);
            }

            //------------
            List<FourBean.DataBean.DeliverListDetailBean> listDetail = item.getDeliver_list_detail();

            String wCount = "";
            for (int i = 0; i < listDetail.size(); i++) {
                wCount += listDetail.get(i).getWarehouse_count() + " , ";
            }

            helper.setText(R.id.warehouse_count, wCount + "");
        });
    }
}