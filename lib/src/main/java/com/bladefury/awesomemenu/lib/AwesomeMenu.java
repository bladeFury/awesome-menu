package com.bladefury.awesomemenu.lib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.bladefury.awesomemenu.lib.adapter.AwesomeAdapter;

/**
 * Awesome Menu
 * Created by zhangge on 2014/5/19.
 */
public class AwesomeMenu extends FrameLayout{

    private OnMenuItemClickListener mOnItemClickListener;

    public enum MenuStatus {
        CLOSED,
        CLOSING,
        OPEN,
        OPENING
    }

    private View mMenuRoot;
    private AwesomeAdapter mAdapter;

    public AwesomeMenu(Context context) {
        super(context);
    }

    public AwesomeMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AwesomeMenu(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * Interface definition for a callback to be invoked when an item in this
     * Menu has been clicked.
     */
    public interface OnMenuItemClickListener {

        /**
         * Callback method to be invoked when an item in this Menu has
         * been clicked.
         * <p>
         * @param parent The Parent View where the click happened.
         * @param view The view within the AdapterView that was clicked (this
         *            will be a view provided by the adapter)
         * @param position The position of the view in the adapter.
         * @param id The row id of the item that was clicked.
         */
        void onItemClick(View parent, View view, int position, long id);
    }

    /**
     * Register a callback to be invoked when an item in this Menu has
     * been clicked.
     *
     * @param listener The callback that will be invoked.
     */
    public void setOnItemClickListener(OnMenuItemClickListener listener) {
        mOnItemClickListener = listener;
    }

    /**
     * @return The callback to be invoked with an item in this Menu has
     *         been clicked, or null id no callback has been set.
     */
    public final OnMenuItemClickListener getOnItemClickListener() {
        return mOnItemClickListener;
    }


    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    public View getMenuRoot() {
        return mMenuRoot;
    }

    public void setMenuRoot(View mMenuRoot) {
        this.mMenuRoot = mMenuRoot;
    }


    public AwesomeAdapter getAdapter() {
        return mAdapter;
    }

    public void setAdapter(AwesomeAdapter mAdapter) {
        this.mAdapter = mAdapter;
    }

    public void openMenu() {

    }

    public void closeMenu() {

    }


}
