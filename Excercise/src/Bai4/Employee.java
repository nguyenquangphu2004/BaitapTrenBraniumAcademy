package Bai4;

public class Employee extends Person{
    private String id;
    private String position;
    private int salary;
    private int exp;


    public Employee() {
        id = "";
        position = "";
        salary = 0;
        exp = 0;


    }

    public Employee(String identification, String fullName,
                    String address, String birth, String email,
                    String phone, String id, String position,
                    int salary, int exp) {
        super(identification, fullName, address, birth, email, phone);
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.exp = exp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    public boolean getAsalary(int amount) {
        if(amount < 0) {
            return false;
        } else {
            salary += amount;
            return true;
        }
    }
}
