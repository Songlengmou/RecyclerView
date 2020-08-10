package com.anningtex.recyclerview.activity.seven;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @Author Song
 */
@Data
public class ContainerBean {

    /**
     * code : 1
     * msg : Success
     * data : {"List_Info":[{"GNDD_ContainerInfoID":"1371","CIID":"1371","BLNo":"584305619","ContainerNo":"HASU5070898","SealNo":"MLCN3475055","LoadDate":"2019-10-16 00:00:00.000","LeaveDate":"2019-10-19 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":58.56,"WeightTotal":34184,"List_GoodsList":[{"TexName_01":"AFX","QSum":18000,"UnitName":"y"},{"TexName_01":"BZ","QSum":24000,"UnitName":"y"},{"TexName_01":"MF","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":36000,"UnitName":"y"},{"TexName_01":"TC45","QSum":201000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1382","CIID":"1382","BLNo":"584305637","ContainerNo":"MRKU6160273","SealNo":"CN3529883","LoadDate":"2019-10-21 00:00:00.000","LeaveDate":"2019-10-26 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.62,"WeightTotal":34074,"List_GoodsList":[{"TexName_01":"AFX","QSum":24000,"UnitName":"y"},{"TexName_01":"SJ","QSum":36000,"UnitName":"y"},{"TexName_01":"TC45","QSum":210000,"UnitName":"y"},{"TexName_01":"TR","QSum":7395,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1383","CIID":"1383","BLNo":"584305638","ContainerNo":"TGBU5392363","SealNo":"CN3529828","LoadDate":"2019-10-21 00:00:00.000","LeaveDate":"2019-10-26 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.64,"WeightTotal":34276,"List_GoodsList":[{"TexName_01":"SJ","QSum":60000,"UnitName":"y"},{"TexName_01":"TC45","QSum":210600,"UnitName":"y"},{"TexName_01":"TR","QSum":7200,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1388","CIID":"1388","BLNo":"584305677","ContainerNo":"TCKU6798286","SealNo":"CN3486180","LoadDate":"2019-10-23 00:00:00.000","LeaveDate":"2019-10-26 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.41,"WeightTotal":34015,"List_GoodsList":[{"TexName_01":"MF","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":48000,"UnitName":"y"},{"TexName_01":"SP","QSum":6000,"UnitName":"y"},{"TexName_01":"TC45","QSum":210000,"UnitName":"y"},{"TexName_01":"TR","QSum":7500,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1389","CIID":"1389","BLNo":"584305636","ContainerNo":"MRKU5724614","SealNo":"CN3706753","LoadDate":"2019-10-23 00:00:00.000","LeaveDate":"2019-10-26 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.71,"WeightTotal":34064,"List_GoodsList":[{"TexName_01":"AFX","QSum":6000,"UnitName":"y"},{"TexName_01":"AS","QSum":18600,"UnitName":"y"},{"TexName_01":"SJ","QSum":36000,"UnitName":"y"},{"TexName_01":"TC45","QSum":213000,"UnitName":"y"},{"TexName_01":"TR","QSum":5700,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1397","CIID":"1397","BLNo":"584305654","ContainerNo":"MSKU1832443","SealNo":"CN3547073","LoadDate":"2019-10-28 00:00:00.000","LeaveDate":"2019-11-02 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.59,"WeightTotal":33891,"List_GoodsList":[{"TexName_01":"AN","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":54000,"UnitName":"y"},{"TexName_01":"TC45","QSum":208200,"UnitName":"y"},{"TexName_01":"TR","QSum":8400,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1398","CIID":"1398","BLNo":"584305655","ContainerNo":"MRKU5537589","SealNo":"CN3547112","LoadDate":"2019-10-28 00:00:00.000","LeaveDate":"2019-11-02 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":57.69,"WeightTotal":33195,"List_GoodsList":[{"TexName_01":"AFX","QSum":36000,"UnitName":"y"},{"TexName_01":"BZ","QSum":9000,"UnitName":"y"},{"TexName_01":"SJ","QSum":24000,"UnitName":"y"},{"TexName_01":"TC45","QSum":207000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1405","CIID":"1405","BLNo":"584305653","ContainerNo":"TCKU6944919","SealNo":"CN3503618","LoadDate":"2019-10-30 00:00:00.000","LeaveDate":"2019-11-02 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.21,"WeightTotal":34015,"List_GoodsList":[{"TexName_01":"BZ","QSum":15000,"UnitName":"y"},{"TexName_01":"PS","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":54000,"UnitName":"y"},{"TexName_01":"TC45","QSum":210000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1406","CIID":"1406","BLNo":"584305502","ContainerNo":"HASU4104680","SealNo":"CN3539967","LoadDate":"2019-10-30 00:00:00.000","LeaveDate":"2019-11-02 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":56.94,"WeightTotal":33519,"List_GoodsList":[{"TexName_01":"BZ","QSum":25500,"UnitName":"y"},{"TexName_01":"SJ","QSum":60000,"UnitName":"y"},{"TexName_01":"TC45","QSum":190800,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1411","CIID":"1411","BLNo":"584305676","ContainerNo":"TCNU2822141","SealNo":"CN3470999","LoadDate":"2019-11-04 00:00:00.000","LeaveDate":"2019-11-09 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.63,"WeightTotal":34253,"List_GoodsList":[{"TexName_01":"AFX","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":54000,"UnitName":"y"},{"TexName_01":"TC45","QSum":211800,"UnitName":"y"},{"TexName_01":"TR","QSum":6457,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1412","CIID":"1412","BLNo":"584305675","ContainerNo":"MRSU4003690","SealNo":"MLCN3733934","LoadDate":"2019-11-04 00:00:00.000","LeaveDate":"2019-11-09 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.74,"WeightTotal":34744,"List_GoodsList":[{"TexName_01":"AFX","QSum":21000,"UnitName":"y"},{"TexName_01":"SJ","QSum":39000,"UnitName":"y"},{"TexName_01":"TC45","QSum":213000,"UnitName":"y"},{"TexName_01":"TR","QSum":6000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1419","CIID":"1419","BLNo":"584305674","ContainerNo":"MRSU3628677","SealNo":"CN3549643","LoadDate":"2019-11-06 00:00:00.000","LeaveDate":"2019-11-09 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.55,"WeightTotal":33393,"List_GoodsList":[{"TexName_01":"AFX","QSum":30000,"UnitName":"y"},{"TexName_01":"AN","QSum":24000,"UnitName":"y"},{"TexName_01":"PS","QSum":6000,"UnitName":"y"},{"TexName_01":"TC45","QSum":208200,"UnitName":"y"},{"TexName_01":"TR","QSum":8400,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1420","CIID":"1420","BLNo":"584305673","ContainerNo":"DFSU6157937","SealNo":"MLCN3468345","LoadDate":"2019-11-06 00:00:00.000","LeaveDate":"2019-11-09 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.8,"WeightTotal":33623,"List_GoodsList":[{"TexName_01":"AN","QSum":24000,"UnitName":"y"},{"TexName_01":"SJ","QSum":36000,"UnitName":"y"},{"TexName_01":"TC45","QSum":217200,"UnitName":"y"},{"TexName_01":"TR","QSum":3763,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1424","CIID":"1424","BLNo":"H","ContainerNo":"HJS","SealNo":"","LoadDate":"2019-11-11 00:00:00.000","LeaveDate":"2019-11-16 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.68,"WeightTotal":33941,"List_GoodsList":[{"TexName_01":"FO","QSum":3600,"UnitName":"y"},{"TexName_01":"SJ","QSum":54000,"UnitName":"y"},{"TexName_01":"SP","QSum":3000,"UnitName":"y"},{"TexName_01":"TC45","QSum":212400,"UnitName":"y"},{"TexName_01":"TR","QSum":6000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1425","CIID":"1425","BLNo":"04","ContainerNo":"04","SealNo":"","LoadDate":"2019-11-11 00:00:00.000","LeaveDate":"2019-11-16 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":70.31,"WeightTotal":34164,"List_GoodsList":[{"TexName_01":"CK","QSum":16778,"UnitName":"m"},{"TexName_01":"TC45","QSum":307200,"UnitName":"y"}]}],"total":{"List_Tex":[{"TexName_01":"AFX","UnitID":"1","total":141000,"UnitName":"y"},{"TexName_01":"AN","UnitID":"1","total":54000,"UnitName":"y"},{"TexName_01":"AS","UnitID":"1","total":18600,"UnitName":"y"},{"TexName_01":"BZ","UnitID":"1","total":73500,"UnitName":"y"},{"TexName_01":"CK","UnitID":"4","total":16778,"UnitName":"m"},{"TexName_01":"FO","UnitID":"1","total":3600,"UnitName":"y"},{"TexName_01":"MF","UnitID":"1","total":12000,"UnitName":"y"},{"TexName_01":"PS","UnitID":"1","total":12000,"UnitName":"y"},{"TexName_01":"SJ","UnitID":"1","total":591000,"UnitName":"y"},{"TexName_01":"SP","UnitID":"1","total":9000,"UnitName":"y"},{"TexName_01":"TC45","UnitID":"1","total":3230400,"UnitName":"y"},{"TexName_01":"TR","UnitID":"1","total":66815,"UnitName":"y"}],"Sum_Volume":899.0799999999997,"Sum_Weight":509351}}
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
         * List_Info : [{"GNDD_ContainerInfoID":"1371","CIID":"1371","BLNo":"584305619","ContainerNo":"HASU5070898","SealNo":"MLCN3475055","LoadDate":"2019-10-16 00:00:00.000","LeaveDate":"2019-10-19 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":58.56,"WeightTotal":34184,"List_GoodsList":[{"TexName_01":"AFX","QSum":18000,"UnitName":"y"},{"TexName_01":"BZ","QSum":24000,"UnitName":"y"},{"TexName_01":"MF","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":36000,"UnitName":"y"},{"TexName_01":"TC45","QSum":201000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1382","CIID":"1382","BLNo":"584305637","ContainerNo":"MRKU6160273","SealNo":"CN3529883","LoadDate":"2019-10-21 00:00:00.000","LeaveDate":"2019-10-26 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.62,"WeightTotal":34074,"List_GoodsList":[{"TexName_01":"AFX","QSum":24000,"UnitName":"y"},{"TexName_01":"SJ","QSum":36000,"UnitName":"y"},{"TexName_01":"TC45","QSum":210000,"UnitName":"y"},{"TexName_01":"TR","QSum":7395,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1383","CIID":"1383","BLNo":"584305638","ContainerNo":"TGBU5392363","SealNo":"CN3529828","LoadDate":"2019-10-21 00:00:00.000","LeaveDate":"2019-10-26 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.64,"WeightTotal":34276,"List_GoodsList":[{"TexName_01":"SJ","QSum":60000,"UnitName":"y"},{"TexName_01":"TC45","QSum":210600,"UnitName":"y"},{"TexName_01":"TR","QSum":7200,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1388","CIID":"1388","BLNo":"584305677","ContainerNo":"TCKU6798286","SealNo":"CN3486180","LoadDate":"2019-10-23 00:00:00.000","LeaveDate":"2019-10-26 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.41,"WeightTotal":34015,"List_GoodsList":[{"TexName_01":"MF","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":48000,"UnitName":"y"},{"TexName_01":"SP","QSum":6000,"UnitName":"y"},{"TexName_01":"TC45","QSum":210000,"UnitName":"y"},{"TexName_01":"TR","QSum":7500,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1389","CIID":"1389","BLNo":"584305636","ContainerNo":"MRKU5724614","SealNo":"CN3706753","LoadDate":"2019-10-23 00:00:00.000","LeaveDate":"2019-10-26 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":"254722879833","CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.71,"WeightTotal":34064,"List_GoodsList":[{"TexName_01":"AFX","QSum":6000,"UnitName":"y"},{"TexName_01":"AS","QSum":18600,"UnitName":"y"},{"TexName_01":"SJ","QSum":36000,"UnitName":"y"},{"TexName_01":"TC45","QSum":213000,"UnitName":"y"},{"TexName_01":"TR","QSum":5700,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1397","CIID":"1397","BLNo":"584305654","ContainerNo":"MSKU1832443","SealNo":"CN3547073","LoadDate":"2019-10-28 00:00:00.000","LeaveDate":"2019-11-02 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.59,"WeightTotal":33891,"List_GoodsList":[{"TexName_01":"AN","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":54000,"UnitName":"y"},{"TexName_01":"TC45","QSum":208200,"UnitName":"y"},{"TexName_01":"TR","QSum":8400,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1398","CIID":"1398","BLNo":"584305655","ContainerNo":"MRKU5537589","SealNo":"CN3547112","LoadDate":"2019-10-28 00:00:00.000","LeaveDate":"2019-11-02 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":57.69,"WeightTotal":33195,"List_GoodsList":[{"TexName_01":"AFX","QSum":36000,"UnitName":"y"},{"TexName_01":"BZ","QSum":9000,"UnitName":"y"},{"TexName_01":"SJ","QSum":24000,"UnitName":"y"},{"TexName_01":"TC45","QSum":207000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1405","CIID":"1405","BLNo":"584305653","ContainerNo":"TCKU6944919","SealNo":"CN3503618","LoadDate":"2019-10-30 00:00:00.000","LeaveDate":"2019-11-02 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.21,"WeightTotal":34015,"List_GoodsList":[{"TexName_01":"BZ","QSum":15000,"UnitName":"y"},{"TexName_01":"PS","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":54000,"UnitName":"y"},{"TexName_01":"TC45","QSum":210000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1406","CIID":"1406","BLNo":"584305502","ContainerNo":"HASU4104680","SealNo":"CN3539967","LoadDate":"2019-10-30 00:00:00.000","LeaveDate":"2019-11-02 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":56.94,"WeightTotal":33519,"List_GoodsList":[{"TexName_01":"BZ","QSum":25500,"UnitName":"y"},{"TexName_01":"SJ","QSum":60000,"UnitName":"y"},{"TexName_01":"TC45","QSum":190800,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1411","CIID":"1411","BLNo":"584305676","ContainerNo":"TCNU2822141","SealNo":"CN3470999","LoadDate":"2019-11-04 00:00:00.000","LeaveDate":"2019-11-09 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.63,"WeightTotal":34253,"List_GoodsList":[{"TexName_01":"AFX","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":54000,"UnitName":"y"},{"TexName_01":"TC45","QSum":211800,"UnitName":"y"},{"TexName_01":"TR","QSum":6457,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1412","CIID":"1412","BLNo":"584305675","ContainerNo":"MRSU4003690","SealNo":"MLCN3733934","LoadDate":"2019-11-04 00:00:00.000","LeaveDate":"2019-11-09 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.74,"WeightTotal":34744,"List_GoodsList":[{"TexName_01":"AFX","QSum":21000,"UnitName":"y"},{"TexName_01":"SJ","QSum":39000,"UnitName":"y"},{"TexName_01":"TC45","QSum":213000,"UnitName":"y"},{"TexName_01":"TR","QSum":6000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1419","CIID":"1419","BLNo":"584305674","ContainerNo":"MRSU3628677","SealNo":"CN3549643","LoadDate":"2019-11-06 00:00:00.000","LeaveDate":"2019-11-09 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.55,"WeightTotal":33393,"List_GoodsList":[{"TexName_01":"AFX","QSum":30000,"UnitName":"y"},{"TexName_01":"AN","QSum":24000,"UnitName":"y"},{"TexName_01":"PS","QSum":6000,"UnitName":"y"},{"TexName_01":"TC45","QSum":208200,"UnitName":"y"},{"TexName_01":"TR","QSum":8400,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1420","CIID":"1420","BLNo":"584305673","ContainerNo":"DFSU6157937","SealNo":"MLCN3468345","LoadDate":"2019-11-06 00:00:00.000","LeaveDate":"2019-11-09 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"MSK","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.8,"WeightTotal":33623,"List_GoodsList":[{"TexName_01":"AN","QSum":24000,"UnitName":"y"},{"TexName_01":"SJ","QSum":36000,"UnitName":"y"},{"TexName_01":"TC45","QSum":217200,"UnitName":"y"},{"TexName_01":"TR","QSum":3763,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1424","CIID":"1424","BLNo":"H","ContainerNo":"HJS","SealNo":"","LoadDate":"2019-11-11 00:00:00.000","LeaveDate":"2019-11-16 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":59.68,"WeightTotal":33941,"List_GoodsList":[{"TexName_01":"FO","QSum":3600,"UnitName":"y"},{"TexName_01":"SJ","QSum":54000,"UnitName":"y"},{"TexName_01":"SP","QSum":3000,"UnitName":"y"},{"TexName_01":"TC45","QSum":212400,"UnitName":"y"},{"TexName_01":"TR","QSum":6000,"UnitName":"y"}]},{"GNDD_ContainerInfoID":"1425","CIID":"1425","BLNo":"04","ContainerNo":"04","SealNo":"","LoadDate":"2019-11-11 00:00:00.000","LeaveDate":"2019-11-16 00:00:00.000","ContainerSize":"1×40","ShipCompanyEN":"","ToPort":"MOMBASA","IsOffLoad":"0","OffLoadDate":null,"UserSupplier_IsTransit":null,"CountryID":"1","CountryName":"肯尼亚","CountryName_EN":"Kenya","VolumeTotal":70.31,"WeightTotal":34164,"List_GoodsList":[{"TexName_01":"CK","QSum":16778,"UnitName":"m"},{"TexName_01":"TC45","QSum":307200,"UnitName":"y"}]}]
         * total : {"List_Tex":[{"TexName_01":"AFX","UnitID":"1","total":141000,"UnitName":"y"},{"TexName_01":"AN","UnitID":"1","total":54000,"UnitName":"y"},{"TexName_01":"AS","UnitID":"1","total":18600,"UnitName":"y"},{"TexName_01":"BZ","UnitID":"1","total":73500,"UnitName":"y"},{"TexName_01":"CK","UnitID":"4","total":16778,"UnitName":"m"},{"TexName_01":"FO","UnitID":"1","total":3600,"UnitName":"y"},{"TexName_01":"MF","UnitID":"1","total":12000,"UnitName":"y"},{"TexName_01":"PS","UnitID":"1","total":12000,"UnitName":"y"},{"TexName_01":"SJ","UnitID":"1","total":591000,"UnitName":"y"},{"TexName_01":"SP","UnitID":"1","total":9000,"UnitName":"y"},{"TexName_01":"TC45","UnitID":"1","total":3230400,"UnitName":"y"},{"TexName_01":"TR","UnitID":"1","total":66815,"UnitName":"y"}],"Sum_Volume":899.0799999999997,"Sum_Weight":509351}
         */

        private TotalBean total;
        private List<ListInfoBean> List_Info;

        public TotalBean getTotal() {
            return total;
        }

        public List<ListInfoBean> getList_Info() {
            return List_Info;
        }

        @Data
        public static class TotalBean implements Serializable {
            /**
             * List_Tex : [{"TexName_01":"AFX","UnitID":"1","total":141000,"UnitName":"y"},{"TexName_01":"AN","UnitID":"1","total":54000,"UnitName":"y"},{"TexName_01":"AS","UnitID":"1","total":18600,"UnitName":"y"},{"TexName_01":"BZ","UnitID":"1","total":73500,"UnitName":"y"},{"TexName_01":"CK","UnitID":"4","total":16778,"UnitName":"m"},{"TexName_01":"FO","UnitID":"1","total":3600,"UnitName":"y"},{"TexName_01":"MF","UnitID":"1","total":12000,"UnitName":"y"},{"TexName_01":"PS","UnitID":"1","total":12000,"UnitName":"y"},{"TexName_01":"SJ","UnitID":"1","total":591000,"UnitName":"y"},{"TexName_01":"SP","UnitID":"1","total":9000,"UnitName":"y"},{"TexName_01":"TC45","UnitID":"1","total":3230400,"UnitName":"y"},{"TexName_01":"TR","UnitID":"1","total":66815,"UnitName":"y"}]
             * Sum_Volume : 899.0799999999997
             * Sum_Weight : 509351
             */

            private double Sum_Volume;
            private int Sum_Weight;
            private List<ListTexBean> List_Tex;

            public List<ListTexBean> getList_Tex() {
                return List_Tex;
            }

            @Data
            public static class ListTexBean {
                /**
                 * TexName_01 : AFX
                 * UnitID : 1
                 * total : 141000
                 * UnitName : y
                 */

                private String TexName_01, UnitID, UnitName;
                private int total;
            }
        }

        @Data
        public static class ListInfoBean implements Serializable {
            /**
             * GNDD_ContainerInfoID : 1371
             * CIID : 1371
             * BLNo : 584305619
             * ContainerNo : HASU5070898
             * SealNo : MLCN3475055
             * LoadDate : 2019-10-16 00:00:00.000
             * LeaveDate : 2019-10-19 00:00:00.000
             * ContainerSize : 1×40
             * ShipCompanyEN : MSK
             * ToPort : MOMBASA
             * IsOffLoad : 0
             * OffLoadDate : null
             * UserSupplier_IsTransit : 254722879833
             * CountryID : 1
             * CountryName : 肯尼亚
             * CountryName_EN : Kenya
             * VolumeTotal : 58.56
             * WeightTotal : 34184
             * List_GoodsList : [{"TexName_01":"AFX","QSum":18000,"UnitName":"y"},{"TexName_01":"BZ","QSum":24000,"UnitName":"y"},{"TexName_01":"MF","QSum":6000,"UnitName":"y"},{"TexName_01":"SJ","QSum":36000,"UnitName":"y"},{"TexName_01":"TC45","QSum":201000,"UnitName":"y"}]
             */

            private String GNDD_ContainerInfoID;
            private String CIID;
            private String BLNo;
            private String ContainerNo;
            private String SealNo;
            private String LoadDate;
            private String LeaveDate;
            private String ContainerSize;
            private String ShipCompanyEN;
            private String ToPort;
            private String IsOffLoad;
            private Object OffLoadDate;
            private String UserSupplier_IsTransit;
            private String CountryID;
            private String CountryName;
            private String CountryName_EN;
            private double VolumeTotal;
            private float WeightTotal;
            private List<ListGoodsListBean> List_GoodsList;

            public List<ListGoodsListBean> getList_GoodsList() {
                return List_GoodsList;
            }

            @Data
            public static class ListGoodsListBean {
                /**
                 * TexName_01 : AFX
                 * QSum : 18000
                 * UnitName : y
                 */

                private String TexName_01, UnitName;
                private int QSum;
            }
        }
    }
}
