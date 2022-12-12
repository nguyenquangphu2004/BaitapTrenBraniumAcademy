package BaiTapInterFace.Bai5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Test {
    private static final String fileEmp = "EMP.DAT";
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();
        AccountManagerImpl accountManager = new AccountManagerImpl();



        boolean checkAccount  = true;

        while(checkAccount) {
            menuAccount();
            int choiceAccount = input.nextInt();
            input.nextLine();
            switch (choiceAccount) {
                case 1:
                    var a = accountManager.signup(account(input));
                    if(a) {
                        System.out.println("====>Đăng kí thành công<====");
                    } else {
                        System.out.println("=====>Đăng kí thất bại<=====");
                    }
                    break;
                case 2:
                    if(accountManager.getAccounts().size() > 0) {
                        var ac = account(input);
                        var b = accountManager.login(ac);
                        boolean ktBoolean = true;
                        for(int i = 0; i < accountManager.getAccounts().size(); i++) {
                            if(ac.equals(accountManager.getAccounts().get(i))) {
                                var s = (Activity)accountManager.getAccounts().get(i);
                                ktBoolean = s.isActivate();
                                break;
                            }
                        }
                        if (b == true && ktBoolean) {
                            boolean check = true;
                            while (check) {
                                menu();
                                System.out.printf("Mời bạn chọn: ");
                                int choice = input.nextInt();
                                input.nextLine();

                                switch (choice) {
                                    case 1:
                                        System.out.println("1.Thêm giám đốc");
                                        System.out.println("2.Thêm nhân viên");
                                        System.out.printf("Mời bạn chọn: ");
                                        int choice1 = Integer.parseInt(input.nextLine());
                                        if (choice1 == 1) {
                                            employees.add(new Manager(person(input),
                                                    (Employee) employee(input), (Manager) manager(input)));
                                        } else if (choice1 == 2) {
                                            employees.add(new Employee(person(input), (Employee) employee(input)));
                                        }
                                        break;
                                    case 2:
                                        showListEmployee(employees);
                                        break;
                                    case 3:
                                        if (employees.size() > 0) {
                                            findOfEmployeeName(employees, input);
                                        } else {
                                            System.out.println("=====>Không tồn tại nhân viên<=====");
                                        }
                                        break;
                                    case 4:
                                        if (employees.size() > 0) {
                                            findOfEmployeeSalary(employees, input);
                                        } else {
                                            System.out.println("=====>Không tồn tại nhân viên<=====");
                                        }
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        if (employees.size() > 0) {
                                            if (removeEmployeeId(employees, input)) {
                                                System.out.println("====>Xóa thành công<====");
                                            } else {
                                                System.out.println("====>Xóa thất bại<=====");
                                            }
                                        } else {
                                            System.out.println("=====>Không tồn tại nhân viên<=====");
                                        }
                                        break;
                                    case 7:
                                        int n = 0;
                                        for (int i = 0; i < employees.size(); i++) {
                                            employees.get(i).canculatorBonus();
                                            employees.get(i).canculatorAmount();
                                            n = i;
                                            if (n == employees.size() - 1) {
                                                int j = 1;
                                                System.out.print("1%");
                                                while (j <= 18) {
                                                    System.out.print("=");
                                                    try {
                                                        Thread.sleep(350);
                                                    } catch (InterruptedException e) {
                                                        throw new RuntimeException(e);
                                                    }
                                                    j++;
                                                }
                                                System.out.print(">100%\n");

                                            }
                                        }
                                        if (n == employees.size() - 1) {
                                            System.out.println("====>Cập nhật bảng lương thành công <======");
                                        } else {
                                            System.out.println("====>Cập nhật bảng lương thất bại <======");

                                        }

                                        break;
                                    case 8:
                                        boolean kt = true;
                                        while (kt) {
                                            menu8();
                                            System.out.println("Mời bạn chọn: ");
                                            int choice3 = Integer.parseInt(input.nextLine());
                                            switch (choice3) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    Collections.sort(employees);
                                                    showListEmployee(employees);
                                                    break;
                                                default:
                                                    kt = false;
                                            }
                                        }
                                        break;
                                    case 9:
                                        showSalary(employees);
                                        break;
                                    case 10:
                                        if (saveFile(employees)) {
                                            System.out.println("======> Lưu thành công <======");
                                        }
                                        break;
                                    default:
                                       if(accountManager.logout(ac)) {
                                           check = false;
                                       }
                                }
                            }
                        } else {
                            System.out.println("====> Tài khoản hoặc Mật khẩu không đúng hoặc" +
                                    " Tài khoản của bạn đang bị khóa <===");
                        }
                    } else {
                        System.out.println("=====>Tài khoản không tồn tại<=====");
                    }
                    break;
                case 3:
                    if(accountManager.getAccounts().size() > 0) {

                        var c = accountManager.lockAccount(account(input));
                        if (c) {
                            System.out.println("=====>Khóa thành công<=====");
                        } else {
                            System.out.println("====> Khóa thất bại <====");
                        }
                    } else {
                        System.out.println("======>Tài khoản không tồn tại <=====");
                    }
                    break;
                case 4:
                    if(accountManager.getAccounts().size() > 0) {
                        var d = accountManager.openAcccount(account(input));
                        if (d) {
                            System.out.println("====>Mở khóa thành công<====");
                        } else {
                            System.out.println("===>Mở khóa thất bại<====");
                        }
                    } else {
                        System.out.println("====>Tài khoản không tồn tại <=====");
                    }
                    break;
                case 5:
                    var sign = account(input);
                    var checkPassWord = findOfPassWord(sign,accountManager.getAccounts());
                    if(checkPassWord != null) {
                        System.out.println("New PassWord: ");
                        String newPass = input.nextLine();
                        System.out.println("Enter a new password: ");
                        String newPass1 = input.nextLine();
                        if (newPass.compareTo(newPass1) == 0) {
                            var check3 = accountManager.changePassWord(new Account(sign.getUser(), newPass));
                            if (check3) {
                                System.out.println("===>ĐỔI MẬT KHÂU THÀNH CÔNG <===");
                            } else {
                                System.out.println("===>Đổi thất bại<====");
                            }
                        } else {
                            System.out.println("Vui lòng nhập lại mất khẩu mới.");
                        }
                    } else {
                        System.out.println("Mật khẩu của tài khoản không hợp lệ");
                    }
                    break;
                default:
                    System.out.println("=====>Cảm ơn bạn đã sử dụng<=====");
                    checkAccount = false;
            }
        }




    }

    private static Account findOfPassWord(Account sign, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            if(sign.getPassWord().equals(accounts.get(i).getPassWord())) {
                return accounts.get(i);
            }
        }
        return null;
    }


    public static Account account(Scanner input) {
        System.out.println("User: ");
        String user = input.nextLine();
        System.out.println("PassWord: ");
        String passWord = input.nextLine();

        return new Activity(user,passWord,false,true);
    }

    public static void menuAccount() {
        System.out.println("1.Đăng kí tài khoản.");
        System.out.println("2.Đăng nhập.");
        System.out.println("3.Vô hiệu hóa tài khoản.");
        System.out.println("4.Mở lại tài khoản.");
        System.out.println("5.Đổi mật khẩu.");
        System.out.println("6.Thoát.");
    }

    private static void menu8() {
        System.out.println("1.Tên tăng dần từ a - z");
        System.out.println("2.Tên giảm dần từ z- a");
        System.out.println("3.Mức lương tăng dần");
        System.out.println("4.Mức lương giảm dần");
        System.out.println("5.Số năm kinh nghiệm tăng dần");
        System.out.println("6.Số năm kinh nghiệm giảm dần");
        System.out.println("7.Tuổi từ trẻ đến già");
        System.out.println("8.Tuổi từ già đến trẻ");
        System.out.println("9.Tổng lương thực giảm dần");
    }

    public static void menu(){
        System.out.println("====================Menu=========================");
        System.out.println("=             1.Thêm mới một nhân viên          =");
        System.out.println("=        2.Hiển thị thông tin nhân viên         =");
        System.out.println("=           3.Tìm nhân viên theo tên            =");
        System.out.println("=       4.Tìm nhân viên có mức lương >= x       =");
        System.out.println("=           5.Tìm giám đốc theo nhiệm kì        =");
        System.out.println("=       6.Xóa nhân viên theo mã cho trước       =");
        System.out.println("=       7.Tính lương, thương cho nhân viên.     =");
        System.out.println("=           8.Sắp xếp nhân viên                 =");
        System.out.println("=       9.Hiển thị bảng lương của nhân viên     =");
        System.out.println("=   10.Ghi danh sách nhân viên vào File EMP.DAT =");
        System.out.println("=               11.Đăng xuất                    =");
        System.out.println("=================================================");
    }

    public static Person person(Scanner input) {
        System.out.println("Căn cước: ");
        String id = input.nextLine();
        System.out.println("Họ và tên: ");
        String fullName = input.nextLine();
        System.out.println("Địa chỉ: ");
        String address = input.nextLine();
        System.out.println("Sinh nhật: ");
        String birth = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();
        System.out.println("Số điện thoại: ");
        String phoneNumber = input.nextLine();
        return new Person(id,fullName,address,birth,email,phoneNumber) {
            @Override
            protected void doWork() {

            }
        };

    }

    public static Person employee(Scanner input) {
        Employee employee = new Employee();
        employee.setIdEmployee();
        System.out.println("Mã nhân viên: \n" + employee.getIdEmployee());
        System.out.println("Chức vụ: ");
        String position = input.nextLine();
        System.out.println("Mức lương: ");
        int salary = input.nextInt();
        System.out.println("Số năm kinh nghiệm: ");
        double exp = input.nextDouble();
        System.out.println("Số ngày làm việc: ");
        int day = input.nextInt();
        System.out.println("Tổng lương thược được: \n" + 0);
        System.out.println("Thưởng thêm: \n" + 0);
        input.nextLine();
        return new Employee(employee.getIdEmployee(),position,
                            salary,exp,day,0,0);

    }
    public static Person manager(Scanner input) {
        System.out.println("Ngày bắt đầu nhiệm kì: ");
        String start = input.nextLine();
        System.out.println("Ngày kết thúc nhiệm kì: ");
        String end = input.nextLine();
        return  new Manager(start,end);
    }

    public static void showListEmployee(ArrayList<Employee> employees) {
        list();
        for (var item: employees) {
            list1(item);
        }
    }

    public static void findOfEmployeeName(ArrayList<Employee> employees,Scanner input) {
        System.out.println("Nhập tên: ");
        String name = input.nextLine();
        list();
        for (int i = 0; i < employees.size(); i++) {
            if(name.compareTo(employees.get(i).getFullName().substring(employees.get(i).getFullName().lastIndexOf(" ") + 1)) == 0) {
                list1(employees.get(i));
            }
        }
    }

    public static void list(){
        System.out.printf("%-13s%-18s%-12s%-12s%-17s%-17s%-15s%-12s%-14s%-20s%-18s\n",
                "Căn cước","Họ và tên", "Địa chỉ","Sinh nhật","Email",
                "Số điện thoại","Mã nhân viên","Chức vụ","Mức lương",
                "Số năm kinh nghiệm", "Số ngày làm việc");
    }
    public static void list1(Employee item) {
        System.out.printf("%-13s%-18s%-12s%-12s%-17s%-17s%-15s%-12s%-14s%-20s%-18s\n",
                item.getId(),item.getFullName(),item.getAddress(),item.getBirth(),
                item.getEmail(),item.getPhoneNumber(),item.getIdEmployee(),
                item.getPosition(),item.getSalary(),item.getExpYear(),item.getDay());
    }

    public static void findOfEmployeeSalary(ArrayList<Employee> employees, Scanner input) {
        System.out.println("Nhập số tiền: ");
        int x = Integer.parseInt(input.nextLine());
        list();
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getSalary() >= x) {
                list1(employees.get(i));
            }
        }
    }

    public static boolean removeEmployeeId(ArrayList<Employee> employees, Scanner input) {
        System.out.println("Nhập mã nhân viên: ");
        String idEmployee = input.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if(idEmployee.compareTo(employees.get(i).getIdEmployee()) == 0) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }
    public static void showSalary(ArrayList<Employee> employees) {
        System.out.printf("%-16s%-19s%-15s%-19s%-14s%-17s\n","Mã nhân viên ",
                "Tên nhân viên","Mức lương", "Số ngày làm việc",
                "Thưởng","Tổng lương");
        for (var item :
                employees) {
            salaryList(item);
        }
    }

    private static void salaryList(Employee item) {
        System.out.printf("%-16s%-19s%-15s%-19s%-14s%-17s\n",
                        item.getIdEmployee(),item.getFullName(),item.getSalary(),
                item.getDay(),item.getBonus(),item.getAmoutSalary());

    }
    public static ArrayList<Employee> readFile() {
        return null;
    }

    public static boolean saveFile(ArrayList<Employee> employees) {
        try {
            FileWriter fileWriter = new FileWriter(new File(fileEmp));
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (var item :
                    employees) {
                printWriter.println(item);
            }
            printWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
