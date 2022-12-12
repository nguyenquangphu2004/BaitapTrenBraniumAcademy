package Bai5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var ojb = new Student("b22dccn621","nguyen quang phu");
        var ojb1 = new Student("b22dccn621","nguyen quang phu");
        Object ojb2 = new Student("b22dccn622","nguyen quang phong");
        ArrayList<Student> students = new ArrayList<>();
        students.add(ojb);
        students.add(ojb1);
        students.add((Student) ojb2);
        int index = 1;
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if(students.get(i).equals(students.get(j))) {
                    index ++;
                }
            }
            if(index == 1) {
                System.out.println(students.get(i));
            }
            index = 1;
        }
        System.out.println(ojb.hashCode());
        System.out.println(ojb1.hashCode());
//        System.out.println(ojb1.hashCode());
    }
//    469406536
//    469406505
}
