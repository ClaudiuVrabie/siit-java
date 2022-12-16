package application;

public  class Logan extends Dacia {


    public Logan(float availableFuel, String chasisNumber){
        this.setAvailableFuel(21);
        this.setChasisNumber("oiqe0934hkkadsn");
    }

    @Override
    public void start(byte gear) {
        System.out.println("Logan is beeing started.");
    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {
        System.out.println("Logan is stoped.");

    }

    @Override
    public void drive(double kms) {
        System.out.println("Logan is beeing driven for" + " " + kms + "kmS");

    }

    @Override
    public String toString() {
        return "Logan";
    }
}


