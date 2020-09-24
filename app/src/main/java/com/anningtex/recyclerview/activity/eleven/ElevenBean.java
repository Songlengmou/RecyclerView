package com.anningtex.recyclerview.activity.eleven;

import java.util.List;

/**
 * @Author Song
 */
public class ElevenBean {

    /**
     * code : 1
     * msg : Success
     * data : {"ID":"81","PIID":"81","BvCode":"BV2019264087","LoadDate":"2020-09-08","FromPort":"Kampala","ToCountryID":"1","ToPort":"Ishasha","ClearBorder":"Ishasha","DeliveryNo":"AOCG20191102-9","PlateNo":"123456","Driver":"kyrie","PhoneNo":"15209891396","Notes":"ok","VolumeTotal":"2.0069","WeightTotal":"1530.5","QBalesTotal":"17","PackingList":[{"TexName_Show":"TR","OrderList":[{"PIGLID":1369,"PIID":"81","BGLID":"1102","QBales":3,"InDate":"2020-09-15","BLNo":"584305620","ContainerNo":"MRSU3660766","OrderNo":"TR190828A","VolumeUnit":"0.1100","WeightUnit":"79.0000","MetersPerBale":"297.0000","MetersPerBaleUnitID":"1","TexID_01":"4","TexType":"IsColor","TexName_Show":"TR","UnitName":"码","UnitNameEN":"y"}]},{"TexName_Show":"SJ","OrderList":[{"PIGLID":1363,"PIID":"81","BGLID":"1106","QBales":2,"InDate":"2020-09-16","BLNo":"584305600","ContainerNo":"MRKU8865128","OrderNo":"SJ190803A","VolumeUnit":"0.1217","WeightUnit":"103.0000","MetersPerBale":"600.0000","MetersPerBaleUnitID":"1","TexID_01":"336","TexType":"IsFlower","TexName_Show":"SJ","UnitName":"码","UnitNameEN":"y"}]},{"TexName_Show":"AN","OrderList":[{"PIGLID":1361,"PIID":"81","BGLID":"6","QBales":5,"InDate":"2018-08-29","BLNo":"588007878","ContainerNo":"MRKU7857257","OrderNo":"AN170530A","VolumeUnit":"0.1217","WeightUnit":"91.0000","MetersPerBale":"600.0000","MetersPerBaleUnitID":"1","TexID_01":"73","TexType":"IsFlower","TexName_Show":"AN","UnitName":"码","UnitNameEN":"y"},{"PIGLID":1371,"PIID":"81","BGLID":"5","QBales":5,"InDate":"2018-08-29","BLNo":"588007878","ContainerNo":"MRKU7857257","OrderNo":"AN170529A","VolumeUnit":"0.1250","WeightUnit":"98.5000","MetersPerBale":"600.0000","MetersPerBaleUnitID":"1","TexID_01":"73","TexType":"IsFlower","TexName_Show":"AN","UnitName":"码","UnitNameEN":"y"}]},{"TexName_Show":"MF","OrderList":[{"PIGLID":1448,"PIID":"81","BGLID":"529","QBales":2,"InDate":"2019-07-06","BLNo":"585759171","ContainerNo":"MRKU7261123","OrderNo":"MF190214A","VolumeUnit":"0.1000","WeightUnit":"70.0000","MetersPerBale":"600.0000","MetersPerBaleUnitID":"1","TexID_01":"218","TexType":"IsFlower","TexName_Show":"MF","UnitName":"码","UnitNameEN":"y"}]}]}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * ID : 81
         * PIID : 81
         * BvCode : BV2019264087
         * LoadDate : 2020-09-08
         * FromPort : Kampala
         * ToCountryID : 1
         * ToPort : Ishasha
         * ClearBorder : Ishasha
         * DeliveryNo : AOCG20191102-9
         * PlateNo : 123456
         * Driver : kyrie
         * PhoneNo : 15209891396
         * Notes : ok
         * VolumeTotal : 2.0069
         * WeightTotal : 1530.5
         * QBalesTotal : 17
         * PackingList : [{"TexName_Show":"TR","OrderList":[{"PIGLID":1369,"PIID":"81","BGLID":"1102","QBales":3,"InDate":"2020-09-15","BLNo":"584305620","ContainerNo":"MRSU3660766","OrderNo":"TR190828A","VolumeUnit":"0.1100","WeightUnit":"79.0000","MetersPerBale":"297.0000","MetersPerBaleUnitID":"1","TexID_01":"4","TexType":"IsColor","TexName_Show":"TR","UnitName":"码","UnitNameEN":"y"}]},{"TexName_Show":"SJ","OrderList":[{"PIGLID":1363,"PIID":"81","BGLID":"1106","QBales":2,"InDate":"2020-09-16","BLNo":"584305600","ContainerNo":"MRKU8865128","OrderNo":"SJ190803A","VolumeUnit":"0.1217","WeightUnit":"103.0000","MetersPerBale":"600.0000","MetersPerBaleUnitID":"1","TexID_01":"336","TexType":"IsFlower","TexName_Show":"SJ","UnitName":"码","UnitNameEN":"y"}]},{"TexName_Show":"AN","OrderList":[{"PIGLID":1361,"PIID":"81","BGLID":"6","QBales":5,"InDate":"2018-08-29","BLNo":"588007878","ContainerNo":"MRKU7857257","OrderNo":"AN170530A","VolumeUnit":"0.1217","WeightUnit":"91.0000","MetersPerBale":"600.0000","MetersPerBaleUnitID":"1","TexID_01":"73","TexType":"IsFlower","TexName_Show":"AN","UnitName":"码","UnitNameEN":"y"},{"PIGLID":1371,"PIID":"81","BGLID":"5","QBales":5,"InDate":"2018-08-29","BLNo":"588007878","ContainerNo":"MRKU7857257","OrderNo":"AN170529A","VolumeUnit":"0.1250","WeightUnit":"98.5000","MetersPerBale":"600.0000","MetersPerBaleUnitID":"1","TexID_01":"73","TexType":"IsFlower","TexName_Show":"AN","UnitName":"码","UnitNameEN":"y"}]},{"TexName_Show":"MF","OrderList":[{"PIGLID":1448,"PIID":"81","BGLID":"529","QBales":2,"InDate":"2019-07-06","BLNo":"585759171","ContainerNo":"MRKU7261123","OrderNo":"MF190214A","VolumeUnit":"0.1000","WeightUnit":"70.0000","MetersPerBale":"600.0000","MetersPerBaleUnitID":"1","TexID_01":"218","TexType":"IsFlower","TexName_Show":"MF","UnitName":"码","UnitNameEN":"y"}]}]
         */

        private String ID;
        private String PIID;
        private String BvCode;
        private String LoadDate;
        private String FromPort;
        private String ToCountryID;
        private String ToPort;
        private String ClearBorder;
        private String DeliveryNo;
        private String PlateNo;
        private String Driver;
        private String PhoneNo;
        private String Notes;
        private String VolumeTotal;
        private String WeightTotal;
        private String QBalesTotal;
        private List<PackingListBean> PackingList;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getPIID() {
            return PIID;
        }

        public void setPIID(String PIID) {
            this.PIID = PIID;
        }

        public String getBvCode() {
            return BvCode;
        }

        public void setBvCode(String BvCode) {
            this.BvCode = BvCode;
        }

        public String getLoadDate() {
            return LoadDate;
        }

        public void setLoadDate(String LoadDate) {
            this.LoadDate = LoadDate;
        }

        public String getFromPort() {
            return FromPort;
        }

        public void setFromPort(String FromPort) {
            this.FromPort = FromPort;
        }

        public String getToCountryID() {
            return ToCountryID;
        }

        public void setToCountryID(String ToCountryID) {
            this.ToCountryID = ToCountryID;
        }

        public String getToPort() {
            return ToPort;
        }

        public void setToPort(String ToPort) {
            this.ToPort = ToPort;
        }

        public String getClearBorder() {
            return ClearBorder;
        }

        public void setClearBorder(String ClearBorder) {
            this.ClearBorder = ClearBorder;
        }

        public String getDeliveryNo() {
            return DeliveryNo;
        }

        public void setDeliveryNo(String DeliveryNo) {
            this.DeliveryNo = DeliveryNo;
        }

        public String getPlateNo() {
            return PlateNo;
        }

        public void setPlateNo(String PlateNo) {
            this.PlateNo = PlateNo;
        }

        public String getDriver() {
            return Driver;
        }

        public void setDriver(String Driver) {
            this.Driver = Driver;
        }

        public String getPhoneNo() {
            return PhoneNo;
        }

        public void setPhoneNo(String PhoneNo) {
            this.PhoneNo = PhoneNo;
        }

        public String getNotes() {
            return Notes;
        }

        public void setNotes(String Notes) {
            this.Notes = Notes;
        }

        public String getVolumeTotal() {
            return VolumeTotal;
        }

        public void setVolumeTotal(String VolumeTotal) {
            this.VolumeTotal = VolumeTotal;
        }

        public String getWeightTotal() {
            return WeightTotal;
        }

        public void setWeightTotal(String WeightTotal) {
            this.WeightTotal = WeightTotal;
        }

        public String getQBalesTotal() {
            return QBalesTotal;
        }

        public void setQBalesTotal(String QBalesTotal) {
            this.QBalesTotal = QBalesTotal;
        }

        public List<PackingListBean> getPackingList() {
            return PackingList;
        }

        public void setPackingList(List<PackingListBean> PackingList) {
            this.PackingList = PackingList;
        }

        public static class PackingListBean {
            /**
             * TexName_Show : TR
             * OrderList : [{"PIGLID":1369,"PIID":"81","BGLID":"1102","QBales":3,"InDate":"2020-09-15","BLNo":"584305620","ContainerNo":"MRSU3660766","OrderNo":"TR190828A","VolumeUnit":"0.1100","WeightUnit":"79.0000","MetersPerBale":"297.0000","MetersPerBaleUnitID":"1","TexID_01":"4","TexType":"IsColor","TexName_Show":"TR","UnitName":"码","UnitNameEN":"y"}]
             */

            private String TexName_Show;
            private List<OrderListBean> OrderList;

            public String getTexName_Show() {
                return TexName_Show;
            }

            public void setTexName_Show(String TexName_Show) {
                this.TexName_Show = TexName_Show;
            }

            public List<OrderListBean> getOrderList() {
                return OrderList;
            }

            public void setOrderList(List<OrderListBean> OrderList) {
                this.OrderList = OrderList;
            }

            public static class OrderListBean {
                /**
                 * PIGLID : 1369
                 * PIID : 81
                 * BGLID : 1102
                 * QBales : 3
                 * InDate : 2020-09-15
                 * BLNo : 584305620
                 * ContainerNo : MRSU3660766
                 * OrderNo : TR190828A
                 * VolumeUnit : 0.1100
                 * WeightUnit : 79.0000
                 * MetersPerBale : 297.0000
                 * MetersPerBaleUnitID : 1
                 * TexID_01 : 4
                 * TexType : IsColor
                 * TexName_Show : TR
                 * UnitName : 码
                 * UnitNameEN : y
                 */

                private int PIGLID;
                private String PIID;
                private String BGLID;
                private int QBales;
                private String InDate;
                private String BLNo;
                private String ContainerNo;
                private String OrderNo;
                private String VolumeUnit;
                private String WeightUnit;
                private String MetersPerBale;
                private String MetersPerBaleUnitID;
                private String TexID_01;
                private String TexType;
                private String TexName_Show;
                private String UnitName;
                private String UnitNameEN;

                public int getPIGLID() {
                    return PIGLID;
                }

                public void setPIGLID(int PIGLID) {
                    this.PIGLID = PIGLID;
                }

                public String getPIID() {
                    return PIID;
                }

                public void setPIID(String PIID) {
                    this.PIID = PIID;
                }

                public String getBGLID() {
                    return BGLID;
                }

                public void setBGLID(String BGLID) {
                    this.BGLID = BGLID;
                }

                public int getQBales() {
                    return QBales;
                }

                public void setQBales(int QBales) {
                    this.QBales = QBales;
                }

                public String getInDate() {
                    return InDate;
                }

                public void setInDate(String InDate) {
                    this.InDate = InDate;
                }

                public String getBLNo() {
                    return BLNo;
                }

                public void setBLNo(String BLNo) {
                    this.BLNo = BLNo;
                }

                public String getContainerNo() {
                    return ContainerNo;
                }

                public void setContainerNo(String ContainerNo) {
                    this.ContainerNo = ContainerNo;
                }

                public String getOrderNo() {
                    return OrderNo;
                }

                public void setOrderNo(String OrderNo) {
                    this.OrderNo = OrderNo;
                }

                public String getVolumeUnit() {
                    return VolumeUnit;
                }

                public void setVolumeUnit(String VolumeUnit) {
                    this.VolumeUnit = VolumeUnit;
                }

                public String getWeightUnit() {
                    return WeightUnit;
                }

                public void setWeightUnit(String WeightUnit) {
                    this.WeightUnit = WeightUnit;
                }

                public String getMetersPerBale() {
                    return MetersPerBale;
                }

                public void setMetersPerBale(String MetersPerBale) {
                    this.MetersPerBale = MetersPerBale;
                }

                public String getMetersPerBaleUnitID() {
                    return MetersPerBaleUnitID;
                }

                public void setMetersPerBaleUnitID(String MetersPerBaleUnitID) {
                    this.MetersPerBaleUnitID = MetersPerBaleUnitID;
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

                public String getTexName_Show() {
                    return TexName_Show;
                }

                public void setTexName_Show(String TexName_Show) {
                    this.TexName_Show = TexName_Show;
                }

                public String getUnitName() {
                    return UnitName;
                }

                public void setUnitName(String UnitName) {
                    this.UnitName = UnitName;
                }

                public String getUnitNameEN() {
                    return UnitNameEN;
                }

                public void setUnitNameEN(String UnitNameEN) {
                    this.UnitNameEN = UnitNameEN;
                }
            }
        }
    }
}
