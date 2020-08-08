package com.anningtex.recyclerview.activity.five;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * @Author Song
 * @Desc:RecycleView分割线
 */
public class MyDecor extends RecyclerView.ItemDecoration {
    //定义一个水平和竖直常量
    private final int Horization = RecyclerView.HORIZONTAL;
    private final int Vertical = RecyclerView.VERTICAL;
    //创建一个int型的数组,在数组中存放android中自带的分割线
    private int[] attrs = {android.R.attr.listDivider};
    //声明一个图片对象
    private Drawable drawable;
    //声明一个RecyclerView的方向
    private int oritation;

    public MyDecor(Context ctx, int orization) {
        TypedArray array = ctx.obtainStyledAttributes(attrs);
        drawable = array.getDrawable(0);
        array.recycle();//回收，防止内存溢出
        //判断方向
        if (orization != Horization && orization != Vertical) {
            //如果既不是水平又不是竖直的，抛出异常
            throw new IllegalArgumentException("没有改方向");
        } else {
            oritation = orization;
        }
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
        if (oritation == Vertical) {
            drawHor(c, parent);
        }
        if (oritation == Horization) {
            drawVer(c, parent);
        }
    }

    /**
     * 水平方向画一条线
     *
     * @param c
     * @param parent
     */
    private void drawHor(Canvas c, RecyclerView parent) {
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();
        int itemCount = parent.getChildCount();
        for (int i = 0; i < itemCount; i++) {
            View child = parent.getChildAt(i);
            //获得item上view视图的参数对象
            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
            //根据参数对象获取参数值
            int top = child.getBottom() + params.bottomMargin;
            //设置bottom坐标
            int bottom = top + drawable.getIntrinsicHeight();
            drawable.setBounds(left, top, right, bottom);
            //花在画板上
            drawable.draw(c);
        }
    }

    /**
     * 垂直方向画一条线
     *
     * @param c
     * @param parent
     */
    private void drawVer(Canvas c, RecyclerView parent) {

        int top = parent.getPaddingTop();
        int bottom = parent.getHeight() - parent.getPaddingBottom();
        int itemCount = parent.getChildCount();
        for (int i = 0; i < itemCount; i++) {
            View child = parent.getChildAt(i);
            //获得item上view视图的参数对象
            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
            //根据参数对象获取参数值
            int left = child.getRight() + params.rightMargin;
            //设置bottom坐标
            int right = left + drawable.getIntrinsicWidth();
            drawable.setBounds(left, top, right, bottom);
            //花在画板上
            drawable.draw(c);
        }
    }

    @Override
    public void getItemOffsets(Rect outRect, int itemPosition, RecyclerView parent) {
        super.getItemOffsets(outRect, itemPosition, parent);
    }
}
