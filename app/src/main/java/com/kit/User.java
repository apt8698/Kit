package com.kit;

import com.kit.recycler.RecyclerShow;
import com.kit.recycler.RecyclerShowVo;

public class User implements RecyclerShow {

    public String index;
    public String name;
    public String info;

    public User(String index, String name, String info) {
        this.index = index;
        this.name = name;
        this.info = info;
    }

    @Override
    public void toShow(RecyclerShowVo recyclerShowVo, int type) {
        recyclerShowVo.id = index;
        recyclerShowVo.section_1_1 = name;
        recyclerShowVo.section_1_2 = info;
    }

}
