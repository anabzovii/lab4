package com.company;

import java.time.LocalDate;

public class Company extends Base{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Company(String name) {
        super();
        this.name = name;
    }
}
