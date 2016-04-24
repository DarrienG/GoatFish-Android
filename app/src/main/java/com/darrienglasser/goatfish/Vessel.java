package com.darrienglasser.goatfish;

import java.io.Serializable;

public class Vessel implements Serializable {
    /** Country. */
    private String flag;
    /** Vessel name. */
    private String name;
    /** IMO. */
    private String imo;
    /** Unique Vessel Identifier. */
    private String uvi;
    /** Year. */
    private String year;
    /** Length of boat. */
    private String length;
    /** Length units. */
    private String lengthUnits;
    /** Tonnage of boat. */
    private String tonnage;
    /** Tonnage type. */
    private String tonnageType;
    /** Owner. */
    private String owner;
    /** Vessel Type. */
    private String vesselType;

    public Vessel(
            String flag,
            String name,
            String imo,
            String year,
            String uvi,
            String length,
            String lengthUnits,
            String tonnage,
            String tonnageType) {
        
        this.flag = flag;
        this.name = name;
        this.imo = imo;
        this.uvi = uvi;
        this.year = year;
        this.length = length;
        this.lengthUnits = lengthUnits;
        this.tonnage = tonnage;
        this.tonnageType = tonnageType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImo() {
        return imo;
    }

    public void setImo(String imo) {
        this.imo = imo;
    }

    public String getUvi() {
        return uvi;
    }

    public void setUvi(String uvi) {
        this.uvi = uvi;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getLengthUnits() {
        return lengthUnits;
    }

    public void setLengthUnits(String lengthUnits) {
        this.lengthUnits = lengthUnits;
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    public String getTonnageType() {
        return tonnageType;
    }

    public void setTonnageType(String tonnageType) {
        this.tonnageType = tonnageType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }
}
