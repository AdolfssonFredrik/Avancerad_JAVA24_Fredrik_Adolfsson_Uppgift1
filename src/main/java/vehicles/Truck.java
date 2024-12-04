package vehicles;

public class Truck extends Vehicle {
    private final int truckCapacity;

    public Truck(String make, String regNumber, int rentPricePerDay, int truckCapacity, Boolean isRented) {
        super(make, regNumber, rentPricePerDay, isRented);
        this.truckCapacity = truckCapacity;
    }

    @Override
    public void vehicleInfo() {
        super.vehicleInfo();
        System.out.println("  " + "- vehicles.Truck capacity: " + truckCapacity);
    }
}
