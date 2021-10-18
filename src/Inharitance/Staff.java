package Inharitance;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * super kế thừa từ Student.
     * @param name tên.
     * @param address địa chỉ.
     * @param school trường.
     * @param pay lương.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name,address);
        this.school = school;
        this.pay = pay;
    }

    String getSchool() {
        return school;
    }

    void setSchool(String school) {
        this.school = school;
    }

    double getPay() {
        return pay;
    }

    void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Lấy thông tin.
     * @return thông tin nv.
     */
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + getSchool() + ",pay=" + getPay() + "]";
    }
}
