package com.anningtex.recyclerview.activity.thirteen;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.anningtex.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Song
 * desc:RecyclerView加载多个不同布局
 */
public class ThirteenActivity extends AppCompatActivity {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        StringAdapter stringAdapter = new StringAdapter(child());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        View view = getLayoutInflater().inflate(R.layout.thirteen_head_view, recyclerView, false);
        RecyclerView headRecyclerView = view.findViewById(R.id.head_recycler);
        StringAdapter headAdapter = new StringAdapter(head());
        headRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        headRecyclerView.setAdapter(headAdapter);
        stringAdapter.addHeaderView(view);

        View footerView = getLayoutInflater().inflate(R.layout.thirteen_footer_view, recyclerView, false);
        RecyclerView footerRecyclerView = footerView.findViewById(R.id.footer_recycler);
        StringAdapter footerAdapter = new StringAdapter(footer());
        footerRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        footerRecyclerView.setAdapter(footerAdapter);
        stringAdapter.addFooterView(footerView);

        recyclerView.setAdapter(stringAdapter);
    }

    private List<String> child() {
        List<String> str = new ArrayList<>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");
        str.add("e");
        str.add("f");
        str.add("g");
        str.add("h");
        str.add("i");
        str.add("j");
        str.add("k");
        return str;
    }

    private List<String> head() {
        List<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
        str.add("E");
        str.add("F");
        str.add("G");
        str.add("H");
        str.add("I");
        str.add("J");
        str.add("K");
        return str;
    }

    private List<String> footer() {
        List<String> str = new ArrayList<>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        str.add("6");
        str.add("7");
        str.add("8");
        str.add("9");
        str.add("10");
        str.add("11");
        return str;
    }
}