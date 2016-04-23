package com.darrienglasser.goatfish;

import java.io.Serializable;

/**
 * Basic POJO. Used to hold strings when passing between intents.
 */
public class SearchDataContainer implements Serializable {
    private String mRadio;
    private String mLettering;
    private String mOwnerId;
    private String mPermit;
    private String mGear;
    private String mLocation;


    public SearchDataContainer(){}

    public SearchDataContainer(
            String radio,
            String lettering,
            String ownerId,
            String permit,
            String gear,
            String location) {

        this.mRadio = radio;
        this.mLettering = lettering;
        this.mOwnerId = ownerId;
        this.mPermit = permit;
        this.mGear = gear;
        this.mLocation = location;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        this.mLocation = location;
    }

    public String getRadio() {
        return mRadio;
    }

    public void setRadio(String radio) {
        this.mRadio = radio;
    }

    public String getLettering() {
        return mLettering;
    }

    public void setLettering(String lettering) {
        this.mLettering = lettering;
    }

    public String getOwnerId() {
        return mOwnerId;
    }

    public void setOwnerId(String ownerId) {
        this.mOwnerId = ownerId;
    }

    public String getPermit() {
        return mPermit;
    }

    public void setPermit(String permit) {
        this.mPermit = permit;
    }

    public String getGear() {
        return mGear;
    }

    public void setGear(String gear) {
        this.mGear = gear;
    }
}
