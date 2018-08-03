package com.kit;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.kit.recycler.MultipleRecyclerAdapter;
import com.kit.recycler.MultipleViewHolder;
import com.kit.recycler.RecyclerShowVo;
import com.kit.recycler.ViewHolderMaker;

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
//        rlv_list.setLayoutManager(new LinearLayoutManager(this));
        init();

    }

    private void init() {
        adapter = new MultipleRecyclerAdapter(this);
        adapter.setMaker(maker);
        adapter.setListener(ocl_listener);
        rlv_list.setAdapter(adapter);
        adapter.setList(make());
    }

    private View.OnClickListener ocl_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerShowVo show = (RecyclerShowVo) v.getTag();
            String info = "Recycler Item Info : (" + show.id + " ," + show.section_1 + " ," + show.section_2 + ")";
            Toast.makeText(MainActivity.this, info, Toast.LENGTH_SHORT).show();
        }
    };

    private List<RecyclerShowVo> make() {
        List<RecyclerShowVo> list = new ArrayList<>();
        RecyclerShowVo show = null;
        User user = null;
        for (int i = 0; i < 15; i++) {
            user = new User((1 + i) + "", "Tom-" + i, "Name is Tom, age is 25!");
            show = new RecyclerShowVo(user);
            list.add(show);
        }
        return list;
    }

    private ViewHolderMaker maker = new ViewHolderMaker() {
        @Override
        public int getResourceId(int type) {
            return R.layout.widget_recycler_item_user;
        }

        @Override
        public MultipleViewHolder make(View view, int type) {
            return new UserViewHolder(view);
        }
    };

    class UserViewHolder extends MultipleViewHolder {

        private TextView tv_index;
        private TextView tv_title;
        private TextView tv_info;

        public UserViewHolder(View itemView) {
            super(itemView);
            tv_index = itemView.findViewById(R.id.tv_index);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_info = itemView.findViewById(R.id.tv_info);
        }

        @Override
        public void setShow(RecyclerShowVo infoVo, View.OnClickListener listener) {
            tv_index.setText(infoVo.id);
            tv_title.setText(infoVo.section_1);
            tv_info.setText(infoVo.section_2);

            tv_index.setTag(infoVo);
            tv_title.setTag(infoVo);
            tv_info.setTag(infoVo);

            tv_index.setOnClickListener(listener);
            tv_title.setOnClickListener(listener);
            tv_info.setOnClickListener(listener);
        }
    }


}
