package Override.Bai4;

public class Manager extends Employee {
    private String start;
    private String end;

    public Manager() {

    }

    public Manager(String idCard, String fullName, String address, String email, String phone, String employeeId, String posittion, int salary, int exp, int numberOfworkDayInMonth, int bonus, int amountReceived, String start, String end) {
        super(idCard, fullName, address, email, phone, employeeId, posittion, salary, exp, numberOfworkDayInMonth, bonus, amountReceived);
        this.start = start;
        this.end = end;
    }

    public Manager(Employee employee) {
        super(employee.getSalary(),employee.getNumberOfworkDayInMonth(),employee.getBonus(),employee.getAmountReceived());
    }

    public Manager(Person person,Employee employee,String start, String end) {
        super(person, employee);
        this.start = start;
        this.end = end;
    }

    public final String getStart() {
        return start;
    }

    public final void setStart(String start) {
        this.start = start;
    }

    public final String getEnd() {
        return end;
    }

    public final void setEnd(String end) {
        this.end = end;
    }


    @Override
    public int payRoll() {
        int salaryReal = (int)(getNumberOfworkDayInMonth() * getSalary()) / (Main.MONTH);
        return  salaryReal;
    }
    @Override
    public int bonuss() {
        int bonu = 0;
        if(getNumberOfworkDayInMonth() >= 22) {
            bonu = (int)(payRoll() * 0.25) ;
            return bonu;

        }
        return  0;

    }
    @Override
    public int amount() {
        return (bonuss() + payRoll());
    }

}
