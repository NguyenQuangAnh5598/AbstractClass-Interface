package employee;

public class PartTime extends Employee{
    private int timeJob;

    public PartTime() {
    }

    public PartTime(String code, String name, int age, String phone, String email, int timeJob) {
        super(code, name, age, phone, email);
        this.timeJob = timeJob;
    }

    @Override
    public String toString() {
        return super.toString() + " PartTime { " +
                " timeJob = " + timeJob +
                " }";
    }
    @Override
    public double calculateSalary() {
        return timeJob * 100000;
    }
}
