import circle.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter area:");
        Circle.area(scanner.nextInt());
        System.out.println("Enter circumference:");
        Circle.circumference(scanner.nextInt());
    }
}