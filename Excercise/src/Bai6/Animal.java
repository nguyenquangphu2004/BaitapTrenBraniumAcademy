package Bai6;


public abstract class Animal {
    private String name;
    private String type;
    private double height;
    private double weight;
    private String enviroment;
    private String reproductive;


    public Animal() {

    }

    public Animal(String name, String type, double height, double weight, String enviroment, String reproductive) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.enviroment = enviroment;
        this.reproductive = reproductive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

    public String getReproductive() {
        return reproductive;
    }

    public void setReproductive(String reproductive) {
        this.reproductive = reproductive;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", enviroment='" + enviroment + '\'' +
                ", reproductive='" + reproductive + '\'' +
                '}';
    }

    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void move();
    protected abstract void relax();





}
