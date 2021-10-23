package com.example.astroid_neostats;

import com.google.gson.annotations.SerializedName;

public class NeoData {
   /* "id": "2465633",
            "neo_reference_id": "2465633",
            "name": "465633 (2009 JR5)",
            "nasa_jpl_url": "http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=2465633",
            "absolute_magnitude_h": 20.36,*/

    @SerializedName("id")
    private long id;
    @SerializedName("name")
    private String name;
    @SerializedName("nasa_jpl_url")
    private String url;
    @SerializedName("absolute_magnitude_h")
    private double absoluteMagnitude;
    @SerializedName("estimated_diameter")
    private EstimatedDiameter estimatedDiameter;
    @SerializedName("close_approach_data")
    private CloseApproachData closeApproachData;

    public NeoData(long id, String name, String url, double absoluteMagnitude, EstimatedDiameter estimatedDiameter, CloseApproachData closeApproachData) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.absoluteMagnitude = absoluteMagnitude;
        this.estimatedDiameter = estimatedDiameter;
        this.closeApproachData = closeApproachData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getAbsoluteMagnitude() {
        return absoluteMagnitude;
    }

    public void setAbsoluteMagnitude(double absoluteMagnitude) {
        this.absoluteMagnitude = absoluteMagnitude;
    }

    public EstimatedDiameter getEstimatedDiameter() {
        return estimatedDiameter;
    }

    public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
    }

    public CloseApproachData getCloseApproachData() {
        return closeApproachData;
    }

    public void setCloseApproachData(CloseApproachData closeApproachData) {
        this.closeApproachData = closeApproachData;
    }
}
