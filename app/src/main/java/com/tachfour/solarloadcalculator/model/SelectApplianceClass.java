package com.tachfour.solarloadcalculator.model;

public class SelectApplianceClass{
    private String tv_appliancename;
    private String tv_appliancevalue;
    private String tv_quantity;
    private String tv_wattage;

    public SelectApplianceClass(String tv_appliancename, String tv_appliancevalue, String tv_quantity, String tv_wattage) {
        this.tv_appliancename = tv_appliancename;
        this.tv_appliancevalue = tv_appliancevalue;
        this.tv_quantity = tv_quantity;
        this.tv_wattage = tv_wattage;
    }

    public String getTv_appliancename() {
        return tv_appliancename;
    }

    public void setTv_appliancename(String tv_appliancename) {
        this.tv_appliancename = tv_appliancename;
    }

    public String getTv_appliancevalue() {
        return tv_appliancevalue;
    }

    public void setTv_appliancevalue(String tv_appliancevalue) {
        this.tv_appliancevalue = tv_appliancevalue;
    }

    public String getTv_quantity() {
        return tv_quantity;
    }

    public void setTv_quantity(String tv_quantity) {
        this.tv_quantity = tv_quantity;
    }

    public String getTv_wattage() {
        return tv_wattage;
    }

    public void setTv_wattage(String tv_wattage) {
        this.tv_wattage = tv_wattage;
    }
}
