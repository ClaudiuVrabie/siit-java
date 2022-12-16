package week5.inner;

//TRY NOT TO USE THIS

public class Car {

    String type;

    public static void main(String[] args) {
        Car.Engine e = new Car.Engine();
    }

    //INNER CLASS
    static class Engine {
        public static void main(String[] args) {
            // cannot access type
//            System.out.println(type);
        }

    }


}
