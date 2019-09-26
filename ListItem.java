package com.example.dronschool;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class ListItem {

    private String head;
    private String desc;
    private Drawable image;
    public ListItem(String head, String desc, Drawable image) {
        this.head = head;
        this.desc = desc;
        this.image = image;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public Drawable getImage() {
        return image;
    }
}
