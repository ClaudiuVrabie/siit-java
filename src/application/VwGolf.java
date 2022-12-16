package application;

public class VwGolf extends Volkswagen {



    public VwGolf( float availableFuel, String chasisNr ){
        this.setAvailableFuel(availableFuel);
        this.setChasisNumber(chasisNr);
        }





        @Override
        public void start ( byte gear){
            System.out.println("Golf is beeing started.");
        }

        @Override
        public void drive (double kmS){
            System.out.println("Golf is beeing driven.");

        }

    @Override
    public void start() {

    }

    @Override
        public void stop () {
            System.out.println("Golf is stopted.");

        }

    @Override
    public String toString() {
        return "VwGolf";
    }
}