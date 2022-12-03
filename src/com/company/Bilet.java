package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Bilet extends Avion{
    private String countryin;
    private String countryout;
    private float price;
    private LocalDate data;

    public UUID getId(){
        return id;
    }

    public String getCountryin() {
        return countryin;
    }

    public void setCountryin(String countryin) {
        this.countryin = countryin;
    }

    public String getCountryout() {
        return countryout;
    }

    public void setCountryout(String countryout) {
        this.countryout = countryout;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public Bilet(String countryin, String countryout, float price, LocalDate data, int nrpasageri, float fueltank, String model, String companyname) {
        super(nrpasageri,fueltank,model,companyname);
        this.countryin = countryin;
        this.countryout = countryout;
        this.price = price;
        this.data = data;
    }
}