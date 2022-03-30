package lesson_04;

public class Main {
    static int sideOfSquare1 = 5;
    static int perimeter1 = 0;
    static int area1 = 0;
    static boolean ifEqual1;

    static int sideOfSquare2 = 2;
    static int perimeter2 = 0;
    static int area2 = 0;
    static boolean ifEqual2;

    public static void main(String[] args) {

        perimeter1 = sideOfSquare1 * 4;
        area1 = sideOfSquare1 * sideOfSquare1;
        ifEqual1 = perimeter1 == area1;
        System.out.println("perimeter: " + perimeter1 + " sm");
        System.out.println("area: " + area1  + " sm");
        System.out.println("Perimeter = area: " + ifEqual1);

        perimeter2 = sideOfSquare2 * 4;
        area2 = sideOfSquare2 * sideOfSquare2;
        ifEqual2 = perimeter2 == area2;
        System.out.println("perimeter: " + perimeter2 + " sm");
        System.out.println("area: " + area2  + " sm");
        System.out.println("Perimeter = area: " + ifEqual2);
    }

}
