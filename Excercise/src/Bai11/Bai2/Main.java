package Bai11.Bai2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nguyen quang phu",8.9);
        Student studen1 = new Student("nguyen quang nam",7.8);
        Student student2 = new Student("àgafa",10);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(studen1);
        students.add(student2);
        Collections.sort(students);
//        for (int i = 0; i < students.size(); i++) {
//            for (int j = i + 1; j < students.size(); j++) {
//                var check = students.get(i).compareTo(students.get(j));
//                if(check == 1) {
//                    var temp = students.get(i);
//                    students.set(i,students.get(j));
//                    students.set(j,temp);
//                }
//
//            }
//        }
        for (var item :
                students) {
            System.out.println(item);
        }

    }
}
