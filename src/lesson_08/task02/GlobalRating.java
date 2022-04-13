package lesson_08.task02;

/**
 * Создать класс GlobalRating со след. полями:
 * -	Массив static Score[] data, размером 4.
 * Этот массив нужно проинициализировать с помощью статического блока инициализации.
 * Заполнить нужно созданными Score c категориями: views, actions, sharings, buyings
 *
 * @author SergeyTitov
 */

public class GlobalRating {

    public Score[] data;

    {
        data = new Score[4];
        data[0] = new Score();
        data[1] = new Score();
        data[2] = new Score();
        data[3] = new Score();
        data[0].category = "views";
        data[1].category = "actions";
        data[2].category = "sharings";
        data[3].category = "buyings";
    }

}
