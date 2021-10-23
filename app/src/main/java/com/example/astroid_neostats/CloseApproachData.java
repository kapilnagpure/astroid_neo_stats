package com.example.astroid_neostats;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class CloseApproachData {
   /* "close_approach_date": "2015-09-08",
            "close_approach_date_full": "2015-Sep-08 18:50",
            "epoch_date_close_approach": 1441738200000,*/

    @SerializedName("close_approach_date")
    private Date closeApproachDate;

    public CloseApproachData(Date closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
    }

    public Date getCloseApproachDate() {
        return closeApproachDate;
    }

    public void setCloseApproachDate(Date closeApproachDate) {
        this.closeApproachDate = closeApproachDate;
    }
}
