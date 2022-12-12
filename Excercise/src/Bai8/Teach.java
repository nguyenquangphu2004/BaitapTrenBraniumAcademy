package Bai8;

public class Teach extends Person{
    private String idTeacher;
    private String specializing; // chuyeen mon;
    private double salary;
    private double expYear;


    public Teach() {

    }

    public Teach(String idTeacher, String specializing, double salary, double expYear) {
        this.idTeacher = idTeacher;
        this.specializing = specializing;
        this.salary = salary;
        this.expYear = expYear;
    }

    public Teach(Person person, Teach teach) {
        super(person.getIdCard(), person.getFullName(), person.getAddress(),
                person.getDateBirth(),person.getEmail(), person.getNumberPhone());
        this.idTeacher = teach.getIdTeacher();
        this.specializing = teach.getSpecializing();
        this.salary = teach.getSalary();
        this.expYear = teach.getExpYear();
    }


    public final String getIdTeacher() {
        return idTeacher;
    }

    public final void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public final String getSpecializing() {
        return specializing;
    }

    public final void setSpecializing(String specializing) {
        this.specializing = specializing;
    }

    public final double getSalary() {
        return salary;
    }

    public final void setSalary(double salary) {
        this.salary = salary;
    }

    public final double getExpYear() {
        return expYear;
    }

    public final void setExpYear(double expYear) {
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
    public String toString() {
        return super.toString() + "\nTeach[" +
                "idTeacher='" + idTeacher + '\'' +
                ", specializing='" + specializing + '\'' +
                ", salary=" + salary +
                ", expYear=" + expYear +
                ']';
    }


    public void compoSing() {
        System.out.println("Giảng viên đang soạn bài môn: " + getSpecializing());
    }
    public void mark() {
        System.out.println("Giảng viên đang chấm bài môn: " + getSpecializing());
    }
    public void topic() {

    }
    public void councilMeeting() {

    }


}
