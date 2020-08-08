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
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @Author Song
 * @Desc: json: {"code":1,"msg":"Success","data":{"color":[{"TexID_01":"4","List_QBales":[{"TexID_01":"4","OrderNo":"TR190823K","MetersPerBale":300,"MetersPerBaleUnitID":"1","QBales":24,"TexName_01":"TR","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y"}],"TexType":"IsColor","TexName_01":"TR","List_Details":[{"ColorName":"G20","MetersPerBale":300,"MetersPerBaleUnitID":"1","QBales":24,"MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","QSum":7200}],"total":24,"total_ma":7200,"count":1},{"TexID_01":"8","List_QBales":[{"TexID_01":"8","OrderNo":"TC190523K","MetersPerBale":600,"MetersPerBaleUnitID":"1","QBales":109,"TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y"},{"TexID_01":"8","OrderNo":"TC190905C","MetersPerBale":600,"MetersPerBaleUnitID":"1","QBales":100,"TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y"},{"TexID_01":"8","OrderNo":"TC191007K","MetersPerBale":600,"MetersPerBaleUnitID":"1","QBales":142,"TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y"}],"TexType":"IsColor","TexName_01":"TC45","List_Details":[{"ColorName":"2013","MetersPerBale":20,"MetersPerBaleUnitID":"3","QBales":21,"MetersPerBaleUnitName":"卷","MetersPerBaleUnitNameEN":"r","QSum":420},{"ColorName":"2039","MetersPerBale":20,"MetersPerBaleUnitID":"3","QBales":28,"MetersPerBaleUnitName":"卷","MetersPerBaleUnitNameEN":"r","QSum":560},{"ColorName":"2052","MetersPerBale":20,"MetersPerBaleUnitID":"3","QBales":20,"MetersPerBaleUnitName":"卷","MetersPerBaleUnitNameEN":"r","QSum":400},{"ColorName":"2094","MetersPerBale":20,"MetersPerBaleUnitID":"3","QBales":35,"MetersPerBaleUnitName":"卷","MetersPerBaleUnitNameEN":"r","QSum":700},{"ColorName":"2151","MetersPerBale":20,"MetersPerBaleUnitID":"3","QBales":38,"MetersPerBaleUnitName":"卷","MetersPerBaleUnitNameEN":"r","QSum":760},{"ColorName":"BLACK","MetersPerBale":20,"MetersPerBaleUnitID":"3","QBales":100,"MetersPerBaleUnitName":"卷","MetersPerBaleUnitNameEN":"r","QSum":2000},{"ColorName":"WHITE","MetersPerBale":20,"MetersPerBaleUnitID":"3","QBales":109,"MetersPerBaleUnitName":"卷","MetersPerBaleUnitNameEN":"r","QSum":2180}],"total":351,"total_ma":7020,"count":7}],"flower":[{"TexID_01":"336","List_QBales":[{"TexID_01":"336","OrderNo":"SJ190625A","MetersPerBale":600,"MetersPerBaleUnitID":"1","QBales":60,"TexName_01":"SJ","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","QSum":36000},{"TexID_01":"321","OrderNo":"SJ190831A","MetersPerBale":600,"MetersPerBaleUnitID":"1","QBales":40,"TexName_01":"SJ","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","QSum":24000}],"TexType":"IsFlower","TexName_01":"SJ"}],"item":[{"TexID_01":"505","List_QBales":[{"TexID_01":"505","OrderNo":"BG190510A","MetersPerBale":25,"MetersPerBaleUnitID":"5","QBales":80,"TexName_01":"BG","TexType":"IsItem","MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs"},{"TexID_01":"505","OrderNo":"BG190513A","MetersPerBale":25,"MetersPerBaleUnitID":"5","QBales":10,"TexName_01":"BG","TexType":"IsItem","MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs"},{"TexID_01":"505","OrderNo":"BG190513A","MetersPerBale":20,"MetersPerBaleUnitID":"5","QBales":1,"TexName_01":"BG","TexType":"IsItem","MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs"}],"TexType":"IsItem","TexName_01":"BG","List_Details":[{"BrandID":"6","ItemName":"1613#","ColorName":"BLACK","IsMix":"0","MetersPerBale":25,"MetersPerBaleUnitID":"5","QBales":20,"MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs","BrandName":"PONASOO","QSum":500},{"BrandID":"6","ItemName":"1616#","ColorName":"BLACK","IsMix":"0","MetersPerBale":25,"MetersPerBaleUnitID":"5","QBales":20,"MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs","BrandName":"PONASOO","QSum":500},{"BrandID":"6","ItemName":"1620#","ColorName":"BLACK","IsMix":"0","MetersPerBale":25,"MetersPerBaleUnitID":"5","QBales":20,"MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs","BrandName":"PONASOO","QSum":500},{"BrandID":"6","ItemName":"1622#","ColorName":"BLACK","IsMix":"0","MetersPerBale":25,"MetersPerBaleUnitID":"5","QBales":20,"MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs","BrandName":"PONASOO","QSum":500},{"BrandID":"6","ItemName":"7302#","ColorName":"BLACK","IsMix":"0","MetersPerBale":25,"MetersPerBaleUnitID":"5","QBales":9,"MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs","BrandName":"PONASOO","QSum":225},{"BrandID":"6","ItemName":"7302#","ColorName":"BLACK","IsMix":"0","MetersPerBale":20,"MetersPerBaleUnitID":"5","QBales":1,"MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs","BrandName":"PONASOO","QSum":20},{"BrandID":"6","ItemName":"7302#","ColorName":"BLACK","IsMix":"0","MetersPerBale":22,"MetersPerBaleUnitID":"5","QBales":1,"MetersPerBaleUnitName":"个","MetersPerBaleUnitNameEN":"pcs","BrandName":"PONASOO","QSum":22}],"total":91,"total_ge":2267,"count":7}],"Info":{"ID":"1383","BLNo":"584305638","ContainerNo":"TGBU5392363","ContainerSize":"1×40","LoadDate":"2019-10-21 00:00:00.000","ToCountryName":"肯尼亚","ToPort":"MOMBASA","SealNo":"CN3529828"}}}
 */
public class ContainerReport02Fragment extends Fragment {
    @BindView(R.id.ll_one)
    LinearLayout llOne;
    @BindView(R.id.tv_LoadDate)
    TextView tvLoadDate;
    @BindView(R.id.tv_ToCountryName)
    TextView tvToCountryName;
    @BindView(R.id.rv_xi)
    RecyclerView rvXi;
    @BindView(R.id.tv_null)
    TextView tvNull;

    private Unbinder unbinder;

    private List<ContainerReport02CSBean> mColorBean;
    private List<ContainerReport02CSBean> mFlowerBean;
    private List<ContainerReport02CSBean> mItemBean;
    private List<ContainerReport02CSBean> mBeans;

    private String json = "{\"code\":1,\"msg\":\"Success\",\"data\":{\"color\":[{\"TexID_01\":\"4\",\"List_QBales\":[{\"TexID_01\":\"4\",\"OrderNo\":\"TR190823K\",\"MetersPerBale\":300,\"MetersPerBaleUnitID\":\"1\",\"QBales\":24,\"TexName_01\":\"TR\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\"}],\"TexType\":\"IsColor\",\"TexName_01\":\"TR\",\"List_Details\":[{\"ColorName\":\"G20\",\"MetersPerBale\":300,\"MetersPerBaleUnitID\":\"1\",\"QBales\":24,\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"QSum\":7200}],\"total\":24,\"total_ma\":7200,\"count\":1},{\"TexID_01\":\"8\",\"List_QBales\":[{\"TexID_01\":\"8\",\"OrderNo\":\"TC190523K\",\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"QBales\":109,\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\"},{\"TexID_01\":\"8\",\"OrderNo\":\"TC190905C\",\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"QBales\":100,\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\"},{\"TexID_01\":\"8\",\"OrderNo\":\"TC191007K\",\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"QBales\":142,\"TexName_01\":\"TC45\",\"TexType\":\"IsColor\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\"}],\"TexType\":\"IsColor\",\"TexName_01\":\"TC45\",\"List_Details\":[{\"ColorName\":\"2013\",\"MetersPerBale\":20,\"MetersPerBaleUnitID\":\"3\",\"QBales\":21,\"MetersPerBaleUnitName\":\"卷\",\"MetersPerBaleUnitNameEN\":\"r\",\"QSum\":420},{\"ColorName\":\"2039\",\"MetersPerBale\":20,\"MetersPerBaleUnitID\":\"3\",\"QBales\":28,\"MetersPerBaleUnitName\":\"卷\",\"MetersPerBaleUnitNameEN\":\"r\",\"QSum\":560},{\"ColorName\":\"2052\",\"MetersPerBale\":20,\"MetersPerBaleUnitID\":\"3\",\"QBales\":20,\"MetersPerBaleUnitName\":\"卷\",\"MetersPerBaleUnitNameEN\":\"r\",\"QSum\":400},{\"ColorName\":\"2094\",\"MetersPerBale\":20,\"MetersPerBaleUnitID\":\"3\",\"QBales\":35,\"MetersPerBaleUnitName\":\"卷\",\"MetersPerBaleUnitNameEN\":\"r\",\"QSum\":700},{\"ColorName\":\"2151\",\"MetersPerBale\":20,\"MetersPerBaleUnitID\":\"3\",\"QBales\":38,\"MetersPerBaleUnitName\":\"卷\",\"MetersPerBaleUnitNameEN\":\"r\",\"QSum\":760},{\"ColorName\":\"BLACK\",\"MetersPerBale\":20,\"MetersPerBaleUnitID\":\"3\",\"QBales\":100,\"MetersPerBaleUnitName\":\"卷\",\"MetersPerBaleUnitNameEN\":\"r\",\"QSum\":2000},{\"ColorName\":\"WHITE\",\"MetersPerBale\":20,\"MetersPerBaleUnitID\":\"3\",\"QBales\":109,\"MetersPerBaleUnitName\":\"卷\",\"MetersPerBaleUnitNameEN\":\"r\",\"QSum\":2180}],\"total\":351,\"total_ma\":7020,\"count\":7}],\"flower\":[{\"TexID_01\":\"336\",\"List_QBales\":[{\"TexID_01\":\"336\",\"OrderNo\":\"SJ190625A\",\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"QBales\":60,\"TexName_01\":\"SJ\",\"TexType\":\"IsFlower\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"QSum\":36000},{\"TexID_01\":\"321\",\"OrderNo\":\"SJ190831A\",\"MetersPerBale\":600,\"MetersPerBaleUnitID\":\"1\",\"QBales\":40,\"TexName_01\":\"SJ\",\"TexType\":\"IsFlower\",\"MetersPerBaleUnitName\":\"码\",\"MetersPerBaleUnitNameEN\":\"y\",\"QSum\":24000}],\"TexType\":\"IsFlower\",\"TexName_01\":\"SJ\"}],\"item\":[{\"TexID_01\":\"505\",\"List_QBales\":[{\"TexID_01\":\"505\",\"OrderNo\":\"BG190510A\",\"MetersPerBale\":25,\"MetersPerBaleUnitID\":\"5\",\"QBales\":80,\"TexName_01\":\"BG\",\"TexType\":\"IsItem\",\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\"},{\"TexID_01\":\"505\",\"OrderNo\":\"BG190513A\",\"MetersPerBale\":25,\"MetersPerBaleUnitID\":\"5\",\"QBales\":10,\"TexName_01\":\"BG\",\"TexType\":\"IsItem\",\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\"},{\"TexID_01\":\"505\",\"OrderNo\":\"BG190513A\",\"MetersPerBale\":20,\"MetersPerBaleUnitID\":\"5\",\"QBales\":1,\"TexName_01\":\"BG\",\"TexType\":\"IsItem\",\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\"}],\"TexType\":\"IsItem\",\"TexName_01\":\"BG\",\"List_Details\":[{\"BrandID\":\"6\",\"ItemName\":\"1613#\",\"ColorName\":\"BLACK\",\"IsMix\":\"0\",\"MetersPerBale\":25,\"MetersPerBaleUnitID\":\"5\",\"QBales\":20,\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\",\"BrandName\":\"PONASOO\",\"QSum\":500},{\"BrandID\":\"6\",\"ItemName\":\"1616#\",\"ColorName\":\"BLACK\",\"IsMix\":\"0\",\"MetersPerBale\":25,\"MetersPerBaleUnitID\":\"5\",\"QBales\":20,\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\",\"BrandName\":\"PONASOO\",\"QSum\":500},{\"BrandID\":\"6\",\"ItemName\":\"1620#\",\"ColorName\":\"BLACK\",\"IsMix\":\"0\",\"MetersPerBale\":25,\"MetersPerBaleUnitID\":\"5\",\"QBales\":20,\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\",\"BrandName\":\"PONASOO\",\"QSum\":500},{\"BrandID\":\"6\",\"ItemName\":\"1622#\",\"ColorName\":\"BLACK\",\"IsMix\":\"0\",\"MetersPerBale\":25,\"MetersPerBaleUnitID\":\"5\",\"QBales\":20,\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\",\"BrandName\":\"PONASOO\",\"QSum\":500},{\"BrandID\":\"6\",\"ItemName\":\"7302#\",\"ColorName\":\"BLACK\",\"IsMix\":\"0\",\"MetersPerBale\":25,\"MetersPerBaleUnitID\":\"5\",\"QBales\":9,\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\",\"BrandName\":\"PONASOO\",\"QSum\":225},{\"BrandID\":\"6\",\"ItemName\":\"7302#\",\"ColorName\":\"BLACK\",\"IsMix\":\"0\",\"MetersPerBale\":20,\"MetersPerBaleUnitID\":\"5\",\"QBales\":1,\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\",\"BrandName\":\"PONASOO\",\"QSum\":20},{\"BrandID\":\"6\",\"ItemName\":\"7302#\",\"ColorName\":\"BLACK\",\"IsMix\":\"0\",\"MetersPerBale\":22,\"MetersPerBaleUnitID\":\"5\",\"QBales\":1,\"MetersPerBaleUnitName\":\"个\",\"MetersPerBaleUnitNameEN\":\"pcs\",\"BrandName\":\"PONASOO\",\"QSum\":22}],\"total\":91,\"total_ge\":2267,\"count\":7}],\"Info\":{\"ID\":\"1383\",\"BLNo\":\"584305638\",\"ContainerNo\":\"TGBU5392363\",\"ContainerSize\":\"1×40\",\"LoadDate\":\"2019-10-21 00:00:00.000\",\"ToCountryName\":\"肯尼亚\",\"ToPort\":\"MOMBASA\",\"SealNo\":\"CN3529828\"}}}";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_container_report02, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        ContainerReport02Bean report02Bean = new Gson().fromJson(json, ContainerReport02Bean.class);
        ContainerReport02Bean.DataBean.InfoBean info = report02Bean.getData().getInfo();
        mColorBean = report02Bean.getData().getColor();
        mFlowerBean = report02Bean.getData().getFlower();
        mItemBean = report02Bean.getData().getItem();

        mBeans = new ArrayList<>();
        mBeans.addAll(mColorBean);
        mBeans.addAll(mFlowerBean);
        mBeans.addAll(mItemBean);
        rvXi.setLayoutManager(new LinearLayoutManager(getContext()));
        rvXi.setAdapter(new MyAdapter());
    }

    class MyAdapter extends RecyclerView.Adapter {
        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            switch (viewType) {
                case 0:
                    return new MyVh1(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_xi_color, parent, false));
                case 1:
                    return new MyVh2(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_xi_flower, parent, false));
                case 2:
                    return new MyVh3(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_xi_item, parent, false));
            }
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            ContainerReport02CSBean containerReport02CsBean = mBeans.get(position);
            int itemViewType = getItemViewType(position);
            switch (itemViewType) {
                case 0:
                    MyVh1 myVh1 = (MyVh1) holder;
                    myVh1.setData(containerReport02CsBean, itemViewType);
                    break;
                case 1:
                    MyVh2 myVh2 = (MyVh2) holder;
                    myVh2.setData(containerReport02CsBean, itemViewType);
                    break;
                case 2:
                    MyVh3 myVh3 = (MyVh3) holder;
                    myVh3.setData(containerReport02CsBean, itemViewType);
                    break;
                default:
                    break;
            }
        }

        @Override
        public int getItemCount() {
            return mBeans == null ? 0 : mBeans.size();
        }

        @Override
        public int getItemViewType(int position) {
            switch (mBeans.get(position).getTexType()) {
                case "IsColor":
                    return 0;
                case "IsFlower":
                    return 1;
                case "IsItem":
                    return 2;
                default:
                    break;
            }
            return 0;
        }

        class MyVh1 extends RecyclerView.ViewHolder {
            @BindView(R.id.tv_title)
            TextView tvTitle;
            @BindView(R.id.rv_details)
            RecyclerView rvDetails;
            @BindView(R.id.tv1)
            TextView tv1;
            @BindView(R.id.tv2)
            TextView tv2;
            @BindView(R.id.tv3)
            TextView tv3;
            @BindView(R.id.rv_qbales)
            RecyclerView rvQBales;
            @BindView(R.id.tv4)
            TextView tv4;

            public MyVh1(@NonNull View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }

            private void setData(ContainerReport02CSBean containerReport02CsBean, int itemViewType) {
                tvTitle.setText(containerReport02CsBean.getTexName_01() + "(" + containerReport02CsBean.getTotal() + ")包");
                List<ContainerReport02CSBean.ListQBalesBean> list_qBales = containerReport02CsBean.getList_QBales();
                List<ContainerReport02CSBean.ListDetailsBean> list_details = containerReport02CsBean.getList_Details();
                MyAdapterLeft adapterLeft = new MyAdapterLeft(list_details, itemViewType);
                MyAdapterRight adapterRight = new MyAdapterRight(list_qBales);
                rvDetails.setLayoutManager(new LinearLayoutManager(getContext()));
                rvQBales.setLayoutManager(new LinearLayoutManager(getContext()));
                rvDetails.setAdapter(adapterLeft);
                rvQBales.setAdapter(adapterRight);

                tv2.setText(containerReport02CsBean.getTotal() + "");
                tv3.setText(containerReport02CsBean.getTotal_ma() + "");
                tv4.setText(containerReport02CsBean.getTotal_ma() + "");
            }
        }

        class MyVh2 extends RecyclerView.ViewHolder {
            @BindView(R.id.rv_details)
            RecyclerView rvDetails;
            @BindView(R.id.rv_qbales)
            RecyclerView rvQBales;
            @BindView(R.id.tv_title)
            TextView tvTitle;

            public MyVh2(@NonNull View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }

            private void setData(ContainerReport02CSBean containerReport02CsBean, int itemViewType) {
                tvTitle.setText(containerReport02CsBean.getTexName_01());
                List<ContainerReport02CSBean.ListQBalesBean> list_qBales = containerReport02CsBean.getList_QBales();
                List<ContainerReport02CSBean.ListDetailsBean> list_details = new ArrayList<>();
                for (ContainerReport02CSBean.ListQBalesBean list_qBale : list_qBales) {
                    ContainerReport02CSBean.ListDetailsBean bean = new ContainerReport02CSBean.ListDetailsBean();

                    String orderNo = list_qBale.getOrderNo();
                    int metersPerBale = list_qBale.getMetersPerBale();
                    String unitName = list_qBale.getMetersPerBaleUnitName();
                    int qBales = list_qBale.getQBales();

                    bean.setNewOrderNo(orderNo);
                    bean.setMetersPerBale(metersPerBale);
                    bean.setMetersPerBaleUnitName(unitName);
                    bean.setQBales(qBales);

                    list_details.add(bean);
                }

                MyAdapterLeft adapterLeft = new MyAdapterLeft(list_details, itemViewType);
                MyAdapterRight adapterRight = new MyAdapterRight(list_qBales);
                rvDetails.setLayoutManager(new LinearLayoutManager(getContext()));
                rvQBales.setLayoutManager(new LinearLayoutManager(getContext()));
                rvDetails.setAdapter(adapterLeft);
                rvQBales.setAdapter(adapterRight);
            }
        }

        class MyVh3 extends RecyclerView.ViewHolder {
            @BindView(R.id.rv_details)
            RecyclerView rvDetails;
            @BindView(R.id.rv_qbales)
            RecyclerView rvQBales;
            @BindView(R.id.tv_title)
            TextView tvTitle;
            @BindView(R.id.tv1)
            TextView tv1;
            @BindView(R.id.tv2)
            TextView tv2;
            @BindView(R.id.tv3)
            TextView tv3;

            public MyVh3(@NonNull View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }

            private void setData(ContainerReport02CSBean containerReport02CsBean, int itemViewType) {
                tvTitle.setText(containerReport02CsBean.getTexName_01() + "(" + containerReport02CsBean.getTotal() + ")包");
                List<ContainerReport02CSBean.ListQBalesBean> list_qBales = containerReport02CsBean.getList_QBales();
                List<ContainerReport02CSBean.ListDetailsBean> list_details = containerReport02CsBean.getList_Details();
                MyAdapterLeft adapterLeft = new MyAdapterLeft(list_details, itemViewType);
                MyAdapterRight adapterRight = new MyAdapterRight(list_qBales);
                rvDetails.setLayoutManager(new LinearLayoutManager(getContext()));
                rvQBales.setLayoutManager(new LinearLayoutManager(getContext()));
                rvDetails.setAdapter(adapterLeft);
                rvQBales.setAdapter(adapterRight);

                tv1.setText(containerReport02CsBean.getTotal() + "");
                tv2.setText(containerReport02CsBean.getTotal_ge() + "");
                tv3.setText(containerReport02CsBean.getTotal_ge() + "");
            }
        }
    }

    class MyAdapterLeft extends RecyclerView.Adapter<MyAdapterLeft.MyVh> {
        List<ContainerReport02CSBean.ListDetailsBean> mBeans;
        private int mType;

        public MyAdapterLeft(List<ContainerReport02CSBean.ListDetailsBean> mBeans, int type) {
            this.mBeans = mBeans;
            mType = type;
        }

        @NonNull
        @Override
        public MyVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MyVh(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_xi_left, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MyVh holder, int position) {
            holder.setData(position);
        }

        @Override
        public int getItemCount() {
            return mBeans == null ? 0 : mBeans.size();
        }

        class MyVh extends RecyclerView.ViewHolder {
            @BindView(R.id.tv_1)
            TextView tv1;
            @BindView(R.id.tv_2)
            TextView tv2;
            @BindView(R.id.tv_3)
            TextView tv3;
            @BindView(R.id.tv_4)
            TextView tv4;
            @BindView(R.id.tv_5)
            TextView tv5;

            public MyVh(@NonNull View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }

            private void setData(int position) {
                ContainerReport02CSBean.ListDetailsBean listDetailsBean = mBeans.get(position);
                switch (mType) {
                    case 0:
                        //IsColor
                        tv1.setText(listDetailsBean.getColorName());
                        tv2.setText(listDetailsBean.getQBales() + "");
                        tv3.setText(listDetailsBean.getMetersPerBale() + " " + listDetailsBean.getMetersPerBaleUnitName());

                        tv4.setVisibility(View.GONE);
                        tv5.setVisibility(View.GONE);
                        break;
                    case 1:
                        //IsFlower
                        tv1.setText(listDetailsBean.getNewOrderNo());
                        tv2.setText(listDetailsBean.getQBales() + "");
                        tv3.setText(listDetailsBean.getMetersPerBale() + listDetailsBean.getMetersPerBaleUnitName());

                        tv4.setVisibility(View.GONE);
                        tv5.setVisibility(View.GONE);
                        break;
                    case 2:
                        //IsItem
                        tv1.setText(listDetailsBean.getBrandName());
                        tv2.setText(listDetailsBean.getItemName());
                        tv3.setText(listDetailsBean.getColorName());
                        tv4.setText(listDetailsBean.getQBales() + "");
                        tv5.setText(listDetailsBean.getQSum() + "");

                        tv4.setVisibility(View.VISIBLE);
                        tv5.setVisibility(View.VISIBLE);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    class MyAdapterRight extends RecyclerView.Adapter<MyAdapterRight.MyVh> {
        List<ContainerReport02CSBean.ListQBalesBean> mBeans;

        public MyAdapterRight(List<ContainerReport02CSBean.ListQBalesBean> mBeans) {
            this.mBeans = mBeans;
        }

        @NonNull
        @Override
        public MyVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MyVh(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_xi_right, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MyVh holder, int position) {
            holder.setData(position);
        }

        @Override
        public int getItemCount() {
            return mBeans == null ? 0 : mBeans.size();
        }

        class MyVh extends RecyclerView.ViewHolder {
            @BindView(R.id.tv_remarks)
            TextView tvRemarks;

            public MyVh(@NonNull View itemView) {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }

            private void setData(int position) {
                ContainerReport02CSBean.ListQBalesBean listQBalesBean = mBeans.get(position);
                tvRemarks.setText(listQBalesBean.getOrderNo() + "-" + listQBalesBean.getQBales() + "*" + listQBalesBean.getMetersPerBale() + listQBalesBean.getMetersPerBaleUnitName());
            }
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
