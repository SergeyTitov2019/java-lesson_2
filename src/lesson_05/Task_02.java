package lesson_05;

/********************
 *
 *  Задание 2
 *                      Написать цикл for от 0 до 100.
 *                      Создать переменную int над циклом равную 1.
 *                      Каждую итерацию цикла умножать эту переменную на i, и сохранять в ней
 *                      результат умножения
 *                      Если результат превысит 1000, вывести результат на экран и завершить
 *                      работу программ
 *
 * ******************************/

public class Task_02 {

    static int num = 1;

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++){
            num = num * i;
            if (num > 1000) {
                return;
            } else {
                System.out.print(num + "; ");
            }
        }
    }
}