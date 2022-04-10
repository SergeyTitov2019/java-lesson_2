package lesson_08.task02;

import java.util.Arrays;

/**
 *      Создать класс GlobalRating со след. полями:
 *      -	Массив static Score[] data, размером 4.
 *          Этот массив нужно проинициализировать с помощью статического блока инициализации.
 *          Заполнить нужно созданными Score c категориями: views, actions, sharings, buyings
 *
 *      @author SergeyTitov
 *
 * */

public class GlobalRating {
    static Score[] data = new Score[4];
    static Score views = data[1];
    public int actions;
    public int sharings;
    public int buyings;

    public static void main(String[] args) {
        Score views = data[1];
        System.out.print(views);
    }

}
