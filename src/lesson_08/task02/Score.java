package lesson_08.task02;


/**
*       Создать класс Score со след. полями:
 *          -	String category
 *          -	Массив double[] statistic, размером 10. Этот массив нужно проинициализировать
 *          случайными числами.
 *      Для этого используйте нестатический блок инициализации.
 *
 *      @author SergeyTitov
*
* */

import java.util.Arrays;


public class Score {
    public String category;
    double[] statistic = new double[5];

    {
        double a;
        for (int i = 0; i < statistic.length; i++) {
            a = (Math.random()*20 - 10)*10;
            statistic[i] = a;
        }
        System.out.println(Arrays.toString(statistic));
    }
}