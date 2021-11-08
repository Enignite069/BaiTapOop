package Abstract;

public class MotorBike extends Vehicle {
    private boolean hasSideCar;

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSideCar = hasSideCar;
    }

    /**
     * thong tin xe may.
     * @return info of motorbike.
     */
    @Override
    public String getInfo() {
        return "Abstract.Car:\n"
                + "  Brand: " + brand + "\n"
                + "  Model: " + model + "\n"
                + "  Registration Number: " + registrationNumber + "\n"
                + "  Has Side Abstract.Car: " + isHasSideCar() + "\n"
                + "  Belongs to " + owner;
    }

    /**
     * checker.
     * @return yes/no.
     */
    public boolean isHasSideCar() {
        return true;
    }
}
