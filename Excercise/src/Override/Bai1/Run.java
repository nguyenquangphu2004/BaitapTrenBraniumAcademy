package Override.Bai1;

public class Run {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mammal cat = new Cat();
        Animal fish = new Fish();
        Animal bird = new Bird();
        System.out.println("==========================");
        animal.drive("Bò tót");
        System.out.println("==========================");
        cat.sleep("Mèo tôm");
        System.out.println("==========================");
        fish.eat();
        System.out.println("==========================");
        bird.drive("Chim én");
        System.out.println("==========================");

    }
}
