package com.darrienglasser.goatfish;

public class ResultsMicroGroup {
    private String name;
    private String year;
    private String imo;
    private String uvi;
    private String length;
    private String units;
    private String country;

    public ResultsMicroGroup(
            String name,
            String year,
            String imo,
            String uvi,
            String length,
            String units,
            String country) {

        this.name = name;
        this.year = year;
        this.imo = imo;
        this.uvi = uvi;
        this.length = length;
        this.units = units;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}