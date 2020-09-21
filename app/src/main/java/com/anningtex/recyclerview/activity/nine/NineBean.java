package com.anningtex.recyclerview.activity.nine;

import com.anningtex.recyclerview.activity.nine.menu.GroupEntity;

import java.util.List;

/**
 * @Author Song
 */
public class NineBean {

    /**
     * code : 1
     * msg : Success
     * data : [{"ID":"74","PIID":"74","BvCode":"","LoadDate":"2019-11-08","FromPort":"Kampala ","ToCountryID":"2","ToPort":"Kampala","ClearBorder":"Kampala ","DeliveryNo":"AOAD20191108 ","PlateNo":"","Driver":"","PhoneNo":"","Notes":"","VolumeTotal":"32.08","WeightTotal":"6596","QBalesTotal":"302","PullerGoodsList":[{"PIID":"74","BGLID":"760","QBales":87,"InDate":"2019-10-05","BLNo":"585758711","ContainerNo":"HASU4605547","OrderNo":"BG190615A","VolumeUnit":"0.2200","WeightUnit":"28.0000"},{"PIID":"74","BGLID":"759","QBales":200,"InDate":"2019-10-05","BLNo":"585758711","ContainerNo":"HASU4605547","OrderNo":"FX190325A","VolumeUnit":"0.0563","WeightUnit":"14.8000"},{"PIID":"74","BGLID":"770","QBales":15,"InDate":"2019-10-05","BLNo":"585758711","ContainerNo":"HASU4605547","OrderNo":"TR190313A","VolumeUnit":"0.1120","WeightUnit":"80.0000"}]},{"ID":"70","PIID":"70","BvCode":"BV2019264087","LoadDate":"2019-11-02","FromPort":"Kampala","ToCountryID":"1","ToPort":"Ishasha","ClearBorder":"Ishasha","DeliveryNo":"AOCG20191102-1","PlateNo":"987","Driver":"sasaas","PhoneNo":"123456788","Notes":"","VolumeTotal":"58.304","WeightTotal":"34848.5","QBalesTotal":"491","PullerGoodsList":[{"PIID":"70","BGLID":"870","QBales":85,"InDate":"2019-10-29","BLNo":"585758784","ContainerNo":"SUDU7725003","OrderNo":"PJX190628A","VolumeUnit":"0.1100","WeightUnit":"74.0000"},{"PIID":"70","BGLID":"891","QBales":60,"InDate":"2019-10-29","BLNo":"585758785","ContainerNo":"MSKU7850568","OrderNo":"PJ190805A","VolumeUnit":"0.1000","WeightUnit":"73.0000"}]}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean extends GroupEntity<List<DataBean.PullerGoodsListBean>> {
        /**
         * ID : 74
         * PIID : 74
         * BvCode :
         * LoadDate : 2019-11-08
         * FromPort : Kampala
         * ToCountryID : 2
         * ToPort : Kampala
         * ClearBorder : Kampala
         * DeliveryNo : AOAD20191108
         * PlateNo :
         * Driver :
         * PhoneNo :
         * Notes :
         * VolumeTotal : 32.08
         * WeightTotal : 6596
         * QBalesTotal : 302
         * PullerGoodsList : [{"PIID":"74","BGLID":"760","QBales":87,"InDate":"2019-10-05","BLNo":"585758711","ContainerNo":"HASU4605547","OrderNo":"BG190615A","VolumeUnit":"0.2200","WeightUnit":"28.0000"},{"PIID":"74","BGLID":"759","QBales":200,"InDate":"2019-10-05","BLNo":"585758711","ContainerNo":"HASU4605547","OrderNo":"FX190325A","VolumeUnit":"0.0563","WeightUnit":"14.8000"},{"PIID":"74","BGLID":"770","QBales":15,"InDate":"2019-10-05","BLNo":"585758711","ContainerNo":"HASU4605547","OrderNo":"TR190313A","VolumeUnit":"0.1120","WeightUnit":"80.0000"}]
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
        private List<PullerGoodsListBean> PullerGoodsList;

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

        public List<PullerGoodsListBean> getPullerGoodsList() {
            return PullerGoodsList;
        }

        public void setPullerGoodsList(List<PullerGoodsListBean> PullerGoodsList) {
            this.PullerGoodsList = PullerGoodsList;
        }

        public static class PullerGoodsListBean {
            /**
             * PIID : 74
             * BGLID : 760
             * QBales : 87
             * InDate : 2019-10-05
             * BLNo : 585758711
             * ContainerNo : HASU4605547
             * OrderNo : BG190615A
             * VolumeUnit : 0.2200
             * WeightUnit : 28.0000
             */

            private String PIID;
            private String BGLID;
            private int QBales;
            private String InDate;
            private String BLNo;
            private String ContainerNo;
            private String OrderNo;
            private String VolumeUnit;
            private String WeightUnit;

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
        }
    }
}
