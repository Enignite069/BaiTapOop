package Inharitance;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * super kế thừa từ Abstract.Person.
     * @param name tên.
     * @param address địa chỉ.
     * @param program khóa học.
     * @param year khóa.
     * @param fee học phí.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    String getProgram() {
        return program;
    }

    void setProgram(String program) {
        this.program = program;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    double getFee() {
        return fee;
    }

    void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Lấy thông tin.
     * @return thông tin học sinh.
     */
    public String toString() {
        return "Student[" + super.toString()
                + ",program=" + getProgram()
                + ",year=" + getYear()
                + ",fee=" + getFee()
                + "]";
    }
}
