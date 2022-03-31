package Task_03;

public class Main {
    static CreditCard card1 = new CreditCard();
    static CreditCard card2 = new CreditCard();
    static CreditCard card3 = new CreditCard();

    public static void main(String[] args) {
        card1.cardNumber = "1232 4566 8787";
        card1.type = "Visa";
        card1.owner = "Vasya Popov";

        card2.cardNumber = "2237 4566 8797";
        card2.type = "Master Card";
        card2.owner = "Zina Stoyanova";

        card3.cardNumber = "6666 6666 6666";
        card3.type = "Mir";
        card3.owner = "Serezha Lavrov";
        switch (card1.type){
            case("Visa"):
                System.out.print("You've got right type of credit card, pls go ahead");
                break;
            case("Master Card"):
                System.out.print("You've got right type of credit card, pls go ahead");
                break;
            case("Mir"):
                System.out.print(card1.owner + ", пошел ты на х#й вместе со своим русским кораблем!!");
                break;
            default:
                System.out.print("We can not identify your credit card");
        }
    }
}
