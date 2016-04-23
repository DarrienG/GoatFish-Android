package com.darrienglasser.goatfish;

import java.io.Serializable;

/**
 * Basic POJO. Used to hold strings when passing between intents.
 */
public class SearchDataContainer implements Serializable {
    private String mName;
    private String mUvi;
    private String mImo;
    private String mCountry;


    public SearchDataContainer(){}

    public SearchDataContainer(
            String permit,
            String gear,
            String location,
            String country) {

        this.mName = permit;
        this.mUvi = gear;
        this.mImo = location;
        mCountry = country;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName= name;
    }

    public String getUvi() {
        return mUvi;
    }

    public void setUvi(String Uvi) {
        this.mUvi = Uvi;
    }

    public String getImo() {
        return mImo;
    }

    public void setImo(String imo) {
        mImo = imo;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public void setGear(String gear) {
        this.mUvi = gear;
    }
}
