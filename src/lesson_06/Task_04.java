package lesson_06;


import java.util.Arrays;

/******************************************************************************************
 *
 *          Создать двумерный массив int[][] score.
 *          Размер первого уровня – 3, размер второго уровня – 4
 *          Заполнить массив как указано ниже:
 *      [
 *          [ 10, 11, 12, 13],
 *          [ 20, 21, 22, 23],
 *          [ 30, 31, 32, 33],
 *      ]
 *          Создать еще один масив int[] result.
 *          Заполнить этот масив суммами элементов каждой строки из  int[][] score
 *
 *
 * ****************************************************************************************/

public class Task_04 {
    public static void main(String[] args) {
        int value = 10;
        int count = 0;
        int[][] num = new int[3][4];
        int[] result = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            count++;
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = i * value + j + value;
            }
            int[] innerArray = num[i];
            long sum = 0;
            for(int val : innerArray){
                sum += val;
            }
            result[i]  += sum;
            System.out.print("Array # " + count + " "+ Arrays.toString(num[i])+ "\n") ;
        }

        System.out.print("Result:" + Arrays.toString(result)+ "\n") ;
    }
}
