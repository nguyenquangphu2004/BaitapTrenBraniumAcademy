package BaiTapInterFace.Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Employee extends Person implements Comparable<Employee>{
    protected static int index = 0;
    private static int next = 1001;
    private String  idEmployee;
    private String position;
    private int salary;
    private double expYear;
    private int day;
    private int amoutSalary;
    private int bonus;

    public Employee() {}


    public Employee(String idEmployee,String position, int salary,double expYear,
                        int day, int amoutSalary, int bonus) {
        this.idEmployee = idEmployee;
        this.position = position;
        this.salary =salary;
        this.expYear = expYear;
        this.day = day;
        this.amoutSalary = amoutSalary;
        this.bonus =bonus;
    }

    public Employee(Person person, Employee employee) {
        super(person.getId(), person.getFullName(), person.getAddress(),
                person.getBirth(), person.getEmail(), person.getPhoneNumber());
        this.idEmployee = employee.idEmployee;
        this.position = employee.getPosition();
        this.salary = employee.getSalary();
        this.expYear = employee.getExpYear();
        this.day = employee.getDay();
        this.amoutSalary = employee.getAmoutSalary();
        this.bonus = employee.getBonus();
    }

    public void setNext(int next) {
        Employee.next = next;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee() {
        this.idEmployee = "EMP" + next;
        next ++;
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

    public double getExpYear() {
        return expYear;
    }

    public void setExpYear(double expYear) {
        this.expYear = expYear;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getAmoutSalary() {
        return amoutSalary;
    }

    public void setAmoutSalary(int amoutSalary) {
        this.amoutSalary = amoutSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    protected void doWork() {

    }

    public int canculatorSalary() {
        return (int)((getSalary() * getDay()) / 30);
    }
    public void canculatorBonus() {
        if(getDay() >= 22) {
            setBonus((int)((day - 22) *(0.5 * getSalary())/30));
        }
    }
    public void canculatorAmount() {
        setAmoutSalary(getBonus() + canculatorSalary());
    }


    @Override
    public int compareTo(Employee o) {
        var check1 = this.getFullName().lastIndexOf(" ");
        var name1 = this.getFullName().substring(check1 + 1);

        var check2  = o.getFullName().lastIndexOf(" ");
        var name2 = o.getFullName().substring(check2 + 1);

        var index1 = this.getFullName().indexOf(" ");
        var last1 = this.getFullName().substring(index1);

        var index2 = o.getFullName().indexOf(" ");
        var last2 = o.getFullName().substring(index1);


        if(index == 1) {
           return (int)name1.charAt(0) - (int)name2.charAt(0);
        } else if(index == 2) {
            return name2.compareTo(name1);
        } else if(index == 3) {
            return (this.salary > o.getSalary()) ? 1 : -1;
        } else if(index == 4) {
            return (o.getSalary() > this.salary) ? 1 : -1;
        } else if(index == 6) {
            return (this.expYear > o.expYear) ? 1 : -1;
        } else if(index == 5) {
            return (this.expYear < o.expYear) ? 1 : -1;
        } else if(index == 7) {
        } else if(index == 8) {
        }else if(index == 9) {
           if(this.getAmoutSalary() < o.getAmoutSalary()) {
               return 1;
           } else {
               return -1;
           }
        }
        return -1;

    }

    @Override
    public String toString() {
        return super.toString() + ";" + idEmployee + ";" + position + ";" +
                salary + ";" + expYear + ";" + day + ";" + amoutSalary + ";"
                + bonus;
    }
}
