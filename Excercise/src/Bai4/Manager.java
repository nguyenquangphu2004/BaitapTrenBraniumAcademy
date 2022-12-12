package Bai4;

public class Manager extends Employee {
    private int salaryBonus;
    private String startDate;
    private String endDate;


    public Manager(String identification, String fullName, String address,
                   String birth, String email, String phone,
                   String id, String position, int salary, int exp,
                   int salaryBonus, String startDate, String endDate) {
        super(identification, fullName, address, birth, email, phone, id, position, salary, exp);
        this.salaryBonus = salaryBonus;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(int salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
