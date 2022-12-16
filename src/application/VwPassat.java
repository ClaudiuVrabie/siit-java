package application;

public class VwPassat extends Volkswagen{



  public VwPassat(float availableFuel, String chasisNumber){
      this.setAvailableFuel(availableFuel);
      this.setChasisNumber(chasisNumber);
    }


    @Override
    public void start ( byte gear){
      System.out.println("Passat is beeing started");
    }

    @Override
    public void drive (double kms){
      System.out.println("Passat is beeing drived.");

    }

  @Override
  public void start() {

  }

  @Override
    public void stop () {
      System.out.println("Passat is stoped.");
    }

  @Override
  public String toString() {
    return "VwPassat";
  }
}



