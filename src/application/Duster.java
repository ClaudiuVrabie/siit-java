package application;

public class Duster extends Car {


    public Duster( float availableFuel, String chasisNr ){
        this.setAvailableFuel(availableFuel);
        this.setChasisNumber(chasisNr);
    }



    @Override
    public void start() {
        System.out.println("Engine is being turned ON");
    }

    @Override
    public void stop() {
        System.out.println("Engine is being turned OFF");
    }

    @Override
    public void drive(double kmS) {
        System.out.println("Duster is being driven.");
    }

    @Override
    public void drive() {
    }

    @Override
    public String toString() {
        return "Duster";
    }

    @Override
    public void start(byte gear) {

    }
}
