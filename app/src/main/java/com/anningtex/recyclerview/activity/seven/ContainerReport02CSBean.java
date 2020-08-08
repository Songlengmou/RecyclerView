package com.anningtex.recyclerview.activity.seven;

import java.util.List;

/**
 * @Author Song
 */
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

    public int getTotal_ge() {
        return total_ge;
    }

    public void setTotal_ge(int total_ge) {
        this.total_ge = total_ge;
    }

    public String getTexID_01() {
        return TexID_01;
    }

    public void setTexID_01(String TexID_01) {
        this.TexID_01 = TexID_01;
    }

    public String getTexType() {
        return TexType;
    }

    public void setTexType(String TexType) {
        this.TexType = TexType;
    }

    public String getTexName_01() {
        return TexName_01;
    }

    public void setTexName_01(String TexName_01) {
        this.TexName_01 = TexName_01;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_ma() {
        return total_ma;
    }

    public void setTotal_ma(int total_ma) {
        this.total_ma = total_ma;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ListQBalesBean> getList_QBales() {
        return List_QBales;
    }

    public void setList_QBales(List<ListQBalesBean> list_QBales) {
        List_QBales = list_QBales;
    }

    public List<ListDetailsBean> getList_Details() {
        return List_Details;
    }

    public void setList_Details(List<ListDetailsBean> list_Details) {
        List_Details = list_Details;
    }

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

        public String getTexID_01() {
            return TexID_01;
        }

        public void setTexID_01(String TexID_01) {
            this.TexID_01 = TexID_01;
        }

        public String getOrderNo() {
            return OrderNo;
        }

        public void setOrderNo(String OrderNo) {
            this.OrderNo = OrderNo;
        }

        public int getMetersPerBale() {
            return MetersPerBale;
        }

        public void setMetersPerBale(int MetersPerBale) {
            this.MetersPerBale = MetersPerBale;
        }

        public String getMetersPerBaleUnitID() {
            return MetersPerBaleUnitID;
        }

        public void setMetersPerBaleUnitID(String MetersPerBaleUnitID) {
            this.MetersPerBaleUnitID = MetersPerBaleUnitID;
        }

        public int getQBales() {
            return QBales;
        }

        public void setQBales(int QBales) {
            this.QBales = QBales;
        }

        public String getTexName_01() {
            return TexName_01;
        }

        public void setTexName_01(String TexName_01) {
            this.TexName_01 = TexName_01;
        }

        public String getTexType() {
            return TexType;
        }

        public void setTexType(String TexType) {
            this.TexType = TexType;
        }

        public String getMetersPerBaleUnitName() {
            return MetersPerBaleUnitName;
        }

        public void setMetersPerBaleUnitName(String MetersPerBaleUnitName) {
            this.MetersPerBaleUnitName = MetersPerBaleUnitName;
        }

        public String getMetersPerBaleUnitNameEN() {
            return MetersPerBaleUnitNameEN;
        }

        public void setMetersPerBaleUnitNameEN(String MetersPerBaleUnitNameEN) {
            this.MetersPerBaleUnitNameEN = MetersPerBaleUnitNameEN;
        }
    }

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

        public String getNewOrderNo() {
            return newOrderNo;
        }

        public void setNewOrderNo(String newOrderNo) {
            this.newOrderNo = newOrderNo;
        }

        public String getBrandID() {
            return BrandID;
        }

        public void setBrandID(String brandID) {
            BrandID = brandID;
        }

        public String getItemName() {
            return ItemName;
        }

        public void setItemName(String itemName) {
            ItemName = itemName;
        }

        public String getColorName() {
            return ColorName;
        }

        public void setColorName(String colorName) {
            ColorName = colorName;
        }

        public String getIsMix() {
            return IsMix;
        }

        public void setIsMix(String isMix) {
            IsMix = isMix;
        }

        public int getMetersPerBale() {
            return MetersPerBale;
        }

        public void setMetersPerBale(int metersPerBale) {
            MetersPerBale = metersPerBale;
        }

        public String getMetersPerBaleUnitID() {
            return MetersPerBaleUnitID;
        }

        public void setMetersPerBaleUnitID(String metersPerBaleUnitID) {
            MetersPerBaleUnitID = metersPerBaleUnitID;
        }

        public int getQBales() {
            return QBales;
        }

        public void setQBales(int QBales) {
            this.QBales = QBales;
        }

        public String getMetersPerBaleUnitName() {
            return MetersPerBaleUnitName;
        }

        public void setMetersPerBaleUnitName(String metersPerBaleUnitName) {
            MetersPerBaleUnitName = metersPerBaleUnitName;
        }

        public String getMetersPerBaleUnitNameEN() {
            return MetersPerBaleUnitNameEN;
        }

        public void setMetersPerBaleUnitNameEN(String metersPerBaleUnitNameEN) {
            MetersPerBaleUnitNameEN = metersPerBaleUnitNameEN;
        }

        public String getBrandName() {
            return BrandName;
        }

        public void setBrandName(String brandName) {
            BrandName = brandName;
        }

        public int getQSum() {
            return QSum;
        }

        public void setQSum(int QSum) {
            this.QSum = QSum;
        }
    }
}
