package model;


import model.abstracts.Vehicle;
import model.enums.Gender;

public class Car extends Vehicle {


    private String carmodelnumber;



    public Car(String carmodelnumber,String make, String plate, int mileage) {
        super(make, plate, mileage);
        this.carmodelnumber = carmodelnumber;
    }

    public String getCarmodelnumber() {
        return carmodelnumber;
    }

    public void setCarmodelnumber(String carmodelnumber) {
        this.carmodelnumber = carmodelnumber;
    }


}
