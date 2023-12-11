package com.example.nt118project.response.Asset;

import com.google.gson.annotations.SerializedName;

public class PM10 {
    @SerializedName("value")
    private double value;
    @SerializedName("timestamp")
    private long timestamp;

    public long getTimestamp() {
        return timestamp;
    }

    public double getValue() {
        return value;
    }
}
