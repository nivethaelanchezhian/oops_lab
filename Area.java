import java.util.Scanner;
import areaconversion.Area;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area a = new Area();

        System.out.println("AREA CONVERSION");
        System.out.println("1. Square Meter to Square Feet");
        System.out.println("2. Square Feet to Square Meter");
        System.out.println("3. Square Meter to Square Yard");
        System.out.println("4. Square Yard to Square Meter");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter the area: ");
        double value = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result = " +
                    a.squareMeterToSquareFeet(value) + " sq.ft");
                break;

            case 2:
                System.out.println("Result = " +
                    a.squareFeetToSquareMeter(value) + " sq.m");
                break;

            case 3:
                System.out.println("Result = " +
                    a.squareMeterToSquareYard(value) + " sq.yard");
                break;

            case 4:
                System.out.println("Result = " +
                    a.squareYardToSquareMeter(value) + " sq.m");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
