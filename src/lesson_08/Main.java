package lesson_08;

import lesson_08.task02.GlobalRating;

import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

        GlobalRating globalRating = new GlobalRating();

        for (int i = 0; i < globalRating.data.length; i++) {
            System.out.println(globalRating.data[i].category + ": " +
                    Arrays.toString(globalRating.data[i].statistic));
        }
    }
}
