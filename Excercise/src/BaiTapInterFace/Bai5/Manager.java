package BaiTapInterFace.Bai5;

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

    public String getStart() {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(start);
    }

    public void setStart(String start) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            this.start = dateFormat.parse(start);
        } catch (ParseException e) {
            this.start = new Date();
        }
    }

    public String getEnd() {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(end);
    }

    public void setEnd(String end) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            this.end = dateFormat.parse(end);
        } catch (ParseException e) {
            this.end = new Date();
        }
    }
     public int canculatorSalary() {
        return (int)((getSalary() * getDay()) / 30);
    }
    public void canculatorBonus() {
        if(getDay() >= 22) {
            setBonus((int)(0.25 * getSalary()));
        }
    }
    public void canculatorAmount() {
        setAmoutSalary(getBonus() + canculatorSalary());
    }

    @Override
    public String toString() {
        return super.toString() + ";" + getStart() + ";" + getEnd();
    }
}
