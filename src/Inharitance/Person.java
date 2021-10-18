package Inharitance;

public class Person {
    private String name;
    private String address;

    /**
     * Hàm được thừa kế.
     * @param name tên.
     * @param address địa chỉ.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }


    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    /**
     * Lấy thông tin.
     * @return tên và địa chỉ.
     */
    public String toString() {
        return "Person[name=" + getName() + ",address=" + getAddress() + "]";
    }
}
