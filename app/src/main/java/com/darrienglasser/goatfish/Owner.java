package com.darrienglasser.goatfish;

import java.util.ArrayList;

public class Owner {
    private String name;
    private ArrayList<Vessel> vessels;

    public Owner(String name, ArrayList<Vessel> vessels) {
        this.name = name;
        this.vessels = vessels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vessel> getVessels() {
        return vessels;
    }

    public void setVessels(ArrayList<Vessel> vessels) {
        this.vessels = vessels;
    }
}
