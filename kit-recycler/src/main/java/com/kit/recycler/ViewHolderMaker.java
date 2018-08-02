package com.kit.recycler;

import android.view.View;

public interface ViewHolderMaker {

    int getResourceId(int type);

    MultipleViewHolder make(View view, int type);

}
