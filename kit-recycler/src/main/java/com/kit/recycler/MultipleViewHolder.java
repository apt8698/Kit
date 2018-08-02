package com.kit.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class MultipleViewHolder extends RecyclerView.ViewHolder {

    public MultipleViewHolder(View itemView) {
        super(itemView);
    }

    /**
     * 信息设置到具体view控件，控件的事件统一用listener抛出去
     *
     * @param infoVo
     * @param listener
     */
    abstract void setShow(RecyclerShowVo infoVo, View.OnClickListener listener);



}
