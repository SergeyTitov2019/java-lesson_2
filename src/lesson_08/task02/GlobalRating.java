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
    static {
        Score s1 = new Score();
        Score s2 = new Score();
        Score s3 = new Score();
        Score s4 = new Score();
        s1.category = "views";
        s2.category = "actions";
        s3.category = "sharings";
        s4.category = "buyings";

        data[0] = s1;
        data[1] = s2;
        data[2] = s3;
        data[3] = s4;
    }

    public static void main(String[] args) {
//        System.out.print("arr:" + Arrays.toString( data));
//        System.out.print("data:" + data);
    }
}
