package week5.stream;

// NOT JAVA BASIC
public class Main {

    public static void main(String[] args) {

        //OLD WAY
        Car c1 = new Car() {
            @Override
            public void start(int x) {
                System.out.println("start");
            }
        };


        //FUNCTIONAL WAY (NEW -> AFTER JAVA 8)
        Car c2 = (x) -> System.out.println("start");
        c2.start(5);
    }
}
