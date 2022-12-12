package Bai4;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private static String fileEmp = "EMP.DAT";
    private static String fileMan  = "DIR.DAT";

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>(employees());
        ArrayList<Manager> managers = new ArrayList<>(managers());
        boolean check = true;
        while(check) {
            System.out.println("Mời bạn chọn:");
            int n = input.nextInt();
            input.nextLine();
            switch (n) {
                case 1:
                    addEmp(employees,input);
                    break;
                case 2:
                    addMan(employees,managers,input);
                    break;
                case 8:
                    deleteEMP(employees,managers,input);
                    break;
                case 9:
                    savaFileEMP(employees);
                    saveFileMan(managers);
                    break;
            }
        }
    }
    public static ArrayList<Employee> employees () {
        ArrayList<Employee> employees = new ArrayList<>();
            try {
                File file = new File(fileEmp);
                file.createNewFile();
                var readFile = new Scanner(file);
                while(readFile.hasNextLine()) {
                    var words = readFile.nextLine().split(";");
                    String ident = words[0];
                    String fulName = words[1];
                    String addre = words[2];
                    String birth = words[3];
                    String email = words[4];
                    String phone  = words[5];
                    String id = words[6];
                    String position = words[7];
                    int salary = Integer.parseInt(words[8]);
                    int exp = Integer.parseInt(words[9]);

                    employees.add(new Employee(ident,fulName,addre,birth,email,phone,
                            id,position,salary,exp));
                }
                readFile.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        return  employees;
    }
    public static ArrayList<Manager> managers () {
        ArrayList<Manager> managers = new ArrayList<>();
        try {
            File file = new File(fileMan);
            file.createNewFile();
            var readFile = new Scanner(file);
            while(readFile.hasNextLine()) {
                var words = readFile.nextLine().split("-");
                String ident = words[0];
                String fulName = words[1];
                String addre = words[2];
                String birth = words[3];
                String email = words[4];
                String phone = words[5];
                String id = words[6];
                String position = words[7];
                int salary = Integer.parseInt(words[8]);
                int exp = Integer.parseInt(words[9]);
                int bonus = Integer.parseInt(words[10]);
                String start = words[11];
                String end = words[12];
                managers.add(new Manager(ident,fulName,addre,birth,
                        email,phone, id,position,salary,exp,
                        bonus,start,end));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return managers;
    }


    public static void saveFileMan(ArrayList<Manager> managers) {
        try {
            FileWriter fileWriter = new FileWriter(fileMan);
            PrintWriter out = new PrintWriter(fileWriter);
            for (var i :
                    managers) {
                out.printf("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s", i.getIdentification(), i.getFullName(), i.getAddress(),
                        i.getBirth(),i.getEmail(),i.getPhone(),i.getId(),i.getPosition(),i.getSalary(),i.getExp(),
                        i.getSalaryBonus(),i.getStartDate(),i.getEndDate());
                out.println();
            }
            out.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void savaFileEMP(ArrayList<Employee> employees) {
        try {
            FileWriter fileWriter = new FileWriter(fileEmp);
            PrintWriter out = new PrintWriter(fileWriter);
            for (var i :
                    employees) {
                out.printf("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s", i.getIdentification(), i.getFullName(), i.getAddress(),
                        i.getBirth(),i.getEmail(),i.getPhone(),i.getId(),i.getPosition(),i.getSalary(),i.getExp());
                out.println();
            }
            out.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void deleteEMP(ArrayList<Employee> employees,ArrayList<Manager> managers,Scanner input) {
        System.out.println("Nhập mã nhân viên: ");
        String id = input.nextLine();
        var check = findOfEmpId(employees,managers,id);
        if(check  == true) {
            System.out.println("xóa thành công");

        } else {
            System.out.println("xóa thất bại");
        }
    }

    private static boolean findOfEmpId(ArrayList<Employee> employees,ArrayList<Manager> managers, String id) {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < managers.size(); j++) {
                if (id.compareTo(managers.get(j).getId()) == 0 && id.compareTo(employees.get(i).getId()) == 0) {
                    employees.remove(i);
                    managers.remove(j);
                    return true;
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            if(id.compareTo(employees.get(i).getId()) == 0) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void  addEmp(ArrayList<Employee> employees,Scanner input) {
        String iden = input.nextLine();
        String name = input.nextLine();
        String address = input.nextLine();
        String birth = input.nextLine();
        String email = input.nextLine();
        String phone = input.nextLine();
        String id = input.nextLine();
        String position = input.nextLine();
        int salary  = input.nextInt();
        int exp = input.nextInt();
        employees.add(new Employee(iden,name,address,birth,email,phone,id,position,salary,exp));
    }

    public static void addMan(ArrayList<Employee> employees,ArrayList<Manager> managers,Scanner input) {
        String iden = input.nextLine();
        String name = input.nextLine();
        String address = input.nextLine();
        String birth = input.nextLine();
        String email = input.nextLine();
        String phone = input.nextLine();
        String id = input.nextLine();
        String position = input.nextLine();
        int salary  = input.nextInt();
        int exp = input.nextInt();
        employees.add(new Employee(iden,name,address,birth,email,phone,id,position,salary,exp));
        int bonus = input.nextInt();
        String start = input.nextLine();
        String end = input.nextLine();
        managers.add(new Manager(iden,name,address,birth,email,phone,id,position,salary,exp,bonus,start,end));
    }


}
