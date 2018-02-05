package com.yahier.pincan.table;

public class Pincan {
    public long pincanId = 10;
    public String dishType = "川菜";
    public String flavor;
    public int personNum;
    public int budget = 80;
    public long longitude = 123;//经度
    public long latitude = 25;//纬度

    public long getPincanId() {
        return pincanId;
    }

    public void setPincanId(long pincanId) {
        this.pincanId = pincanId;
    }

    public String getDishType() {
        return dishType;
    }

    public void setDishType(String dishType) {
        this.dishType = dishType;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPersonNum() {
        return personNum;
    }

    public void setPersonNum(int personNum) {
        this.personNum = personNum;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }
}
