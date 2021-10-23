package com.example.astroid_neostats;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class EstimatedDiameter {
// "kilometers": {
//        "estimated_diameter_min": 0.0728710415,
//                "estimated_diameter_max": 0.1629446024
//    },

    @SerializedName("kilometers")
    private KiloMeter closeApproachDate;

    public EstimatedDiameter(KiloMeter closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
    }

    public KiloMeter getCloseApproachDate() {
        return closeApproachDate;
    }

    public void setCloseApproachDate(KiloMeter closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
    }
}
