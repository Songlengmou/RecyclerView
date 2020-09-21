package com.anningtex.recyclerview.activity.ten;

import java.util.List;

/**
 * @Author Song
 * @Desc:
 */
public class TenBean {

    /**
     * code : 1
     * msg : Success
     * data : {"tex_type":"IsFlower","goods_spec_in_list":[{"id":29,"container_id":1141,"order_no":"MF181229A","bales":-4,"meters_per_bale":600,"meters_per_bale_unit_id":1,"volume_unit":"0.1000","weight_unit":"71.0000","is_manual":1,"notes":""}]}
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
         * tex_type : IsFlower
         * goods_spec_in_list : [{"id":29,"container_id":1141,"order_no":"MF181229A","bales":-4,"meters_per_bale":600,"meters_per_bale_unit_id":1,"volume_unit":"0.1000","weight_unit":"71.0000","is_manual":1,"notes":""}]
         */

        private String tex_type;
        private List<GoodsSpecInListBean> goods_spec_in_list;

        public String getTex_type() {
            return tex_type;
        }

        public void setTex_type(String tex_type) {
            this.tex_type = tex_type;
        }

        public List<GoodsSpecInListBean> getGoods_spec_in_list() {
            return goods_spec_in_list;
        }

        public void setGoods_spec_in_list(List<GoodsSpecInListBean> goods_spec_in_list) {
            this.goods_spec_in_list = goods_spec_in_list;
        }

        public static class GoodsSpecInListBean {
            /**
             * id : 29
             * container_id : 1141
             * order_no : MF181229A
             * bales : -4
             * meters_per_bale : 600
             * meters_per_bale_unit_id : 1
             * volume_unit : 0.1000
             * weight_unit : 71.0000
             * is_manual : 1
             * notes :
             */

            private int id;
            private int container_id;
            private String order_no;
            private int bales;
            private int meters_per_bale;
            private int meters_per_bale_unit_id;
            private String volume_unit;
            private String weight_unit;
            private int is_manual;
            private String notes;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getContainer_id() {
                return container_id;
            }

            public void setContainer_id(int container_id) {
                this.container_id = container_id;
            }

            public String getOrder_no() {
                return order_no;
            }

            public void setOrder_no(String order_no) {
                this.order_no = order_no;
            }

            public int getBales() {
                return bales;
            }

            public void setBales(int bales) {
                this.bales = bales;
            }

            public int getMeters_per_bale() {
                return meters_per_bale;
            }

            public void setMeters_per_bale(int meters_per_bale) {
                this.meters_per_bale = meters_per_bale;
            }

            public int getMeters_per_bale_unit_id() {
                return meters_per_bale_unit_id;
            }

            public void setMeters_per_bale_unit_id(int meters_per_bale_unit_id) {
                this.meters_per_bale_unit_id = meters_per_bale_unit_id;
            }

            public String getVolume_unit() {
                return volume_unit;
            }

            public void setVolume_unit(String volume_unit) {
                this.volume_unit = volume_unit;
            }

            public String getWeight_unit() {
                return weight_unit;
            }

            public void setWeight_unit(String weight_unit) {
                this.weight_unit = weight_unit;
            }

            public int getIs_manual() {
                return is_manual;
            }

            public void setIs_manual(int is_manual) {
                this.is_manual = is_manual;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }
        }
    }
}
