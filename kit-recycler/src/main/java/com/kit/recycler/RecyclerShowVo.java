package com.kit.recycler;

public class RecyclerShowVo {

    public int type;

    public String id;
    public String url;
    public String info_1;
    public String info_2;
    public String info_3;
    public String info_4;
    public String info_5;
    public String info_6;
    public String info_7;
    public String info_8;
    public String info_9;

    public String time_1;
    public String time_2;

    public RecyclerShow recyclerShow;

    public RecyclerShowVo(RecyclerShow recyclerShow) {
        this.recyclerShow = recyclerShow;
        recyclerShow.toShow(this, 0);
    }

}
