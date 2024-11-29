package vehicles;

public class Suv extends Vehicle {
    private int lengthInMeters;

    public Suv(String make, String regNumber, int rentPricePerDay, int lengthInMeters, Boolean isRented) {
        super(make, regNumber, rentPricePerDay, isRented);
        this.lengthInMeters = lengthInMeters;
    }
    @Override
    public void vehicleInfo() {
        super.vehicleInfo();
        System.out.println("  " + "- Length: " + lengthInMeters + " meters");
    }

    public int getLengthInMeters() {
        return lengthInMeters;
    }

    public void setLengthInMeters(int lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }
}
