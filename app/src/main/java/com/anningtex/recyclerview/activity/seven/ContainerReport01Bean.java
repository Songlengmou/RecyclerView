package com.anningtex.recyclerview.activity.seven;

import java.util.List;

import lombok.Data;

/**
 * @Author Song
 */
@Data
public class ContainerReport01Bean {

    /**
     * code : 1
     * msg : Success
     * data : {"Info_Container":{"ID":"1371","BLNo":"584305619","ContainerNo":"HASU5070898","ContainerSize":"1×40","LoadDate":"2019-10-16 00:00:00.000","ToCountryName":"肯尼亚","ToPort":"MOMBASA","SealNo":"MLCN3475055"},"List_GoodsList":[{"OrderNo":"SJ190827A","TexID_01":"336","QBales":60,"VolumeTotal":"7.32","WeightTotal":6180,"Notes":"冠中发货，花色不齐20包，余仓库","DeliveryNote":"YD-AN191012K","MetersSum":32918.4,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1220","WeightUnit":"103.0000","TexName_01":"SJ","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1220","AWeight":103},{"OrderNo":"AFX190717A","TexID_01":"496","QBales":30,"VolumeTotal":"3.69","WeightTotal":3015,"Notes":"WAXWAX，冠中发货，M,Z转K，余仓库","DeliveryNote":"YD-AN191012B","MetersSum":16459.2,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1230","WeightUnit":"100.5000","TexName_01":"AFX","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1230","AWeight":100.5},{"OrderNo":"MF190611A","TexID_01":"218","QBales":10,"VolumeTotal":"1.00","WeightTotal":720,"Notes":"鸿鑫达发货，余仓库","DeliveryNote":"YD-AN190907D","MetersSum":5486.4,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1000","WeightUnit":"72.0000","TexName_01":"MF","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1000","AWeight":72},{"OrderNo":"BZ190708K","TexID_01":"41","QBales":40,"VolumeTotal":"3.84","WeightTotal":3120,"Notes":"600码，浙江灏宇发货，余仓库","DeliveryNote":"YD-AN190913K","MetersSum":21945.6,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.0960","WeightUnit":"78.0000","TexName_01":"BZ","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.0960","AWeight":78},{"OrderNo":"TC190924K","TexID_01":"8","QBales":90,"VolumeTotal":"11.48","WeightTotal":5760,"Notes":"黑色，凌立发货，安泰报关，余仓库","DeliveryNote":"YD-AN191012G","MetersSum":49377.6,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"64.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":64},{"OrderNo":"TC190911K","TexID_01":"8","QBales":4,"VolumeTotal":"0.51","WeightTotal":252,"Notes":"黑色，凌立发货，本清报关，余仓库","DeliveryNote":"YD-AN190928P","MetersSum":2194.56,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC190924K","TexID_01":"8","QBales":60,"VolumeTotal":"7.65","WeightTotal":3780,"Notes":"黑色，凌立发货，安泰报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":32918.4,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC191012K","TexID_01":"8","QBales":99,"VolumeTotal":"12.62","WeightTotal":6237,"Notes":"黑色，凌立发货，安泰报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":54315.36,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC191007K","TexID_01":"8","QBales":22,"VolumeTotal":"2.81","WeightTotal":1386,"Notes":"凌立发货，本清报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":12070.08,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC190906K","TexID_01":"8","QBales":14,"VolumeTotal":"1.79","WeightTotal":882,"Notes":"凌立发货，本清报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":7680.96,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC190918K","TexID_01":"8","QBales":46,"VolumeTotal":"5.87","WeightTotal":2852,"Notes":"凌立发货，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":25237.44,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"62.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":62}],"volume_sum":58.58,"weight_sum":34184,"qbales_sum":475}
     */

    private int code;
    private String msg;
    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    @Data
    public static class DataBean {
        /**
         * Info_Container : {"ID":"1371","BLNo":"584305619","ContainerNo":"HASU5070898","ContainerSize":"1×40","LoadDate":"2019-10-16 00:00:00.000","ToCountryName":"肯尼亚","ToPort":"MOMBASA","SealNo":"MLCN3475055"}
         * List_GoodsList : [{"OrderNo":"SJ190827A","TexID_01":"336","QBales":60,"VolumeTotal":"7.32","WeightTotal":6180,"Notes":"冠中发货，花色不齐20包，余仓库","DeliveryNote":"YD-AN191012K","MetersSum":32918.4,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1220","WeightUnit":"103.0000","TexName_01":"SJ","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1220","AWeight":103},{"OrderNo":"AFX190717A","TexID_01":"496","QBales":30,"VolumeTotal":"3.69","WeightTotal":3015,"Notes":"WAXWAX，冠中发货，M,Z转K，余仓库","DeliveryNote":"YD-AN191012B","MetersSum":16459.2,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1230","WeightUnit":"100.5000","TexName_01":"AFX","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1230","AWeight":100.5},{"OrderNo":"MF190611A","TexID_01":"218","QBales":10,"VolumeTotal":"1.00","WeightTotal":720,"Notes":"鸿鑫达发货，余仓库","DeliveryNote":"YD-AN190907D","MetersSum":5486.4,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1000","WeightUnit":"72.0000","TexName_01":"MF","TexType":"IsFlower","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1000","AWeight":72},{"OrderNo":"BZ190708K","TexID_01":"41","QBales":40,"VolumeTotal":"3.84","WeightTotal":3120,"Notes":"600码，浙江灏宇发货，余仓库","DeliveryNote":"YD-AN190913K","MetersSum":21945.6,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.0960","WeightUnit":"78.0000","TexName_01":"BZ","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.0960","AWeight":78},{"OrderNo":"TC190924K","TexID_01":"8","QBales":90,"VolumeTotal":"11.48","WeightTotal":5760,"Notes":"黑色，凌立发货，安泰报关，余仓库","DeliveryNote":"YD-AN191012G","MetersSum":49377.6,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"64.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":64},{"OrderNo":"TC190911K","TexID_01":"8","QBales":4,"VolumeTotal":"0.51","WeightTotal":252,"Notes":"黑色，凌立发货，本清报关，余仓库","DeliveryNote":"YD-AN190928P","MetersSum":2194.56,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC190924K","TexID_01":"8","QBales":60,"VolumeTotal":"7.65","WeightTotal":3780,"Notes":"黑色，凌立发货，安泰报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":32918.4,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC191012K","TexID_01":"8","QBales":99,"VolumeTotal":"12.62","WeightTotal":6237,"Notes":"黑色，凌立发货，安泰报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":54315.36,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC191007K","TexID_01":"8","QBales":22,"VolumeTotal":"2.81","WeightTotal":1386,"Notes":"凌立发货，本清报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":12070.08,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC190906K","TexID_01":"8","QBales":14,"VolumeTotal":"1.79","WeightTotal":882,"Notes":"凌立发货，本清报关，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":7680.96,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"63.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":63},{"OrderNo":"TC190918K","TexID_01":"8","QBales":46,"VolumeTotal":"5.87","WeightTotal":2852,"Notes":"凌立发货，余仓库","DeliveryNote":"YD-AN191019F","MetersSum":25237.44,"MetersPerBale":600,"MetersPerBaleUnitID":"1","VolumeUnit":"0.1275","WeightUnit":"62.0000","TexName_01":"TC45","TexType":"IsColor","MetersPerBaleUnitName":"码","MetersPerBaleUnitNameEN":"y","AVolume":"0.1275","AWeight":62}]
         * volume_sum : 58.58
         * weight_sum : 34184
         * qbales_sum : 475
         */

        private InfoContainerBean Info_Container;
        private double volume_sum;
        private int weight_sum, qbales_sum;
        private List<ListGoodsListBean> List_GoodsList;

        public InfoContainerBean getInfo_Container() {
            return Info_Container;
        }

        public List<ListGoodsListBean> getList_GoodsList() {
            return List_GoodsList;
        }

        @Data
        public static class InfoContainerBean {
            /**
             * ID : 1371
             * BLNo : 584305619
             * ContainerNo : HASU5070898
             * ContainerSize : 1×40
             * LoadDate : 2019-10-16 00:00:00.000
             * ToCountryName : 肯尼亚
             * ToPort : MOMBASA
             * SealNo : MLCN3475055
             */

            private String ID;
            private String BLNo;
            private String ContainerNo;
            private String ContainerSize;
            private String LoadDate;
            private String ToCountryName;
            private String ToPort;
            private String SealNo;
        }

        @Data
        public static class ListGoodsListBean {
            /**
             * OrderNo : SJ190827A
             * TexID_01 : 336
             * QBales : 60
             * VolumeTotal : 7.32
             * WeightTotal : 6180
             * Notes : 冠中发货，花色不齐20包，余仓库
             * DeliveryNote : YD-AN191012K
             * MetersSum : 32918.4
             * MetersPerBale : 600
             * MetersPerBaleUnitID : 1
             * VolumeUnit : 0.1220
             * WeightUnit : 103.0000
             * TexName_01 : SJ
             * TexType : IsFlower
             * MetersPerBaleUnitName : 码
             * MetersPerBaleUnitNameEN : y
             * AVolume : 0.1220
             * AWeight : 103
             */

            private String OrderNo;
            private String TexID_01;
            private int QBales;
            private String VolumeTotal;
            private float WeightTotal;
            private String DeliveryNote;
            private double MetersSum;
            private int MetersPerBale;
            private String MetersPerBaleUnitID;
            private String VolumeUnit;
            private String WeightUnit;
            private String TexName_01;
            private String TexType;
            private String MetersPerBaleUnitName;
            private String MetersPerBaleUnitNameEN;
            private String AVolume;
            private float AWeight;
        }
    }
}
