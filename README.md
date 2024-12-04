# :red_car: Virtual Car Rental Service :red_car:

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=AdolfssonFredrik_Avancerad_JAVA24_Fredrik_Adolfsson_Uppgift1&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=AdolfssonFredrik_Avancerad_JAVA24_Fredrik_Adolfsson_Uppgift1)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=AdolfssonFredrik_Avancerad_JAVA24_Fredrik_Adolfsson_Uppgift1&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=AdolfssonFredrik_Avancerad_JAVA24_Fredrik_Adolfsson_Uppgift1)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=AdolfssonFredrik_Avancerad_JAVA24_Fredrik_Adolfsson_Uppgift1&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=AdolfssonFredrik_Avancerad_JAVA24_Fredrik_Adolfsson_Uppgift1)

---

### :wave: Introduction 

This project was made for an assignment in school. The assignment was to make a virtual car rental service. The project required us to use abstract classes and interfaces to accomplish this task.

---

### :rocket: Getting started 

Here is how to use this Repo for yourself:

1. Open Git Bash
2. Go to the directory where you want the project
3. Write the following command
```
git clone https://github.com/AdolfssonFredrik/Avancerad_JAVA24_Fredrik_Adolfsson_Uppgift1.git
```

4. Open the project in your ide of choice and hit run.
5. Done! :partying_face:
---

### :robot: Method & Class Explanation

### Methods

- #### display()
  - This method displays the main menu where you select if you want to rent or return a car.


- #### rent()
  - This method is responsible for displaying which cars are available to rent and displaying them. It also deals with the selection of the car.

- #### returnCar()
  - This method is responsible for displaying which cars are available to return and displaying them. It also deals with the selection of the car.

- #### vehicleInfo()
  - This method display the info for the vehicel.

- #### start()
  - This method writes out the make of the car and then " starts".

- #### rentCar(int daysRented)
  - This method handels the renting of a given car.

- #### returnCar()
  - This method handels returning a car.

- #### calculatePrice()
  - This method calculates the price for the total amount of time the user wants to rent the car.

- #### rent(Vehicle vehicle)
  - This method handels the rent processes. For example displaying the calculated price and asking for confirmation if the user wants to rent the car.


### Classes

- #### Rentable.java
  - This is an interface responsible for the three methods all rentable cars needs to have.
    - RentCar(int daysRented)
    - returnCar
    - calculatePrice

- #### Vehicle.java
  - This is an abstract class that has the base for all vehicles including methods and variables.

    
---