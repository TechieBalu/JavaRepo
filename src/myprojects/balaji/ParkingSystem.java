package myprojects.balaji;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingSystem {

    static int totalSlots, availableSlots;
    static ArrayList<String> parkedCars = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of parking slots:");
        totalSlots = sc.nextInt();
        availableSlots = totalSlots;

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Park a car");
            System.out.println("2. Remove a car");
            System.out.println("3. View parked cars");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    parkCar();
                    break;
                case 2:
                    removeCar();
                    break;
                case 3:
                    viewParkedCars();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void parkCar() {
        if (availableSlots == 0) {
            System.out.println("Sorry, there are no available parking slots.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the license plate number of the car:");
        String licensePlate = sc.nextLine();
        parkedCars.add(licensePlate);
        availableSlots--;
        System.out.println("Car parked successfully. Available slots: " + availableSlots);
    }

    public static void removeCar() {
        if (availableSlots == totalSlots) {
            System.out.println("There are no parked cars.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the license plate number of the car to be removed:");
        String licensePlate = sc.nextLine();
        if (parkedCars.contains(licensePlate)) {
            parkedCars.remove(licensePlate);
            availableSlots++;
            System.out.println("Car removed successfully. Available slots: " + availableSlots);
        } else {
            System.out.println("The car is not parked here.");
        }
    }

    public static void viewParkedCars() {
        if (availableSlots == totalSlots) {
            System.out.println("There are no parked cars.");
            return;
        }

        System.out.println("Parked cars:");
        for (String licensePlate : parkedCars) {
            System.out.println(licensePlate);
        }
    }
}