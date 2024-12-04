package vehicles;

public class Suv extends Vehicle {
    private final int lengthInMeters;

    public Suv(String make, String regNumber, int rentPricePerDay, int lengthInMeters, Boolean isRented) {
        super(make, regNumber, rentPricePerDay, isRented);
        this.lengthInMeters = lengthInMeters;
    }
    @Override
    public void vehicleInfo() {
        super.vehicleInfo();
        System.out.println("  " + "- Length: " + lengthInMeters + " meters");
    }
}
