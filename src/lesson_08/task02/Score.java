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

public class Score {

    public String category;
    public double[] statistic = new double[10];

    {
        double a;
        for (int i = 0; i < statistic.length; i++) {
            a = (Math.random()*20 - 10)*10;
            statistic[i] = a;
        }
    }
}