package ru.job4j.oop;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String type;
    private int passenger;
    private int maxSpeed;

    public  abstract void accelerate();

    public abstract  void street();

    public void brake() {
        System.out.println("Стандартная тормозная система");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
