import vehicles.Convertible;
import vehicles.Suv;
import vehicles.Truck;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Truck truck;
    static Convertible convertible;
    static Suv suv;

    static RentCar rentCar = new RentCar();

    static List<Vehicle> vehicles;
    static Scanner sc;

    static String answer;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        truck = new Truck("Truck", "ABC123", 20, 100, true);
        convertible = new Convertible("Convertible", "CHT982", 60, 100, false);
        suv = new Suv("Suv", "AIN201", 45, 4, false);

        vehicles = new ArrayList<>();
        vehicles.add(truck);
        vehicles.add(convertible);
        vehicles.add(suv);

        display();


    }
    public static void display() {
        System.out.println("|======================================|");
        System.out.println(" Welcome to RentACarAB!");
        System.out.println();

        System.out.println("Would you like to rent or return a car?");
        while(true) {
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("rent")) {
                rent();
            } else if (answer.equalsIgnoreCase("return")) {
                returnCar();
            }
            else{
                System.out.println("Please enter a valid option!");
            }
        }
    }


    public static void rent(){
        System.out.println(" Here are your options:");

        int index = 1;

        for (Vehicle vehicle : vehicles) {
            if(!vehicle.getIsRented()){
                System.out.println("  " + index + ". " + vehicle.getMake());
                index++;
            }
        }
        System.out.println("  " + index + ". Exit");
        System.out.println("|======================================|");

        while (true) {
            System.out.println("Please enter your choice:");
            answer = sc.nextLine();

            if(answer.equalsIgnoreCase("truck")) {
                truck.vehicleInfo();
                rentCar.rentCar(truck);
                display();
            }
            else if(answer.equalsIgnoreCase("convertible")) {
                convertible.vehicleInfo();
                rentCar.rentCar(convertible);
                display();
            }
            else if (answer.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting RentACarAB!");
                System.exit(0);
            }
            else if(answer.equalsIgnoreCase("suv")) {
                suv.vehicleInfo();
                rentCar.rentCar(suv);
                display();
            }
            else {
                System.out.println("Please enter a valid choice.");
            }


        }
    }
    public static void returnCar(){
        System.out.println(" Here are your options:");

        int index = 1;

        for (Vehicle vehicle : vehicles) {
            if(vehicle.getIsRented()){
                System.out.println("  " + index + ". " + vehicle.getMake());
                index++;
            }
        }
        System.out.println("  " + index + ". Exit");
        System.out.println("|======================================|");

        while (true) {
            System.out.println("Please enter your choice:");
            answer = sc.nextLine();

            if(answer.equalsIgnoreCase("truck")) {
                truck.returnCar();
                display();
            }
            else if(answer.equalsIgnoreCase("convertible")) {
                convertible.returnCar();
                display();
            }
            else if(answer.equalsIgnoreCase("suv")) {
                suv.returnCar();
                display();
            }
            else if (answer.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting RentACarAB!");
                System.exit(0);
            }
            else {
                System.out.println("Please enter a valid choice.");
            }


        }
    }

}
