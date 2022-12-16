package week5.anonymus;

import week4.constructors.constructorchaining.C;

public class Main {

    public static void main(String[] args) {


        Car c = new Dacia();

        Car c1 = new Car() {
            @Override
            public void start(){
                System.out.println("Starting");
            }
        };

    }

}

