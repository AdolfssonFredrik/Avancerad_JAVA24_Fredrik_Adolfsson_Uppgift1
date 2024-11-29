public class Convertible extends Vehicle {
    private int coolnessFactor;


    public Convertible(String make, String regNumber, int rentPricePerDay, int coolnessFactor, Boolean isRented) {
        super(make, regNumber, rentPricePerDay, isRented);
        this.coolnessFactor = coolnessFactor;
    }

    @Override
    public void vehicleInfo() {
        super.vehicleInfo();
        System.out.println("  " + "- CoolnessFactor: " + coolnessFactor);
    }



    public int getCoolnessFactor() {
        return coolnessFactor;
    }

    public void setCoolnessFactor(int coolnessFactor) {
        this.coolnessFactor = coolnessFactor;
    }
}
