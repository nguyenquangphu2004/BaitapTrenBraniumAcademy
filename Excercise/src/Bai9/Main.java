package Bai9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String fileEMP = "EMP.DAT";

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        boolean check = true;
        while(check) {
            menu();
            System.out.println("Mời bạn chọn: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("=================================================================================");
                    System.out.println("=  1.Thêm giám đốc vào 1 danh sách riêng của giám đốc.                          =");
                    System.out.println("=  2.Thêm nhân viên (khi thêm giám đốc sẽ tự động thêm vào danh sách nhân viên) =");
                    System.out.println("=================================================================================");
                    String choice1 = input.nextLine();
                    switch (choice1) {
                        case "1" :
                            employees.add(manager((input)));
                            break;
                        case "2":
                            employees.add(new Employee(person(input),(Employee)employee(input)));
                            break;
                        default:
                            System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("=================================================================");
                    System.out.println("=  1.Hiển thị danh sách của giám đốc.                           =");
                    System.out.println("=  2.Hiển thị danh sách của nhân viên                           =");
                    System.out.println("=================================================================");
                    String choice2 = input.nextLine();
                    switch (choice2) {
                        case "1" :

                            break;
                        case "2":

                            break;
                        default:
                            System.out.println();
                    }
                    break;
                case 3:
                    findOfEmployeeName(input,employees);
                    break;
                case 4:
                    findOfEmployeeSalary(input,employees);
                    break;
                case 5:
                    break;
                case 6:
                    removeEmployeeId(input,employees);
                    break;
                case 7:
//                    calculator(input,employees,managers);
                    break;
                case 8:
                    showlistSalary(employees);
                    break;
                case 9:
                    break;
                default:
                    check = false;
            }
        }
    }

    private static void menu() {
        System.out.println("===================MENU==================");
        System.out.println("=   1.Thêm nhân viên vào Arraylist      =");
        System.out.println("=   2.Hiển thị thông tin nhân viên      =");
        System.out.println("=   3.Tìm nhân viên theo tên            =");
        System.out.println("=   4.Tìm nhân viên có mức lương >= x   =");
        System.out.println("=   5.Tìm giám đốc theo nhiệm kì        =");
        System.out.println("=   6.Xóa Nhân viên theo mã cho trước   =");
        System.out.println("=   7.Tính lương,thưởng cho nhân viên   =");
        System.out.println("=   8.Hiển thị bảng lương của nhân viên =");
        System.out.println("=   9.Ghi danh sách nhân viên vào file =");
        System.out.println("=   10.Thoát chương trình               =");
        System.out.println("============Cảm ơn bạn đã sử dụng========");
    }

    private static ArrayList readFileEMP() {
        ArrayList<Employee> employees = new ArrayList<>();
        File file = new File(fileEMP);
        try {
            var readFile = new Scanner(file);
            while(readFile.hasNextLine()) {


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
    private static Person person(Scanner input) {
        System.out.println("Chứng minh thư: ");
        String idCard = input.nextLine();
        System.out.println("Họ và tên: ");
        String fullName = input.nextLine();
        System.out.println("Địa chỉ: ");
        String address = input.nextLine();
        System.out.println("Ngày sinh: ");
        String birth  =  input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        System.out.println("Số điện thoại: ");
        String phoneNumber = input.nextLine();

        return  new Person(idCard,fullName,address,birth,email,phoneNumber) {
            @Override
            protected void dowork() {

            }
        };
    }
    private static Person employee(Scanner input) {
        Employee employee = new Employee();
        System.out.println("Mã nhân viên: ");
        employee.setIdEmployee();
        System.out.println(employee.getIdEmployee());
        System.out.println("Chức vụ: ");
        String position = input.nextLine();
        System.out.println("Mức lương: ");
        int salary = input.nextInt();
        System.out.println("Số năm kinh nghiêm: ");
        double expYear = input.nextDouble();
        input.nextLine();

        return new Employee(employee.getIdEmployee(),position,salary,expYear,0,0,0);
    }
    private static Manager manager(Scanner input) {
        System.out.println("Ngày bắt đầu nhiệm kì:");
        String start = input.nextLine();
        System.out.println("Ngày kết thúc nhiệm kì: ");
        String end  = input.nextLine();
        return new Manager(start,end);
    }
    private static void findOfEmployeeName(Scanner input,ArrayList<Employee> employees) {
        System.out.println("Nhập tên: ");
        String name = input.nextLine();
        int index = 0;
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getFullName().substring(employees.get(i).getFullName().lastIndexOf(" ") + 1).compareTo(name) == 0) {
                index = 1;
                System.out.println(employees.get(i));
                System.out.println("--------------------------------------------------------------------");
            }
        }
        if(index == 0) {
            System.out.println("======================Không tìm thấy nhân viên========================");
        }
    }
    private static void findOfEmployeeSalary(Scanner input, ArrayList<Employee> employees) {
        System.out.println("Nhập số tiền x: ");
        double x = input.nextDouble();
        int index = 0;
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getSalary() >= x) {
                index = 1;
                System.out.println(employees.get(i));
                System.out.println("--------------------------------------------------------------------");
            }
        }
        if(index == 0) {
            System.out.println("======================Không tìm thấy nhân viên========================");
        }

    }
    private static Boolean removeEmployeeId(Scanner input,ArrayList<Employee> employees) {
        System.out.println("Mã nhân viên: ");
        String id = input.nextLine();
        int index = 0;
        if(findOfEmployeeId(index,id,employees) != null){
            employees.remove(index);
            System.out.println("=================xóa thành công====================");
            return true;
        }
        else {
            System.out.println("=================xóa thất bại======================");
            return false;
        }

    }

    private static Employee findOfEmployeeId(int index,String id, ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            if(id.compareTo(employees.get(i).getIdEmployee()) == 0) {
                index = i;
                return employees.get(i);
            }
        }
        return null;
    }
    private static void calculator(Scanner input,ArrayList<Employee> employees,ArrayList<Manager> managers) {
        System.out.println("Nhập mã nhân viên: ");
        String id = input.nextLine();
        int index = 0;
        var item1 = findOfEmployeeId(index,id,employees);
        if(item1 != null) {
            System.out.println("Nhập số ngày: ");
            int day = input.nextInt();
            var item = findOfManagerId(id,managers);
            if(item != null) {
                System.out.println("Lương thực: " + item.calculatorSalary(item.getSalary(),day));
                System.out.println("Mức thưởng: " + item.calculartoBonus(item.getSalary(),day));
                System.out.println("Tổng lương: " + item.calculartoAmount(item.getSalary(),day));
                employees.set(index,item);

            } else {
                System.out.println("Lương thực: " + item1.calculatorSalary(item1.getSalary(),day));
                System.out.println("Mức thưởng: " + item1.calculartoBonus(item1.getSalary(),day));
                System.out.println("Tổng lương: " + item1.calculartoAmount(item1.getSalary(),day));
            }
        }
        else {
            System.out.println("==============không tìm thấy nhân viên===============");
        }

    }
    private static Manager findOfManagerId(String id,ArrayList<Manager> managers) {
        for (int i = 0; i < managers.size(); i++) {
            if(id.compareTo(managers.get(i).getIdEmployee()) == 0) {
                return managers.get(i);
            }
        }
        return null;
    }
    private static void showlistSalary(ArrayList<Employee> employees){
        System.out.printf("%-15s%-15s%-12s%-18s%-10s%-20s\n","Mã nhân viên","Tên nhân viên","Mức lương","Số ngày làm việc","Thưởng","Tổng lương được lĩnh");
        for (var item : employees) {
            show(item);
        }
    }
    private static void show(Employee item) {
        System.out.printf("%-15s%-15s%-12s%-18s%-10s%-20s\n",item.getIdEmployee(),item.getFullName().substring(item.getFullName().lastIndexOf(" ") + 1),item.getSalary(),item.getDayOfMonth(),item.getBonus(),item.getAmount());
    }
}
