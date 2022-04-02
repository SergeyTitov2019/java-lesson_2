package lesson_06;

import java.lang.reflect.Array;
import java.util.Arrays;

/**************************************************************************************************
 *
 *      2    Скопировать все данные из массива String[] fruits в новый массив String[] food.
 *           Для копирования используйте , метод утилитного класса Arrays.
 *
 * ************************************************************************************************/

public class Task_02 {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Plum", "Mango", "Pineapple", "Orange"};
        String[] newFruits = Arrays.copyOf(fruits, fruits.length);
        newFruits[2] = "Banana";
        System.out.print("TTT");
    }
}
