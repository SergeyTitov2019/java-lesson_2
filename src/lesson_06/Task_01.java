package lesson_06;

/***************************************************************************************
 *
*       1.      Создать и проинициализировать массив String[] fruits.
                Заполнить его названиями ваших любимых фруктов (5-10 елементов).

        3.      Выведите все элементы массива food на экран.
                Примечание каждый элемент вывести на новой строке.
 *
* ************************************************************************************/

public class Task_01 {
    static String[] fruits = {"Apple", "Plum", "Mango", "Pineapple", "Orange"};

    public static void main(String[] args) {
        System.out.print("Fruits: " + fruits[0] + "\n");
        System.out.print("Fruits: " + fruits[1] + "\n");
        System.out.print("Fruits: " + fruits[2] + "\n");
        System.out.print("Fruits: " + fruits[3] + "\n");
        System.out.print("Fruits: " + fruits[4] + "\n");
    }
}
