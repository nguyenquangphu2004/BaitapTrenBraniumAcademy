package BaiTapInterFace.Bai3;

public class Student extends Person{
    private String studentId;
    private String school;
    private String nameClass;
    private String major;
    private String avGrade;

    public Student() {

    }

    public Student(String studentId, String school, String nameClass,
                   String major, String avGrade) {
        this.studentId = studentId;
        this.school = school;
        this.nameClass = nameClass;
        this.major = major;
        this.avGrade = avGrade;
    }

    public Student(Person person, Student student) {
        super(person.getId(), person.getFullName(), person.getAddress(),
                person.getBirth(),person.getEmail(),person.getPhoneNumber());
        this.studentId = student.getStudentId();
        this.school = student.getSchool();
        this.nameClass = student.getNameClass();
        this.major = student.getMajor();
        this.avGrade = student.getAvGrade();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(String avGrade) {
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

    }

    @Override
    protected void speak() {

    }

    @Override
    protected void relax() {

    }

//    @Override
//    public int compareTo(Person o) {
//       var word = this.getFullName().split(" ");
//       var name1 = word[word.length - 1];
//       var word1 = o.getFullName().split(" ");
//       var name2 = word1[word1.length - 1];
//       return name1.compareTo(name2);
//    }


}
