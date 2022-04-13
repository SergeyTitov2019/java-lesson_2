package lesson_07.task01;

import java.time.LocalDate;

/**
 *  Client related info
 *
 *  @author STitov
 *
 * */

public class Client {
    String fullName;
    static int age;
    int sumAvailable;
    static boolean credit;
//    static boolean sumEnough;
    static LocalDate day = LocalDate.now();

    public static void main(String[] args) {
        getAge(15);
        getPurchase(true);

    }

    public static void getAge(int clientAge){
        int rightYear = day.getYear() + 18 - clientAge;
        if(clientAge < 18){
            System.out.print("You can be our customer in " + rightYear + "\n");
        }
    }
    public static void getPurchase(boolean sumEnough){
        if(sumEnough == true){
            credit = true;
            System.out.print("Congrats! You can enjoy the car!" + "\n");
        } else{
            System.out.print("You need credit" + "\n");
        }
    }
    public static void getCredit(boolean readyToCredit){
        if(readyToCredit == true){
            credit = true;
            System.out.print("Congrats! You can enjoy the car!" + "\n");
        } else{
            System.out.print("You need credit" + "\n");
        }
    }


}
