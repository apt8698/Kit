package com.kit.recycler;

public class RecyclerShowVo {

    public int type;

    public String id;
    public String url;

    public String section_1;
    public String section_2;
    public String section_3;
    public String section_4;
    public String section_5;
    public String section_6;
    public String section_7;
    public String section_8;
    public String section_9;
    public String section_10;
    public String section_11;
    public String section_12;
    public String section_13;
    public String section_14;
    public String section_15;

    public String time_1;
    public String time_2;

    public RecyclerShow recyclerShow;

    public RecyclerShowVo(RecyclerShow recyclerShow) {
        this.recyclerShow = recyclerShow;
        recyclerShow.toShow(this, 0);
    }

}
