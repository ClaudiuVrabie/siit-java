package week5.casting;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.honk();

        Truck t1 = new Truck();
        t1.honk();
        t1.fillUp();

        IceCreamTruck ic1 = new IceCreamTruck();
        ic1.honk();
        ic1.fillUp();
        ic1.sellIceCream();

        //upcasting
        Car c2 = (Car) new Truck();
        c2.honk();
//        c2.fillUp(); -> not seen when referred from a bigger container
        Truck t2 = (Truck) new IceCreamTruck();
        t2.honk();
        t2.fillUp();
//        t2.sellIceCream(); -> not seen when referred from a bigger container

        //down-casting
        Car c3 = new IceCreamTruck();
        IceCreamTruck ic3 = (IceCreamTruck) c3;
        ic3.honk();
        ic3.fillUp();
        ic3.sellIceCream();

        Truck t3 = (Truck) ic3;

        // down-casting that will fail
        // will work only if the value is null
        Car c = new Car();
        Truck t = (Truck) c;
    }
}
