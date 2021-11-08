package Abstract;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    String address;
    List<Vehicle> vehicleList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * them phuong tien.
     * @param vehicle - phuong tien.
     */
    public void addVehicle(Vehicle vehicle) {

    }

    /**
     * xoa thong tin phuong tien.
     * @param registrationNumber - bien so.
     */
    public void removeVehicle(String registrationNumber) {

    }

    /**
     * Dua ra thong tin phuong tien.
     * @return info.
     */
    public String getVehiclesInfo() {
        return "";
    }
}
