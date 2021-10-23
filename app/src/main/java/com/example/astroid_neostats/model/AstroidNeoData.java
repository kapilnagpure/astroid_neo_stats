package com.example.astroid_neostats.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;


public class AstroidNeoData {
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @SerializedName("links")
    private Links links;
    @SerializedName("element_count")
    private Integer elementCount;
    @SerializedName("near_earth_objects")
    private NearEarthObjects nearEarthObjects;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Integer getElementCount() {
        return elementCount;
    }

    public void setElementCount(Integer elementCount) {
        this.elementCount = elementCount;
    }

    public NearEarthObjects getNearEarthObjects() {
        return nearEarthObjects;
    }

    public void setNearEarthObjects(NearEarthObjects nearEarthObjects) {
        this.nearEarthObjects = nearEarthObjects;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

