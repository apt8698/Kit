package com.kit.recycler;

public class RecyclerShowVo {

    public int type;

    public String id;
    public String url;

    public String section_1_1;
    public String section_1_2;
    public String section_1_3;
    public String section_1_4;
    public String section_1_5;

    public String section_2_1;
    public String section_2_2;
    public String section_2_3;
    public String section_2_4;
    public String section_2_5;

    public String section_3_1;
    public String section_3_2;
    public String section_3_3;
    public String section_3_4;
    public String section_3_5;

    public String time_1;
    public String time_2;

    public RecyclerShow recyclerShow;

    public RecyclerShowVo(RecyclerShow recyclerShow) {
        this.recyclerShow = recyclerShow;
        recyclerShow.toShow(this, 0);
    }

}
