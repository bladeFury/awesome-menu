package com.bladefury.awesomemenu.lib.adapter;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zhangge on 2014/5/19.
 */
public interface AwesomeAdapter {
    public int getCount();
    public Object getItem(int index);
    public View getView(int index, ViewGroup parent);
    public Rect getViewRect(int index, Rect availableRect, Rect rootItemRect, View menuItemView);

}
