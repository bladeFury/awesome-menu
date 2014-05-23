package com.bladefury.awesomemenu.lib.adapter;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zhangge on 2014/5/19.
 */
public interface AwesomeAdapter {
    public int getCount();
    public Object getItem(int index);
    View getView(int index, ViewGroup parent);


}
