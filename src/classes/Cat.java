package classes;

public class Cat extends Animal{
    private String catDisease;

    public Cat(String name, int age, int height, float weight, String sex, String catDisease) {
        super(name, age, height, weight, sex);
        this.catDisease = catDisease;
    }

    public Cat() {
    }

    public String getCatDisease() {
        return catDisease;
    }

    public void setCatDisease(String catDisease) {
        this.catDisease = catDisease;
    }
}
