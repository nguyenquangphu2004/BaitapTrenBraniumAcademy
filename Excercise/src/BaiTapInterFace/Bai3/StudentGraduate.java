package BaiTapInterFace.Bai3;

public class StudentGraduate extends Student{
    private String start;
    private String end;
    private int retakenCreditNumber;
    private int numberOfFailedSubject;
    private int startSalary;
    private String nameCompany;
    private String jobPosition;

    public StudentGraduate(String studentId, String school, String nameClass,
                           String major, String avGrade, String start,
                           String end, int retakenCreditNumber,
                           int numberOfFailedSubject, int startSalary,
                           String nameCompany, String jobPosition) {
        super(studentId, school, nameClass, major, avGrade);
        this.start = start;
        this.end = end;
        this.retakenCreditNumber = retakenCreditNumber;
        this.numberOfFailedSubject = numberOfFailedSubject;
        this.startSalary = startSalary;
        this.nameCompany = nameCompany;
        this.jobPosition = jobPosition;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getRetakenCreditNumber() {
        return retakenCreditNumber;
    }

    public void setRetakenCreditNumber(int retakenCreditNumber) {
        this.retakenCreditNumber = retakenCreditNumber;
    }

    public int getNumberOfFailedSubject() {
        return numberOfFailedSubject;
    }

    public void setNumberOfFailedSubject(int numberOfFailedSubject) {
        this.numberOfFailedSubject = numberOfFailedSubject;
    }

    public int getStartSalary() {
        return startSalary;
    }

    public void setStartSalary(int startSalary) {
        this.startSalary = startSalary;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    @Override
    public int compareTo(Person o) {
      var word = this.getFullName().split(" ");
       var name1 = word[word.length - 1];
       var word1 = o.getFullName().split(" ");
       var name2 = word1[word1.length - 1];
       return name1.compareTo(name2);
    }
}
