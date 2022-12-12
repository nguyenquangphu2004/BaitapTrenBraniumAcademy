package Bai8;

public class Student extends  Person{
    private String idStudent;
    private String school;
    private String major;
    private double avGrade;

    public Student() {

    }

    public Student(String idStudent,String school,String major,double avGrade) {
        this.idStudent = idStudent;
        this.school = school;
        this.major  = major;
        this.avGrade  = avGrade;

    }

    public Student(Person person,Student student) {
        super(person.getIdCard(), person.getFullName(), person.getAddress(),
                person.getDateBirth(),person.getEmail(), person.getNumberPhone());
        this.idStudent = student.getIdStudent();
        this.school = student.getSchool();
        this.major = student.getMajor();
        this.avGrade = student.getAvGrade();
    }



    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void doWork() {
        System.out.println("Đang làm bài tập của chuyên ngành: " + getMajor());
    }

    @Override
    protected void speak() {

    }

    @Override
    protected void relax() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nStudent{" +
                "idStudent='" + idStudent + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", avGrade=" + avGrade +
                '}';
    }




}
