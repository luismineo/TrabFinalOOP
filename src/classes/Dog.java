package classes;

public class Dog extends Animal{
    private String dogDisease;

    public Dog(String name, int age, int height, float weight, String sex, String dogDisease) {
        super(name, age, height, weight, sex);
        this.dogDisease = dogDisease;
    }

    public Dog() {
    }

    public String getDogDisease() {
        return dogDisease;
    }

    public void setDogDisease(String dogDisease) {
        this.dogDisease = dogDisease;
    }
}
