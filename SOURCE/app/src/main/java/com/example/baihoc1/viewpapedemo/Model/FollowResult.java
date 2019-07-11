package com.example.baihoc1.viewpapedemo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FollowResult implements Serializable {

@SerializedName("materialID")
@Expose
public String materialID;
@SerializedName("materialName")
@Expose
public String materialName;
@SerializedName("unit")
@Expose
public String unit;
@SerializedName("price")
@Expose
public Float price;
@SerializedName("maxKm")
@Expose
public Float maxKm;

    public String getMaterialID() {
        return materialID;
    }

    public void setMaterialID(String materialID) {
        this.materialID = materialID;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(Float maxKm) {
        this.maxKm = maxKm;
    }
}