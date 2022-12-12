package Override.Bai4;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String fileEMP = "EMP.DAT";
    public static final String fileMNG = "MNG.DAT";
    public static final int MONTH = 30;

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(readFileEMP());
        ArrayList<Manager> managers = new ArrayList<>(readFileMNG());

        var input = new Scanner(System.in);
        boolean check = true;
        while(check) {
            menu();
           String choice = input.nextLine();
           switch (choice) {
               case "1" :
                   System.out.println("1.Them nhan vien");
                   System.out.println("2.Them giam doc.");
                   String c = input.nextLine();
                   switch (c) {
                       case "1" :
                           employees.add(addEmployee(input));
                           break;
                       case "2" :
                           managers.add(addManager(input,employees));
                           break;
                   }
                   break;
               case "2" :
                   System.out.println("1.Hien thi danh sach nhan vien");
                   System.out.println("2.Hien thi danh sach giam doc.");
                   String d = input.nextLine();
                   switch (d) {
                       case "1" :
                           showEmployee(employees);
                           break;
                       case "2" :
                           showManager(managers);
                           break;
                   }
                   break;
               case "3":
                   searchEMP(employees,input);
                   break;
               case "4":
                   searchSalary(employees,input);
                   break;
               case "5":
                   break;
               case "6":
                   if(delete(employees,input)) {
                       System.out.println("Xoa thanh cong");
                   } else {
                       System.out.println("xoa that bai");
                   }
                   break;
               case "7":
                   calculatorSalary(input,employees,managers);
                   break;
               case "8":
                   showlistSalary(employees);
                   break;
               case "9":
                   saveEMP(employees);
                   saveMNG(managers);
                   System.out.println("thanh cong");

                   break;
               default:
                   System.out.println("thanks");
//                   check = false;
           }
        }
    }

    private static void menu() {
        System.out.println("1.Them moi mot nhan vien(giam doc va nhan vien)");
        System.out.println("2.Hien thi thong tin nhan vien(giam doc va nhan vien)");
        System.out.println("3.Tim nhan vien theo ten");
        System.out.println("4.Tim nhan vien co muc luong >= x");
        System.out.println("5.Tim giam doc theo nhiem ki");
        System.out.println("6.Xoa nhan vien theo ma cho truoc");
        System.out.println("7.Tinh luong,tien thuong cua nhan vien.");
        System.out.println("8.Hien thi bang luong cua nhan vien.");
        System.out.println("9.Ghi danh sach nhan vien vao file EMP.DAT");
        System.out.println("Khac.Thoat");
    }
    public static Person person(Scanner input) {
        System.out.println("Chung minh thu: ");
        String idCard = input.nextLine();
        System.out.println("Ho va ten: ");
        String fullName = input.nextLine();
        System.out.println("Dia chi: ");
        String address = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        System.out.println("So dien thoai: ");
        String phone = input.nextLine();
        return new Person(idCard,fullName,address,email,phone);
    }
    public static Employee employee(Scanner input) {
        System.out.println("Ma nhan vien: ");
        String employeeId = input.nextLine();
        System.out.println("Chuc vu: ");
        String position = input.nextLine();
        System.out.println("Muc luong: ");
        int salary = Integer.parseInt(input.nextLine());
        System.out.println("So nam kinh nghiem: ");
        int exp = Integer.parseInt(input.nextLine());
        return  new Employee(employeeId,position,salary,exp);


    }
    public static Employee addEmployee(Scanner input) {
        return new Employee(person(input),employee(input));
    }
    public static Manager addManager(Scanner input,ArrayList<Employee> employees) {
        Person person = person(input);
        Employee employee = employee(input);
        System.out.println("Ngay bat dau nhiem ki: ");
        String start = input.nextLine();
        System.out.println("Ngay ket thuc nhiem ki: ");
        String end = input.nextLine();
        employees.add(new Employee(person,employee));
        return new Manager(person,employee,start,end);
    }

    public static void showEmployee(ArrayList<Employee> employees) {
        System.out.printf("%-18s%-18s%-15s%-15s%-15s%-15s%-15s%-14s%-15s\n","Chung minh thu","Ho ten","Dia chi","Email","So dien thoai","Ma nhan vien","Chuc vu","Muc luong","Kinh nghiem");
        for (var item :
                employees) {
            show(item);
        }

    }

    private static void show(Employee item) {
        System.out.printf("%-18s%-18s%-15s%-15s%-15s%-15s%-15s%-14s%-15s\n",
            item.getIdCard(),item.getFullName(),item.getAddress(),item.getEmail(),
            item.getPhone(),item.getEmployeeId(),item.getPosittion(),item.getSalary(),
            item.getExp());
    }

    public static void showManager(ArrayList<Manager> managers) {
        System.out.printf("%-18s%-18s%-15s%-15s%-15s%-15s%-15s%-14s%-15s%-25s%-25s\n","Chung minh thu","Ho ten","Dia chi","Email","So dien thoai","Ma nhan vien","Chuc vu","Muc luong","Kinh nghiem","Ngay bat dau nhiem ki","Ngay ket thuc nhiem ki");
        for (var item :
                managers) {
            System.out.printf("%-18s%-18s%-15s%-15s%-15s%-15s%-15s%-14s%-15s%-25s%-25s\n",
                    item.getIdCard(),item.getFullName(),item.getAddress(),item.getEmail(),
                    item.getPhone(),item.getEmployeeId(),item.getPosittion(),item.getSalary(),
                    item.getExp(),item.getStart(),item.getEnd());
        }
    }

    public static void searchEMP(ArrayList<Employee> employees,Scanner input) {
        System.out.println("Nhap ten: ");
        String name = input.nextLine();
        var check = findOfEMP(employees,name);
        if(check != null) {
            System.out.printf("%-18s%-18s%-15s%-15s%-15s%-15s%-15s%-14s%-15s\n","Chung minh thu","Ho ten","Dia chi","Email","So dien thoai","Ma nhan vien","Chuc vu","Muc luong","Kinh nghiem");
            var item = check;
            System.out.printf("%-18s%-18s%-15s%-15s%-15s%-15s%-15s%-14s%-15s\n",
                    item.getIdCard(),item.getFullName(),item.getAddress(),item.getEmail(),
                    item.getPhone(),item.getEmployeeId(),item.getPosittion(),item.getSalary(),
                    item.getExp());
        } else {
            System.out.println("khong tim thay");
        }
    }

    private static Employee findOfEMP(ArrayList<Employee> employees, String name) {

        for (int i = 0; i < employees.size(); i++) {
            var start = employees.get(i).getFullName().split(" ");
            if(name.compareTo(start[start.length - 1]) == 0); {
                return employees.get(i);
            }
        }
        return null;
    }
    private static boolean delete(ArrayList<Employee> employees,Scanner input) {
        System.out.println("Nhap ma nhan vien: ");
        String id = input.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if(id.compareTo(employees.get(i).getEmployeeId()) == 0) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }
    private static void searchSalary(ArrayList<Employee> employees,Scanner input) {
        System.out.println("Nhap muc long: ");
        int x = input.nextInt();
        System.out.printf("%-18s%-18s%-15s%-15s%-15s%-15s%-15s%-14s%-15s\n","Chung minh thu","Ho ten","Dia chi","Email","So dien thoai","Ma nhan vien","Chuc vu","Muc luong","Kinh nghiem");
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getSalary() >= x) {
                var item = employees.get(i);
                System.out.printf("%-18s%-18s%-15s%-15s%-15s%-15s%-15s%-14s%-15s\n",
                        item.getIdCard(),item.getFullName(),item.getAddress(),item.getEmail(),
                        item.getPhone(),item.getEmployeeId(),item.getPosittion(),item.getSalary(),
                        item.getExp());
            }
        }
    }


    private static void listSalary(ArrayList<Employee> employees) {
        System.out.printf("%-16s%-18s%-15s%-20s%-15s%-15s\n","Ma nhan vien","Ho ten","Muc luong","So ngay lam viec","Thuong","Tong luong");
        for (var item :
                employees) {
            list(item);
        }
    }

    private static void list(Employee item) {
        System.out.printf("%-16s%-18s%-15s%-20s%-15s%-15s\n",item.getEmployeeId(),item.getFullName(),item.getSalary(),item.getNumberOfworkDayInMonth(),item.getBonus(),item.getAmountReceived());
    }




    private static Employee findOfEMPIdi(String id, ArrayList<Employee> employees, int index_1) {
        for (int i = 0; i < employees.size(); i++) {
            if(id.compareTo(employees.get(i).getEmployeeId()) == 0) {
                index_1 = i;
                return employees.get(i);
            }
        }
        return null;
    }

    private static Manager findOfMNGId(String id, ArrayList<Manager> managers,int index_2) {
        for (int i = 0; i < managers.size(); i++) {
            if(id.compareTo(managers.get(i).getEmployeeId() ) == 0) {
                index_2 = i;
                return managers.get(i);
            }
        }
        return null;
    }
    public static void showlistSalary(ArrayList<Employee> employees) {
        System.out.printf("%-15s%-20s%-15s%-20s%-15s%-15s\n","Ma nhan vien","Ho ten","Muc luong","So ngay lam viec","Thuong","Tong luong");
        for (var item :
                employees) {
            showSalary(item);
        }
    }

    private static void showSalary(Employee item) {
        System.out.printf("%-15s%-20s%-15s%-20s%-15s%-15s\n",item.getEmployeeId(),item.getFullName(),item.getSalary(),item.getNumberOfworkDayInMonth(),item.getBonus(),item.getAmountReceived());
    }

    public static void calculatorSalary(Scanner input,ArrayList<Employee> employees,ArrayList<Manager> managers) {
        System.out.println("Ma nhan vien:");
        String id = input.nextLine();
        int index_1 = 0;
        var check1 = findOfEMPIdi(id,employees,index_1);
        if(check1 != null) {
            System.out.println("Nhap ngay: ");
            int day = input.nextInt();
            check1.setNumberOfworkDayInMonth(day);
            int index_2 = 0;
            var check2 = findOfMNGId(id,managers,index_2);
            if(check2 != null) {
                check2.setNumberOfworkDayInMonth(day);
                check2.setBonus(check2.bonuss());
                check2.setAmountReceived(check2.amount());
                check1.setBonus(check2.bonuss());
                check1.setAmountReceived(check2.amount());
                System.out.println("Luong thuc: " + check1.payRoll());
                System.out.println("Thuong: " + check1.getBonus());
                System.out.println("Tong luong: " + check1.getAmountReceived());

            } else {
                System.out.println("Luong thuc: " + check1.payRoll());
                System.out.println("Thuong: " + check1.bonuss());
                System.out.println("Tong luong: " + check1.amount());
            }
        } else {
            System.out.println("khong tim thay ma");
        }
    }
    public static ArrayList<Employee> readFileEMP() {
        ArrayList<Employee> employees = new ArrayList<>();
        File file = new File(fileEMP);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            var read = new Scanner(file);
            while(read.hasNextLine()) {
                var words = read.nextLine().split(";");
                var idCard = words[0];
                var fullName = words[1];
                var address= words[2];
                var email = words[3];
                var phone = words[4];
                var id = words[5];
                var position = words[6];
                var salary =Integer.parseInt(words[7]);
                var exp = Integer.parseInt(words[8]);
                var day = Integer.parseInt(words[9]);
                var bonus = Integer.parseInt(words[10]);
                var amout = Integer.parseInt(words[11]);
                employees.add(new Employee(idCard,fullName,address,email,phone,id,position,salary,exp,day
                ,bonus,amout));

            }
            read.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
    public static void saveEMP(ArrayList<Employee> employees) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileEMP);
            PrintWriter out = new PrintWriter(fileWriter);
            for (var item :
                    employees) {
                out.printf("%s;%s;%s;%s;%s;%s;%s;%d;%d;%d;%d;%d",item.getIdCard(),item.getFullName(),item.getAddress(),
                        item.getEmail(),item.getPhone(),item.getEmployeeId(),item.getPosittion(),item.getSalary(),
                        item.getExp(),item.getNumberOfworkDayInMonth(),item.getBonus(),item.getAmountReceived());
            }
            out.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<Manager>  readFileMNG() {
        ArrayList<Manager> managers = new ArrayList<>();
        File file = new File(fileMNG);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            var read = new Scanner(file);
            while(read.hasNextLine()) {
                var words = read.nextLine().split(";");
                var idCard = words[0];
                var fullName = words[1];
                var address= words[2];
                var email = words[3];
                var phone = words[4];
                var id = words[5];
                var position = words[6];
                var salary =Integer.parseInt(words[7]);
                var exp = Integer.parseInt(words[8]);
                var day = Integer.parseInt(words[9]);
                var bonus = Integer.parseInt(words[10]);
                var amout = Integer.parseInt(words[11]);
                var start = words[12];
                var end = words[13];

                managers.add(new Manager(idCard,fullName,address,email,phone,id,position,salary,exp,day,bonus,amout,start,end));
            }
            read.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return managers;
    }
    public static void saveMNG(ArrayList<Manager> managers) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileMNG);
            PrintWriter out = new PrintWriter(fileWriter);
            for (var item :
                    managers) {
                out.printf("%s;%s;%s;%s;%s;%s;%s;%d;%d;%d;%d;%d;%s;%s",item.getIdCard(),item.getFullName(),item.getAddress(),
                        item.getEmail(),item.getPhone(),item.getEmployeeId(),item.getPosittion(),item.getSalary(),
                        item.getExp(),item.getNumberOfworkDayInMonth(),item.getBonus(),item.getAmountReceived(),item.getStart(),item.getEnd());
            }
            out.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
