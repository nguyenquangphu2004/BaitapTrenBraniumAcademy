package Bai8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GraduatedStudent extends Student{
    private Date timeGraduate;
    private int creditRetaken;
    private int numberSubjectFailed;
    private double salaryStartPoint;
    private String nameCompany;
    private String position;

    public GraduatedStudent() {

    }

    public GraduatedStudent(String timeGraduate, int creditRetaken,
                            int numberSubjectFailed, double salaryStartPoint,
                            String nameCompany, String position) {
        setTimeGraduate(timeGraduate);
        this.creditRetaken = creditRetaken;
        this.numberSubjectFailed = numberSubjectFailed;
        this.salaryStartPoint = salaryStartPoint;
        this.nameCompany = nameCompany;
        this.position = position;
    }



    public GraduatedStudent(Person person, Student student, GraduatedStudent graduatedStudent ) {
        super(person,student);
        setTimeGraduate(graduatedStudent.getTimeGraduate());
        this.creditRetaken = graduatedStudent.getCreditRetaken();
        this.numberSubjectFailed = graduatedStudent.getNumberSubjectFailed();
        this.salaryStartPoint = graduatedStudent.getSalaryStartPoint();
        this.nameCompany = graduatedStudent.getNameCompany();
        this.position = graduatedStudent.getPosition();
    }



    public String getTimeGraduate() {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        return formatDate.format(timeGraduate);
    }

    public void setTimeGraduate(String timeGraduate) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        try {
            this.timeGraduate = formatDate.parse(timeGraduate);
        } catch (ParseException e) {
            this.timeGraduate = new Date();
//            throw new RuntimeException(e);
        }

    }

    public int getCreditRetaken() {
        return creditRetaken;
    }

    public void setCreditRetaken(int creditRetaken) {
        this.creditRetaken = creditRetaken;
    }

    public int getNumberSubjectFailed() {
        return numberSubjectFailed;
    }

    public void setNumberSubjectFailed(int numberSubjectFailed) {
        this.numberSubjectFailed = numberSubjectFailed;
    }

    public double getSalaryStartPoint() {
        return salaryStartPoint;
    }

    public void setSalaryStartPoint(double salaryStartPoint) {
        this.salaryStartPoint = salaryStartPoint;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGraduatedStudent{" +
                "timeGraduate=" + getTimeGraduate() +
                ", creditRetaken=" + creditRetaken +
                ", numberSubjectFailed=" + numberSubjectFailed +
                ", salaryStartPoint=" + salaryStartPoint +
                ", nameCompany='" + nameCompany + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
