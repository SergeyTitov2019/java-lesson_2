package lesson_02;

public class Variables {
    static int number1 = 10;
    static double number2 = 12_223.12;
    static byte number3 = 127;
    static short number4 = 123;
    static long number5 = 5_500_345;
    static float number6 = (float) 123.12;
    static char someSymbol = '\u00A9';
    static char someSymbol2 = '\u00B5';
    static char someSymbol3 = '\u00AE';
    static boolean condition = true;

    public static void main(String[] args) {
        System.out.println(someSymbol);
        System.out.println(someSymbol2);
        System.out.println(someSymbol3);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(condition);
    }

}

// byte, short, int, long, float, double, char, boolean