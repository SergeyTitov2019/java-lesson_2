package lesson_01;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        IdentityCard card = new IdentityCard();
        Country country = new Country();

        car.age = 2;
        car.brand = "Mercedes";
        car.type = "ML 350";
        car.fuel = "diesel";

        card.number = "689898";
        card.nameOwner = "Tom Dir";

        country.name = "USA";
        country.city = "New York";
        country.cityPopulation = 10000000;

        System.out.println("lesson_01.Car Notation: " + car.brand + "Age: " + car.age*12 + " month");

    }
}
