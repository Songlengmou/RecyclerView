package com.anningtex.recyclerview.activity.six;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.anningtex.recyclerview.R;
import com.anningtex.recyclerview.common.BaseRecycleAdapter;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Administrator
 */
public class SixActivity extends AppCompatActivity {
    @BindView(R.id.rv_six)
    RecyclerView rvSix;

    private BaseRecycleAdapter adapter;
    int[] icons = new int[]{R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1,
            R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1,
            R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1,
            R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1,
            R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1,
            R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1, R.mipmap.test1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        ButterKnife.bind(this);
        setTitle("Six");
        initView();
    }

    private void initView() {
        List<SixBean> list = new ArrayList();
        //随机高度集合
        List<Integer> mHeight = new ArrayList<>();

        for (int i = 0; i < icons.length; i++) {
            list.add(new SixBean(icons[i], (i + 1) + ""));
            mHeight.add((int) (100 + Math.random() * 300));
        }

        rvSix.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        adapter = new BaseRecycleAdapter(R.layout.item_six, list);
        rvSix.setAdapter(adapter);

        adapter.setOnDataToViewListener((BaseRecycleAdapter.OnDataToViewListener<SixBean>) (helper, bean, position) -> {
            ImageView mIvSix = helper.getView(R.id.iv_six);
            helper.setText(R.id.tv_data, bean.getName());
            Glide.with(this).load(bean.getPic()).into(mIvSix);
        });
    }
}
