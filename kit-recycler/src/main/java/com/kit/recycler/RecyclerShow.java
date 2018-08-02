package com.kit.recycler;

public interface RecyclerShow {

    /**
     *  绑定数据到要显示的vo上面
     *
     * @param recyclerShowVo 要展示列表vo
     * @param type 同一种数据可能有多种列表展现方式，type便于分类处理
     */
    void toShow(RecyclerShowVo recyclerShowVo, int type);

}
