package com.anningtex.recyclerview.activity.four;

import java.util.List;

/**
 * @Author Song
 * @Desc:
 */
public class FourBean {

    /**
     * code : 1
     * msg : Success
     * data : [{"id":"109","load_date":"2020-05-08","supplier_delivery_no":"YD-AN200509D","is_delivery":"1","is_deliver_status":"运输中","deliver_list_detail":[{"delivery_id":"109","order_no":"AFX190618A","supplier_id":"251","bales_quantity":80,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509D","warehouse_count":11,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"},{"delivery_id":"109","order_no":"AN190521A","supplier_id":"251","bales_quantity":5,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509D","warehouse_count":5,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"},{"delivery_id":"109","order_no":"IB190121A","supplier_id":"251","bales_quantity":44,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509D","warehouse_count":7,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"},{"delivery_id":"109","order_no":"IB190329A","supplier_id":"251","bales_quantity":8,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509D","warehouse_count":4,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"}],"order_no_list":["AFX190618A","AN190521A","IB190121A","IB190329A"],"supplier_name_list":["临清三和纺织集团有限公司"]},{"id":"106","load_date":"2020-05-07","supplier_delivery_no":"YD-AN200509A","is_delivery":"1","is_deliver_status":"运输中","deliver_list_detail":[{"delivery_id":"106","order_no":"AN180329A","supplier_id":"251","bales_quantity":20,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509A","warehouse_count":9,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"},{"delivery_id":"106","order_no":"SJ190716A","supplier_id":"251","bales_quantity":3,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509A","warehouse_count":35,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"},{"delivery_id":"106","order_no":"SJ190724M","supplier_id":"251","bales_quantity":3,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509A","warehouse_count":0,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"},{"delivery_id":"106","order_no":"SJ191003A","supplier_id":"251","bales_quantity":10,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509A","warehouse_count":10,"checked":0,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"}],"order_no_list":["AN180329A","SJ190716A","SJ190724M","SJ191003A"],"supplier_name_list":["临清三和纺织集团有限公司"]}]
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

    public static class DataBean {
        /**
         * id : 109
         * load_date : 2020-05-08
         * supplier_delivery_no : YD-AN200509D
         * is_delivery : 1
         * is_deliver_status : 运输中
         * deliver_list_detail : [{"delivery_id":"109","order_no":"AFX190618A","supplier_id":"251","bales_quantity":80,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509D","warehouse_count":11,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"},{"delivery_id":"109","order_no":"AN190521A","supplier_id":"251","bales_quantity":5,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509D","warehouse_count":5,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"},{"delivery_id":"109","order_no":"IB190121A","supplier_id":"251","bales_quantity":44,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509D","warehouse_count":7,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"},{"delivery_id":"109","order_no":"IB190329A","supplier_id":"251","bales_quantity":8,"meters_per_bale":600,"meters_per_bale_unit_id":"1","notes":"","supplier_delivery_no":"YD-AN200509D","warehouse_count":4,"checked":1,"supplier_name":"临清三和纺织集团有限公司","meters_per_bale_unit_name_en":"y"}]
         * order_no_list : ["AFX190618A","AN190521A","IB190121A","IB190329A"]
         * supplier_name_list : ["临清三和纺织集团有限公司"]
         */

        private String id;
        private String load_date;
        private String supplier_delivery_no;
        private String is_delivery;
        private String is_deliver_status;
        private List<DeliverListDetailBean> deliver_list_detail;
        private List<String> order_no_list;
        private List<String> supplier_name_list;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLoad_date() {
            return load_date;
        }

        public void setLoad_date(String load_date) {
            this.load_date = load_date;
        }

        public String getSupplier_delivery_no() {
            return supplier_delivery_no;
        }

        public void setSupplier_delivery_no(String supplier_delivery_no) {
            this.supplier_delivery_no = supplier_delivery_no;
        }

        public String getIs_delivery() {
            return is_delivery;
        }

        public void setIs_delivery(String is_delivery) {
            this.is_delivery = is_delivery;
        }

        public String getIs_deliver_status() {
            return is_deliver_status;
        }

        public void setIs_deliver_status(String is_deliver_status) {
            this.is_deliver_status = is_deliver_status;
        }

        public List<DeliverListDetailBean> getDeliver_list_detail() {
            return deliver_list_detail;
        }

        public void setDeliver_list_detail(List<DeliverListDetailBean> deliver_list_detail) {
            this.deliver_list_detail = deliver_list_detail;
        }

        public List<String> getOrder_no_list() {
            return order_no_list;
        }

        public void setOrder_no_list(List<String> order_no_list) {
            this.order_no_list = order_no_list;
        }

        public List<String> getSupplier_name_list() {
            return supplier_name_list;
        }

        public void setSupplier_name_list(List<String> supplier_name_list) {
            this.supplier_name_list = supplier_name_list;
        }

        public static class DeliverListDetailBean {
            /**
             * delivery_id : 109
             * order_no : AFX190618A
             * supplier_id : 251
             * bales_quantity : 80
             * meters_per_bale : 600
             * meters_per_bale_unit_id : 1
             * notes :
             * supplier_delivery_no : YD-AN200509D
             * warehouse_count : 11
             * checked : 1
             * supplier_name : 临清三和纺织集团有限公司
             * meters_per_bale_unit_name_en : y
             */

            private String delivery_id;
            private String order_no;
            private String supplier_id;
            private int bales_quantity;
            private int meters_per_bale;
            private String meters_per_bale_unit_id;
            private String notes;
            private String supplier_delivery_no;
            private int warehouse_count;
            private int checked;
            private String supplier_name;
            private String meters_per_bale_unit_name_en;

            public String getDelivery_id() {
                return delivery_id;
            }

            public void setDelivery_id(String delivery_id) {
                this.delivery_id = delivery_id;
            }

            public String getOrder_no() {
                return order_no;
            }

            public void setOrder_no(String order_no) {
                this.order_no = order_no;
            }

            public String getSupplier_id() {
                return supplier_id;
            }

            public void setSupplier_id(String supplier_id) {
                this.supplier_id = supplier_id;
            }

            public int getBales_quantity() {
                return bales_quantity;
            }

            public void setBales_quantity(int bales_quantity) {
                this.bales_quantity = bales_quantity;
            }

            public int getMeters_per_bale() {
                return meters_per_bale;
            }

            public void setMeters_per_bale(int meters_per_bale) {
                this.meters_per_bale = meters_per_bale;
            }

            public String getMeters_per_bale_unit_id() {
                return meters_per_bale_unit_id;
            }

            public void setMeters_per_bale_unit_id(String meters_per_bale_unit_id) {
                this.meters_per_bale_unit_id = meters_per_bale_unit_id;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }

            public String getSupplier_delivery_no() {
                return supplier_delivery_no;
            }

            public void setSupplier_delivery_no(String supplier_delivery_no) {
                this.supplier_delivery_no = supplier_delivery_no;
            }

            public int getWarehouse_count() {
                return warehouse_count;
            }

            public void setWarehouse_count(int warehouse_count) {
                this.warehouse_count = warehouse_count;
            }

            public int getChecked() {
                return checked;
            }

            public void setChecked(int checked) {
                this.checked = checked;
            }

            public String getSupplier_name() {
                return supplier_name;
            }

            public void setSupplier_name(String supplier_name) {
                this.supplier_name = supplier_name;
            }

            public String getMeters_per_bale_unit_name_en() {
                return meters_per_bale_unit_name_en;
            }

            public void setMeters_per_bale_unit_name_en(String meters_per_bale_unit_name_en) {
                this.meters_per_bale_unit_name_en = meters_per_bale_unit_name_en;
            }
        }
    }
}
