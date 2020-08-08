package com.anningtex.recyclerview.activity.five;

import lombok.Data;

/**
 * @Author Song
 * @Desc:
 */
@Data
public class FiveBean {
    private int imPic;
    private String name;

    public FiveBean(int imPic, String name) {
        this.imPic = imPic;
        this.name = name;
    }
}
