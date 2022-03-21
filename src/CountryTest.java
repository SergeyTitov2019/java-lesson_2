public class CountryTest {
    public static void main(String[] args) {
        Car car = new Car();
        IdentityCard card = new IdentityCard();
        Country country = new Country();

        country.name = "USA";
        country.city = "San Fransisco";
        country.cityPopulation = 2000000;

        System.out.println("Country Test: " + country.name + " worth to visit. " + "Best city for IT developers is " + country.city);

    }
}
