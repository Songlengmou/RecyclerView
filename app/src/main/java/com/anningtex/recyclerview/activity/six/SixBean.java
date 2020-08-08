package com.anningtex.recyclerview.activity.six;

import lombok.Data;

/**
 * @Author Song
 * @Desc:
 */
@Data
class SixBean {
    private int pic;
    private String name;

    public SixBean(int pic, String name) {
        this.pic = pic;
        this.name = name;
    }
}
