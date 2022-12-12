package Bai10.Bai2;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Car carSmall  = new CarSmall("Roll Royce");
        System.out.println("===================");
        carSmall.startEngine();
        System.out.println("===================");
        carSmall.speed(500.2f);
        System.out.println("===================");
        carSmall.turnOfLight(false);
        System.out.println("===================");
        carSmall.brake();
        System.out.println("===================");
        carSmall.endEngine();
        System.out.println("===================");
    }
}
