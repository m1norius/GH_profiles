package com.minorius.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Engine {

    @SerializedName("power")
    @Expose
    private Integer power;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("capacity")
    @Expose
    private Double capacity;

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

}