package vehicles;

public interface Rentable {
    void rentCar(int daysRented);
    void returnCar();
    int calculatePrice();

}
