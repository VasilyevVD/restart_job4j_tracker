package ru.job4j.oop;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Марка", "Модель");
        Car.Transmission transmission = car.new Transmission();
        Car.Brakes brakes = car.new Brakes();
        car.startEngine();
        transmission.accelertr();
        brakes.brake();
        System.out.println();
        Car.TripComputer tripComputer = car.new TripComputer();
        tripComputer.getInfo();
    }
}
