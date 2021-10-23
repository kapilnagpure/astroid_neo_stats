package com.example.astroid_neostats;

import com.google.gson.annotations.SerializedName;

public class KiloMeter {
// "kilometers": {
//        "estimated_diameter_min": 0.0728710415,
//                "estimated_diameter_max": 0.1629446024
//    },

    @SerializedName("estimated_diameter_min")
    private Double estimatedDiameterMin;
    @SerializedName("estimated_diameter_max")
    private Double estimatedDiameterMax;
}
