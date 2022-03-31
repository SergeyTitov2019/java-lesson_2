package lesson_05;

//        Написать цикл for от 0 до 100.
//        Вывести все цифры, кроме 13 и 66.

public class Task_01 {

    public static void main(String[] args) {

        int num = 1;
        for (int i = 0; i < 100; i++) {

            num = num + 1;
            if (num == 13 || num == 66) {
                continue;
            } else {
                System.out.print(num + "; ");
            }
        }
    }
}

