package com.ioprogramming.jsondata.practiceproblems.javaobject;

public class Car {
    private int carNumber;
    private String carType;

    public Car(String carType,int carNumber){
        this.carNumber=carNumber;
        this.carType=carType;
    }
    public int getCarNumber() {
        return carNumber;
    }

    public String getCarType() {
        return carType;
    }
}
