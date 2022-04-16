package lesson_07.task01;

import java.time.LocalDate;

public class Main {
    static Client client;
    static Car car = new Car();
    static boolean isAmountReady;
    static boolean isWantToBuy;
    static boolean isReadyForCredit;

    static LocalDate day = LocalDate.now();

    static {
        client = new Client();
        client.fullName = "Alex";
        client.clientAge = 35;
    }

    static {
        car.carName = "Audi A6";
        car.carPrice = 42000;
    }

    public static void main(String[] args) {
        isWantToBuy = true;
        isAmountReady = false;
        isReadyForCredit = true;
        getGreetings(client.fullName, isWantToBuy);

    }

    public static void getGreetings(String name, boolean ifWillingToBuy) {
        if (ifWillingToBuy) {
            System.out.print("Hi, " + name + "!" + "\n");
            System.out.print("I can see, " + name + ", " + " you'd like to buy a car!" + "\n");
            getAge(client.clientAge);
        } else {
            System.out.print("Hi, " + name + "!" + "\n");
            System.out.print("I can see, " + name + ", " + " you are not ready for a purchase." + "\n");
        }

    }

    public static void getAge(int clientAge) {
        int rightYear = day.getYear() + 18 - clientAge;
        if (clientAge < 18) {
            System.out.print(client.fullName + ", you can be our customer in " + rightYear + "\n");
        } else {
            System.out.print("Your age,  " + client.fullName + ", allows you to be a driver!" + "\n");
            System.out.print("Do you have whole amount to pay or you need a credit? " + "\n");
            getPurchase(isAmountReady);
        }
    }

    public static void getPurchase(boolean sumEnough) {
        if (sumEnough == true) {
            System.out.print("Congrats, " + client.fullName + "! You can use you money to buy this " + car.carName + "\n");
        } else {
            System.out.print(client.fullName + ". You've got to take a credit" + "\n");
            getCredit(isReadyForCredit);
        }
    }

    public static void getCredit(boolean readyToCredit) {
        int creditInterest = 18;
        if (readyToCredit == true) {
            int amountPerMonth = car.carPrice * creditInterest / 100 / 12;
            System.out.print("Congrats! You can take a credit, pay and enjoy the car!" + "\n");
            System.out.print("Your monthly payment is going to be " + amountPerMonth + " euro." + "\n");
            System.out.print("Enjoy you excellent " + car.carName + ". And have a good day!" + "\n");
        } else {
            System.out.print("If you are not ready for taking credit, thank you for coming, " + client.fullName + ". See you later." + "\n");
        }
    }

}
