package com.anningtex.recyclerview.activity.eight;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anningtex.recyclerview.R;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Administrator
 * desc:
 */
public class EightActivity extends AppCompatActivity {
    @BindView(R.id.recycler)
    RecyclerView mRecycler;

    private CommonAdapter<String> mCommonAdapter;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        ButterKnife.bind(this);
        setTitle("Eight");
        initView();
    }

    private void initView() {
        list = initData();

        mRecycler.setLayoutManager(new LinearLayoutManager(EightActivity.this));
        mCommonAdapter = new CommonAdapter<String>(this, R.layout.item_eight, list) {
            @Override
            protected void convert(ViewHolder holder, String s, int position) {
                holder.setText(R.id.tv, s);

                holder.setOnClickListener(R.id.tv, v -> Toast.makeText(EightActivity.this, "我被点击了！", Toast.LENGTH_SHORT).show());

                holder.setOnLongClickListener(R.id.tv, v -> {
                    Toast.makeText(EightActivity.this, "我被长按了！", Toast.LENGTH_SHORT).show();
                    return false;
                });
            }
        };

        mRecycler.setAdapter(mCommonAdapter);
    }

    private List<String> initData() {
        for (int i = 0; i < 100; i++) {
            list.add("第" + i + "个数据");
        }
        return list;
    }
}