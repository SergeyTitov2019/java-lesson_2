public class IdentityCardTest {
    public static void main(String[] args) {
        Car car = new Car();
        IdentityCard card = new IdentityCard();
        Country country = new Country();


        car.age = 3;
        car.brand = "Audi";
        car.type = "A 5";
        car.fuel = "gas";

        card.number = "12333433";
        card.nameOwner = "Tom Dir";

        country.name = "USA";
        country.city = "New York";
        country.cityPopulation = 10000000;

        System.out.println(country.city + " is located in " + country.name + " "+ country.cityPopulation + " people live in it");

    }
}
