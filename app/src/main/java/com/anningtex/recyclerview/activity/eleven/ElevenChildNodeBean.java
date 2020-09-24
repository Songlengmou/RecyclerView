package com.anningtex.recyclerview.activity.eleven;

import com.chad.library.adapter.base.entity.node.BaseNode;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @Author: Song
 */
public class ElevenChildNodeBean extends BaseNode {
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

    public void setInDate(String inDate) {
        InDate = inDate;
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

    public void setContainerNo(String containerNo) {
        ContainerNo = containerNo;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public String getVolumeUnit() {
        return VolumeUnit;
    }

    public void setVolumeUnit(String volumeUnit) {
        VolumeUnit = volumeUnit;
    }

    public String getWeightUnit() {
        return WeightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        WeightUnit = weightUnit;
    }

    public String getMetersPerBale() {
        return MetersPerBale;
    }

    public void setMetersPerBale(String metersPerBale) {
        MetersPerBale = metersPerBale;
    }

    public String getMetersPerBaleUnitID() {
        return MetersPerBaleUnitID;
    }

    public void setMetersPerBaleUnitID(String metersPerBaleUnitID) {
        MetersPerBaleUnitID = metersPerBaleUnitID;
    }

    public String getTexID_01() {
        return TexID_01;
    }

    public void setTexID_01(String texID_01) {
        TexID_01 = texID_01;
    }

    public String getTexType() {
        return TexType;
    }

    public void setTexType(String texType) {
        TexType = texType;
    }

    public String getTexName_Show() {
        return TexName_Show;
    }

    public void setTexName_Show(String texName_Show) {
        TexName_Show = texName_Show;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getUnitNameEN() {
        return UnitNameEN;
    }

    public void setUnitNameEN(String unitNameEN) {
        UnitNameEN = unitNameEN;
    }

    @Nullable
    @Override
    public List<BaseNode> getChildNode() {
        return null;
    }
}
