package BaiTapInterFace.QuangPhu;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        var input = new Scanner(System.in);
        boolean check = true;
        while(check) {
            menu();
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1.Thêm mới con Mèo.");
                    System.out.println("2.Thêm mới còn Cá");
                    System.out.println("3.Thêm mới con chim");
                    int choice1 = input.nextInt();
                    input.nextLine();
                    if (choice1 == 1) {
                        animals.add(new Cat(animal(input), (Mammal) mammal(input), (Cat) cat(input)));
                    } else if (choice1 == 2) {
                        animals.add(new Fish(animal(input), (Fish) fish(input)));
                    } else if (choice1 == 3) {
                        animals.add(new Bird(animal(input), (Bird) bird(input)));
                    }
                    break;
                case 2:
                    System.out.println("1.Hiển thị bảng danh sách con mèo.");
                    System.out.println("2.Hiển thị bảng danh sách con Cá.");
                    System.out.println("3.Hiển thị bảng danh sách con Chim.");
                    int choice2 = input.nextInt();
                    input.nextLine();
                    if (choice2 == 1) {
                        showListCat(animals);
                    } else if (choice2 == 2) {
                        showListFish(animals);
                    } else if (choice2 == 3) {
                        showListBird(animals);
                    }
                    break;
                case 3:
                    System.out.println("1.Sắp xếp danh sách con mèo.");
                    System.out.println("2.Sắp xếp danh sách con Cá.");
                    System.out.println("3.Sắp xếp danh sách con Chim.");
                    int choice3 = input.nextInt();
                    input.nextLine();
                    ArrayList<Cat> cats = new ArrayList<>();
                    ArrayList<Bird> birds = new ArrayList<>();
                    ArrayList<Fish> fishs = new ArrayList<>();

                    if (choice3 == 1) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Cat) {
                                cats.add((Cat) animals.get(i));
                            }
                        }
                        Collections.sort(cats, new MySortAzCat());
                        showCatSort(cats);

                    } else if(choice3 == 2) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Fish) {
                                fishs.add((Fish) animals.get(i));
                            }
                        }
                        Collections.sort(fishs, new MySortAzFish());
                        showFishSort(fishs);
                    } else if(choice3 == 3) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Bird) {
                                birds.add((Bird) animals.get(i));
                            }
                        }
                        Collections.sort(birds, new MySortAzBird());
                        showBirdSort(birds);
                    }

                    break;
                case 4:
                    System.out.println("1.Sắp xếp danh sách con mèo.");
                    System.out.println("2.Sắp xếp danh sách con Cá.");
                    System.out.println("3.Sắp xếp danh sách con Chim.");
                    int choice4 = input.nextInt();
                    input.nextLine();
                    ArrayList<Cat> cats1 = new ArrayList<>();
                    ArrayList<Bird> birds1 = new ArrayList<>();
                    ArrayList<Fish> fishs1 = new ArrayList<>();

                    if (choice4 == 1) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Cat) {
                                cats1.add((Cat) animals.get(i));
                            }
                        }
                        Collections.sort(cats1, new MySortHeightCatDown());
                        showCatSort(cats1);


                    } else if(choice4 == 2) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Fish) {
                                fishs1.add((Fish) animals.get(i));
                            }
                        }
                        Collections.sort(fishs1, new MySortHeightFishDown());
                        showFishSort(fishs1);
                    } else if(choice4 == 3) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Bird) {
                                birds1.add((Bird) animals.get(i));
                            }
                        }
                        Collections.sort(birds1, new MySortHeightBirdDown());
                        showBirdSort(birds1);
                    }
                    break;
                case 5:
                    System.out.println("1.Sắp xếp danh sách con mèo.");
                    System.out.println("2.Sắp xếp danh sách con Cá.");
                    System.out.println("3.Sắp xếp danh sách con Chim.");
                    int choice5 = input.nextInt();
                    input.nextLine();
                    ArrayList<Cat> cats2 = new ArrayList<>();
                    ArrayList<Bird> birds2 = new ArrayList<>();
                    ArrayList<Fish> fishs2 = new ArrayList<>();

                    if (choice5 == 1) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Cat) {
                                cats2.add((Cat) animals.get(i));
                            }
                        }
                        Collections.sort(cats2, new MySortWeightCatDown());
                        showCatSort(cats2);


                    } else if(choice5 == 2) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Fish) {
                                fishs2.add((Fish) animals.get(i));
                            }
                        }
                        Collections.sort(fishs2, new MySortWeightFishDown());
                        showFishSort(fishs2);
                    } else if(choice5 == 3) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Bird) {
                                birds2.add((Bird) animals.get(i));
                            }
                        }
                        Collections.sort(birds2, new MySortWeightBirdDown());
                        showBirdSort(birds2);
                    }
                    break;
                case 6:
                    System.out.println("1.Sắp xếp danh sách con mèo.");
                    System.out.println("2.Sắp xếp danh sách con Cá.");
                    System.out.println("3.Sắp xếp danh sách con Chim.");
                    int choice6 = input.nextInt();
                    input.nextLine();
                    ArrayList<Cat> cats3 = new ArrayList<>();
                    ArrayList<Bird> birds3 = new ArrayList<>();
                    ArrayList<Fish> fishs3 = new ArrayList<>();

                    if (choice6 == 1) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Cat) {
                                cats3.add((Cat) animals.get(i));
                            }
                        }
                        Collections.sort(cats3, new MySortWeightCatRise());
                        showCatSort(cats3);


                    } else if(choice6 == 2) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Fish) {
                                fishs3.add((Fish) animals.get(i));
                            }
                        }
                        Collections.sort(fishs3, new MySortWeightFishRise());
                        showFishSort(fishs3);
                    } else if(choice6 == 3) {
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i) instanceof Bird) {
                                birds3.add((Bird) animals.get(i));
                            }
                        }
                        Collections.sort(birds3, new MySortWeightBirdRise());
                        showBirdSort(birds3);
                    }
                    break;
                default:
                    check = false;
                    System.out.println("========>Cảm ơn bạn đã sử dụng<=========");


            }

        }

    }



    private static void showListFish(ArrayList<Animal> animals) {
       System.out.println("============> Bảng danh sách các con Cá <=============");
        System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s\n","Tên",
                                "Chiều cao","Cân nặng","Môi trường sông",
                                "Sinh sản", "Màu sắc","Thức ăn chính");
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Fish) {
                var cat = (Fish) animals.get(i);

                System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s\n",
                                    cat.getName(),cat.getHeight(),cat.getWeight(),cat.getEnviroment(),
                                cat.getProducForm(),cat.getColor(),cat.getMainEat());
            }
        }

    }


    private static void showListBird(ArrayList<Animal> animals) {

        System.out.println("============> Bảng danh sách các con Chim <=============");
        System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s%-15s%\n","Tên",
                "Chiều cao","Cân nặng","Môi trường sông",
                "Sinh sản", "Màu lông", "Thức ăn chính","Sải cánh");
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Bird) {
                var cat = (Bird) animals.get(i);

                System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s%-15s%\n",
                        cat.getName(),cat.getHeight(),cat.getWeight(),cat.getEnviroment(),
                        cat.getProducForm(),cat.getFeatherColor(),cat.getMainEat(),cat.getWingspan());
            }
        }


    }

    public static void menu() {
        System.out.println("===========================================================");
        System.out.println("|   1.Thêm mới một danh sách động vât.                    |");
        System.out.println("|   2.Hiển thị danh sách động vật theo dạng cột bản.      |");
        System.out.println("|   3.Sắp xếp danh sách động vật từ a - z.                |");
        System.out.println("|   4.Sắp xếp động vật theo chiều cao giảm dần.           |");
        System.out.println("|   5.Sắp xếp động vật theo cân nặng giảm dần.            |");
        System.out.println("|   6.Sắp xếp động vật theo cân nặng tăng dần.            |");
        System.out.println("|   0.Thoát chương trình.                                 |");
        System.out.println("===========================================================");
        System.out.printf("                       Mời bạn lựa chọn:");
    }
    public static Animal animal(Scanner input) {
        System.out.println("Tên con vật: ");
        String name = input.nextLine();
        System.out.println("Chiều cao: ");
        float height = Float.parseFloat(input.nextLine());
        System.out.println("Cân nặng: ");
        float weight = Float.parseFloat(input.nextLine());
        System.out.println("Môi trường sống: ");
        String enviroment = input.nextLine();
        System.out.println("Hình thức sản xuất: ");
        String producForm = input.nextLine();

        return new Animal(name,height,weight,enviroment,producForm) {
            @Override
            protected void eat() {

            }

            @Override
            protected void sleep() {

            }

            @Override
            protected void remove() {

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
        int teeth = Integer.parseInt(input.nextLine());
        System.out.println("Thói quen: ");
        String behaviour = input.nextLine();
        return new Mammal(leg,featherColor,teeth,behaviour);
    }

    public static Animal cat(Scanner input) {
        System.out.println("Tuổi: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Sở thích: ");
        String habitat = input.nextLine();
        System.out.println("Màu mắt: ");
        String eyeColor = input.nextLine();
        System.out.println("Tên riêng: ");
        String petName = input.nextLine();
        return new Cat(age,habitat,eyeColor,petName);
    }

    public static Animal bird(Scanner input) {
        System.out.println("Màu lông: ");
        String featherColor = input.nextLine();
        System.out.println("Thức ăn chính: ");
        String eatMain = input.nextLine();
        System.out.println("Sải cánh: ");
        String wingspan = input.nextLine();

        return new Bird(featherColor,eatMain,wingspan);
    }
    public static Animal fish(Scanner input) {
        System.out.println("Màu sắc: ");
        String color = input.nextLine();
        System.out.println("Thức ăn chính: ");
        String eatMain = input.nextLine();
        return new Fish(color,eatMain);
    }
    public static void showListCat(ArrayList<Animal> animals) {

        System.out.println("============> Bảng danh sách các con Mèo <=============");
        System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s%-15s%-15s\n","Tên",
                                "Chiều cao","Cân nặng","Môi trường sông",
                                "Sinh sản", "Tuổi","Sở thích","Màu mắt","Tên Riêng");
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Cat) {
                var cat = (Cat) animals.get(i);

                System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s%-15s%-15s\n",
                                    cat.getName(),cat.getHeight(),cat.getWeight(),cat.getEnviroment(),
                                cat.getProducForm(),cat.getAge(),cat.getHabitat(),cat.getEyeColor(),
                                cat.getPetName());
            }
        }

    }

    public static void showCatSort(ArrayList<Cat> cats) {
        System.out.println("============> Bảng danh sách các con Mèo <=============");
        System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s%-15s%-15s\n", "Tên",
                "Chiều cao", "Cân nặng", "Môi trường sông",
                "Sinh sản", "Tuổi", "Sở thích", "Màu mắt", "Tên Riêng");
        for (int i = 0; i < cats.size(); i++) {
            var cat = cats.get(i);
            System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s%-15s%-15s\n",
                    cat.getName(), cat.getHeight(), cat.getWeight(), cat.getEnviroment(),
                    cat.getProducForm(), cat.getAge(), cat.getHabitat(), cat.getEyeColor(),
                    cat.getPetName());
        }
    }
    public static void showFishSort(ArrayList<Fish> fish) {
        System.out.println("============> Bảng danh sách các con Cá <=============");
        System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s\n","Tên",
                "Chiều cao","Cân nặng","Môi trường sông",
                "Sinh sản", "Màu sắc","Thức ăn chính");
        for (int i = 0; i < fish.size(); i++) {
            if(fish.get(i) instanceof Fish) {
                var cat =  fish.get(i);

                System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s\n",
                        cat.getName(),cat.getHeight(),cat.getWeight(),cat.getEnviroment(),
                        cat.getProducForm(),cat.getColor(),cat.getMainEat());
            }
        }
    }
    private static void showBirdSort(ArrayList<Bird> birds) {

        System.out.println("============> Bảng danh sách các con Chim <=============");
        System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s%-15s%\n","Tên",
                "Chiều cao","Cân nặng","Môi trường sông",
                "Sinh sản", "Màu lông", "Thức ăn chính","Sải cánh");
        for (int i = 0; i < birds.size(); i++) {
            if(birds.get(i) instanceof Bird) {
                var cat = (Bird) birds.get(i);

                System.out.printf("%-10s%-15s%-15s%-18s%-15s%-14s%-10s%-15s%\n",
                        cat.getName(),cat.getHeight(),cat.getWeight(),cat.getEnviroment(),
                        cat.getProducForm(),cat.getFeatherColor(),cat.getMainEat(),cat.getWingspan());
            }
        }


    }

}
