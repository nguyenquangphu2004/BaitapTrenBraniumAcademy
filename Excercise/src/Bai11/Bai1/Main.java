package Bai11.Bai1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        Account account1 = new Activity("AC1001","quangphu","1234",
                "Nguyen quang phu", "quangphu2060@gmail.com",
                "098237967",true,false);
        AccountManagerImp manager = new AccountManagerImp();

        Account account = new Account("quangphu","1234");
        manager.signup(account1);

        manager.changePassWord(account);
        System.out.println(manager.getAccounts().get(0).getUsername());

        System.out.println(manager.getAccounts().get(0).getPassword());






    }


    private static void showResult(Account account1) {
        Activity check = (Activity) account1;
        var status = (check.isOnline()) ? "Online" : "Offline";
        System.out.println("Tài khoản: "  + check.getUsername() + " đang " + status);
    }

}
