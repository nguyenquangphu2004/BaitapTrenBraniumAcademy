package Bai9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager extends Employee{
    private Date start;
    private Date end;

    public Manager() {

    }

    public Manager(String start, String end) {
        setStart(start);
        setEnd(end);
    }

    public Manager(Person person, Employee employee, Manager manager) {
        super(person, employee);
        setStart(manager.getStart());
        setEnd(manager.getEnd());
    }

    public final String getStart() {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);

        return format.formatted(start);
    }

    public final void setStart(String start) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        try {
            this.start = formatDate.parse(start);
        } catch (ParseException e) {
            this.start = new Date();
        }
    }

    public final String getEnd() {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);

        return format.formatted(end);
    }

    public final void setEnd(String end) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        try {
            this.end = formatDate.parse(end);
        } catch (ParseException e) {
            this.end = new Date();
        }
    }


    @Override
    public String toString() {
        return super.toString() + "\nManager[" +
                "start=" + getStart() +
                ", end=" + getEnd() +
                ']';
    }
    @Override
    public int calculatorSalary(int salary, int day) {
        var point = (int)(day * salary) / 30;
        setDayOfMonth(day);
        return point;
    }
    @Override
    public int calculartoBonus(int salary, int day) {
        if(day >= 22) {
            setBonus((int)(0.25* salary));
            return (int)(0.25 * salary);
        }
        return 0;
    }
    @Override
    public int calculartoAmount(int salary, int day) {
        setAmount((int)(calculatorSalary(salary,day) + calculartoBonus(salary,day)));
        return calculatorSalary(salary,day) + calculartoBonus(salary,day);
    }
}
