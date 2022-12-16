package application;

public abstract class Car implements Vehicle {

      private byte fuelTankSize;

      private String fuelType;

      private byte gear;

      private float consumptionPer100Km;

      private float availableFuel;

       private int tireSize;

       private String chasisNumber;

       private float averageFuelConsumption;
       final public float kms = 12.13f;


        public void shiftGear (int shiftGear){
        System.out.println("Shift gear" + " " + "to" + " " + shiftGear);
    }

        public byte getFuelTankSize () {
            return fuelTankSize;
        }

        public void setFuelTankSize ( byte fuelTankSize){
            this.fuelTankSize = fuelTankSize;
        }


        public String getFuelType (String fuelType){
            return fuelType;
        }

        public void setFuelType (String fuelType){
            this.fuelType = fuelType;
        }


        public double getGear () {
            return gear;
        }

        public void setGear ( byte gear){
            this.gear = gear;
        }


        public float getConsumptionPer100Km () {
           consumptionPer100Km = (availableFuel * 100) / kms;

            return consumptionPer100Km;
        }

        public void setConsumptionPer100Km ( float consumptionPer100Km){
            this.consumptionPer100Km = consumptionPer100Km;
        }

        public float getAvailableFuel (float startFuel, float stopFuel ) {
            availableFuel = startFuel - stopFuel;
            return availableFuel;
        }
        public void setAvailableFuel ( float availableFuel){
            this.availableFuel = availableFuel;
        }

        public int getTireSize () {
            return tireSize;
        }

        public void setTireSize ( int tireSize){
            this.tireSize = tireSize;
        }

        public String getChasisNumber(){return chasisNumber;}

        public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

        public float getAverageFuelConsumption () {

            return averageFuelConsumption;
        }

        public void setAverageFuelConsumption ( float averageFuelConsumption){
            this.averageFuelConsumption = averageFuelConsumption;
        }


    public abstract void start(byte gear);
}
