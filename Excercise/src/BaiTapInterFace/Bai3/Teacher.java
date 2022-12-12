package BaiTapInterFace.Bai3;

public class Teacher extends Person {
    private String idTeacher;
    private String major;
    private int salary;
    private double expYear;

    public Teacher() {

    }


    public Teacher(int salary, double expYear) {
        this.salary = salary;
        this.expYear = expYear;
    }

    public Teacher(String idTeacher, String major, int salary, double expYear) {
        this.idTeacher = idTeacher;
        this.major = major;
        this.salary = salary;
        this.expYear = expYear;
    }

    public Teacher(Person person, Teacher teacher) {
        super(person.getId(), person.getFullName(), person.getAddress(),
                person.getBirth(),person.getEmail(),person.getPhoneNumber());
        this.idTeacher = teacher.getIdTeacher();
        this.major =teacher.getMajor();
        this.salary = teacher.getSalary();
        this.expYear =teacher.getExpYear();
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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

    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void doWork() {

    }

    @Override
    protected void speak() {

    }

    @Override
    protected void relax() {

    }


    @Override
    public int compareTo(Person o) {
        if(o instanceof Teacher) {
            var a = (Teacher)o;
            if(this.expYear > a.getExpYear()) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Cô Giáo = [ Họ Và Tên: '" + getFullName() + "'][Lương = "
                + getSalary() + "][Số năm kinh nghiêm = " + getExpYear() + "]";
    }

}
