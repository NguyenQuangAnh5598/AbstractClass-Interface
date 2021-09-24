package employee;

public class FullTime extends Employee{
    private double bonus;
    private double forfeit;
    private double salary;

    public FullTime() {
    }

    public FullTime(String code, String name, int age, String phone, String email, double bonus, double forfeit, double salary) {
        super(code, name, age, phone, email);
        this.bonus = bonus;
        this.forfeit = forfeit;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +  " FullTime { " +
                " bonus = " + bonus +
                " , forfeit = " + forfeit +
                " , salary=" + salary +
                " }";
    }
    @Override
    public double calculateSalary(){
        return salary + (bonus-forfeit);
    }
}
