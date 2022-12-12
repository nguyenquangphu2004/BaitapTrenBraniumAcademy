package Bai8;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teach> teaches = new ArrayList<>();
        ArrayList<GraduatedStudent> graduatedStudents = new ArrayList<>();

        boolean check = true;
        while (check) {
            menu();
            System.out.println("XIN MOI CHON: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    students.add(new Student(person(input),(Student)student(input)));
                    break;
                case 2:
                    graduatedStudents.add(new GraduatedStudent(person(input),(Student)student(input),(GraduatedStudent)graduatedStudent(input) ));
                    break;
                case 3:
                    teaches.add(new Teach(person(input),(Teach)teach(input)));
                    break;
                case 4:


                    System.out.println(students.get(0));
                    System.out.println("======================================");
                    System.out.println(graduatedStudents.get(0));
                    System.out.println("======================================");
                    System.out.println(teaches.get(0));
                    break;
                default:
                    check = false;
            }
        }

    }

    public static void menu() {
        System.out.println("=======================================");
        System.out.println("= 1.Them sinh vien chua tot nghiep.    =");
        System.out.println("= 2.Them sinh vien da tot nghiep.      =");
        System.out.println("= 3.Them giao vien                     =");
        System.out.println("= 4.Hien thi danh sach.                =");
        System.out.println("=======================================");
    }

    public static Person person(Scanner input) {
        System.out.println("CHUNG MINH THU:");
        String idCard = input.nextLine();

        System.out.println("Ho va ten: ");
        String fullName = input.nextLine();

        System.out.println("Dia chi: ");
        String address = input.nextLine();

        System.out.println("Ngay sinh: ");
        String dateBirth = input.nextLine();

        System.out.println("Email: ");
        String email  = input.nextLine();

        System.out.println("So dien thoai: ");
        String numberPhone = input.nextLine();

        return new Person(idCard,fullName,address,dateBirth,email,numberPhone) {
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
        };
    }

    public static Person student(Scanner input) {
        System.out.println("Ma sinh vien: ");
        String idStudent = input.nextLine();

        System.out.println("Truong hoc: ");
        String school = input.nextLine();

        System.out.println("Chuyen nganh: ");
        String major = input.nextLine();

        System.out.println("Diem trung binh: ");
        double avGrade = input.nextDouble();
        input.nextLine();
        return new Student(idStudent,school,major,avGrade);
    }

    public static Person teach(Scanner input) {
        System.out.println("Ma giao vien: ");
        String idTeacher = input.nextLine();

        System.out.println("Chuyen mon: ");
        String specializing = input.nextLine();

        System.out.println("Muc luong: ");
        double salary = input.nextDouble();

        System.out.println("So nam kinh nghiem: ");
        double expYear = input.nextDouble();
        input.nextLine();

        return new Teach(idTeacher,specializing,salary,expYear);
    }

    public static Person graduatedStudent(Scanner input) {
        System.out.println("Thoi gian tot nghiep: ");
        String timeGraduate = input.nextLine();

        System.out.println("So tin chi da hoc lai: ");
        int creditRetaken = input.nextInt();

        System.out.println("So mon hoc da hoc lai: ");
        int numberSubjectFailed = input.nextInt();

        System.out.println("Muc luong khoi diem: ");
        double salaryStartPointt = input.nextDouble();
        input.nextLine();

        System.out.println("Ten cong ty: ");
        String nameCompany = input.nextLine();

        System.out.println("Chuc vu: ");
        String position = input.nextLine();

        return new GraduatedStudent(timeGraduate,creditRetaken,numberSubjectFailed,salaryStartPointt
        ,nameCompany,position);

    }

}

