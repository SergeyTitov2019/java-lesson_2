package lesson_01.Methods;

import lesson_01.Utilities.IdentityCard;

public class IdentityCardTest {
    public static void main(String[] args) {

        IdentityCard card1 = new IdentityCard();
        IdentityCard card2 = new IdentityCard();
        IdentityCard card3 = new IdentityCard();

        card1.nameOwner = "Vasya Mihov";
        card2.nameOwner = "Jora Popov";
        card3.nameOwner = "Zina Stoyanova";
        card1.number = "1234 1234 1234";
        card2.number = "5554 1234 1234";
        card3.number = "7894 1090 1234";
        card1.validTo = "03/2023";
        card2.validTo = "06/2027";
        card3.validTo = "01/2024";

        System.out.print("Credit card of " + card1.nameOwner + " # " + card1.number
                + " valid to " + card1.validTo + "." + '\n');
        System.out.print("Credit card of " + card2.nameOwner + " # " + card2.number
                + " valid to " + card2.validTo + "." + '\n');
        System.out.print("Credit card of " + card3.nameOwner + " # " + card3.number
                + " valid to " + card3.validTo + "." + '\n');


    }
}
