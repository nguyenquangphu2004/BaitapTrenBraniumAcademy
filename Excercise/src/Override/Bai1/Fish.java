package Override.Bai1;

public class Fish extends Animal{
    private String color;
    private String eat;
    public Fish() {

    }

    public Fish(String color, String eat) {
        this.color = color;
        this.eat = eat;
    }

    @Override
    public void eat() {
        System.out.println("con cá đang ăn cám");
    }

}
