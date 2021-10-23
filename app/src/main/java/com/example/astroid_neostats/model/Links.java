package com.example.astroid_neostats.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;


public class Links {

    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @SerializedName("next")
    private String next;
    @SerializedName("prev")
    private String prev;
    @SerializedName("self")
    private String self;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
