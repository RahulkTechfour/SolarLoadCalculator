package com.tachfour.solarloadcalculator.model;

public class ListApplianceItem {

    String smallappliance;
    int wattage;

    public ListApplianceItem(String smallappliance, int wattage) {
        this.smallappliance = smallappliance;
        this.wattage = wattage;
    }

    public ListApplianceItem() {
    }

    public String getSmallappliance() {
        return smallappliance;
    }

    public void setSmallappliance(String smallappliance) {
        this.smallappliance = smallappliance;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
}
