package Bai5;

import java.util.Objects;

public class Student {
    private String id;
    private String fullName;

    public Student(String id,String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
//    @Override
//    public String toString() {
//        return "{id ='" + id + "',FullName='" + fullName + "'}";
//    }

    @Override
    public String toString() {
        return getClass().getName()+ "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return 31 + id.hashCode();
    }
}
