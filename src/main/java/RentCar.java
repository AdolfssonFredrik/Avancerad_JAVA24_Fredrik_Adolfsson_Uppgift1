import vehicles.Vehicle;

import java.util.Scanner;

public class RentCar {
    public void rentCar(Vehicle vehicle) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        while(true){

            System.out.println("Would you like to rent? (y/n)");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("y")) {

                try {
                    System.out.println("How many days do you want to rent the " + vehicle.getMake() + " for?");
                    answer = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Not a valid option. Stopping rent processes.");
                    break;
                }

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
                break;
            }
            else{
                System.out.println("Please enter a valid choice.");
            }
        }
    }
}
