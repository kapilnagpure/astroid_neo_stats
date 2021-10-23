package com.example.astroid_neostats.model;

import com.google.gson.annotations.SerializedName;

public class KiloMeters {

    @SerializedName("estimated_diameter_min")
    private Double estimatedDiameterMin;
    @SerializedName("estimated_diameter_max")
    private Double estimatedDiameterMax;

    public Double getEstimatedDiameterMin() {
        return estimatedDiameterMin;
    }

    public void setEstimatedDiameterMin(Double estimatedDiameterMin) {
        this.estimatedDiameterMin = estimatedDiameterMin;
    }

    public Double getEstimatedDiameterMax() {
        return estimatedDiameterMax;
    }

    public void setEstimatedDiameterMax(Double estimatedDiameterMax) {
        this.estimatedDiameterMax = estimatedDiameterMax;
    }
}
