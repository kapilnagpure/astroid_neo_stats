package com.example.astroid_neostats.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DateWiseData {
    @SerializedName("links")
    private Links links;
    @SerializedName("id")
    private String id;
    @SerializedName("neo_reference_id")
    private String neoReferenceId;
    @SerializedName("name")
    private String name;
    @SerializedName("nasa_jpl_url")
    private String nasaJplUrl;
    @SerializedName("absolute_magnitude_h")
    private Double absoluteMagnitudeH;
    @SerializedName("estimated_diameter")
    private EstimatedDiameter estimatedDiameter;
    @SerializedName("is_potentially_hazardous_asteroid")
    private Boolean isPotentiallyHazardousAsteroid;
    @SerializedName("close_approach_data")
    private List<CloseApproachData> closeApproachData = null;
    @SerializedName("is_sentry_object")
    private Boolean isSentryObject;

    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNeoReferenceId() {
        return neoReferenceId;
    }

    public void setNeoReferenceId(String neoReferenceId) {
        this.neoReferenceId = neoReferenceId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getNasaJplUrl() {
        return nasaJplUrl;
    }


    public void setNasaJplUrl(String nasaJplUrl) {
        this.nasaJplUrl = nasaJplUrl;
    }


    public Double getAbsoluteMagnitudeH() {
        return absoluteMagnitudeH;
    }


    public void setAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
        this.absoluteMagnitudeH = absoluteMagnitudeH;
    }

    public EstimatedDiameter getEstimatedDiameter() {
        return estimatedDiameter;
    }

    public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
    }

    public Boolean getIsPotentiallyHazardousAsteroid() {
        return isPotentiallyHazardousAsteroid;
    }

    public void setIsPotentiallyHazardousAsteroid(Boolean isPotentiallyHazardousAsteroid) {
        this.isPotentiallyHazardousAsteroid = isPotentiallyHazardousAsteroid;
    }

    public List<CloseApproachData> getCloseApproachData() {
        return closeApproachData;
    }


    public void setCloseApproachData(List<CloseApproachData> closeApproachData) {
        this.closeApproachData = closeApproachData;
    }


    public Boolean getIsSentryObject() {
        return isSentryObject;
    }


    public void setIsSentryObject(Boolean isSentryObject) {
        this.isSentryObject = isSentryObject;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}