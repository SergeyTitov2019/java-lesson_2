package lesson_08;

import lesson_08.task02.GlobalRating;
import lesson_08.task02.Score;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Score[] globalRating = GlobalRating.data;

        for (int i = 0; i < globalRating.length; i++) {
            System.out.println(globalRating[i].category + ": " +
                    Arrays.toString(globalRating[i].statistic));
        }
    }
}
