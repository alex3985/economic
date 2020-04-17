package com.khpi.economic.form;

import javax.validation.constraints.NotNull;

public class COCOMOForm {

    @NotNull
    private int capacity;

    @NotNull
    private double coefA;

    @NotNull
    private double coefG;

    @NotNull
    private double coefH;

    @NotNull
    private double coefE;

    @NotNull
    private double[] coefMArray;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCoefA() {
        return coefA;
    }

    public void setCoefA(double coefA) {
        this.coefA = coefA;
    }

    public double getCoefG() {
        return coefG;
    }

    public void setCoefG(double coefG) {
        this.coefG = coefG;
    }

    public double getCoefH() {
        return coefH;
    }

    public void setCoefH(double coefH) {
        this.coefH = coefH;
    }

    public double getCoefE() {
        return coefE;
    }

    public void setCoefE(double coefE) {
        this.coefE = coefE;
    }

    public double[] getCoefMArray() {
        return coefMArray;
    }

    public void setCoefMArray(double[] coefMArray) {
        this.coefMArray = coefMArray;
    }

}