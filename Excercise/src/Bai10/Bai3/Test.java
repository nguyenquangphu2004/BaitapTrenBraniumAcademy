package Bai10.Bai3;

public class Test {
    public static void main(String[] args) {
        Smartphone iphone = new Iphone();
        iphone.setName("Iphone 14 Pro Max");
        System.out.println("==========================");
        System.out.println("Tên iphone: " + iphone.getName());
        System.out.println("==========================");
        iphone.restart(false);

    }
}
