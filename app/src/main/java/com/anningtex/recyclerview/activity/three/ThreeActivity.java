package com.anningtex.recyclerview.activity.three;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anningtex.recyclerview.R;
import com.anningtex.recyclerview.common.BaseRecycleAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lombok.Data;

/**
 * @author Administrator
 * desc: 单纯的使用 BaseRecycleAdapter
 */
public class ThreeActivity extends AppCompatActivity {
    @BindView(R.id.rv_three)
    RecyclerView rvThree;

    private BaseRecycleAdapter adapter;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        ButterKnife.bind(this);
        setTitle("Three");
        initView();
    }

    private void initView() {
        List<String> data = new ArrayList<>();
        for (int i = 0; data.size() < 10; i++) {
            data.add(i + "");
        }

        Box<String> name = new Box<>("SL");

        adapter = new BaseRecycleAdapter(R.layout.item_three, data);
        rvThree.setLayoutManager(new LinearLayoutManager(ThreeActivity.this));
        rvThree.setAdapter(adapter);

        adapter.setOnDataToViewListener((helper, item, positions) -> {
            int position = helper.getLayoutPosition();

            TextView tvOne = helper.getView(R.id.tv_one);
            TextView tvTwo = helper.getView(R.id.tv_two);
            TextView tvMoney = helper.getView(R.id.tv_money);
            TextView tvJin = helper.getView(R.id.tv_jin);

            for (int i = 0; i < data.size(); i++) {
                str = data.set(i, "12,456.00");
            }

            tvOne.setText(++position + "");
            tvTwo.setText(name.getClientName());
            tvMoney.setText("88,886,666.886");
            tvJin.setText(str);
        });
    }

    @Data
    class Box<T> {
        private String clientName;

        public Box(String clientName) {
            this.clientName = clientName;
        }
    }
}
