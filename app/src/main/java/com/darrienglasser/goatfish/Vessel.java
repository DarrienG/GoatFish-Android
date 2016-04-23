package com.darrienglasser.goatfish;

public class Vessel {
    /** IMO. */
    private String id_num;

    private String name;
    private String Uvi;
    private String pictureUrl;
    private int size;
    private String radioCallClass;
    private Permit permit;

    public Vessel(String name) {
        this.name = name;
    }

    public String getId_num() {
        return id_num;
    }

    public void setId_num(String id_num) {
        this.id_num = id_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUvi() {
        return Uvi;
    }

    public void setUvi(String uvi) {
        Uvi = uvi;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getRadioCallClass() {
        return radioCallClass;
    }

    public void setRadioCallClass(String radioCallClass) {
        this.radioCallClass = radioCallClass;
    }

    public Permit getPermit() {
        return permit;
    }

    public void setPermit(Permit permit) {
        this.permit = permit;
    }
}
