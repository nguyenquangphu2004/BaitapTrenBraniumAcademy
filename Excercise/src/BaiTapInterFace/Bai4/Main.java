package BaiTapInterFace.Bai4;

import Bai10.Bai3.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static int x = 0;
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        SmartPhone1 smart1 = new SmartPhone1("1","Apple","Iphone 14ProMax",
                34000000,1,"520x250");
       SmartPhone1 smart2 = new SmartPhone1("2","Samsung","Samsung14x plus",
                15000000,3,"450x260");
       SmartPhone1 smart3 = new SmartPhone1("3","Apple","Ipad",
                25000000,2,"1150x520");

        ArrayList<SmartPhone1> smar = new ArrayList<>();
        smar.add(smart1);
        smar.add(smart2);
        smar.add(smart3);

        boolean check = true;
        while(check) {
            System.out.println("1.Sắp xếp theo hãng tăng dần a-z");
            System.out.println("2.Sắp xếp tên thiết bị theo tăng tần a-z");
            System.out.println("3.Sắp xếp giá bán giảm dần.");
            System.out.println("4.Să xếp giá bán tăng dần");
            System.out.println("5.Hiển thị giá bán >= 1 mốc cho trước.");
            int n = input.nextInt();
            input.nextLine();
            SmartPhone1.index = n;
            switch (n) {
                case 1:
                    Collections.sort(smar);
                    for (var item :
                            smar) {
                        System.out.println(item);
                    }
                    break;
                case 2:
                    Collections.sort(smar);
                for (var item :

                            smar) {
                        System.out.println(item);
                    };
                    break;
                case 3:
                    Collections.sort(smar);
                    for (var item :
                            smar) {
                        System.out.println(item);
                    }
                    break;
                case 4:
                    Collections.sort(smar);
                    for (var item :
                            smar) {
                        System.out.println(item);
                    }
                    break;
                case 5:
                    System.out.println("Nhập mốc: ");
                    x = input.nextInt();
                    input.nextLine();
                    ArrayList<SmartPhone1> helper = new ArrayList<>();

                    for (var item :
                            smar) {
                        if(item.getOriginalPrice() >= x) {
                            helper.add(item);
                        }
                    }
                    Collections.sort(helper);
                    int i = 0;
                    for (var item :
                            helper) {
                        System.out.println(item);
                    }

                    for (int j = 0; j < helper.size(); j++) {
                        helper.remove(i);
                    }

                    break;
            }
        }


    }
}
