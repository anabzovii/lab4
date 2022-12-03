package com.company;

abstract class Employee extends Avion {

    private double salary;
    private int experience;
    private String name, surname;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Employee(String name, String surname, int year, int experience, double basesal,int nrpasageri, float fueltank, String model, String companyname) {
        super(nrpasageri,fueltank,model,companyname);
        this.salary = basesal+(experience*1300);
        this.experience = experience;
        this.name = name;
        this.surname= surname;
    }
}
