package com.company;

import java.util.UUID;

public class Avion extends Company{
    private int nrpasageri;
    private double fueltank;
    private String model;


    public int getNrpasageri() {
        return nrpasageri;
    }

    public void setNrpasageri(int nrpasageri) {
        this.nrpasageri = nrpasageri;
    }

    public double getFueltank() {
        return fueltank;
    }

    public void setFueltank(double fueltank) {
        this.fueltank = fueltank;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Avion(int nrpasageri, float fueltank, String model, String companyname) {
        super(companyname);
        this.nrpasageri = nrpasageri;
        this.fueltank = fueltank;
        this.model=model;
    }

    public double Flydistance(double fueltank){
        double distance = fueltank/12;
        return distance;
    }
}
