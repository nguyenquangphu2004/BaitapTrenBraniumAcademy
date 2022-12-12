package BaiTapInterFace.Bai3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person teach1 = new Teacher(1000,15.9);

//        item.setSalary(1000);
        teach1.setFullName("Trần Thị Vân Anh");


        Person teach2 = new Teacher(150,6.5);
        teach2.setFullName("Kim Jisoo");


        Person teach3 = new Teacher(505,2.4);
        teach3.setFullName("Kim Jenni");

        Person teach4 = new Teacher(12012,5);
        teach4.setFullName("Park Cheng Young");

        Person teach5 = new Teacher(53252,7.8);
        teach5.setFullName("Erik Teg Hag");

        Person teach6 = new Teacher(29,2.4);
        teach6.setFullName("Pep Guradiola");

        Person teach7 = new Teacher(496946944,15.8);
        teach7.setFullName("Trần Thị Ngọc Hương");

        people.add(teach1);
        people.add(teach2);
        people.add(teach3);
        people.add(teach4);
        people.add(teach5);
        people.add(teach6);
        people.add(teach7);

        System.out.println("Trước khi sắp xếp: ");
        for (var item :
                people) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Sau khi sắp xếp: ");

        Collections.sort(people);
        for (var item :
             people) {
            System.out.println(item);
        }


    }
}
