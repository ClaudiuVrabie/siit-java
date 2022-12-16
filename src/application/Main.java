package application;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Car passat = new VwPassat(21, "2457oopshgjy097");
        Car car = new Logan(27, "oiqe0934hkkadsn");
        Vehicle vehicle = new VwGolf(30, "1987ddkshik289");
        Car duster = new Duster(42,"4566dhjiuik154");

        car.getFuelType("disel");
        car.setTireSize(15);

        car.start();

        car.shiftGear(1);

        car.drive(0.01);

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();


        float availableFuel = car.getAvailableFuel(27, 24.4f);

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();

        System.out.println( car + " " + "consumption per 100 km is:" + " " + car.getConsumptionPer100Km() + "%");


        System.out.println("-----------------------------------------");


        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();
        car = (Car) vehicle;

        car.getAvailableFuel(32,31);

        System.out.println(vehicle + " " + "consumption per 100 km is:" + " " + car.getConsumptionPer100Km() + "%");



        System.out.println("----------------------------------");



        passat.start();

        passat.shiftGear(1);

        passat.drive(0.01);

        passat.shiftGear(2);

        passat.drive(0.02);

        passat.shiftGear(3);

        passat.drive(0.5);

        passat.shiftGear(4);

        passat.drive(0.5);

        passat.shiftGear(4);

        passat.drive(0.5);

        passat.shiftGear(5);

        passat.drive(10);

        passat.shiftGear(4);

        passat.drive(0.5);

        passat.shiftGear(3);

        passat.drive(0.1);

        passat.stop();
        passat.getAvailableFuel(21, 20.4f);
        System.out.println(passat + " " + "consumption per 100 km is:" + " " + passat.getConsumptionPer100Km() + "%");


        System.out.println("---------------------------------------------");


        duster.start();

        duster.shiftGear(1);

        duster.drive(0.01);

        duster.shiftGear(2);

        duster.drive(0.12);

        duster.shiftGear(3);

        duster.drive(12);

        duster.stop();

        duster.getAvailableFuel(45.3f,42.4f);
        System.out.println(duster + " " + "consumption per 100 km is:" + " " + duster.getConsumptionPer100Km() + "%");


    }
}