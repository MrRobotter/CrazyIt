package com.joinyon.crazyit;

import android.os.Bundle;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private String[] ITEMS = new String[]{"第一章", "第二章", "第三章", "第四章", "第五章", "第六章", "第七章"};
    private List<String> itemList = Arrays.asList(ITEMS);
    private GuideAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
    }
}
