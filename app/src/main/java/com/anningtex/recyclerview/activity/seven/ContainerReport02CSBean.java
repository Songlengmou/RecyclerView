package com.anningtex.recyclerview.activity.seven;

import java.util.List;

import lombok.Data;

/**
 * @Author Song
 */
@Data
public class ContainerReport02CSBean {
    private String TexID_01;
    private String TexType;
    private String TexName_01;
    private int total;
    private int total_ma;
    private int total_ge;
    private int count;
    private List<ListQBalesBean> List_QBales;
    private List<ListDetailsBean> List_Details;

    public List<ListQBalesBean> getList_QBales() {
        return List_QBales;
    }

    public List<ListDetailsBean> getList_Details() {
        return List_Details;
    }

    @Data
    public static class ListQBalesBean {
        /**
         * TexID_01 : 4
         * OrderNo : TR190823K
         * MetersPerBale : 300
         * MetersPerBaleUnitID : 1
         * QBales : 24
         * TexName_01 : TR
         * TexType : IsColor
         * MetersPerBaleUnitName : 码
         * MetersPerBaleUnitNameEN : y
         */

        private String TexID_01;
        private String OrderNo;
        private int MetersPerBale;
        private String MetersPerBaleUnitID;
        private int QBales;
        private String TexName_01;
        private String TexType;
        private String MetersPerBaleUnitName;
        private String MetersPerBaleUnitNameEN;
    }

    @Data
    public static class ListDetailsBean {
        private String BrandID;
        private String ItemName;
        private String ColorName;
        private String IsMix;
        private int MetersPerBale;
        private String MetersPerBaleUnitID;
        private int QBales;
        private String MetersPerBaleUnitName;
        private String MetersPerBaleUnitNameEN;
        private String BrandName;
        private int QSum;
        //add
        private String newOrderNo;
    }
}
