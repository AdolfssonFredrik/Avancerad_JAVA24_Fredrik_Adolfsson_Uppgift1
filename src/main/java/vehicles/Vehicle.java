package vehicles;

public abstract class Vehicle implements Rentable {
    final String make;
    final String regNumber;
    final int rentPricePerDay;
    int daysRented;
    Boolean isRented;

    public Vehicle(String make, String regNumber, int rentPricePerDay, Boolean isRented) {
        this.make = make;
        this.regNumber = regNumber;
        this.rentPricePerDay = rentPricePerDay;
        this.isRented = isRented;
    }

    public void vehicleInfo() {
        System.out.println("|======Info========|");
        System.out.println("  " + "- Make: " + make);
        System.out.println("  " + "- RegNumber: " + regNumber);
        System.out.println("  " + "- Price per day: " + rentPricePerDay + "kr");
    }


    public void start() {
        System.out.println(make + " starts");
    }


    @Override
    public void rentCar(int daysRented) {
        System.out.println(make + " rented");
        setDaysRented(daysRented);
        setIsRented(true);
    }

    @Override
    public void returnCar() {
        System.out.println("Returning " + make);
        System.out.println("You rented the car for " + getDaysRented() + " days.");
        setIsRented(false);
        setDaysRented(0);
    }

    @Override
    public int calculatePrice() {
        return rentPricePerDay * daysRented;
    }

    public String getMake() {
        return make;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getRentPricePerDay() {
        return rentPricePerDay;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public void setIsRented(Boolean isRented) {
        this.isRented = isRented;
    }

    public Boolean getIsRented() {
        return isRented;
    }
}
