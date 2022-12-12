package Override.Bai4;

public class Employee extends Person {
    private String employeeId;
    private String posittion;
    private int  salary;
    private int exp;
    private int numberOfworkDayInMonth;
    private int bonus;
    private int amountReceived;


    public Employee() {

    }
    public Employee(int salary,int numberOfworkDayInMonth,int bonus,int amountReceived) {
        this.salary = salary;
        this.numberOfworkDayInMonth =  numberOfworkDayInMonth;
        this.bonus =bonus;
        this.amountReceived = amountReceived;
    }
    public Employee(String employeeId, String posittion, int salary, int exp) {
        this.employeeId = employeeId;
        this.posittion = posittion;
        this.salary = salary;
        this.exp = exp;
    }

    public Employee(Person person, Employee employee) {
        super(person.getIdCard(),person.getFullName(),person.getAddress() ,person.getEmail() ,person.getPhone());
        this.employeeId = employee.getEmployeeId();
        this.posittion = employee.getPosittion();
        this.salary = employee.getSalary();
        this.exp = employee.getExp();
        this.numberOfworkDayInMonth = employee.getNumberOfworkDayInMonth();
        this.bonus = employee.getBonus();
        this.amountReceived = employee.getAmountReceived();

    }

    public Employee(String idCard, String fullName, String address, String email, String phone, String employeeId, String posittion, int salary, int exp, int numberOfworkDayInMonth, int bonus, int amountReceived) {
        super(idCard, fullName, address, email, phone);
        this.employeeId = employeeId;
        this.posittion = posittion;
        this.salary = salary;
        this.exp = exp;
        this.numberOfworkDayInMonth = numberOfworkDayInMonth;
        this.bonus = bonus;
        this.amountReceived = amountReceived;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosittion() {
        return posittion;
    }

    public void setPosittion(String posittion) {
        this.posittion = posittion;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    public int getExp() {
        return exp;
    }
    public int getNumberOfworkDayInMonth() {
        return numberOfworkDayInMonth;
    }

    public void setNumberOfworkDayInMonth(int numberOfworkDayInMonth) {
        this.numberOfworkDayInMonth = numberOfworkDayInMonth;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(int amountReceived) {

        this.amountReceived = amountReceived;
    }
    public int payRoll() {
         int salaryReal = (int)(getNumberOfworkDayInMonth() * getSalary()) / (Main.MONTH);
         return salaryReal;
    }
    public int bonuss() {
        int bonu = 0;
        if(getNumberOfworkDayInMonth() >= 20) {
            bonu = (int) (((0.5 * getSalary()) / (Main.MONTH)) * (getNumberOfworkDayInMonth() - 20));
            return bonu;
        }
        return 0;
    }
    public int amount() {
        return (bonus + payRoll());
    }
}
