package BaiTapInterFace.QuangPhu;

public abstract class Animal {
    private String name;
    private float height;
    private float weight;
    private String enviroment;
    private String producForm;

    public Animal(String name, float height, float weight,
                        String enviroment, String producForm) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.enviroment = enviroment;
        this.producForm = producForm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

    public String getProducForm() {
        return producForm;
    }

    public void setProducForm(String producForm) {
        this.producForm = producForm;
    }

    public Animal() {

    }


    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void remove();
    protected abstract void relax();



}
