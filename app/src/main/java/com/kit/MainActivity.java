package com.kit;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.kit.recycler.MultipleRecyclerAdapter;
import com.kit.recycler.RecyclerShowVo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView rlv_list;
    private MultipleRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rlv_list = findViewById(R.id.rlv_content_list);
        init();
    }

    private void init() {
        adapter = new MultipleRecyclerAdapter(this);
        adapter.setList(make());
        rlv_list.setAdapter(adapter);
    }


    private List<RecyclerShowVo> make() {
        List<RecyclerShowVo> list = new ArrayList<>();
        RecyclerShowVo show = null;
        User user = null;
        for (int i = 0; i < 15; i++) {
            user = new User((1 + i) + "", "Tom-" + i, "");
            show = new RecyclerShowVo(user);
            list.add(show);
        }
        return list;
    }



}
