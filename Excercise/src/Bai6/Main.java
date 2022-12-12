package Bai6;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Fish> fishs = new ArrayList<>();

        boolean check = true;
        while(check) {
            menu();
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    birds.add(new Bird(animal(input),(Bird) bird(input)));
                    break;
                case 2:
                    cats.add(new Cat(animal(input),(Mammal) mammal(input),(Cat) cat(input)));
                    break;
                case 3:
                    fishs.add(new Fish(animal(input),(Fish)fish(input)));
                    break;
                case 4:
                    for (var bird : birds) {
                        System.out.println(bird);
                    }
                    break;
                case 5:
                    for (var cat :
                            cats) {
                        System.out.println(cat);
                    }
                    break;
                case 6:
                    for (var fish :
                            fishs) {
                        System.out.println(fish);
                    }
                    break;
                case 7:
                    if(birds.size() > 0)
                        birds.get(0).move();
                    if(cats.size() > 0)
                        cats.get(0).move();
                    if(fishs.size() > 0)
                        fishs.get(0).move();
                    break;


                default:
                    System.out.println("CẢM ƠN ĐÃ SỬ DỤNG");
                    check = false;
            }
        }
    }
    public static void menu() {
        System.out.println("1.Thêm các con chim vào Arraylist...");
        System.out.println("2.Thêm các con mèo vào ArrayList...");
        System.out.println("3.Thêm các con cá vào ArrayList...");
        System.out.println("4.Hiển thị bảng con chim...");
        System.out.println("5.Hiển thị bảng con mèo...");
        System.out.println("6.Hiên thị bảng con cá...");
        System.out.println("7.Hành động di chuyển của các con vật trên...");
        System.out.println("Xin mời lựa chọn: ");

    }
    public static Animal animal(Scanner input) {
        System.out.println("Tên: ");
        String name = input.nextLine();
        System.out.println("Loài: ");
        String type = input.nextLine();
        System.out.println("Chiều cao: ");
        double height = Double.parseDouble(input.nextLine());
        System.out.println("Cân nặng: ");
        double weight = Double.parseDouble(input.nextLine());
        System.out.println("Môi trường sống: ");
        String enviroment = input.nextLine();
        System.out.println("Hình thức sinh sản: ");
        String reproduct = input.nextLine();

        return new Animal(name,type,height,weight,enviroment,reproduct) {
            @Override
            protected void eat() {

            }

            @Override
            protected void sleep() {

            }

            @Override
            protected void move() {

            }

            @Override
            protected void relax() {

            }
        };

    }
    public static Animal mammal(Scanner input) {
        System.out.println("Số chân: ");
        int leg = Integer.parseInt(input.nextLine());
        System.out.println("Màu lông: ");
        String featherColor = input.nextLine();
        System.out.println("Số răng: ");
        int teeth = input.nextInt();
        System.out.println("Tập tính: ");
        String behavior = input.nextLine();
        return new Mammal(leg,featherColor,teeth,behavior);

    }
    public static Animal bird(Scanner input) {
        System.out.println("Màu lông: " );
        String featerColor = input.nextLine();
        System.out.println("Thức ăn chính: ");
        String mainEat = input.nextLine();
        System.out.println("Sải cánh: ");
        double wingspan = Double.parseDouble(input.nextLine());
        return new Bird(featerColor,mainEat,wingspan);

    }

    public static Animal fish(Scanner input) {
        System.out.println("Màu sắc: ");
        String color = input.nextLine();
        System.out.println("Thức ăn: ");
        String eat = input.nextLine();

        return new Fish(color,eat);

    }

    public static Animal cat(Scanner input) {
        System.out.println("Tuổi: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Sở thích: ");
        String habitat = input.nextLine();
        System.out.println("Màu mắt: ");
        String colorEye = input.nextLine();
        System.out.println("Tên riêng: ");
        String name = input.nextLine();
        return  new Cat(age,habitat,colorEye,name);
    }

}
