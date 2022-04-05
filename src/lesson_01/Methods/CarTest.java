package lesson_01.Methods;

import lesson_01.Utilities.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        car1.brand = "Audi";
        car1.age = 2;
        car1.fuel = "gas";
        car1.type = "SUV";
        car2.brand = "Mercedes";
        car2.age = 5;
        car2.fuel = "diesel";
        car2.type = "coupe";
        car3.brand = "WV";
        car3.fuel = "gas";
        car3.age = 3;
        car3.type = "sedan";

        System.out.println("Car Test for " + car1.brand + ": " + "age: " + car1.age + ", " + "type: "
                + car1.type + ", " + "fuel type: " + car1.fuel + "\n");
        System.out.println("Car Test for " + car2.brand + ": " + "age: " + car2.age + ", " + "type: "
                + car2.type + ", " + "fuel type: " + car2.fuel + "\n");
        System.out.println("Car Test for " + car3.brand + ": " + "age: " + car3.age + ", " + "type: "
                + car3.type + ", " + "fuel type: " + car3.fuel + "\n");
    }
}
