package lesson_04;

public class Task02 {

    static byte varByte = 127;
    static int varInt = 250_000_000;
    static short varShort = 2000;
    static char varChar = 333;

    public static void main(String[] args) {
        short varByteShort = varByte;
        int varShortInt = varByteShort;
        long varIntLong = varShortInt;
        double varIntDouble = varInt;
        float varShortFloat = varShort;
        double varShortDouble = varShortFloat;
        int varCharInt = varChar;
        System.out.print("__byte -> short -> int -> long __ " + '\n');
        System.out.print("Before byte: " + varByte + ", after short: " + varByteShort + '\n');
        System.out.print("Before short: " + varByteShort + ", after int: " + varShortInt + '\n');
        System.out.print("Before int: " + varShortInt + ", after long: " + varIntLong + '\n');
        System.out.print('\n');
        System.out.print("__int -> double __ " + '\n');
        System.out.print("Before int: " + varInt + ", after double: " + varIntDouble + '\n');
        System.out.print('\n');
        System.out.print("__short -> float -> double __ " + '\n');
        System.out.print("Before short: " + varShort + ", after float: " + varShortFloat + '\n');
        System.out.print("Before float: " + varShortFloat + ", after double: " + varShortDouble + '\n');
        System.out.print('\n');
        System.out.print("__char -> int__ " + '\n');
        System.out.print("Before char: " + varChar + ", after int: " + varCharInt + '\n');
    }

}
