package Bai10.Bai4;

public class Main {
    public static void main(String[] args) {
        Test test  = new Test();
        System.out.println("---------------------------------------------------");
        test.fingerPrint(false);
        System.out.println("---------------------------------------------------");
        test.faceId(true);
        System.out.println("---------------------------------------------------");
        test.restart(true);
        System.out.println("---------------------------------------------------");
        test.turnOff(false);
        System.out.println("---------------------------------------------------");

    }
}
