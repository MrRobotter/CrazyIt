package com.joinyon.crazyit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.joinyon.crazyit.bean.GuideBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuideActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<GuideBean> itemList = new ArrayList<>();
    private GuideAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initData();
        initView();
    }

    private void initData() {
        itemList.add(new GuideBean("简单的图片浏览器", "ImagesActivity"));
    }

    private void initView() {
        Map<String, String> s = new HashMap<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new GuideAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }

}
