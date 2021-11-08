package Abstract;

import Abstract.Person;

public abstract class Vehicle {
    String brand;
    String model;
    String registrationNumber;
    Person owner;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * somehow needed.
     * @param brand of vehicle.
     * @param model of vehicle.
     * @param registrationNumber of vehicle.
     * @param owner of vehicle.
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * thong tin abcxyz.
     * @return info.
     */
    public String getInfo() {
        return "";
    }

    /**
     * chuyen chu so huu.
     * @param newOwer - nguoi so huu moi.
     */
    public void transferOwnership(Person newOwer) {

    }
}
