package com.kit.recycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class MultipleRecyclerAdapter extends RecyclerView.Adapter<MultipleViewHolder> {

    private List<RecyclerShowVo> list;
    private Context ctx;
    private LayoutInflater inflater;
    private View.OnClickListener listener;
    private ViewHolderMaker maker;

    public MultipleRecyclerAdapter(Context ctx) {
        this.ctx = ctx;
        inflater = LayoutInflater.from(ctx);
    }

    public void setList(List<RecyclerShowVo> list) {
        this.list = list;
    }

    /**
     *
     * @param listener
     */
    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    /**
     *
     * @param maker
     */
    public void setMaker(ViewHolderMaker maker) {
        this.maker = maker;
    }

    @NonNull
    @Override
    public MultipleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(maker.getResourceId(viewType), parent, false);
        return maker.make(v, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull MultipleViewHolder holder, int position) {
        holder.setShow(list.get(position), listener);
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).type;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
