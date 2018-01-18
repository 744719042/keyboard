package com.example.comment;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

/**
 * Created by Administrator on 2018/1/18.
 */

public class HintPopupWindow {
    private PopupWindow popupWindow;

    public HintPopupWindow(Context context) {
        popupWindow = new PopupWindow(context);
        popupWindow.setWidth(CommonUtils.getScreenWidth());
        popupWindow.setHeight(context.getResources().getDimensionPixelSize(R.dimen.comment_hint_height));
        LayoutInflater inflater = LayoutInflater.from(context);
        View contentView = inflater.inflate(R.layout.comment_hint_layout, null);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setContentView(contentView);
    }

    public void show(View parent, int x, int y) {
        popupWindow.showAtLocation(parent, Gravity.NO_GRAVITY, x, y);
    }

    public void hide() {
        popupWindow.dismiss();
    }

    public int getHeight() {
        return popupWindow.getHeight();
    }
}
