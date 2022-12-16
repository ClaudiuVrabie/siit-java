package week5.nested;

public class Car {
    String type;

    public static void main(String[] args) {
        Car c = new Car();
        Car.Engine e = c.new Engine();
        //equivalent as above
        Car.Engine e1 = new Car().new Engine();
    }

    //NESTED CLASS
    class Engine{
        public void start(){
            System.out.println("Starting " + type);
        }
    }
}
