package com.example.nt118project.response.Asset;

import com.google.gson.annotations.SerializedName;

public class sunIrradiance {
    @SerializedName("value")
    private double value;
    @SerializedName("timestamp")
    private long timestamp;

    public double getValue() {
        return value;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
