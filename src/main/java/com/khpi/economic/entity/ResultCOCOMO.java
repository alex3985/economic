package com.khpi.economic.entity;

public class ResultCOCOMO {

    private double laborInput;
    private double durationProduction;
    private double averageNumberSpecialists;
    private double averageProductivitySpecialists;

    public double getLaborInput() {
        return laborInput;
    }

    public void setLaborInput(double laborInput) {
        this.laborInput = laborInput;
    }

    public double getDurationProduction() {
        return durationProduction;
    }

    public void setDurationProduction(double durationProduction) {
        this.durationProduction = durationProduction;
    }

    public double getAverageNumberSpecialists() {
        return averageNumberSpecialists;
    }

    public void setAverageNumberSpecialists(double averageNumberSpecialists) {
        this.averageNumberSpecialists = averageNumberSpecialists;
    }

    public double getAverageProductivitySpecialists() {
        return averageProductivitySpecialists;
    }

    public void setAverageProductivitySpecialists(double averageProductivitySpecialists) {
        this.averageProductivitySpecialists = averageProductivitySpecialists;
    }

}