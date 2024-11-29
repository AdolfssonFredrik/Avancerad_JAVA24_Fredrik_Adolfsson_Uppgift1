import vehicles.Vehicle;

import java.util.Scanner;

public class RentCar {
    public void rentCar(Vehicle vehicle) {
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Would you like to rent? (y/n)");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("y")) {
                System.out.println("How many days do you want to rent the " + vehicle.getMake() + " for?");
                int answer = sc.nextInt();

                vehicle.setDaysRented(answer);
                System.out.println("For " + answer + " days it will cost you " + vehicle.calculatePrice() + "kr.");
                System.out.println("Would you like to continue? (y/n)");

                String answer2 = sc.next();
                if(answer2.equalsIgnoreCase("y")) {
                    vehicle.rentCar(answer);
                }else{
                    System.out.println("Restating.");
                }

                break;
            }
            else if(choice.equalsIgnoreCase("n")) {
                continue;
            }
            else{
                System.out.println("Please enter a valid choice.");
            }
        }
    }
}
