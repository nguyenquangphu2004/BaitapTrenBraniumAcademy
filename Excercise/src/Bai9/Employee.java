package Bai9;

public class Employee extends Person{
    private static int next = 1001;
    private String idEmployee;
    private String position;
    private int salary;
    private double expYear;
    private int dayOfMonth;
    private int bonus;
    private int amount;



    public Employee() {

    }
    public Employee(Manager manager) {
        super(manager.getIdCard(), manager.getFullName(), manager.getAddress(),
                manager.getBirth(), manager.getEmail(), manager.getPhoneNumber());
        this.idEmployee = manager.getIdEmployee();
        this.position = manager.getPosition();
        this.salary = manager.getSalary();
        this.expYear = manager.getExpYear();
        this.dayOfMonth = manager.getDayOfMonth();
        this.bonus = manager.getBonus();
        this.amount = manager.getAmount();

    }

    public Employee(String idEmployee, String position, int salary, double expYear,
                int dayOfMonth, int bonus,int amount) {
        this.idEmployee = idEmployee;
        this.position = position;
        this.salary = salary;
        this.expYear = expYear;
        this.dayOfMonth = dayOfMonth;
        this.bonus = bonus;
        this.amount = amount;
    }

    public Employee(Person person, Employee employee) {
        super(person.getIdCard(), person.getFullName(), person.getAddress(),
                person.getBirth(), person.getEmail(), person.getPhoneNumber());
        this.idEmployee = employee.getIdEmployee();
        this.position = employee.getPosition();
        this.salary = employee.getSalary();
        this.expYear = employee.getExpYear();
        this.dayOfMonth = employee.getDayOfMonth();
        this.bonus = employee.getBonus();
        this.amount = employee.getAmount();
    }
    public void nextId(int next) {
        Employee.next = next;
    }

    public final String getIdEmployee() {
        return idEmployee;
    }

    public final void setIdEmployee() {
        this.idEmployee = "EMP" + Employee.next;
        Employee.next ++;
    }

    public final String getPosition() {
        return position;
    }

    public final void setPosition(String position) {
        this.position = position;
    }

    public final int getSalary() {
        return salary;
    }

    public final void setSalary(int salary) {
        this.salary = salary;
    }

    public final double getExpYear() {
        return expYear;
    }

    public final void setExpYear(double expYear) {
        this.expYear = expYear;
    }

    public final int getDayOfMonth() {
        return dayOfMonth;
    }

    public final void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public final int getBonus() {
        return bonus;
    }

    public final void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public final int getAmount() {
        return amount;
    }

    public final void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    protected void dowork() {

    }

    public int calculatorSalary(int salary, int day) {
        var point = (int)(day * salary) / 30;
        setDayOfMonth(day);
       return point;
    }

    public int calculartoBonus(int salary, int day) {
        if(day >= 20) {
            setBonus((int)((30 - day) * 0.5 * (salary/30)));
            return (int)((30 - day) * 0.5 * (salary/30));
        }
        return 0;
    }
    public int calculartoAmount(int salary, int day) {
        setAmount((int)(calculatorSalary(salary,day) + calculartoBonus(salary,day)));
        return (int)(calculatorSalary(salary,day) + calculartoBonus(salary,day));
    }



    @Override
    public String toString() {
        return  super.toString() + "\nEmployee[" +
                "idEmployee='" + idEmployee + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", expYear=" + expYear +
                ", dayOfMonth=" + dayOfMonth +
                ", bonus=" + bonus +
                ", amount=" + amount +
                ']';
    }
}
