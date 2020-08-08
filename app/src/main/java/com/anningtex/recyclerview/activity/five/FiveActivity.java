package com.anningtex.recyclerview.activity.five;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
public class FiveActivity extends AppCompatActivity {
    @BindView(R.id.rv_five)
    RecyclerView mRvFive;

    private BaseRecycleAdapter adapter;
    private int[] icons = new int[]{R.mipmap.one, R.mipmap.two, R.mipmap.three, R.mipmap.four, R.mipmap.five, R.mipmap.six, R.mipmap.seven, R.mipmap.eight};
    private String[] name = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        ButterKnife.bind(this);
        setTitle("Five");

        mRvFive.setLayoutManager(new GridLayoutManager(this, 4));
        mRvFive.addItemDecoration(new MyDecor(this, RecyclerView.VERTICAL));

        List<FiveBean> list = new ArrayList<>();
//        list.add(new FiveBean(R.mipmap.one, "1"));
//        list.add(new FiveBean(R.mipmap.two, "2"));
//        list.add(new FiveBean(R.mipmap.three, "3"));
//        list.add(new FiveBean(R.mipmap.four, "4"));
//        list.add(new FiveBean(R.mipmap.five, "5"));
//        list.add(new FiveBean(R.mipmap.six, "6"));
//        list.add(new FiveBean(R.mipmap.seven, "7"));
//        list.add(new FiveBean(R.mipmap.eight, "8"));

        for (int i = 0; i < icons.length; i++) {
            list.add(new FiveBean(icons[i], name[i]));
        }

        adapter = new BaseRecycleAdapter(R.layout.item_five, list);
        mRvFive.setAdapter(adapter);

        FiveBean target = new FiveBean(R.mipmap.four, "four");
        Log.e("TAG", list.contains(target) + "");
        if (list.contains(target)) {
            list.remove(target);
        }

        adapter.setOnDataToViewListener((BaseRecycleAdapter.OnDataToViewListener<FiveBean>) (helper, bean, position) -> {
            ImageView mIvFive = helper.getView(R.id.iv_five);
            helper.setText(R.id.tv_data, bean.getName());
            Glide.with(this).load(bean.getImPic()).into(mIvFive);
        });

        adapter.setOnItemClickListener((adapter, view, position) -> {
            List<FiveBean> list1 = adapter.getData();
            int index = 0;
            for (int i = 0; i < name.length; i++) {
                if (list1.get(position).getName().equals(name[i])) {
                    Toast.makeText(FiveActivity.this, list1.get(position).getName(), Toast.LENGTH_SHORT).show();
                    index = i;
                    break;
                }
            }

            switch (index) {
                case 0:
                    Toast.makeText(FiveActivity.this, "1", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Toast.makeText(FiveActivity.this, "2", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Toast.makeText(FiveActivity.this, "3", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Toast.makeText(FiveActivity.this, "4", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Toast.makeText(FiveActivity.this, "5", Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    Toast.makeText(FiveActivity.this, "6", Toast.LENGTH_SHORT).show();
                    break;
                case 6:
                    Toast.makeText(FiveActivity.this, "7", Toast.LENGTH_SHORT).show();
                    break;
                case 7:
                    Toast.makeText(FiveActivity.this, "8", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        });
    }
}
