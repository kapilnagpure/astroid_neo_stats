package com.example.astroid_neostats.model;

import com.google.gson.annotations.SerializedName;

public class EstimatedDiameter {
    @SerializedName("kilometers")
    private KiloMeters kilometers;

    public KiloMeters getKilometers() {
        return kilometers;
    }

    public void setKilometers(KiloMeters kilometers) {
        this.kilometers = kilometers;
    }
}
