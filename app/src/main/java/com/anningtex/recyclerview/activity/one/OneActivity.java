package com.anningtex.recyclerview.activity.one;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anningtex.recyclerview.R;
import com.anningtex.recyclerview.utils.DoubleUtil;
import com.anningtex.recyclerview.utils.StringUtils;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cz.msebera.android.httpclient.Header;

/**
 * @author Administrator
 * desc: 原生的 RecyclerView
 */
public class OneActivity extends AppCompatActivity {
    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.tv6)
    TextView tv6;
    @BindView(R.id.tv8)
    TextView tv8;
    @BindView(R.id.rv_report)
    RecyclerView rvReport;

    private OneAdapter adapter;
    private String json = "{\"code\":1,\"msg\":\"Success\",\"data\":[{\"CurrencyID\":\"2\",\"CurrencyName\":\"UGX\",\"Credit\":66882000,\"Date\":\"2013-11-30\",\"List_Details\":[{\"PCID\":\"24428\",\"SellDate\":\"2013-12-03\",\"TexID\":\"73\",\"TexNumber\":\"2400.0000\",\"UnitID\":\"1\",\"SellMoney\":\"8700000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"2\",\"TexID_01\":\"73\",\"TexName_Show\":\"AN\",\"UnitName\":\"码\"},{\"PCID\":\"24441\",\"SellDate\":\"2013-12-03\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"10000000.0000\",\"IsUSD\":\"2\"},{\"PCID\":\"24472\",\"SellDate\":\"2013-12-05\",\"TexID\":\"25\",\"TexNumber\":\"1200.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2500000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"2\",\"TexID_01\":\"25\",\"TexName_Show\":\"YG\",\"UnitName\":\"码\"},{\"PCID\":\"24473\",\"SellDate\":\"2013-12-05\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"6000000.0000\",\"IsUSD\":\"2\"},{\"PCID\":\"24537\",\"SellDate\":\"2013-12-07\",\"TexID\":\"69\",\"TexNumber\":\"1200.0000\",\"UnitID\":\"1\",\"SellMoney\":\"5200000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"2\",\"TexID_01\":\"69\",\"TexName_Show\":\"烫金真蜡\",\"UnitName\":\"码\"},{\"PCID\":\"24579\",\"SellDate\":\"2013-12-09\",\"TexID\":\"73\",\"TexNumber\":\"600.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2175000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"2\",\"TexID_01\":\"73\",\"TexName_Show\":\"AN\",\"UnitName\":\"码\"},{\"PCID\":\"24584\",\"SellDate\":\"2013-12-09\",\"TexID\":\"69\",\"TexNumber\":\"600.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2600000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"2\",\"TexID_01\":\"69\",\"TexName_Show\":\"烫金真蜡\",\"UnitName\":\"码\"},{\"PCID\":\"24595\",\"SellDate\":\"2013-12-09\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"8000000.0000\",\"IsUSD\":\"2\"},{\"PCID\":\"24618\",\"SellDate\":\"2013-12-10\",\"TexID\":\"73\",\"TexNumber\":\"1800.0000\",\"UnitID\":\"1\",\"SellMoney\":\"6525000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"2\",\"TexID_01\":\"73\",\"TexName_Show\":\"AN\",\"UnitName\":\"码\"},{\"PCID\":\"24620\",\"SellDate\":\"2013-12-10\",\"TexID\":\"43\",\"TexNumber\":\"600.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2400000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"2\",\"TexID_01\":\"43\",\"TexName_Show\":\"SU\",\"UnitName\":\"码\"},{\"PCID\":\"24636\",\"SellDate\":\"2013-12-10\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"10000000.0000\",\"IsUSD\":\"2\"}]},{\"CurrencyID\":\"5\",\"CurrencyName\":\"USD\",\"List_Details\":[{\"PCID\":\"24659\",\"SellDate\":\"2013-12-11\",\"TexID\":\"73\",\"TexNumber\":\"1200.0000\",\"UnitID\":\"1\",\"SellMoney\":\"4350000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"73\",\"TexName_Show\":\"AN\",\"UnitName\":\"码\"},{\"PCID\":\"24662\",\"SellDate\":\"2013-12-11\",\"TexID\":\"69\",\"TexNumber\":\"1200.0000\",\"UnitID\":\"1\",\"SellMoney\":\"5200000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"69\",\"TexName_Show\":\"烫金真蜡\",\"UnitName\":\"码\"},{\"PCID\":\"24678\",\"SellDate\":\"2013-12-11\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"6000000.0000\",\"IsUSD\":\"5\"},{\"PCID\":\"24691\",\"SellDate\":\"2013-12-12\",\"TexID\":\"73\",\"TexNumber\":\"1200.0000\",\"UnitID\":\"1\",\"SellMoney\":\"4350000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"73\",\"TexName_Show\":\"AN\",\"UnitName\":\"码\"},{\"PCID\":\"24696\",\"SellDate\":\"2013-12-12\",\"TexID\":\"38\",\"TexNumber\":\"900.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2625000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"38\",\"TexName_Show\":\"仿蜡布\",\"UnitName\":\"码\"},{\"PCID\":\"24716\",\"SellDate\":\"2013-12-12\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"8000000.0000\",\"IsUSD\":\"5\"},{\"PCID\":\"24731\",\"SellDate\":\"2013-12-13\",\"TexID\":\"73\",\"TexNumber\":\"588.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2131000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"73\",\"TexName_Show\":\"AN\",\"UnitName\":\"码\"},{\"PCID\":\"24733\",\"SellDate\":\"2013-12-13\",\"TexID\":\"69\",\"TexNumber\":\"600.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2600000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"69\",\"TexName_Show\":\"烫金真蜡\",\"UnitName\":\"码\"},{\"PCID\":\"24754\",\"SellDate\":\"2013-12-13\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"5000000.0000\",\"IsUSD\":\"5\"},{\"PCID\":\"24797\",\"SellDate\":\"2013-12-16\",\"TexID\":\"73\",\"TexNumber\":\"600.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2150000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"73\",\"TexName_Show\":\"AN\",\"UnitName\":\"码\"},{\"PCID\":\"24798\",\"SellDate\":\"2013-12-16\",\"TexID\":\"38\",\"TexNumber\":\"900.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2625000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"38\",\"TexName_Show\":\"仿蜡布\",\"UnitName\":\"码\"},{\"PCID\":\"24802\",\"SellDate\":\"2013-12-16\",\"TexID\":\"69\",\"TexNumber\":\"600.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2600000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"69\",\"TexName_Show\":\"烫金真蜡\",\"UnitName\":\"码\"},{\"PCID\":\"24814\",\"SellDate\":\"2013-12-16\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"7000000.0000\",\"IsUSD\":\"5\"},{\"PCID\":\"24853\",\"SellDate\":\"2013-12-17\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"5000000.0000\",\"IsUSD\":\"5\"},{\"PCID\":\"24906\",\"SellDate\":\"2013-12-19\",\"TexID\":\"25\",\"TexNumber\":\"1200.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2500000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"25\",\"TexName_Show\":\"YG\",\"UnitName\":\"码\"},{\"PCID\":\"24913\",\"SellDate\":\"2013-12-19\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"5000000.0000\",\"IsUSD\":\"5\"},{\"PCID\":\"24973\",\"SellDate\":\"2013-12-21\",\"TexID\":\"25\",\"TexNumber\":\"1200.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2500000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"25\",\"TexName_Show\":\"YG\",\"UnitName\":\"码\"},{\"PCID\":\"24977\",\"SellDate\":\"2013-12-21\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"5000000.0000\",\"IsUSD\":\"5\"},{\"PCID\":\"24987\",\"SellDate\":\"2013-12-23\",\"TexID\":\"43\",\"TexNumber\":\"600.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2400000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"43\",\"TexName_Show\":\"SU\",\"UnitName\":\"码\"},{\"PCID\":\"24993\",\"SellDate\":\"2013-12-23\",\"TexID\":\"25\",\"TexNumber\":\"1200.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2500000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"25\",\"TexName_Show\":\"YG\",\"UnitName\":\"码\"},{\"PCID\":\"24994\",\"SellDate\":\"2013-12-23\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"9000000.0000\",\"IsUSD\":\"5\"},{\"PCID\":\"25062\",\"SellDate\":\"2013-12-30\",\"TexID\":\"38\",\"TexNumber\":\"900.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2625000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"38\",\"TexName_Show\":\"仿蜡布\",\"UnitName\":\"码\"},{\"PCID\":\"25065\",\"SellDate\":\"2013-12-30\",\"TexID\":\"43\",\"TexNumber\":\"600.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2400000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"43\",\"TexName_Show\":\"SU\",\"UnitName\":\"码\"},{\"PCID\":\"25079\",\"SellDate\":\"2013-12-30\",\"TexID\":\"0\",\"TexNumber\":\"0.0000\",\"UnitID\":\"0\",\"SellMoney\":\"0.0000\",\"ReceiveMoney\":\"5000000.0000\",\"IsUSD\":\"5\"},{\"PCID\":\"25102\",\"SellDate\":\"2013-12-31\",\"TexID\":\"25\",\"TexNumber\":\"1200.0000\",\"UnitID\":\"1\",\"SellMoney\":\"2500000.0000\",\"ReceiveMoney\":\"0.0000\",\"IsUSD\":\"5\",\"TexID_01\":\"25\",\"TexName_Show\":\"YG\",\"UnitName\":\"码\"}]}]}\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        ButterKnife.bind(this);
        setTitle("One");

        data();
        if (rvReport != null) {
            rvReport.setLayoutManager(new LinearLayoutManager(this));
        } else {
            Log.e("TAG", "rvReport is null");
        }
    }

    private void data() {
        OneBean OneBean = new Gson().fromJson(json, OneBean.class);
        List<OneBean.DataBean> data = OneBean.getData();
        Log.e("TAG", data.size() + "");

        runOnUiThread(() -> {
            for (OneBean.DataBean datum : data) {
                adapter = new OneAdapter();
                adapter.mDate = datum.getDate();
                adapter.mCredit = datum.getCredit();
                adapter.mCurrencyName = datum.getCurrencyName();
                adapter.setBeans(datum.getList_Details());
                rvReport.setAdapter(adapter);
                total(datum.getList_Details());
            }
        });
    }

    private void total(List<OneBean.DataBean.ListDetailsBean> list_details) {
        try {
            double sell = 0;
            double rec = 0;

            for (OneBean.DataBean.ListDetailsBean list_detail : list_details) {
                String sellMoney = list_detail.getSellMoney();
                String receiveMoney = list_detail.getReceiveMoney();

                if (sellMoney != null && !sellMoney.isEmpty()) {
                    double dmoney = Double.parseDouble(sellMoney);
                    dmoney = DoubleUtil.mul(dmoney, 0.001d);
                    sell = DoubleUtil.add(sell, dmoney);
                }

                if (receiveMoney != null && !receiveMoney.isEmpty()) {
                    double dmoney = Double.parseDouble(receiveMoney);
                    dmoney = DoubleUtil.mul(dmoney, 0.001d);
                    rec = DoubleUtil.add(rec, dmoney);
                }
            }
            tv1.setText("总计");
            tv6.setText(StringUtils.addComma(StringUtils.formatFloatNumber1(Double.parseDouble(DoubleUtil.getDoubleString(DoubleUtil.mul(sell, 1000d))))));
            tv8.setText(StringUtils.addComma(StringUtils.formatFloatNumber1(Double.parseDouble(DoubleUtil.getDoubleString(DoubleUtil.mul(rec, 1000d))))));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
