package Abstract;

public class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String brand, String model,
               String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * thong tin o to.
     * @return info of car.
     */
    @Override
    public String getInfo() {
        return "Abstract.Car:\n"
                + "  Brand: " + brand + "\n"
                + "  Model: " + model + "\n"
                + "  Registration Number: " + registrationNumber + "\n"
                + "  Number of Doors: " + numberOfDoors + "\n"
                + "  Belongs to " + owner;
    }
}
