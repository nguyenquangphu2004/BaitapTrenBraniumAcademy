package Bai11.Bai2;

public class Student implements Comparable<Student>{
    private String fullName;
    private double avGrade;

    public Student() {

    }
    public Student(String fullName, double avGrade) {
        this.fullName = fullName;
        this.avGrade = avGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", avGrade=" + avGrade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.avGrade - o.avGrade < 0) {
            return -1;
        }
        return 1;
    }
}
