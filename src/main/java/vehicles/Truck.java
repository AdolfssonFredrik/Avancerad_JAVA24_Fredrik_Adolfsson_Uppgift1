package vehicles;

public class Truck extends Vehicle {
    private int truckCapacity;

    public Truck(String make, String regNumber, int rentPricePerDay, int truckCapacity, Boolean isRented) {
        super(make, regNumber, rentPricePerDay, isRented);
        this.truckCapacity = truckCapacity;
    }

    @Override
    public void vehicleInfo() {
        super.vehicleInfo();
        System.out.println("  " + "- vehicles.Truck capacity: " + truckCapacity);
    }


    public int getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(int truckCapacity) {
        this.truckCapacity = truckCapacity;
    }
}
