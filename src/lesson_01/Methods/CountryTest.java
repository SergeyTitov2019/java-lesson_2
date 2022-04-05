package lesson_01.Methods;

import lesson_01.Utilities.Country;

public class CountryTest {
    public static void main(String[] args) {

        Country country1 = new Country();
        Country country2 = new Country();
        Country country3 = new Country();

        country1.name = "USA";
        country1.city = "San Francisco";
        country1.cityPopulation = 2000000;
        country2.name = "France";
        country2.city = "Paris";
        country2.cityPopulation = 4000000;
        country3.name = "Germany";
        country3.city = "Berlin";
        country3.cityPopulation = 3000000;

        System.out.print(country1.city + " is city of " + country1.name + ". It's population is "
                + country1.cityPopulation + "." + '\n');
        System.out.print(country2.city + " is city of " + country2.name + ". It's population is "
                + country2.cityPopulation + "." + '\n');
        System.out.print(country3.city + " is city of " + country3.name + ". It's population is "
                + country3.cityPopulation + "." + '\n');
    }
}
