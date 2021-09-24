package employee;

public abstract class Employee {
    private String code;
    private String name;
    private int age;
    private String phone;
    private String email;

    public Employee() {
    }

    public Employee(String code, String name, int age, String phone, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "code = '" + code + '\'' +
                " , name = '" + name + '\'' +
                " , age=" + age +
                " , phone = '" + phone + '\'' +
                " , email = '" + email + '\'';
    }
    public abstract double calculateSalary();
}
